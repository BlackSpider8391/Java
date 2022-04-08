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

public class V1ConfigMapBuilder extends V1ConfigMapFluentImpl<V1ConfigMapBuilder>
    implements VisitableBuilder<
        V1ConfigMap, io.kubernetes.client.openapi.models.V1ConfigMapBuilder> {
  public V1ConfigMapBuilder() {
    this(false);
  }

  public V1ConfigMapBuilder(Boolean validationEnabled) {
    this(new V1ConfigMap(), validationEnabled);
  }

  public V1ConfigMapBuilder(V1ConfigMapFluent<?> fluent) {
    this(fluent, false);
  }

  public V1ConfigMapBuilder(
      io.kubernetes.client.openapi.models.V1ConfigMapFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1ConfigMap(), validationEnabled);
  }

  public V1ConfigMapBuilder(
      io.kubernetes.client.openapi.models.V1ConfigMapFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1ConfigMap instance) {
    this(fluent, instance, false);
  }

  public V1ConfigMapBuilder(
      io.kubernetes.client.openapi.models.V1ConfigMapFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1ConfigMap instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withBinaryData(instance.getBinaryData());

    fluent.withData(instance.getData());

    fluent.withImmutable(instance.getImmutable());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled;
  }

  public V1ConfigMapBuilder(io.kubernetes.client.openapi.models.V1ConfigMap instance) {
    this(instance, false);
  }

  public V1ConfigMapBuilder(
      io.kubernetes.client.openapi.models.V1ConfigMap instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withApiVersion(instance.getApiVersion());

    this.withBinaryData(instance.getBinaryData());

    this.withData(instance.getData());

    this.withImmutable(instance.getImmutable());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1ConfigMapFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1ConfigMap build() {
    V1ConfigMap buildable = new V1ConfigMap();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setBinaryData(fluent.getBinaryData());
    buildable.setData(fluent.getData());
    buildable.setImmutable(fluent.getImmutable());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    return buildable;
  }
}
