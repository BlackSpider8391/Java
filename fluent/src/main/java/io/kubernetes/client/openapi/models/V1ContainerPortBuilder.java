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

public class V1ContainerPortBuilder extends V1ContainerPortFluentImpl<V1ContainerPortBuilder>
    implements VisitableBuilder<
        io.kubernetes.client.openapi.models.V1ContainerPort,
        io.kubernetes.client.openapi.models.V1ContainerPortBuilder> {
  public V1ContainerPortBuilder() {
    this(false);
  }

  public V1ContainerPortBuilder(Boolean validationEnabled) {
    this(new V1ContainerPort(), validationEnabled);
  }

  public V1ContainerPortBuilder(V1ContainerPortFluent<?> fluent) {
    this(fluent, false);
  }

  public V1ContainerPortBuilder(
      io.kubernetes.client.openapi.models.V1ContainerPortFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1ContainerPort(), validationEnabled);
  }

  public V1ContainerPortBuilder(
      io.kubernetes.client.openapi.models.V1ContainerPortFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1ContainerPort instance) {
    this(fluent, instance, false);
  }

  public V1ContainerPortBuilder(
      io.kubernetes.client.openapi.models.V1ContainerPortFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1ContainerPort instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withContainerPort(instance.getContainerPort());

    fluent.withHostIP(instance.getHostIP());

    fluent.withHostPort(instance.getHostPort());

    fluent.withName(instance.getName());

    fluent.withProtocol(instance.getProtocol());

    this.validationEnabled = validationEnabled;
  }

  public V1ContainerPortBuilder(io.kubernetes.client.openapi.models.V1ContainerPort instance) {
    this(instance, false);
  }

  public V1ContainerPortBuilder(
      io.kubernetes.client.openapi.models.V1ContainerPort instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withContainerPort(instance.getContainerPort());

    this.withHostIP(instance.getHostIP());

    this.withHostPort(instance.getHostPort());

    this.withName(instance.getName());

    this.withProtocol(instance.getProtocol());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1ContainerPortFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1ContainerPort build() {
    V1ContainerPort buildable = new V1ContainerPort();
    buildable.setContainerPort(fluent.getContainerPort());
    buildable.setHostIP(fluent.getHostIP());
    buildable.setHostPort(fluent.getHostPort());
    buildable.setName(fluent.getName());
    buildable.setProtocol(fluent.getProtocol());
    return buildable;
  }
}
