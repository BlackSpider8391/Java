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

public class V1beta2PriorityLevelConfigurationSpecBuilder
    extends V1beta2PriorityLevelConfigurationSpecFluentImpl<
        V1beta2PriorityLevelConfigurationSpecBuilder>
    implements VisitableBuilder<
        io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationSpec,
        V1beta2PriorityLevelConfigurationSpecBuilder> {
  public V1beta2PriorityLevelConfigurationSpecBuilder() {
    this(false);
  }

  public V1beta2PriorityLevelConfigurationSpecBuilder(Boolean validationEnabled) {
    this(new V1beta2PriorityLevelConfigurationSpec(), validationEnabled);
  }

  public V1beta2PriorityLevelConfigurationSpecBuilder(
      V1beta2PriorityLevelConfigurationSpecFluent<?> fluent) {
    this(fluent, false);
  }

  public V1beta2PriorityLevelConfigurationSpecBuilder(
      io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationSpecFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1beta2PriorityLevelConfigurationSpec(), validationEnabled);
  }

  public V1beta2PriorityLevelConfigurationSpecBuilder(
      io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationSpecFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationSpec instance) {
    this(fluent, instance, false);
  }

  public V1beta2PriorityLevelConfigurationSpecBuilder(
      io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationSpecFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationSpec instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withLimited(instance.getLimited());

    fluent.withType(instance.getType());

    this.validationEnabled = validationEnabled;
  }

  public V1beta2PriorityLevelConfigurationSpecBuilder(
      io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationSpec instance) {
    this(instance, false);
  }

  public V1beta2PriorityLevelConfigurationSpecBuilder(
      io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationSpec instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withLimited(instance.getLimited());

    this.withType(instance.getType());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationSpecFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationSpec build() {
    V1beta2PriorityLevelConfigurationSpec buildable = new V1beta2PriorityLevelConfigurationSpec();
    buildable.setLimited(fluent.getLimited());
    buildable.setType(fluent.getType());
    return buildable;
  }
}
