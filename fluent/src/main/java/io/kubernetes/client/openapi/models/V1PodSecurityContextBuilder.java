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

public class V1PodSecurityContextBuilder
    extends V1PodSecurityContextFluentImpl<V1PodSecurityContextBuilder>
    implements VisitableBuilder<
        V1PodSecurityContext, io.kubernetes.client.openapi.models.V1PodSecurityContextBuilder> {
  public V1PodSecurityContextBuilder() {
    this(false);
  }

  public V1PodSecurityContextBuilder(Boolean validationEnabled) {
    this(new V1PodSecurityContext(), validationEnabled);
  }

  public V1PodSecurityContextBuilder(V1PodSecurityContextFluent<?> fluent) {
    this(fluent, false);
  }

  public V1PodSecurityContextBuilder(
      io.kubernetes.client.openapi.models.V1PodSecurityContextFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1PodSecurityContext(), validationEnabled);
  }

  public V1PodSecurityContextBuilder(
      io.kubernetes.client.openapi.models.V1PodSecurityContextFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1PodSecurityContext instance) {
    this(fluent, instance, false);
  }

  public V1PodSecurityContextBuilder(
      io.kubernetes.client.openapi.models.V1PodSecurityContextFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1PodSecurityContext instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withFsGroup(instance.getFsGroup());

    fluent.withFsGroupChangePolicy(instance.getFsGroupChangePolicy());

    fluent.withRunAsGroup(instance.getRunAsGroup());

    fluent.withRunAsNonRoot(instance.getRunAsNonRoot());

    fluent.withRunAsUser(instance.getRunAsUser());

    fluent.withSeLinuxOptions(instance.getSeLinuxOptions());

    fluent.withSeccompProfile(instance.getSeccompProfile());

    fluent.withSupplementalGroups(instance.getSupplementalGroups());

    fluent.withSysctls(instance.getSysctls());

    fluent.withWindowsOptions(instance.getWindowsOptions());

    this.validationEnabled = validationEnabled;
  }

  public V1PodSecurityContextBuilder(
      io.kubernetes.client.openapi.models.V1PodSecurityContext instance) {
    this(instance, false);
  }

  public V1PodSecurityContextBuilder(
      io.kubernetes.client.openapi.models.V1PodSecurityContext instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withFsGroup(instance.getFsGroup());

    this.withFsGroupChangePolicy(instance.getFsGroupChangePolicy());

    this.withRunAsGroup(instance.getRunAsGroup());

    this.withRunAsNonRoot(instance.getRunAsNonRoot());

    this.withRunAsUser(instance.getRunAsUser());

    this.withSeLinuxOptions(instance.getSeLinuxOptions());

    this.withSeccompProfile(instance.getSeccompProfile());

    this.withSupplementalGroups(instance.getSupplementalGroups());

    this.withSysctls(instance.getSysctls());

    this.withWindowsOptions(instance.getWindowsOptions());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1PodSecurityContextFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1PodSecurityContext build() {
    V1PodSecurityContext buildable = new V1PodSecurityContext();
    buildable.setFsGroup(fluent.getFsGroup());
    buildable.setFsGroupChangePolicy(fluent.getFsGroupChangePolicy());
    buildable.setRunAsGroup(fluent.getRunAsGroup());
    buildable.setRunAsNonRoot(fluent.getRunAsNonRoot());
    buildable.setRunAsUser(fluent.getRunAsUser());
    buildable.setSeLinuxOptions(fluent.getSeLinuxOptions());
    buildable.setSeccompProfile(fluent.getSeccompProfile());
    buildable.setSupplementalGroups(fluent.getSupplementalGroups());
    buildable.setSysctls(fluent.getSysctls());
    buildable.setWindowsOptions(fluent.getWindowsOptions());
    return buildable;
  }
}
