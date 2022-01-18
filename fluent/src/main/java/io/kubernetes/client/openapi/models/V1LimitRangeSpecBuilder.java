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

public class V1LimitRangeSpecBuilder
    extends io.kubernetes.client.openapi.models.V1LimitRangeSpecFluentImpl<
        io.kubernetes.client.openapi.models.V1LimitRangeSpecBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V1LimitRangeSpec,
        io.kubernetes.client.openapi.models.V1LimitRangeSpecBuilder> {
  public V1LimitRangeSpecBuilder() {
    this(false);
  }

  public V1LimitRangeSpecBuilder(java.lang.Boolean validationEnabled) {
    this(new V1LimitRangeSpec(), validationEnabled);
  }

  public V1LimitRangeSpecBuilder(
      io.kubernetes.client.openapi.models.V1LimitRangeSpecFluent<?> fluent) {
    this(fluent, false);
  }

  public V1LimitRangeSpecBuilder(
      io.kubernetes.client.openapi.models.V1LimitRangeSpecFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1LimitRangeSpec(), validationEnabled);
  }

  public V1LimitRangeSpecBuilder(
      io.kubernetes.client.openapi.models.V1LimitRangeSpecFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1LimitRangeSpec instance) {
    this(fluent, instance, false);
  }

  public V1LimitRangeSpecBuilder(
      io.kubernetes.client.openapi.models.V1LimitRangeSpecFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1LimitRangeSpec instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withLimits(instance.getLimits());

    this.validationEnabled = validationEnabled;
  }

  public V1LimitRangeSpecBuilder(io.kubernetes.client.openapi.models.V1LimitRangeSpec instance) {
    this(instance, false);
  }

  public V1LimitRangeSpecBuilder(
      io.kubernetes.client.openapi.models.V1LimitRangeSpec instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withLimits(instance.getLimits());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1LimitRangeSpecFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1LimitRangeSpec build() {
    V1LimitRangeSpec buildable = new V1LimitRangeSpec();
    buildable.setLimits(fluent.getLimits());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1LimitRangeSpecBuilder that = (V1LimitRangeSpecBuilder) o;
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
