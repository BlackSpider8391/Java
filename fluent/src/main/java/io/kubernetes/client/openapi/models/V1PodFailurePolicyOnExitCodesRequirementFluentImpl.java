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
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

/** Generated */
@SuppressWarnings(value = "unchecked")
public class V1PodFailurePolicyOnExitCodesRequirementFluentImpl<
        A extends V1PodFailurePolicyOnExitCodesRequirementFluent<A>>
    extends BaseFluent<A> implements V1PodFailurePolicyOnExitCodesRequirementFluent<A> {
  public V1PodFailurePolicyOnExitCodesRequirementFluentImpl() {}

  public V1PodFailurePolicyOnExitCodesRequirementFluentImpl(
      V1PodFailurePolicyOnExitCodesRequirement instance) {
    this.withContainerName(instance.getContainerName());

    this.withOperator(instance.getOperator());

    this.withValues(instance.getValues());
  }

  private String containerName;
  private String operator;
  private List<Integer> values;

  public String getContainerName() {
    return this.containerName;
  }

  public A withContainerName(String containerName) {
    this.containerName = containerName;
    return (A) this;
  }

  public Boolean hasContainerName() {
    return this.containerName != null;
  }

  public String getOperator() {
    return this.operator;
  }

  public A withOperator(String operator) {
    this.operator = operator;
    return (A) this;
  }

  public Boolean hasOperator() {
    return this.operator != null;
  }

  public A addToValues(Integer index, Integer item) {
    if (this.values == null) {
      this.values = new ArrayList<Integer>();
    }
    this.values.add(index, item);
    return (A) this;
  }

  public A setToValues(Integer index, Integer item) {
    if (this.values == null) {
      this.values = new ArrayList<Integer>();
    }
    this.values.set(index, item);
    return (A) this;
  }

  public A addToValues(java.lang.Integer... items) {
    if (this.values == null) {
      this.values = new ArrayList<Integer>();
    }
    for (Integer item : items) {
      this.values.add(item);
    }
    return (A) this;
  }

  public A addAllToValues(Collection<Integer> items) {
    if (this.values == null) {
      this.values = new ArrayList<Integer>();
    }
    for (Integer item : items) {
      this.values.add(item);
    }
    return (A) this;
  }

  public A removeFromValues(java.lang.Integer... items) {
    for (Integer item : items) {
      if (this.values != null) {
        this.values.remove(item);
      }
    }
    return (A) this;
  }

  public A removeAllFromValues(Collection<Integer> items) {
    for (Integer item : items) {
      if (this.values != null) {
        this.values.remove(item);
      }
    }
    return (A) this;
  }

  public List<Integer> getValues() {
    return this.values;
  }

  public Integer getValue(Integer index) {
    return this.values.get(index);
  }

  public Integer getFirstValue() {
    return this.values.get(0);
  }

  public Integer getLastValue() {
    return this.values.get(values.size() - 1);
  }

  public Integer getMatchingValue(Predicate<Integer> predicate) {
    for (Integer item : values) {
      if (predicate.test(item)) {
        return item;
      }
    }
    return null;
  }

  public Boolean hasMatchingValue(Predicate<Integer> predicate) {
    for (Integer item : values) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withValues(List<Integer> values) {
    if (values != null) {
      this.values = new ArrayList();
      for (Integer item : values) {
        this.addToValues(item);
      }
    } else {
      this.values = null;
    }
    return (A) this;
  }

  public A withValues(java.lang.Integer... values) {
    if (this.values != null) {
      this.values.clear();
    }
    if (values != null) {
      for (Integer item : values) {
        this.addToValues(item);
      }
    }
    return (A) this;
  }

  public Boolean hasValues() {
    return values != null && !values.isEmpty();
  }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1PodFailurePolicyOnExitCodesRequirementFluentImpl that =
        (V1PodFailurePolicyOnExitCodesRequirementFluentImpl) o;
    if (containerName != null
        ? !containerName.equals(that.containerName)
        : that.containerName != null) return false;
    if (operator != null ? !operator.equals(that.operator) : that.operator != null) return false;
    if (values != null ? !values.equals(that.values) : that.values != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(containerName, operator, values, super.hashCode());
  }

  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (containerName != null) {
      sb.append("containerName:");
      sb.append(containerName + ",");
    }
    if (operator != null) {
      sb.append("operator:");
      sb.append(operator + ",");
    }
    if (values != null && !values.isEmpty()) {
      sb.append("values:");
      sb.append(values);
    }
    sb.append("}");
    return sb.toString();
  }
}
