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
package io.kubernetes.client.extended.kubectl;

import io.kubernetes.client.common.KubernetesListObject;
import io.kubernetes.client.common.KubernetesObject;
import io.kubernetes.client.custom.V1Patch;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.util.generic.GenericKubernetesApi;
import io.kubernetes.client.util.generic.options.PatchOptions;

class PatchHelper {
  public static <ApiType extends KubernetesObject, ApiListType extends KubernetesListObject>
      ApiType dryRunStrategyMergePatch(
          GenericKubernetesApi<ApiType, ApiListType> genericApi,
          String patch,
          String namespace,
          String name)
          throws ApiException {
    PatchOptions options = new PatchOptions();
    options.setDryRun("All");
    return genericApi
        .patch(
            namespace,
            name,
            V1Patch.PATCH_FORMAT_STRATEGIC_MERGE_PATCH,
            new V1Patch(patch),
            options)
        .throwsApiException()
        .getObject();
  }
}
