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

public class V1PortworxVolumeSourceBuilder
    extends V1PortworxVolumeSourceFluentImpl<V1PortworxVolumeSourceBuilder>
    implements VisitableBuilder<
        io.kubernetes.client.openapi.models.V1PortworxVolumeSource, V1PortworxVolumeSourceBuilder> {
  public V1PortworxVolumeSourceBuilder() {
    this(false);
  }

  public V1PortworxVolumeSourceBuilder(Boolean validationEnabled) {
    this(new V1PortworxVolumeSource(), validationEnabled);
  }

  public V1PortworxVolumeSourceBuilder(
      io.kubernetes.client.openapi.models.V1PortworxVolumeSourceFluent<?> fluent) {
    this(fluent, false);
  }

  public V1PortworxVolumeSourceBuilder(
      io.kubernetes.client.openapi.models.V1PortworxVolumeSourceFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1PortworxVolumeSource(), validationEnabled);
  }

  public V1PortworxVolumeSourceBuilder(
      io.kubernetes.client.openapi.models.V1PortworxVolumeSourceFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1PortworxVolumeSource instance) {
    this(fluent, instance, false);
  }

  public V1PortworxVolumeSourceBuilder(
      io.kubernetes.client.openapi.models.V1PortworxVolumeSourceFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1PortworxVolumeSource instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withFsType(instance.getFsType());

    fluent.withReadOnly(instance.getReadOnly());

    fluent.withVolumeID(instance.getVolumeID());

    this.validationEnabled = validationEnabled;
  }

  public V1PortworxVolumeSourceBuilder(
      io.kubernetes.client.openapi.models.V1PortworxVolumeSource instance) {
    this(instance, false);
  }

  public V1PortworxVolumeSourceBuilder(
      io.kubernetes.client.openapi.models.V1PortworxVolumeSource instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withFsType(instance.getFsType());

    this.withReadOnly(instance.getReadOnly());

    this.withVolumeID(instance.getVolumeID());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1PortworxVolumeSourceFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1PortworxVolumeSource build() {
    V1PortworxVolumeSource buildable = new V1PortworxVolumeSource();
    buildable.setFsType(fluent.getFsType());
    buildable.setReadOnly(fluent.getReadOnly());
    buildable.setVolumeID(fluent.getVolumeID());
    return buildable;
  }
}
