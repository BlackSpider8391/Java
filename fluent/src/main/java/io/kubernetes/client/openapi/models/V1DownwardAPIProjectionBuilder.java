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

public class V1DownwardAPIProjectionBuilder
    extends io.kubernetes.client.openapi.models.V1DownwardAPIProjectionFluentImpl<
        io.kubernetes.client.openapi.models.V1DownwardAPIProjectionBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V1DownwardAPIProjection,
        io.kubernetes.client.openapi.models.V1DownwardAPIProjectionBuilder> {
  public V1DownwardAPIProjectionBuilder() {
    this(false);
  }

  public V1DownwardAPIProjectionBuilder(java.lang.Boolean validationEnabled) {
    this(new V1DownwardAPIProjection(), validationEnabled);
  }

  public V1DownwardAPIProjectionBuilder(
      io.kubernetes.client.openapi.models.V1DownwardAPIProjectionFluent<?> fluent) {
    this(fluent, false);
  }

  public V1DownwardAPIProjectionBuilder(
      io.kubernetes.client.openapi.models.V1DownwardAPIProjectionFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1DownwardAPIProjection(), validationEnabled);
  }

  public V1DownwardAPIProjectionBuilder(
      io.kubernetes.client.openapi.models.V1DownwardAPIProjectionFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1DownwardAPIProjection instance) {
    this(fluent, instance, false);
  }

  public V1DownwardAPIProjectionBuilder(
      io.kubernetes.client.openapi.models.V1DownwardAPIProjectionFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1DownwardAPIProjection instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withItems(instance.getItems());

    this.validationEnabled = validationEnabled;
  }

  public V1DownwardAPIProjectionBuilder(
      io.kubernetes.client.openapi.models.V1DownwardAPIProjection instance) {
    this(instance, false);
  }

  public V1DownwardAPIProjectionBuilder(
      io.kubernetes.client.openapi.models.V1DownwardAPIProjection instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withItems(instance.getItems());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1DownwardAPIProjectionFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1DownwardAPIProjection build() {
    V1DownwardAPIProjection buildable = new V1DownwardAPIProjection();
    buildable.setItems(fluent.getItems());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1DownwardAPIProjectionBuilder that = (V1DownwardAPIProjectionBuilder) o;
    if (fluent != null && fluent != this
        ? !fluent.equals(that.fluent)
        : that.fluent != null && fluent != this) return false;

    if (validationEnabled != null
        ? !validationEnabled.equals(that.validationEnabled)
        : that.validationEnabled != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(fluent, validationEnabled, super.hashCode());
  }
}
