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

public class V1ISCSIPersistentVolumeSourceBuilder
    extends V1ISCSIPersistentVolumeSourceFluentImpl<V1ISCSIPersistentVolumeSourceBuilder>
    implements VisitableBuilder<
        io.kubernetes.client.openapi.models.V1ISCSIPersistentVolumeSource,
        V1ISCSIPersistentVolumeSourceBuilder> {
  public V1ISCSIPersistentVolumeSourceBuilder() {
    this(false);
  }

  public V1ISCSIPersistentVolumeSourceBuilder(Boolean validationEnabled) {
    this(new V1ISCSIPersistentVolumeSource(), validationEnabled);
  }

  public V1ISCSIPersistentVolumeSourceBuilder(
      io.kubernetes.client.openapi.models.V1ISCSIPersistentVolumeSourceFluent<?> fluent) {
    this(fluent, false);
  }

  public V1ISCSIPersistentVolumeSourceBuilder(
      io.kubernetes.client.openapi.models.V1ISCSIPersistentVolumeSourceFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1ISCSIPersistentVolumeSource(), validationEnabled);
  }

  public V1ISCSIPersistentVolumeSourceBuilder(
      io.kubernetes.client.openapi.models.V1ISCSIPersistentVolumeSourceFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1ISCSIPersistentVolumeSource instance) {
    this(fluent, instance, false);
  }

  public V1ISCSIPersistentVolumeSourceBuilder(
      io.kubernetes.client.openapi.models.V1ISCSIPersistentVolumeSourceFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1ISCSIPersistentVolumeSource instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withChapAuthDiscovery(instance.getChapAuthDiscovery());

    fluent.withChapAuthSession(instance.getChapAuthSession());

    fluent.withFsType(instance.getFsType());

    fluent.withInitiatorName(instance.getInitiatorName());

    fluent.withIqn(instance.getIqn());

    fluent.withIscsiInterface(instance.getIscsiInterface());

    fluent.withLun(instance.getLun());

    fluent.withPortals(instance.getPortals());

    fluent.withReadOnly(instance.getReadOnly());

    fluent.withSecretRef(instance.getSecretRef());

    fluent.withTargetPortal(instance.getTargetPortal());

    this.validationEnabled = validationEnabled;
  }

  public V1ISCSIPersistentVolumeSourceBuilder(
      io.kubernetes.client.openapi.models.V1ISCSIPersistentVolumeSource instance) {
    this(instance, false);
  }

  public V1ISCSIPersistentVolumeSourceBuilder(
      io.kubernetes.client.openapi.models.V1ISCSIPersistentVolumeSource instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withChapAuthDiscovery(instance.getChapAuthDiscovery());

    this.withChapAuthSession(instance.getChapAuthSession());

    this.withFsType(instance.getFsType());

    this.withInitiatorName(instance.getInitiatorName());

    this.withIqn(instance.getIqn());

    this.withIscsiInterface(instance.getIscsiInterface());

    this.withLun(instance.getLun());

    this.withPortals(instance.getPortals());

    this.withReadOnly(instance.getReadOnly());

    this.withSecretRef(instance.getSecretRef());

    this.withTargetPortal(instance.getTargetPortal());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1ISCSIPersistentVolumeSourceFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1ISCSIPersistentVolumeSource build() {
    V1ISCSIPersistentVolumeSource buildable = new V1ISCSIPersistentVolumeSource();
    buildable.setChapAuthDiscovery(fluent.getChapAuthDiscovery());
    buildable.setChapAuthSession(fluent.getChapAuthSession());
    buildable.setFsType(fluent.getFsType());
    buildable.setInitiatorName(fluent.getInitiatorName());
    buildable.setIqn(fluent.getIqn());
    buildable.setIscsiInterface(fluent.getIscsiInterface());
    buildable.setLun(fluent.getLun());
    buildable.setPortals(fluent.getPortals());
    buildable.setReadOnly(fluent.getReadOnly());
    buildable.setSecretRef(fluent.getSecretRef());
    buildable.setTargetPortal(fluent.getTargetPortal());
    return buildable;
  }
}
