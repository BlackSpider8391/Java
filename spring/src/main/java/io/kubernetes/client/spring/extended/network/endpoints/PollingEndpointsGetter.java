/*
Copyright 2020 The Kubernetes Authors.
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
package io.kubernetes.client.spring.extended.network.endpoints;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import io.kubernetes.client.apimachinery.NamespaceName;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.apis.CoreV1Api;
import io.kubernetes.client.openapi.models.V1Endpoints;
import java.time.Duration;
import java.util.concurrent.ExecutionException;
import org.springframework.beans.factory.annotation.Autowired;

public class PollingEndpointsGetter implements EndpointsGetter {

  private static final Cache<NamespaceName, V1Endpoints> lastObservedEndpoints =
      CacheBuilder.newBuilder().expireAfterWrite(Duration.ofMinutes(5)).build();

  @Autowired private ApiClient apiClient;

  @Override
  public V1Endpoints get(String namespace, String name) {
    CoreV1Api coreV1Api = new CoreV1Api(apiClient);
    try {
      return lastObservedEndpoints.get(
          new NamespaceName(namespace, name),
          () -> {
            return coreV1Api.readNamespacedEndpoints(name, namespace, null, null, null);
          });
    } catch (ExecutionException e) {
      throw new RuntimeException(e);
    }
  }
}
