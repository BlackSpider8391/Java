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
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

/** Generated */
@SuppressWarnings(value = "unchecked")
public class V1NetworkPolicyStatusFluentImpl<A extends V1NetworkPolicyStatusFluent<A>>
    extends BaseFluent<A> implements V1NetworkPolicyStatusFluent<A> {
  public V1NetworkPolicyStatusFluentImpl() {}

  public V1NetworkPolicyStatusFluentImpl(
      io.kubernetes.client.openapi.models.V1NetworkPolicyStatus instance) {
    this.withConditions(instance.getConditions());
  }

  private ArrayList<V1ConditionBuilder> conditions;

  public A addToConditions(Integer index, V1Condition item) {
    if (this.conditions == null) {
      this.conditions =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1ConditionBuilder>();
    }
    io.kubernetes.client.openapi.models.V1ConditionBuilder builder =
        new io.kubernetes.client.openapi.models.V1ConditionBuilder(item);
    _visitables
        .get("conditions")
        .add(index >= 0 ? index : _visitables.get("conditions").size(), builder);
    this.conditions.add(index >= 0 ? index : conditions.size(), builder);
    return (A) this;
  }

  public A setToConditions(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1Condition item) {
    if (this.conditions == null) {
      this.conditions =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1ConditionBuilder>();
    }
    io.kubernetes.client.openapi.models.V1ConditionBuilder builder =
        new io.kubernetes.client.openapi.models.V1ConditionBuilder(item);
    if (index < 0 || index >= _visitables.get("conditions").size()) {
      _visitables.get("conditions").add(builder);
    } else {
      _visitables.get("conditions").set(index, builder);
    }
    if (index < 0 || index >= conditions.size()) {
      conditions.add(builder);
    } else {
      conditions.set(index, builder);
    }
    return (A) this;
  }

  public A addToConditions(io.kubernetes.client.openapi.models.V1Condition... items) {
    if (this.conditions == null) {
      this.conditions =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1ConditionBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1Condition item : items) {
      io.kubernetes.client.openapi.models.V1ConditionBuilder builder =
          new io.kubernetes.client.openapi.models.V1ConditionBuilder(item);
      _visitables.get("conditions").add(builder);
      this.conditions.add(builder);
    }
    return (A) this;
  }

  public A addAllToConditions(Collection<io.kubernetes.client.openapi.models.V1Condition> items) {
    if (this.conditions == null) {
      this.conditions =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1ConditionBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1Condition item : items) {
      io.kubernetes.client.openapi.models.V1ConditionBuilder builder =
          new io.kubernetes.client.openapi.models.V1ConditionBuilder(item);
      _visitables.get("conditions").add(builder);
      this.conditions.add(builder);
    }
    return (A) this;
  }

  public A removeFromConditions(io.kubernetes.client.openapi.models.V1Condition... items) {
    for (io.kubernetes.client.openapi.models.V1Condition item : items) {
      io.kubernetes.client.openapi.models.V1ConditionBuilder builder =
          new io.kubernetes.client.openapi.models.V1ConditionBuilder(item);
      _visitables.get("conditions").remove(builder);
      if (this.conditions != null) {
        this.conditions.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeAllFromConditions(
      java.util.Collection<io.kubernetes.client.openapi.models.V1Condition> items) {
    for (io.kubernetes.client.openapi.models.V1Condition item : items) {
      io.kubernetes.client.openapi.models.V1ConditionBuilder builder =
          new io.kubernetes.client.openapi.models.V1ConditionBuilder(item);
      _visitables.get("conditions").remove(builder);
      if (this.conditions != null) {
        this.conditions.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeMatchingFromConditions(
      Predicate<io.kubernetes.client.openapi.models.V1ConditionBuilder> predicate) {
    if (conditions == null) return (A) this;
    final Iterator<io.kubernetes.client.openapi.models.V1ConditionBuilder> each =
        conditions.iterator();
    final List visitables = _visitables.get("conditions");
    while (each.hasNext()) {
      io.kubernetes.client.openapi.models.V1ConditionBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A) this;
  }

  /**
   * This method has been deprecated, please use method buildConditions instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public List<io.kubernetes.client.openapi.models.V1Condition> getConditions() {
    return conditions != null ? build(conditions) : null;
  }

  public java.util.List<io.kubernetes.client.openapi.models.V1Condition> buildConditions() {
    return conditions != null ? build(conditions) : null;
  }

  public io.kubernetes.client.openapi.models.V1Condition buildCondition(java.lang.Integer index) {
    return this.conditions.get(index).build();
  }

  public io.kubernetes.client.openapi.models.V1Condition buildFirstCondition() {
    return this.conditions.get(0).build();
  }

  public io.kubernetes.client.openapi.models.V1Condition buildLastCondition() {
    return this.conditions.get(conditions.size() - 1).build();
  }

  public io.kubernetes.client.openapi.models.V1Condition buildMatchingCondition(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ConditionBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1ConditionBuilder item : conditions) {
      if (predicate.test(item)) {
        return item.build();
      }
    }
    return null;
  }

  public Boolean hasMatchingCondition(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ConditionBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1ConditionBuilder item : conditions) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withConditions(
      java.util.List<io.kubernetes.client.openapi.models.V1Condition> conditions) {
    if (this.conditions != null) {
      _visitables.get("conditions").removeAll(this.conditions);
    }
    if (conditions != null) {
      this.conditions = new java.util.ArrayList();
      for (io.kubernetes.client.openapi.models.V1Condition item : conditions) {
        this.addToConditions(item);
      }
    } else {
      this.conditions = null;
    }
    return (A) this;
  }

  public A withConditions(io.kubernetes.client.openapi.models.V1Condition... conditions) {
    if (this.conditions != null) {
      this.conditions.clear();
    }
    if (conditions != null) {
      for (io.kubernetes.client.openapi.models.V1Condition item : conditions) {
        this.addToConditions(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasConditions() {
    return conditions != null && !conditions.isEmpty();
  }

  public V1NetworkPolicyStatusFluent.ConditionsNested<A> addNewCondition() {
    return new V1NetworkPolicyStatusFluentImpl.ConditionsNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1NetworkPolicyStatusFluent.ConditionsNested<A>
      addNewConditionLike(io.kubernetes.client.openapi.models.V1Condition item) {
    return new V1NetworkPolicyStatusFluentImpl.ConditionsNestedImpl(-1, item);
  }

  public io.kubernetes.client.openapi.models.V1NetworkPolicyStatusFluent.ConditionsNested<A>
      setNewConditionLike(
          java.lang.Integer index, io.kubernetes.client.openapi.models.V1Condition item) {
    return new io.kubernetes.client.openapi.models.V1NetworkPolicyStatusFluentImpl
        .ConditionsNestedImpl(index, item);
  }

  public io.kubernetes.client.openapi.models.V1NetworkPolicyStatusFluent.ConditionsNested<A>
      editCondition(java.lang.Integer index) {
    if (conditions.size() <= index)
      throw new RuntimeException("Can't edit conditions. Index exceeds size.");
    return setNewConditionLike(index, buildCondition(index));
  }

  public io.kubernetes.client.openapi.models.V1NetworkPolicyStatusFluent.ConditionsNested<A>
      editFirstCondition() {
    if (conditions.size() == 0)
      throw new RuntimeException("Can't edit first conditions. The list is empty.");
    return setNewConditionLike(0, buildCondition(0));
  }

  public io.kubernetes.client.openapi.models.V1NetworkPolicyStatusFluent.ConditionsNested<A>
      editLastCondition() {
    int index = conditions.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last conditions. The list is empty.");
    return setNewConditionLike(index, buildCondition(index));
  }

  public io.kubernetes.client.openapi.models.V1NetworkPolicyStatusFluent.ConditionsNested<A>
      editMatchingCondition(
          java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ConditionBuilder>
              predicate) {
    int index = -1;
    for (int i = 0; i < conditions.size(); i++) {
      if (predicate.test(conditions.get(i))) {
        index = i;
        break;
      }
    }
    if (index < 0) throw new RuntimeException("Can't edit matching conditions. No match found.");
    return setNewConditionLike(index, buildCondition(index));
  }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1NetworkPolicyStatusFluentImpl that = (V1NetworkPolicyStatusFluentImpl) o;
    if (conditions != null ? !conditions.equals(that.conditions) : that.conditions != null)
      return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(conditions, super.hashCode());
  }

  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (conditions != null && !conditions.isEmpty()) {
      sb.append("conditions:");
      sb.append(conditions);
    }
    sb.append("}");
    return sb.toString();
  }

  class ConditionsNestedImpl<N>
      extends V1ConditionFluentImpl<V1NetworkPolicyStatusFluent.ConditionsNested<N>>
      implements io.kubernetes.client.openapi.models.V1NetworkPolicyStatusFluent.ConditionsNested<
              N>,
          Nested<N> {
    ConditionsNestedImpl(java.lang.Integer index, V1Condition item) {
      this.index = index;
      this.builder = new V1ConditionBuilder(this, item);
    }

    ConditionsNestedImpl() {
      this.index = -1;
      this.builder = new io.kubernetes.client.openapi.models.V1ConditionBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1ConditionBuilder builder;
    java.lang.Integer index;

    public N and() {
      return (N) V1NetworkPolicyStatusFluentImpl.this.setToConditions(index, builder.build());
    }

    public N endCondition() {
      return and();
    }
  }
}
