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
package io.kubernetes.client.util.generic;

import io.kubernetes.client.common.KubernetesType;
import io.kubernetes.client.openapi.models.V1Status;
import java.util.function.Consumer;

public class KubernetesApiResponse<DataType extends KubernetesType> {

  private final DataType object;
  private final V1Status status;
  private final int httpStatusCode;

  public KubernetesApiResponse(DataType object) {
    this.object = object;
    this.status = null;
    this.httpStatusCode = -1;
  }

  public KubernetesApiResponse(V1Status status, int httpStatusCode) {
    this.object = null;
    this.status = status;
    this.httpStatusCode = httpStatusCode;
  }

  public DataType getObject() {
    return object;
  }

  public V1Status getStatus() {
    return status;
  }

  public int getHttpStatusCode() {
    return httpStatusCode;
  }

  public boolean isSuccess() {
    return this.httpStatusCode < 400;
  }

  public KubernetesApiResponse<DataType> onFailure(Consumer<V1Status> errorStatusHandler) {
    if (!isSuccess()) {
      errorStatusHandler.accept(this.status);
    }
    return this;
  }
}
