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
package io.kubernetes.client.extended.kubectl;

import io.kubernetes.client.common.KubernetesObject;
import io.kubernetes.client.custom.V1Patch;
import io.kubernetes.client.extended.kubectl.exception.KubectlException;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.apis.AppsV1Api;
import io.kubernetes.client.openapi.models.V1Deployment;
import io.kubernetes.client.openapi.models.V1ReplicaSet;
import io.kubernetes.client.util.PatchUtils;

public class KubectlScale<ApiType extends KubernetesObject>
    extends Kubectl.ResourceBuilder<ApiType, KubectlScale<ApiType>>
    implements Kubectl.Executable<ApiType> {
  private final AppsV1Api api;
  private int replicas;

  KubectlScale(ApiClient client, Class<ApiType> apiTypeClass) {
    super(client, apiTypeClass);
    this.api = new AppsV1Api(client);
    this.replicas = -1;
  }

  public KubectlScale<ApiType> replicas(int replicas) {
    this.replicas = replicas;
    return this;
  }

  @Override
  public ApiType execute() throws KubectlException {
    validate();

    String jsonPatchStr =
        String.format("[{\"op\":\"replace\",\"path\":\"/spec/replicas\",\"value\":%d}]", replicas);

    try {
      if (apiTypeClass.equals(V1Deployment.class)) {
        return PatchUtils.patch(
            (Class<ApiType>) apiTypeClass,
            () ->
                api.patchNamespacedDeploymentCall(
                    name,
                    namespace,
                    new V1Patch(jsonPatchStr),
                    null,
                    null,
                    null, // field-manager is optional
                    null,
                    null),
            V1Patch.PATCH_FORMAT_JSON_PATCH,
            this.apiClient);
      } else if (apiTypeClass.equals(V1ReplicaSet.class)) {
        return PatchUtils.patch(
            (Class<ApiType>) apiTypeClass,
            () ->
                api.patchNamespacedReplicaSetCall(
                    name, namespace, new V1Patch(jsonPatchStr), null, null, null, null, null),
            V1Patch.PATCH_FORMAT_JSON_PATCH,
            this.apiClient);
      } else {
        throw new KubectlException("Unsupported class for scale: " + apiTypeClass);
      }
    } catch (ApiException ex) {
      throw new KubectlException(ex);
    }
  }

  private void validate() throws KubectlException {
    StringBuilder msg = new StringBuilder();
    if (name == null) {
      msg.append("Missing name, ");
    }
    if (namespace == null) {
      msg.append("Missing namespace, ");
    }
    if (replicas < 0) {
      msg.append("Invalid replicas");
    }
    if (msg.length() > 0) {
      throw new KubectlException(msg.toString());
    }
  }
}
