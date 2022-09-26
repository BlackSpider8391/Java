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
public interface V1beta2PriorityLevelConfigurationStatusFluent<
        A extends V1beta2PriorityLevelConfigurationStatusFluent<A>>
    extends Fluent<A> {
  public A addToConditions(Integer index, V1beta2PriorityLevelConfigurationCondition item);

  public A setToConditions(Integer index, V1beta2PriorityLevelConfigurationCondition item);

  public A addToConditions(
      io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationCondition... items);

  public A addAllToConditions(Collection<V1beta2PriorityLevelConfigurationCondition> items);

  public A removeFromConditions(
      io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationCondition... items);

  public A removeAllFromConditions(Collection<V1beta2PriorityLevelConfigurationCondition> items);

  public A removeMatchingFromConditions(
      Predicate<V1beta2PriorityLevelConfigurationConditionBuilder> predicate);

  /**
   * This method has been deprecated, please use method buildConditions instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public List<V1beta2PriorityLevelConfigurationCondition> getConditions();

  public List<V1beta2PriorityLevelConfigurationCondition> buildConditions();

  public V1beta2PriorityLevelConfigurationCondition buildCondition(Integer index);

  public V1beta2PriorityLevelConfigurationCondition buildFirstCondition();

  public V1beta2PriorityLevelConfigurationCondition buildLastCondition();

  public V1beta2PriorityLevelConfigurationCondition buildMatchingCondition(
      Predicate<V1beta2PriorityLevelConfigurationConditionBuilder> predicate);

  public Boolean hasMatchingCondition(
      Predicate<V1beta2PriorityLevelConfigurationConditionBuilder> predicate);

  public A withConditions(List<V1beta2PriorityLevelConfigurationCondition> conditions);

  public A withConditions(
      io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationCondition... conditions);

  public Boolean hasConditions();

  public V1beta2PriorityLevelConfigurationStatusFluent.ConditionsNested<A> addNewCondition();

  public V1beta2PriorityLevelConfigurationStatusFluent.ConditionsNested<A> addNewConditionLike(
      V1beta2PriorityLevelConfigurationCondition item);

  public V1beta2PriorityLevelConfigurationStatusFluent.ConditionsNested<A> setNewConditionLike(
      Integer index, V1beta2PriorityLevelConfigurationCondition item);

  public V1beta2PriorityLevelConfigurationStatusFluent.ConditionsNested<A> editCondition(
      Integer index);

  public V1beta2PriorityLevelConfigurationStatusFluent.ConditionsNested<A> editFirstCondition();

  public V1beta2PriorityLevelConfigurationStatusFluent.ConditionsNested<A> editLastCondition();

  public V1beta2PriorityLevelConfigurationStatusFluent.ConditionsNested<A> editMatchingCondition(
      Predicate<V1beta2PriorityLevelConfigurationConditionBuilder> predicate);

  public interface ConditionsNested<N>
      extends Nested<N>,
          V1beta2PriorityLevelConfigurationConditionFluent<
              V1beta2PriorityLevelConfigurationStatusFluent.ConditionsNested<N>> {
    public N and();

    public N endCondition();
  }
}
