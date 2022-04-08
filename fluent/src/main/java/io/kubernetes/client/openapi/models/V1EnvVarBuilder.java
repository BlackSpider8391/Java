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

public class V1EnvVarBuilder extends V1EnvVarFluentImpl<V1EnvVarBuilder>
    implements VisitableBuilder<V1EnvVar, io.kubernetes.client.openapi.models.V1EnvVarBuilder> {
  public V1EnvVarBuilder() {
    this(false);
  }

  public V1EnvVarBuilder(Boolean validationEnabled) {
    this(new V1EnvVar(), validationEnabled);
  }

  public V1EnvVarBuilder(V1EnvVarFluent<?> fluent) {
    this(fluent, false);
  }

  public V1EnvVarBuilder(
      io.kubernetes.client.openapi.models.V1EnvVarFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1EnvVar(), validationEnabled);
  }

  public V1EnvVarBuilder(
      io.kubernetes.client.openapi.models.V1EnvVarFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1EnvVar instance) {
    this(fluent, instance, false);
  }

  public V1EnvVarBuilder(
      io.kubernetes.client.openapi.models.V1EnvVarFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1EnvVar instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withName(instance.getName());

    fluent.withValue(instance.getValue());

    fluent.withValueFrom(instance.getValueFrom());

    this.validationEnabled = validationEnabled;
  }

  public V1EnvVarBuilder(io.kubernetes.client.openapi.models.V1EnvVar instance) {
    this(instance, false);
  }

  public V1EnvVarBuilder(
      io.kubernetes.client.openapi.models.V1EnvVar instance, java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withName(instance.getName());

    this.withValue(instance.getValue());

    this.withValueFrom(instance.getValueFrom());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1EnvVarFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1EnvVar build() {
    V1EnvVar buildable = new V1EnvVar();
    buildable.setName(fluent.getName());
    buildable.setValue(fluent.getValue());
    buildable.setValueFrom(fluent.getValueFrom());
    return buildable;
  }
}
