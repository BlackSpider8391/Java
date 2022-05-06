/*
Copyright 2022 The Kubernetes Authors.
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
package io.kubernetes.client.openapi.models;

import io.kubernetes.client.custom.IntOrString;
import io.kubernetes.client.fluent.Fluent;

/** Generated */
public interface V1RollingUpdateStatefulSetStrategyFluent<
        A extends V1RollingUpdateStatefulSetStrategyFluent<A>>
    extends Fluent<A> {
  public IntOrString getMaxUnavailable();

  public A withMaxUnavailable(io.kubernetes.client.custom.IntOrString maxUnavailable);

  public Boolean hasMaxUnavailable();

  public A withNewMaxUnavailable(int value);

  public A withNewMaxUnavailable(String value);

  public Integer getPartition();

  public A withPartition(java.lang.Integer partition);

  public java.lang.Boolean hasPartition();
}
