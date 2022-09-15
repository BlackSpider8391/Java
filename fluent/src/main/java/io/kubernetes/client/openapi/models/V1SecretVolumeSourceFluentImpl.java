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
public class V1SecretVolumeSourceFluentImpl<A extends V1SecretVolumeSourceFluent<A>>
    extends BaseFluent<A> implements V1SecretVolumeSourceFluent<A> {
  public V1SecretVolumeSourceFluentImpl() {}

  public V1SecretVolumeSourceFluentImpl(V1SecretVolumeSource instance) {
    this.withDefaultMode(instance.getDefaultMode());

    this.withItems(instance.getItems());

    this.withOptional(instance.getOptional());

    this.withSecretName(instance.getSecretName());
  }

  private Integer defaultMode;
  private ArrayList<V1KeyToPathBuilder> items;
  private Boolean optional;
  private String secretName;

  public Integer getDefaultMode() {
    return this.defaultMode;
  }

  public A withDefaultMode(Integer defaultMode) {
    this.defaultMode = defaultMode;
    return (A) this;
  }

  public Boolean hasDefaultMode() {
    return this.defaultMode != null;
  }

  public A addToItems(Integer index, V1KeyToPath item) {
    if (this.items == null) {
      this.items = new ArrayList<V1KeyToPathBuilder>();
    }
    V1KeyToPathBuilder builder = new V1KeyToPathBuilder(item);
    _visitables.get("items").add(index >= 0 ? index : _visitables.get("items").size(), builder);
    this.items.add(index >= 0 ? index : items.size(), builder);
    return (A) this;
  }

  public A setToItems(Integer index, V1KeyToPath item) {
    if (this.items == null) {
      this.items = new ArrayList<V1KeyToPathBuilder>();
    }
    V1KeyToPathBuilder builder = new V1KeyToPathBuilder(item);
    if (index < 0 || index >= _visitables.get("items").size()) {
      _visitables.get("items").add(builder);
    } else {
      _visitables.get("items").set(index, builder);
    }
    if (index < 0 || index >= items.size()) {
      items.add(builder);
    } else {
      items.set(index, builder);
    }
    return (A) this;
  }

  public A addToItems(io.kubernetes.client.openapi.models.V1KeyToPath... items) {
    if (this.items == null) {
      this.items = new ArrayList<V1KeyToPathBuilder>();
    }
    for (V1KeyToPath item : items) {
      V1KeyToPathBuilder builder = new V1KeyToPathBuilder(item);
      _visitables.get("items").add(builder);
      this.items.add(builder);
    }
    return (A) this;
  }

  public A addAllToItems(Collection<V1KeyToPath> items) {
    if (this.items == null) {
      this.items = new ArrayList<V1KeyToPathBuilder>();
    }
    for (V1KeyToPath item : items) {
      V1KeyToPathBuilder builder = new V1KeyToPathBuilder(item);
      _visitables.get("items").add(builder);
      this.items.add(builder);
    }
    return (A) this;
  }

  public A removeFromItems(io.kubernetes.client.openapi.models.V1KeyToPath... items) {
    for (V1KeyToPath item : items) {
      V1KeyToPathBuilder builder = new V1KeyToPathBuilder(item);
      _visitables.get("items").remove(builder);
      if (this.items != null) {
        this.items.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeAllFromItems(Collection<V1KeyToPath> items) {
    for (V1KeyToPath item : items) {
      V1KeyToPathBuilder builder = new V1KeyToPathBuilder(item);
      _visitables.get("items").remove(builder);
      if (this.items != null) {
        this.items.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeMatchingFromItems(Predicate<V1KeyToPathBuilder> predicate) {
    if (items == null) return (A) this;
    final Iterator<V1KeyToPathBuilder> each = items.iterator();
    final List visitables = _visitables.get("items");
    while (each.hasNext()) {
      V1KeyToPathBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A) this;
  }

  /**
   * This method has been deprecated, please use method buildItems instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public List<V1KeyToPath> getItems() {
    return items != null ? build(items) : null;
  }

  public List<V1KeyToPath> buildItems() {
    return items != null ? build(items) : null;
  }

  public V1KeyToPath buildItem(Integer index) {
    return this.items.get(index).build();
  }

  public V1KeyToPath buildFirstItem() {
    return this.items.get(0).build();
  }

  public V1KeyToPath buildLastItem() {
    return this.items.get(items.size() - 1).build();
  }

  public V1KeyToPath buildMatchingItem(Predicate<V1KeyToPathBuilder> predicate) {
    for (V1KeyToPathBuilder item : items) {
      if (predicate.test(item)) {
        return item.build();
      }
    }
    return null;
  }

  public Boolean hasMatchingItem(Predicate<V1KeyToPathBuilder> predicate) {
    for (V1KeyToPathBuilder item : items) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withItems(List<V1KeyToPath> items) {
    if (this.items != null) {
      _visitables.get("items").removeAll(this.items);
    }
    if (items != null) {
      this.items = new ArrayList();
      for (V1KeyToPath item : items) {
        this.addToItems(item);
      }
    } else {
      this.items = null;
    }
    return (A) this;
  }

  public A withItems(io.kubernetes.client.openapi.models.V1KeyToPath... items) {
    if (this.items != null) {
      this.items.clear();
    }
    if (items != null) {
      for (V1KeyToPath item : items) {
        this.addToItems(item);
      }
    }
    return (A) this;
  }

  public Boolean hasItems() {
    return items != null && !items.isEmpty();
  }

  public V1SecretVolumeSourceFluent.ItemsNested<A> addNewItem() {
    return new V1SecretVolumeSourceFluentImpl.ItemsNestedImpl();
  }

  public V1SecretVolumeSourceFluent.ItemsNested<A> addNewItemLike(V1KeyToPath item) {
    return new V1SecretVolumeSourceFluentImpl.ItemsNestedImpl(-1, item);
  }

  public V1SecretVolumeSourceFluent.ItemsNested<A> setNewItemLike(Integer index, V1KeyToPath item) {
    return new V1SecretVolumeSourceFluentImpl.ItemsNestedImpl(index, item);
  }

  public V1SecretVolumeSourceFluent.ItemsNested<A> editItem(Integer index) {
    if (items.size() <= index) throw new RuntimeException("Can't edit items. Index exceeds size.");
    return setNewItemLike(index, buildItem(index));
  }

  public V1SecretVolumeSourceFluent.ItemsNested<A> editFirstItem() {
    if (items.size() == 0) throw new RuntimeException("Can't edit first items. The list is empty.");
    return setNewItemLike(0, buildItem(0));
  }

  public V1SecretVolumeSourceFluent.ItemsNested<A> editLastItem() {
    int index = items.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last items. The list is empty.");
    return setNewItemLike(index, buildItem(index));
  }

  public V1SecretVolumeSourceFluent.ItemsNested<A> editMatchingItem(
      Predicate<V1KeyToPathBuilder> predicate) {
    int index = -1;
    for (int i = 0; i < items.size(); i++) {
      if (predicate.test(items.get(i))) {
        index = i;
        break;
      }
    }
    if (index < 0) throw new RuntimeException("Can't edit matching items. No match found.");
    return setNewItemLike(index, buildItem(index));
  }

  public Boolean getOptional() {
    return this.optional;
  }

  public A withOptional(Boolean optional) {
    this.optional = optional;
    return (A) this;
  }

  public Boolean hasOptional() {
    return this.optional != null;
  }

  public String getSecretName() {
    return this.secretName;
  }

  public A withSecretName(String secretName) {
    this.secretName = secretName;
    return (A) this;
  }

  public Boolean hasSecretName() {
    return this.secretName != null;
  }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1SecretVolumeSourceFluentImpl that = (V1SecretVolumeSourceFluentImpl) o;
    if (defaultMode != null ? !defaultMode.equals(that.defaultMode) : that.defaultMode != null)
      return false;
    if (items != null ? !items.equals(that.items) : that.items != null) return false;
    if (optional != null ? !optional.equals(that.optional) : that.optional != null) return false;
    if (secretName != null ? !secretName.equals(that.secretName) : that.secretName != null)
      return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(defaultMode, items, optional, secretName, super.hashCode());
  }

  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (defaultMode != null) {
      sb.append("defaultMode:");
      sb.append(defaultMode + ",");
    }
    if (items != null && !items.isEmpty()) {
      sb.append("items:");
      sb.append(items + ",");
    }
    if (optional != null) {
      sb.append("optional:");
      sb.append(optional + ",");
    }
    if (secretName != null) {
      sb.append("secretName:");
      sb.append(secretName);
    }
    sb.append("}");
    return sb.toString();
  }

  public A withOptional() {
    return withOptional(true);
  }

  class ItemsNestedImpl<N> extends V1KeyToPathFluentImpl<V1SecretVolumeSourceFluent.ItemsNested<N>>
      implements V1SecretVolumeSourceFluent.ItemsNested<N>, Nested<N> {
    ItemsNestedImpl(Integer index, V1KeyToPath item) {
      this.index = index;
      this.builder = new V1KeyToPathBuilder(this, item);
    }

    ItemsNestedImpl() {
      this.index = -1;
      this.builder = new V1KeyToPathBuilder(this);
    }

    V1KeyToPathBuilder builder;
    Integer index;

    public N and() {
      return (N) V1SecretVolumeSourceFluentImpl.this.setToItems(index, builder.build());
    }

    public N endItem() {
      return and();
    }
  }
}
