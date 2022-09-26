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
public interface V1SecretListFluent<A extends V1SecretListFluent<A>> extends Fluent<A> {
  public String getApiVersion();

  public A withApiVersion(String apiVersion);

  public Boolean hasApiVersion();

  public A addToItems(Integer index, V1Secret item);

  public A setToItems(Integer index, V1Secret item);

  public A addToItems(io.kubernetes.client.openapi.models.V1Secret... items);

  public A addAllToItems(Collection<V1Secret> items);

  public A removeFromItems(io.kubernetes.client.openapi.models.V1Secret... items);

  public A removeAllFromItems(Collection<V1Secret> items);

  public A removeMatchingFromItems(Predicate<V1SecretBuilder> predicate);

  /**
   * This method has been deprecated, please use method buildItems instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public List<V1Secret> getItems();

  public List<V1Secret> buildItems();

  public V1Secret buildItem(Integer index);

  public V1Secret buildFirstItem();

  public V1Secret buildLastItem();

  public V1Secret buildMatchingItem(Predicate<V1SecretBuilder> predicate);

  public Boolean hasMatchingItem(Predicate<V1SecretBuilder> predicate);

  public A withItems(List<V1Secret> items);

  public A withItems(io.kubernetes.client.openapi.models.V1Secret... items);

  public Boolean hasItems();

  public V1SecretListFluent.ItemsNested<A> addNewItem();

  public V1SecretListFluent.ItemsNested<A> addNewItemLike(V1Secret item);

  public V1SecretListFluent.ItemsNested<A> setNewItemLike(Integer index, V1Secret item);

  public V1SecretListFluent.ItemsNested<A> editItem(Integer index);

  public V1SecretListFluent.ItemsNested<A> editFirstItem();

  public V1SecretListFluent.ItemsNested<A> editLastItem();

  public V1SecretListFluent.ItemsNested<A> editMatchingItem(Predicate<V1SecretBuilder> predicate);

  public String getKind();

  public A withKind(String kind);

  public Boolean hasKind();

  /**
   * This method has been deprecated, please use method buildMetadata instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V1ListMeta getMetadata();

  public V1ListMeta buildMetadata();

  public A withMetadata(V1ListMeta metadata);

  public Boolean hasMetadata();

  public V1SecretListFluent.MetadataNested<A> withNewMetadata();

  public V1SecretListFluent.MetadataNested<A> withNewMetadataLike(V1ListMeta item);

  public V1SecretListFluent.MetadataNested<A> editMetadata();

  public V1SecretListFluent.MetadataNested<A> editOrNewMetadata();

  public V1SecretListFluent.MetadataNested<A> editOrNewMetadataLike(V1ListMeta item);

  public interface ItemsNested<N>
      extends Nested<N>, V1SecretFluent<V1SecretListFluent.ItemsNested<N>> {
    public N and();

    public N endItem();
  }

  public interface MetadataNested<N>
      extends Nested<N>, V1ListMetaFluent<V1SecretListFluent.MetadataNested<N>> {
    public N and();

    public N endMetadata();
  }
}
