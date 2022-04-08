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

import io.kubernetes.client.fluent.VisitableBuilder;

public class V1beta1OverheadBuilder extends V1beta1OverheadFluentImpl<V1beta1OverheadBuilder>
    implements VisitableBuilder<
        V1beta1Overhead, io.kubernetes.client.openapi.models.V1beta1OverheadBuilder> {
  public V1beta1OverheadBuilder() {
    this(false);
  }

  public V1beta1OverheadBuilder(Boolean validationEnabled) {
    this(new V1beta1Overhead(), validationEnabled);
  }

  public V1beta1OverheadBuilder(
      io.kubernetes.client.openapi.models.V1beta1OverheadFluent<?> fluent) {
    this(fluent, false);
  }

  public V1beta1OverheadBuilder(
      io.kubernetes.client.openapi.models.V1beta1OverheadFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1beta1Overhead(), validationEnabled);
  }

  public V1beta1OverheadBuilder(
      io.kubernetes.client.openapi.models.V1beta1OverheadFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1beta1Overhead instance) {
    this(fluent, instance, false);
  }

  public V1beta1OverheadBuilder(
      io.kubernetes.client.openapi.models.V1beta1OverheadFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1beta1Overhead instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withPodFixed(instance.getPodFixed());

    this.validationEnabled = validationEnabled;
  }

  public V1beta1OverheadBuilder(io.kubernetes.client.openapi.models.V1beta1Overhead instance) {
    this(instance, false);
  }

  public V1beta1OverheadBuilder(
      io.kubernetes.client.openapi.models.V1beta1Overhead instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withPodFixed(instance.getPodFixed());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1beta1OverheadFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1beta1Overhead build() {
    V1beta1Overhead buildable = new V1beta1Overhead();
    buildable.setPodFixed(fluent.getPodFixed());
    return buildable;
  }
}
