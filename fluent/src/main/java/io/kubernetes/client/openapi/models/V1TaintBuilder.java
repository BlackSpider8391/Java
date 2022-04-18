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

public class V1TaintBuilder extends V1TaintFluentImpl<V1TaintBuilder>
    implements VisitableBuilder<
        io.kubernetes.client.openapi.models.V1Taint,
        io.kubernetes.client.openapi.models.V1TaintBuilder> {
  public V1TaintBuilder() {
    this(false);
  }

  public V1TaintBuilder(Boolean validationEnabled) {
    this(new V1Taint(), validationEnabled);
  }

  public V1TaintBuilder(V1TaintFluent<?> fluent) {
    this(fluent, false);
  }

  public V1TaintBuilder(
      io.kubernetes.client.openapi.models.V1TaintFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1Taint(), validationEnabled);
  }

  public V1TaintBuilder(
      io.kubernetes.client.openapi.models.V1TaintFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1Taint instance) {
    this(fluent, instance, false);
  }

  public V1TaintBuilder(
      io.kubernetes.client.openapi.models.V1TaintFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1Taint instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withEffect(instance.getEffect());

    fluent.withKey(instance.getKey());

    fluent.withTimeAdded(instance.getTimeAdded());

    fluent.withValue(instance.getValue());

    this.validationEnabled = validationEnabled;
  }

  public V1TaintBuilder(io.kubernetes.client.openapi.models.V1Taint instance) {
    this(instance, false);
  }

  public V1TaintBuilder(
      io.kubernetes.client.openapi.models.V1Taint instance, java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withEffect(instance.getEffect());

    this.withKey(instance.getKey());

    this.withTimeAdded(instance.getTimeAdded());

    this.withValue(instance.getValue());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1TaintFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1Taint build() {
    V1Taint buildable = new V1Taint();
    buildable.setEffect(fluent.getEffect());
    buildable.setKey(fluent.getKey());
    buildable.setTimeAdded(fluent.getTimeAdded());
    buildable.setValue(fluent.getValue());
    return buildable;
  }
}
