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

public class V1TokenRequestStatusBuilder
    extends V1TokenRequestStatusFluentImpl<V1TokenRequestStatusBuilder>
    implements VisitableBuilder<
        io.kubernetes.client.openapi.models.V1TokenRequestStatus,
        io.kubernetes.client.openapi.models.V1TokenRequestStatusBuilder> {
  public V1TokenRequestStatusBuilder() {
    this(false);
  }

  public V1TokenRequestStatusBuilder(Boolean validationEnabled) {
    this(new V1TokenRequestStatus(), validationEnabled);
  }

  public V1TokenRequestStatusBuilder(V1TokenRequestStatusFluent<?> fluent) {
    this(fluent, false);
  }

  public V1TokenRequestStatusBuilder(
      io.kubernetes.client.openapi.models.V1TokenRequestStatusFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1TokenRequestStatus(), validationEnabled);
  }

  public V1TokenRequestStatusBuilder(
      io.kubernetes.client.openapi.models.V1TokenRequestStatusFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1TokenRequestStatus instance) {
    this(fluent, instance, false);
  }

  public V1TokenRequestStatusBuilder(
      io.kubernetes.client.openapi.models.V1TokenRequestStatusFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1TokenRequestStatus instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withExpirationTimestamp(instance.getExpirationTimestamp());

    fluent.withToken(instance.getToken());

    this.validationEnabled = validationEnabled;
  }

  public V1TokenRequestStatusBuilder(
      io.kubernetes.client.openapi.models.V1TokenRequestStatus instance) {
    this(instance, false);
  }

  public V1TokenRequestStatusBuilder(
      io.kubernetes.client.openapi.models.V1TokenRequestStatus instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withExpirationTimestamp(instance.getExpirationTimestamp());

    this.withToken(instance.getToken());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1TokenRequestStatusFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1TokenRequestStatus build() {
    V1TokenRequestStatus buildable = new V1TokenRequestStatus();
    buildable.setExpirationTimestamp(fluent.getExpirationTimestamp());
    buildable.setToken(fluent.getToken());
    return buildable;
  }
}
