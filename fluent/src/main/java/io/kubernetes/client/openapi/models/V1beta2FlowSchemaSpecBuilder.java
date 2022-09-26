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

public class V1beta2FlowSchemaSpecBuilder
    extends V1beta2FlowSchemaSpecFluentImpl<V1beta2FlowSchemaSpecBuilder>
    implements VisitableBuilder<V1beta2FlowSchemaSpec, V1beta2FlowSchemaSpecBuilder> {
  public V1beta2FlowSchemaSpecBuilder() {
    this(false);
  }

  public V1beta2FlowSchemaSpecBuilder(Boolean validationEnabled) {
    this(new V1beta2FlowSchemaSpec(), validationEnabled);
  }

  public V1beta2FlowSchemaSpecBuilder(V1beta2FlowSchemaSpecFluent<?> fluent) {
    this(fluent, false);
  }

  public V1beta2FlowSchemaSpecBuilder(
      V1beta2FlowSchemaSpecFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V1beta2FlowSchemaSpec(), validationEnabled);
  }

  public V1beta2FlowSchemaSpecBuilder(
      V1beta2FlowSchemaSpecFluent<?> fluent, V1beta2FlowSchemaSpec instance) {
    this(fluent, instance, false);
  }

  public V1beta2FlowSchemaSpecBuilder(
      V1beta2FlowSchemaSpecFluent<?> fluent,
      V1beta2FlowSchemaSpec instance,
      Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withDistinguisherMethod(instance.getDistinguisherMethod());

    fluent.withMatchingPrecedence(instance.getMatchingPrecedence());

    fluent.withPriorityLevelConfiguration(instance.getPriorityLevelConfiguration());

    fluent.withRules(instance.getRules());

    this.validationEnabled = validationEnabled;
  }

  public V1beta2FlowSchemaSpecBuilder(V1beta2FlowSchemaSpec instance) {
    this(instance, false);
  }

  public V1beta2FlowSchemaSpecBuilder(V1beta2FlowSchemaSpec instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withDistinguisherMethod(instance.getDistinguisherMethod());

    this.withMatchingPrecedence(instance.getMatchingPrecedence());

    this.withPriorityLevelConfiguration(instance.getPriorityLevelConfiguration());

    this.withRules(instance.getRules());

    this.validationEnabled = validationEnabled;
  }

  V1beta2FlowSchemaSpecFluent<?> fluent;
  Boolean validationEnabled;

  public V1beta2FlowSchemaSpec build() {
    V1beta2FlowSchemaSpec buildable = new V1beta2FlowSchemaSpec();
    buildable.setDistinguisherMethod(fluent.getDistinguisherMethod());
    buildable.setMatchingPrecedence(fluent.getMatchingPrecedence());
    buildable.setPriorityLevelConfiguration(fluent.getPriorityLevelConfiguration());
    buildable.setRules(fluent.getRules());
    return buildable;
  }
}
