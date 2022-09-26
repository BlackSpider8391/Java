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

import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

/** Generated */
public interface V1ReplicationControllerStatusFluent<
        A extends V1ReplicationControllerStatusFluent<A>>
    extends Fluent<A> {
  public Integer getAvailableReplicas();

  public A withAvailableReplicas(Integer availableReplicas);

  public Boolean hasAvailableReplicas();

  public A addToConditions(Integer index, V1ReplicationControllerCondition item);

  public A setToConditions(Integer index, V1ReplicationControllerCondition item);

  public A addToConditions(
      io.kubernetes.client.openapi.models.V1ReplicationControllerCondition... items);

  public A addAllToConditions(Collection<V1ReplicationControllerCondition> items);

  public A removeFromConditions(
      io.kubernetes.client.openapi.models.V1ReplicationControllerCondition... items);

  public A removeAllFromConditions(Collection<V1ReplicationControllerCondition> items);

  public A removeMatchingFromConditions(
      Predicate<V1ReplicationControllerConditionBuilder> predicate);

  /**
   * This method has been deprecated, please use method buildConditions instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public List<V1ReplicationControllerCondition> getConditions();

  public List<V1ReplicationControllerCondition> buildConditions();

  public V1ReplicationControllerCondition buildCondition(Integer index);

  public V1ReplicationControllerCondition buildFirstCondition();

  public V1ReplicationControllerCondition buildLastCondition();

  public V1ReplicationControllerCondition buildMatchingCondition(
      Predicate<V1ReplicationControllerConditionBuilder> predicate);

  public Boolean hasMatchingCondition(Predicate<V1ReplicationControllerConditionBuilder> predicate);

  public A withConditions(List<V1ReplicationControllerCondition> conditions);

  public A withConditions(
      io.kubernetes.client.openapi.models.V1ReplicationControllerCondition... conditions);

  public Boolean hasConditions();

  public V1ReplicationControllerStatusFluent.ConditionsNested<A> addNewCondition();

  public V1ReplicationControllerStatusFluent.ConditionsNested<A> addNewConditionLike(
      V1ReplicationControllerCondition item);

  public V1ReplicationControllerStatusFluent.ConditionsNested<A> setNewConditionLike(
      Integer index, V1ReplicationControllerCondition item);

  public V1ReplicationControllerStatusFluent.ConditionsNested<A> editCondition(Integer index);

  public V1ReplicationControllerStatusFluent.ConditionsNested<A> editFirstCondition();

  public V1ReplicationControllerStatusFluent.ConditionsNested<A> editLastCondition();

  public V1ReplicationControllerStatusFluent.ConditionsNested<A> editMatchingCondition(
      Predicate<V1ReplicationControllerConditionBuilder> predicate);

  public Integer getFullyLabeledReplicas();

  public A withFullyLabeledReplicas(Integer fullyLabeledReplicas);

  public Boolean hasFullyLabeledReplicas();

  public Long getObservedGeneration();

  public A withObservedGeneration(Long observedGeneration);

  public Boolean hasObservedGeneration();

  public Integer getReadyReplicas();

  public A withReadyReplicas(Integer readyReplicas);

  public Boolean hasReadyReplicas();

  public Integer getReplicas();

  public A withReplicas(Integer replicas);

  public Boolean hasReplicas();

  public interface ConditionsNested<N>
      extends Nested<N>,
          V1ReplicationControllerConditionFluent<
              V1ReplicationControllerStatusFluent.ConditionsNested<N>> {
    public N and();

    public N endCondition();
  }
}
