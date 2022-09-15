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

import io.kubernetes.client.fluent.BaseFluent;

/** Generated */
@SuppressWarnings(value = "unchecked")
public class V1beta1QueuingConfigurationFluentImpl<A extends V1beta1QueuingConfigurationFluent<A>>
    extends BaseFluent<A> implements V1beta1QueuingConfigurationFluent<A> {
  public V1beta1QueuingConfigurationFluentImpl() {}

  public V1beta1QueuingConfigurationFluentImpl(V1beta1QueuingConfiguration instance) {
    this.withHandSize(instance.getHandSize());

    this.withQueueLengthLimit(instance.getQueueLengthLimit());

    this.withQueues(instance.getQueues());
  }

  private Integer handSize;
  private Integer queueLengthLimit;
  private Integer queues;

  public Integer getHandSize() {
    return this.handSize;
  }

  public A withHandSize(Integer handSize) {
    this.handSize = handSize;
    return (A) this;
  }

  public Boolean hasHandSize() {
    return this.handSize != null;
  }

  public Integer getQueueLengthLimit() {
    return this.queueLengthLimit;
  }

  public A withQueueLengthLimit(Integer queueLengthLimit) {
    this.queueLengthLimit = queueLengthLimit;
    return (A) this;
  }

  public Boolean hasQueueLengthLimit() {
    return this.queueLengthLimit != null;
  }

  public Integer getQueues() {
    return this.queues;
  }

  public A withQueues(Integer queues) {
    this.queues = queues;
    return (A) this;
  }

  public Boolean hasQueues() {
    return this.queues != null;
  }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1beta1QueuingConfigurationFluentImpl that = (V1beta1QueuingConfigurationFluentImpl) o;
    if (handSize != null ? !handSize.equals(that.handSize) : that.handSize != null) return false;
    if (queueLengthLimit != null
        ? !queueLengthLimit.equals(that.queueLengthLimit)
        : that.queueLengthLimit != null) return false;
    if (queues != null ? !queues.equals(that.queues) : that.queues != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(handSize, queueLengthLimit, queues, super.hashCode());
  }

  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (handSize != null) {
      sb.append("handSize:");
      sb.append(handSize + ",");
    }
    if (queueLengthLimit != null) {
      sb.append("queueLengthLimit:");
      sb.append(queueLengthLimit + ",");
    }
    if (queues != null) {
      sb.append("queues:");
      sb.append(queues);
    }
    sb.append("}");
    return sb.toString();
  }
}
