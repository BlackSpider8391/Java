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

import io.kubernetes.client.custom.IntOrString;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;

/** Generated */
public interface V1PodDisruptionBudgetSpecFluent<A extends V1PodDisruptionBudgetSpecFluent<A>>
    extends Fluent<A> {
  public IntOrString getMaxUnavailable();

  public A withMaxUnavailable(IntOrString maxUnavailable);

  public Boolean hasMaxUnavailable();

  public A withNewMaxUnavailable(int value);

  public A withNewMaxUnavailable(String value);

  public IntOrString getMinAvailable();

  public A withMinAvailable(IntOrString minAvailable);

  public Boolean hasMinAvailable();

  public A withNewMinAvailable(int value);

  public A withNewMinAvailable(String value);

  /**
   * This method has been deprecated, please use method buildSelector instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V1LabelSelector getSelector();

  public V1LabelSelector buildSelector();

  public A withSelector(V1LabelSelector selector);

  public Boolean hasSelector();

  public V1PodDisruptionBudgetSpecFluent.SelectorNested<A> withNewSelector();

  public V1PodDisruptionBudgetSpecFluent.SelectorNested<A> withNewSelectorLike(
      V1LabelSelector item);

  public V1PodDisruptionBudgetSpecFluent.SelectorNested<A> editSelector();

  public V1PodDisruptionBudgetSpecFluent.SelectorNested<A> editOrNewSelector();

  public V1PodDisruptionBudgetSpecFluent.SelectorNested<A> editOrNewSelectorLike(
      V1LabelSelector item);

  public interface SelectorNested<N>
      extends Nested<N>, V1LabelSelectorFluent<V1PodDisruptionBudgetSpecFluent.SelectorNested<N>> {
    public N and();

    public N endSelector();
  }
}
