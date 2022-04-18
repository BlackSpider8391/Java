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

public class V1CinderPersistentVolumeSourceBuilder
    extends V1CinderPersistentVolumeSourceFluentImpl<V1CinderPersistentVolumeSourceBuilder>
    implements VisitableBuilder<
        io.kubernetes.client.openapi.models.V1CinderPersistentVolumeSource,
        io.kubernetes.client.openapi.models.V1CinderPersistentVolumeSourceBuilder> {
  public V1CinderPersistentVolumeSourceBuilder() {
    this(false);
  }

  public V1CinderPersistentVolumeSourceBuilder(Boolean validationEnabled) {
    this(new V1CinderPersistentVolumeSource(), validationEnabled);
  }

  public V1CinderPersistentVolumeSourceBuilder(V1CinderPersistentVolumeSourceFluent<?> fluent) {
    this(fluent, false);
  }

  public V1CinderPersistentVolumeSourceBuilder(
      io.kubernetes.client.openapi.models.V1CinderPersistentVolumeSourceFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1CinderPersistentVolumeSource(), validationEnabled);
  }

  public V1CinderPersistentVolumeSourceBuilder(
      io.kubernetes.client.openapi.models.V1CinderPersistentVolumeSourceFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1CinderPersistentVolumeSource instance) {
    this(fluent, instance, false);
  }

  public V1CinderPersistentVolumeSourceBuilder(
      io.kubernetes.client.openapi.models.V1CinderPersistentVolumeSourceFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1CinderPersistentVolumeSource instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withFsType(instance.getFsType());

    fluent.withReadOnly(instance.getReadOnly());

    fluent.withSecretRef(instance.getSecretRef());

    fluent.withVolumeID(instance.getVolumeID());

    this.validationEnabled = validationEnabled;
  }

  public V1CinderPersistentVolumeSourceBuilder(
      io.kubernetes.client.openapi.models.V1CinderPersistentVolumeSource instance) {
    this(instance, false);
  }

  public V1CinderPersistentVolumeSourceBuilder(
      io.kubernetes.client.openapi.models.V1CinderPersistentVolumeSource instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withFsType(instance.getFsType());

    this.withReadOnly(instance.getReadOnly());

    this.withSecretRef(instance.getSecretRef());

    this.withVolumeID(instance.getVolumeID());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1CinderPersistentVolumeSourceFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1CinderPersistentVolumeSource build() {
    V1CinderPersistentVolumeSource buildable = new V1CinderPersistentVolumeSource();
    buildable.setFsType(fluent.getFsType());
    buildable.setReadOnly(fluent.getReadOnly());
    buildable.setSecretRef(fluent.getSecretRef());
    buildable.setVolumeID(fluent.getVolumeID());
    return buildable;
  }
}
