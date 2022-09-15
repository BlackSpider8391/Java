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
public interface V1TopologySelectorTermFluent<A extends V1TopologySelectorTermFluent<A>>
    extends Fluent<A> {
  public A addToMatchLabelExpressions(Integer index, V1TopologySelectorLabelRequirement item);

  public A setToMatchLabelExpressions(Integer index, V1TopologySelectorLabelRequirement item);

  public A addToMatchLabelExpressions(
      io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirement... items);

  public A addAllToMatchLabelExpressions(Collection<V1TopologySelectorLabelRequirement> items);

  public A removeFromMatchLabelExpressions(
      io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirement... items);

  public A removeAllFromMatchLabelExpressions(Collection<V1TopologySelectorLabelRequirement> items);

  public A removeMatchingFromMatchLabelExpressions(
      Predicate<V1TopologySelectorLabelRequirementBuilder> predicate);

  /**
   * This method has been deprecated, please use method buildMatchLabelExpressions instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public List<V1TopologySelectorLabelRequirement> getMatchLabelExpressions();

  public List<V1TopologySelectorLabelRequirement> buildMatchLabelExpressions();

  public V1TopologySelectorLabelRequirement buildMatchLabelExpression(Integer index);

  public V1TopologySelectorLabelRequirement buildFirstMatchLabelExpression();

  public V1TopologySelectorLabelRequirement buildLastMatchLabelExpression();

  public V1TopologySelectorLabelRequirement buildMatchingMatchLabelExpression(
      Predicate<V1TopologySelectorLabelRequirementBuilder> predicate);

  public Boolean hasMatchingMatchLabelExpression(
      Predicate<V1TopologySelectorLabelRequirementBuilder> predicate);

  public A withMatchLabelExpressions(
      List<V1TopologySelectorLabelRequirement> matchLabelExpressions);

  public A withMatchLabelExpressions(
      io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirement...
          matchLabelExpressions);

  public Boolean hasMatchLabelExpressions();

  public V1TopologySelectorTermFluent.MatchLabelExpressionsNested<A> addNewMatchLabelExpression();

  public V1TopologySelectorTermFluent.MatchLabelExpressionsNested<A> addNewMatchLabelExpressionLike(
      V1TopologySelectorLabelRequirement item);

  public V1TopologySelectorTermFluent.MatchLabelExpressionsNested<A> setNewMatchLabelExpressionLike(
      Integer index, V1TopologySelectorLabelRequirement item);

  public V1TopologySelectorTermFluent.MatchLabelExpressionsNested<A> editMatchLabelExpression(
      Integer index);

  public V1TopologySelectorTermFluent.MatchLabelExpressionsNested<A>
      editFirstMatchLabelExpression();

  public V1TopologySelectorTermFluent.MatchLabelExpressionsNested<A> editLastMatchLabelExpression();

  public V1TopologySelectorTermFluent.MatchLabelExpressionsNested<A>
      editMatchingMatchLabelExpression(
          Predicate<V1TopologySelectorLabelRequirementBuilder> predicate);

  public interface MatchLabelExpressionsNested<N>
      extends Nested<N>,
          V1TopologySelectorLabelRequirementFluent<
              V1TopologySelectorTermFluent.MatchLabelExpressionsNested<N>> {
    public N and();

    public N endMatchLabelExpression();
  }
}
