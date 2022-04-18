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

public class V1ProbeBuilder extends V1ProbeFluentImpl<V1ProbeBuilder>
    implements VisitableBuilder<io.kubernetes.client.openapi.models.V1Probe, V1ProbeBuilder> {
  public V1ProbeBuilder() {
    this(false);
  }

  public V1ProbeBuilder(Boolean validationEnabled) {
    this(new V1Probe(), validationEnabled);
  }

  public V1ProbeBuilder(io.kubernetes.client.openapi.models.V1ProbeFluent<?> fluent) {
    this(fluent, false);
  }

  public V1ProbeBuilder(
      io.kubernetes.client.openapi.models.V1ProbeFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1Probe(), validationEnabled);
  }

  public V1ProbeBuilder(
      io.kubernetes.client.openapi.models.V1ProbeFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1Probe instance) {
    this(fluent, instance, false);
  }

  public V1ProbeBuilder(
      io.kubernetes.client.openapi.models.V1ProbeFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1Probe instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withExec(instance.getExec());

    fluent.withFailureThreshold(instance.getFailureThreshold());

    fluent.withGrpc(instance.getGrpc());

    fluent.withHttpGet(instance.getHttpGet());

    fluent.withInitialDelaySeconds(instance.getInitialDelaySeconds());

    fluent.withPeriodSeconds(instance.getPeriodSeconds());

    fluent.withSuccessThreshold(instance.getSuccessThreshold());

    fluent.withTcpSocket(instance.getTcpSocket());

    fluent.withTerminationGracePeriodSeconds(instance.getTerminationGracePeriodSeconds());

    fluent.withTimeoutSeconds(instance.getTimeoutSeconds());

    this.validationEnabled = validationEnabled;
  }

  public V1ProbeBuilder(io.kubernetes.client.openapi.models.V1Probe instance) {
    this(instance, false);
  }

  public V1ProbeBuilder(
      io.kubernetes.client.openapi.models.V1Probe instance, java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withExec(instance.getExec());

    this.withFailureThreshold(instance.getFailureThreshold());

    this.withGrpc(instance.getGrpc());

    this.withHttpGet(instance.getHttpGet());

    this.withInitialDelaySeconds(instance.getInitialDelaySeconds());

    this.withPeriodSeconds(instance.getPeriodSeconds());

    this.withSuccessThreshold(instance.getSuccessThreshold());

    this.withTcpSocket(instance.getTcpSocket());

    this.withTerminationGracePeriodSeconds(instance.getTerminationGracePeriodSeconds());

    this.withTimeoutSeconds(instance.getTimeoutSeconds());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1ProbeFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1Probe build() {
    V1Probe buildable = new V1Probe();
    buildable.setExec(fluent.getExec());
    buildable.setFailureThreshold(fluent.getFailureThreshold());
    buildable.setGrpc(fluent.getGrpc());
    buildable.setHttpGet(fluent.getHttpGet());
    buildable.setInitialDelaySeconds(fluent.getInitialDelaySeconds());
    buildable.setPeriodSeconds(fluent.getPeriodSeconds());
    buildable.setSuccessThreshold(fluent.getSuccessThreshold());
    buildable.setTcpSocket(fluent.getTcpSocket());
    buildable.setTerminationGracePeriodSeconds(fluent.getTerminationGracePeriodSeconds());
    buildable.setTimeoutSeconds(fluent.getTimeoutSeconds());
    return buildable;
  }
}
