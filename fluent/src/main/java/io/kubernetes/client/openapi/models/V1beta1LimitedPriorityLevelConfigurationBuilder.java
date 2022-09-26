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

public class V1beta1LimitedPriorityLevelConfigurationBuilder
    extends V1beta1LimitedPriorityLevelConfigurationFluentImpl<
        V1beta1LimitedPriorityLevelConfigurationBuilder>
    implements VisitableBuilder<
        V1beta1LimitedPriorityLevelConfiguration, V1beta1LimitedPriorityLevelConfigurationBuilder> {
  public V1beta1LimitedPriorityLevelConfigurationBuilder() {
    this(false);
  }

  public V1beta1LimitedPriorityLevelConfigurationBuilder(Boolean validationEnabled) {
    this(new V1beta1LimitedPriorityLevelConfiguration(), validationEnabled);
  }

  public V1beta1LimitedPriorityLevelConfigurationBuilder(
      V1beta1LimitedPriorityLevelConfigurationFluent<?> fluent) {
    this(fluent, false);
  }

  public V1beta1LimitedPriorityLevelConfigurationBuilder(
      V1beta1LimitedPriorityLevelConfigurationFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V1beta1LimitedPriorityLevelConfiguration(), validationEnabled);
  }

  public V1beta1LimitedPriorityLevelConfigurationBuilder(
      V1beta1LimitedPriorityLevelConfigurationFluent<?> fluent,
      V1beta1LimitedPriorityLevelConfiguration instance) {
    this(fluent, instance, false);
  }

  public V1beta1LimitedPriorityLevelConfigurationBuilder(
      V1beta1LimitedPriorityLevelConfigurationFluent<?> fluent,
      V1beta1LimitedPriorityLevelConfiguration instance,
      Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withAssuredConcurrencyShares(instance.getAssuredConcurrencyShares());

    fluent.withLimitResponse(instance.getLimitResponse());

    this.validationEnabled = validationEnabled;
  }

  public V1beta1LimitedPriorityLevelConfigurationBuilder(
      V1beta1LimitedPriorityLevelConfiguration instance) {
    this(instance, false);
  }

  public V1beta1LimitedPriorityLevelConfigurationBuilder(
      V1beta1LimitedPriorityLevelConfiguration instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withAssuredConcurrencyShares(instance.getAssuredConcurrencyShares());

    this.withLimitResponse(instance.getLimitResponse());

    this.validationEnabled = validationEnabled;
  }

  V1beta1LimitedPriorityLevelConfigurationFluent<?> fluent;
  Boolean validationEnabled;

  public V1beta1LimitedPriorityLevelConfiguration build() {
    V1beta1LimitedPriorityLevelConfiguration buildable =
        new V1beta1LimitedPriorityLevelConfiguration();
    buildable.setAssuredConcurrencyShares(fluent.getAssuredConcurrencyShares());
    buildable.setLimitResponse(fluent.getLimitResponse());
    return buildable;
  }
}
