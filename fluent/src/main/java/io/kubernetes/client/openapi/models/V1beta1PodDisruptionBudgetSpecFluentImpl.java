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
import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.fluent.Nested;

/** Generated */
@SuppressWarnings(value = "unchecked")
public class V1beta1PodDisruptionBudgetSpecFluentImpl<
        A extends V1beta1PodDisruptionBudgetSpecFluent<A>>
    extends BaseFluent<A> implements V1beta1PodDisruptionBudgetSpecFluent<A> {
  public V1beta1PodDisruptionBudgetSpecFluentImpl() {}

  public V1beta1PodDisruptionBudgetSpecFluentImpl(
      io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetSpec instance) {
    this.withMaxUnavailable(instance.getMaxUnavailable());

    this.withMinAvailable(instance.getMinAvailable());

    this.withSelector(instance.getSelector());
  }

  private IntOrString maxUnavailable;
  private io.kubernetes.client.custom.IntOrString minAvailable;
  private V1LabelSelectorBuilder selector;

  public io.kubernetes.client.custom.IntOrString getMaxUnavailable() {
    return this.maxUnavailable;
  }

  public A withMaxUnavailable(io.kubernetes.client.custom.IntOrString maxUnavailable) {
    this.maxUnavailable = maxUnavailable;
    return (A) this;
  }

  public Boolean hasMaxUnavailable() {
    return this.maxUnavailable != null;
  }

  public A withNewMaxUnavailable(int value) {
    return (A) withMaxUnavailable(new IntOrString(value));
  }

  public A withNewMaxUnavailable(String value) {
    return (A) withMaxUnavailable(new IntOrString(value));
  }

  public io.kubernetes.client.custom.IntOrString getMinAvailable() {
    return this.minAvailable;
  }

  public A withMinAvailable(io.kubernetes.client.custom.IntOrString minAvailable) {
    this.minAvailable = minAvailable;
    return (A) this;
  }

  public java.lang.Boolean hasMinAvailable() {
    return this.minAvailable != null;
  }

  public A withNewMinAvailable(int value) {
    return (A) withMinAvailable(new IntOrString(value));
  }

  public A withNewMinAvailable(java.lang.String value) {
    return (A) withMinAvailable(new IntOrString(value));
  }

  /**
   * This method has been deprecated, please use method buildSelector instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public io.kubernetes.client.openapi.models.V1LabelSelector getSelector() {
    return this.selector != null ? this.selector.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1LabelSelector buildSelector() {
    return this.selector != null ? this.selector.build() : null;
  }

  public A withSelector(io.kubernetes.client.openapi.models.V1LabelSelector selector) {
    _visitables.get("selector").remove(this.selector);
    if (selector != null) {
      this.selector = new V1LabelSelectorBuilder(selector);
      _visitables.get("selector").add(this.selector);
    }
    return (A) this;
  }

  public java.lang.Boolean hasSelector() {
    return this.selector != null;
  }

  public V1beta1PodDisruptionBudgetSpecFluent.SelectorNested<A> withNewSelector() {
    return new V1beta1PodDisruptionBudgetSpecFluentImpl.SelectorNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetSpecFluent.SelectorNested<A>
      withNewSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item) {
    return new V1beta1PodDisruptionBudgetSpecFluentImpl.SelectorNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetSpecFluent.SelectorNested<A>
      editSelector() {
    return withNewSelectorLike(getSelector());
  }

  public io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetSpecFluent.SelectorNested<A>
      editOrNewSelector() {
    return withNewSelectorLike(
        getSelector() != null
            ? getSelector()
            : new io.kubernetes.client.openapi.models.V1LabelSelectorBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetSpecFluent.SelectorNested<A>
      editOrNewSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item) {
    return withNewSelectorLike(getSelector() != null ? getSelector() : item);
  }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1beta1PodDisruptionBudgetSpecFluentImpl that = (V1beta1PodDisruptionBudgetSpecFluentImpl) o;
    if (maxUnavailable != null
        ? !maxUnavailable.equals(that.maxUnavailable)
        : that.maxUnavailable != null) return false;
    if (minAvailable != null ? !minAvailable.equals(that.minAvailable) : that.minAvailable != null)
      return false;
    if (selector != null ? !selector.equals(that.selector) : that.selector != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(maxUnavailable, minAvailable, selector, super.hashCode());
  }

  public java.lang.String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (maxUnavailable != null) {
      sb.append("maxUnavailable:");
      sb.append(maxUnavailable + ",");
    }
    if (minAvailable != null) {
      sb.append("minAvailable:");
      sb.append(minAvailable + ",");
    }
    if (selector != null) {
      sb.append("selector:");
      sb.append(selector);
    }
    sb.append("}");
    return sb.toString();
  }

  class SelectorNestedImpl<N>
      extends V1LabelSelectorFluentImpl<V1beta1PodDisruptionBudgetSpecFluent.SelectorNested<N>>
      implements io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetSpecFluent
                  .SelectorNested<
              N>,
          Nested<N> {
    SelectorNestedImpl(V1LabelSelector item) {
      this.builder = new V1LabelSelectorBuilder(this, item);
    }

    SelectorNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1LabelSelectorBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1LabelSelectorBuilder builder;

    public N and() {
      return (N) V1beta1PodDisruptionBudgetSpecFluentImpl.this.withSelector(builder.build());
    }

    public N endSelector() {
      return and();
    }
  }
}
