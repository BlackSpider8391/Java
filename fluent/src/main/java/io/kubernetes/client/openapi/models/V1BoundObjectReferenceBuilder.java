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

public class V1BoundObjectReferenceBuilder
    extends V1BoundObjectReferenceFluentImpl<V1BoundObjectReferenceBuilder>
    implements VisitableBuilder<
        io.kubernetes.client.openapi.models.V1BoundObjectReference,
        io.kubernetes.client.openapi.models.V1BoundObjectReferenceBuilder> {
  public V1BoundObjectReferenceBuilder() {
    this(false);
  }

  public V1BoundObjectReferenceBuilder(Boolean validationEnabled) {
    this(new V1BoundObjectReference(), validationEnabled);
  }

  public V1BoundObjectReferenceBuilder(V1BoundObjectReferenceFluent<?> fluent) {
    this(fluent, false);
  }

  public V1BoundObjectReferenceBuilder(
      io.kubernetes.client.openapi.models.V1BoundObjectReferenceFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1BoundObjectReference(), validationEnabled);
  }

  public V1BoundObjectReferenceBuilder(
      io.kubernetes.client.openapi.models.V1BoundObjectReferenceFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1BoundObjectReference instance) {
    this(fluent, instance, false);
  }

  public V1BoundObjectReferenceBuilder(
      io.kubernetes.client.openapi.models.V1BoundObjectReferenceFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1BoundObjectReference instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withKind(instance.getKind());

    fluent.withName(instance.getName());

    fluent.withUid(instance.getUid());

    this.validationEnabled = validationEnabled;
  }

  public V1BoundObjectReferenceBuilder(
      io.kubernetes.client.openapi.models.V1BoundObjectReference instance) {
    this(instance, false);
  }

  public V1BoundObjectReferenceBuilder(
      io.kubernetes.client.openapi.models.V1BoundObjectReference instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withApiVersion(instance.getApiVersion());

    this.withKind(instance.getKind());

    this.withName(instance.getName());

    this.withUid(instance.getUid());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1BoundObjectReferenceFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1BoundObjectReference build() {
    V1BoundObjectReference buildable = new V1BoundObjectReference();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setName(fluent.getName());
    buildable.setUid(fluent.getUid());
    return buildable;
  }
}
