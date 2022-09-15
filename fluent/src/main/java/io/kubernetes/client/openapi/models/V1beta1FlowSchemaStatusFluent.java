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
public interface V1beta1FlowSchemaStatusFluent<A extends V1beta1FlowSchemaStatusFluent<A>>
    extends Fluent<A> {
  public A addToConditions(Integer index, V1beta1FlowSchemaCondition item);

  public A setToConditions(Integer index, V1beta1FlowSchemaCondition item);

  public A addToConditions(io.kubernetes.client.openapi.models.V1beta1FlowSchemaCondition... items);

  public A addAllToConditions(Collection<V1beta1FlowSchemaCondition> items);

  public A removeFromConditions(
      io.kubernetes.client.openapi.models.V1beta1FlowSchemaCondition... items);

  public A removeAllFromConditions(Collection<V1beta1FlowSchemaCondition> items);

  public A removeMatchingFromConditions(Predicate<V1beta1FlowSchemaConditionBuilder> predicate);

  /**
   * This method has been deprecated, please use method buildConditions instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public List<V1beta1FlowSchemaCondition> getConditions();

  public List<V1beta1FlowSchemaCondition> buildConditions();

  public V1beta1FlowSchemaCondition buildCondition(Integer index);

  public V1beta1FlowSchemaCondition buildFirstCondition();

  public V1beta1FlowSchemaCondition buildLastCondition();

  public V1beta1FlowSchemaCondition buildMatchingCondition(
      Predicate<V1beta1FlowSchemaConditionBuilder> predicate);

  public Boolean hasMatchingCondition(Predicate<V1beta1FlowSchemaConditionBuilder> predicate);

  public A withConditions(List<V1beta1FlowSchemaCondition> conditions);

  public A withConditions(
      io.kubernetes.client.openapi.models.V1beta1FlowSchemaCondition... conditions);

  public Boolean hasConditions();

  public V1beta1FlowSchemaStatusFluent.ConditionsNested<A> addNewCondition();

  public V1beta1FlowSchemaStatusFluent.ConditionsNested<A> addNewConditionLike(
      V1beta1FlowSchemaCondition item);

  public V1beta1FlowSchemaStatusFluent.ConditionsNested<A> setNewConditionLike(
      Integer index, V1beta1FlowSchemaCondition item);

  public V1beta1FlowSchemaStatusFluent.ConditionsNested<A> editCondition(Integer index);

  public V1beta1FlowSchemaStatusFluent.ConditionsNested<A> editFirstCondition();

  public V1beta1FlowSchemaStatusFluent.ConditionsNested<A> editLastCondition();

  public V1beta1FlowSchemaStatusFluent.ConditionsNested<A> editMatchingCondition(
      Predicate<V1beta1FlowSchemaConditionBuilder> predicate);

  public interface ConditionsNested<N>
      extends Nested<N>,
          V1beta1FlowSchemaConditionFluent<V1beta1FlowSchemaStatusFluent.ConditionsNested<N>> {
    public N and();

    public N endCondition();
  }
}
