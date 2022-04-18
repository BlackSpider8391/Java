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

public class V1beta2FlowDistinguisherMethodBuilder
    extends V1beta2FlowDistinguisherMethodFluentImpl<V1beta2FlowDistinguisherMethodBuilder>
    implements VisitableBuilder<
        io.kubernetes.client.openapi.models.V1beta2FlowDistinguisherMethod,
        io.kubernetes.client.openapi.models.V1beta2FlowDistinguisherMethodBuilder> {
  public V1beta2FlowDistinguisherMethodBuilder() {
    this(false);
  }

  public V1beta2FlowDistinguisherMethodBuilder(Boolean validationEnabled) {
    this(new V1beta2FlowDistinguisherMethod(), validationEnabled);
  }

  public V1beta2FlowDistinguisherMethodBuilder(V1beta2FlowDistinguisherMethodFluent<?> fluent) {
    this(fluent, false);
  }

  public V1beta2FlowDistinguisherMethodBuilder(
      io.kubernetes.client.openapi.models.V1beta2FlowDistinguisherMethodFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1beta2FlowDistinguisherMethod(), validationEnabled);
  }

  public V1beta2FlowDistinguisherMethodBuilder(
      io.kubernetes.client.openapi.models.V1beta2FlowDistinguisherMethodFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1beta2FlowDistinguisherMethod instance) {
    this(fluent, instance, false);
  }

  public V1beta2FlowDistinguisherMethodBuilder(
      io.kubernetes.client.openapi.models.V1beta2FlowDistinguisherMethodFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1beta2FlowDistinguisherMethod instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withType(instance.getType());

    this.validationEnabled = validationEnabled;
  }

  public V1beta2FlowDistinguisherMethodBuilder(
      io.kubernetes.client.openapi.models.V1beta2FlowDistinguisherMethod instance) {
    this(instance, false);
  }

  public V1beta2FlowDistinguisherMethodBuilder(
      io.kubernetes.client.openapi.models.V1beta2FlowDistinguisherMethod instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withType(instance.getType());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1beta2FlowDistinguisherMethodFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1beta2FlowDistinguisherMethod build() {
    V1beta2FlowDistinguisherMethod buildable = new V1beta2FlowDistinguisherMethod();
    buildable.setType(fluent.getType());
    return buildable;
  }
}
