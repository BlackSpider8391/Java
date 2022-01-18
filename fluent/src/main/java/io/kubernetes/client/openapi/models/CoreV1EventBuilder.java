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

public class CoreV1EventBuilder
    extends io.kubernetes.client.openapi.models.CoreV1EventFluentImpl<
        io.kubernetes.client.openapi.models.CoreV1EventBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.CoreV1Event,
        io.kubernetes.client.openapi.models.CoreV1EventBuilder> {
  public CoreV1EventBuilder() {
    this(false);
  }

  public CoreV1EventBuilder(java.lang.Boolean validationEnabled) {
    this(new CoreV1Event(), validationEnabled);
  }

  public CoreV1EventBuilder(io.kubernetes.client.openapi.models.CoreV1EventFluent<?> fluent) {
    this(fluent, false);
  }

  public CoreV1EventBuilder(
      io.kubernetes.client.openapi.models.CoreV1EventFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new CoreV1Event(), validationEnabled);
  }

  public CoreV1EventBuilder(
      io.kubernetes.client.openapi.models.CoreV1EventFluent<?> fluent,
      io.kubernetes.client.openapi.models.CoreV1Event instance) {
    this(fluent, instance, false);
  }

  public CoreV1EventBuilder(
      io.kubernetes.client.openapi.models.CoreV1EventFluent<?> fluent,
      io.kubernetes.client.openapi.models.CoreV1Event instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withAction(instance.getAction());

    fluent.withApiVersion(instance.getApiVersion());

    fluent.withCount(instance.getCount());

    fluent.withEventTime(instance.getEventTime());

    fluent.withFirstTimestamp(instance.getFirstTimestamp());

    fluent.withInvolvedObject(instance.getInvolvedObject());

    fluent.withKind(instance.getKind());

    fluent.withLastTimestamp(instance.getLastTimestamp());

    fluent.withMessage(instance.getMessage());

    fluent.withMetadata(instance.getMetadata());

    fluent.withReason(instance.getReason());

    fluent.withRelated(instance.getRelated());

    fluent.withReportingComponent(instance.getReportingComponent());

    fluent.withReportingInstance(instance.getReportingInstance());

    fluent.withSeries(instance.getSeries());

    fluent.withSource(instance.getSource());

    fluent.withType(instance.getType());

    this.validationEnabled = validationEnabled;
  }

  public CoreV1EventBuilder(io.kubernetes.client.openapi.models.CoreV1Event instance) {
    this(instance, false);
  }

  public CoreV1EventBuilder(
      io.kubernetes.client.openapi.models.CoreV1Event instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withAction(instance.getAction());

    this.withApiVersion(instance.getApiVersion());

    this.withCount(instance.getCount());

    this.withEventTime(instance.getEventTime());

    this.withFirstTimestamp(instance.getFirstTimestamp());

    this.withInvolvedObject(instance.getInvolvedObject());

    this.withKind(instance.getKind());

    this.withLastTimestamp(instance.getLastTimestamp());

    this.withMessage(instance.getMessage());

    this.withMetadata(instance.getMetadata());

    this.withReason(instance.getReason());

    this.withRelated(instance.getRelated());

    this.withReportingComponent(instance.getReportingComponent());

    this.withReportingInstance(instance.getReportingInstance());

    this.withSeries(instance.getSeries());

    this.withSource(instance.getSource());

    this.withType(instance.getType());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.CoreV1EventFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.CoreV1Event build() {
    CoreV1Event buildable = new CoreV1Event();
    buildable.setAction(fluent.getAction());
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setCount(fluent.getCount());
    buildable.setEventTime(fluent.getEventTime());
    buildable.setFirstTimestamp(fluent.getFirstTimestamp());
    buildable.setInvolvedObject(fluent.getInvolvedObject());
    buildable.setKind(fluent.getKind());
    buildable.setLastTimestamp(fluent.getLastTimestamp());
    buildable.setMessage(fluent.getMessage());
    buildable.setMetadata(fluent.getMetadata());
    buildable.setReason(fluent.getReason());
    buildable.setRelated(fluent.getRelated());
    buildable.setReportingComponent(fluent.getReportingComponent());
    buildable.setReportingInstance(fluent.getReportingInstance());
    buildable.setSeries(fluent.getSeries());
    buildable.setSource(fluent.getSource());
    buildable.setType(fluent.getType());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    CoreV1EventBuilder that = (CoreV1EventBuilder) o;
    if (fluent != null && fluent != this
        ? !fluent.equals(that.fluent)
        : that.fluent != null && fluent != this) return false;

    if (validationEnabled != null
        ? !validationEnabled.equals(that.validationEnabled)
        : that.validationEnabled != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(fluent, validationEnabled, super.hashCode());
  }
}
