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
public interface V1ReplicationControllerListFluent<A extends V1ReplicationControllerListFluent<A>>
    extends Fluent<A> {
  public String getApiVersion();

  public A withApiVersion(String apiVersion);

  public Boolean hasApiVersion();

  public A addToItems(Integer index, V1ReplicationController item);

  public A setToItems(Integer index, V1ReplicationController item);

  public A addToItems(io.kubernetes.client.openapi.models.V1ReplicationController... items);

  public A addAllToItems(Collection<V1ReplicationController> items);

  public A removeFromItems(io.kubernetes.client.openapi.models.V1ReplicationController... items);

  public A removeAllFromItems(Collection<V1ReplicationController> items);

  public A removeMatchingFromItems(Predicate<V1ReplicationControllerBuilder> predicate);

  /**
   * This method has been deprecated, please use method buildItems instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public List<V1ReplicationController> getItems();

  public List<V1ReplicationController> buildItems();

  public V1ReplicationController buildItem(Integer index);

  public V1ReplicationController buildFirstItem();

  public V1ReplicationController buildLastItem();

  public V1ReplicationController buildMatchingItem(
      Predicate<V1ReplicationControllerBuilder> predicate);

  public Boolean hasMatchingItem(Predicate<V1ReplicationControllerBuilder> predicate);

  public A withItems(List<V1ReplicationController> items);

  public A withItems(io.kubernetes.client.openapi.models.V1ReplicationController... items);

  public Boolean hasItems();

  public V1ReplicationControllerListFluent.ItemsNested<A> addNewItem();

  public V1ReplicationControllerListFluent.ItemsNested<A> addNewItemLike(
      V1ReplicationController item);

  public V1ReplicationControllerListFluent.ItemsNested<A> setNewItemLike(
      Integer index, V1ReplicationController item);

  public V1ReplicationControllerListFluent.ItemsNested<A> editItem(Integer index);

  public V1ReplicationControllerListFluent.ItemsNested<A> editFirstItem();

  public V1ReplicationControllerListFluent.ItemsNested<A> editLastItem();

  public V1ReplicationControllerListFluent.ItemsNested<A> editMatchingItem(
      Predicate<V1ReplicationControllerBuilder> predicate);

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

  public V1ReplicationControllerListFluent.MetadataNested<A> withNewMetadata();

  public V1ReplicationControllerListFluent.MetadataNested<A> withNewMetadataLike(V1ListMeta item);

  public V1ReplicationControllerListFluent.MetadataNested<A> editMetadata();

  public V1ReplicationControllerListFluent.MetadataNested<A> editOrNewMetadata();

  public V1ReplicationControllerListFluent.MetadataNested<A> editOrNewMetadataLike(V1ListMeta item);

  public interface ItemsNested<N>
      extends Nested<N>,
          V1ReplicationControllerFluent<V1ReplicationControllerListFluent.ItemsNested<N>> {
    public N and();

    public N endItem();
  }

  public interface MetadataNested<N>
      extends Nested<N>, V1ListMetaFluent<V1ReplicationControllerListFluent.MetadataNested<N>> {
    public N and();

    public N endMetadata();
  }
}
