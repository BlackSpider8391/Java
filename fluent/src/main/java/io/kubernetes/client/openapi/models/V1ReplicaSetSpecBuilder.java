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

public class V1ReplicaSetSpecBuilder extends V1ReplicaSetSpecFluentImpl<V1ReplicaSetSpecBuilder>
    implements VisitableBuilder<
        io.kubernetes.client.openapi.models.V1ReplicaSetSpec,
        io.kubernetes.client.openapi.models.V1ReplicaSetSpecBuilder> {
  public V1ReplicaSetSpecBuilder() {
    this(false);
  }

  public V1ReplicaSetSpecBuilder(Boolean validationEnabled) {
    this(new V1ReplicaSetSpec(), validationEnabled);
  }

  public V1ReplicaSetSpecBuilder(V1ReplicaSetSpecFluent<?> fluent) {
    this(fluent, false);
  }

  public V1ReplicaSetSpecBuilder(
      io.kubernetes.client.openapi.models.V1ReplicaSetSpecFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1ReplicaSetSpec(), validationEnabled);
  }

  public V1ReplicaSetSpecBuilder(
      io.kubernetes.client.openapi.models.V1ReplicaSetSpecFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1ReplicaSetSpec instance) {
    this(fluent, instance, false);
  }

  public V1ReplicaSetSpecBuilder(
      io.kubernetes.client.openapi.models.V1ReplicaSetSpecFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1ReplicaSetSpec instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withMinReadySeconds(instance.getMinReadySeconds());

    fluent.withReplicas(instance.getReplicas());

    fluent.withSelector(instance.getSelector());

    fluent.withTemplate(instance.getTemplate());

    this.validationEnabled = validationEnabled;
  }

  public V1ReplicaSetSpecBuilder(io.kubernetes.client.openapi.models.V1ReplicaSetSpec instance) {
    this(instance, false);
  }

  public V1ReplicaSetSpecBuilder(
      io.kubernetes.client.openapi.models.V1ReplicaSetSpec instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withMinReadySeconds(instance.getMinReadySeconds());

    this.withReplicas(instance.getReplicas());

    this.withSelector(instance.getSelector());

    this.withTemplate(instance.getTemplate());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1ReplicaSetSpecFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1ReplicaSetSpec build() {
    V1ReplicaSetSpec buildable = new V1ReplicaSetSpec();
    buildable.setMinReadySeconds(fluent.getMinReadySeconds());
    buildable.setReplicas(fluent.getReplicas());
    buildable.setSelector(fluent.getSelector());
    buildable.setTemplate(fluent.getTemplate());
    return buildable;
  }
}
