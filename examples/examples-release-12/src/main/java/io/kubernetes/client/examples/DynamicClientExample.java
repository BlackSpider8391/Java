/*
Copyright 2021 The Kubernetes Authors.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package io.kubernetes.client.examples;

import java.io.FileReader;
import java.io.IOException;

import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.util.ClientBuilder;
import io.kubernetes.client.util.KubeConfig;
import io.kubernetes.client.util.generic.dynamic.DynamicKubernetesApi;
import io.kubernetes.client.util.generic.dynamic.DynamicKubernetesObject;

public class DynamicClientExample {

	public static void main(String[] args) throws IOException, ApiException {

		ApiClient apiClient = ClientBuilder.standard().build();

		// retrieving the latest state of the default namespace
		DynamicKubernetesApi dynamicApi = new DynamicKubernetesApi("", "v1", "namespaces", apiClient);
		DynamicKubernetesObject defaultNamespace = dynamicApi.get("default")
				.throwsApiException()
				.getObject();

		// attaching a "foo=bar" label to the default namespace
		defaultNamespace.setMetadata(defaultNamespace.getMetadata().putLabelsItem("foo", "bar"));
		DynamicKubernetesObject updatedDefaultNamespace = dynamicApi.update(defaultNamespace)
				.throwsApiException()
				.getObject();

		System.out.println(updatedDefaultNamespace);

		apiClient.getHttpClient().connectionPool().evictAll();
	}
}
