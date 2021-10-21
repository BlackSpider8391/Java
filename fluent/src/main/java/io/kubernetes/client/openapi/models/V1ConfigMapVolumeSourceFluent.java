package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Integer;
import java.lang.Deprecated;
import java.util.Iterator;
import java.util.Collection;
import java.util.List;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1ConfigMapVolumeSourceFluent<A extends io.kubernetes.client.openapi.models.V1ConfigMapVolumeSourceFluent<A>> extends io.kubernetes.client.fluent.Fluent<A>{
  public java.lang.Integer getDefaultMode();
  public A withDefaultMode(java.lang.Integer defaultMode);
  public java.lang.Boolean hasDefaultMode();
  public A addToItems(java.lang.Integer index,io.kubernetes.client.openapi.models.V1KeyToPath item);
  public A setToItems(java.lang.Integer index,io.kubernetes.client.openapi.models.V1KeyToPath item);
  public A addToItems(io.kubernetes.client.openapi.models.V1KeyToPath... items);
  public A addAllToItems(java.util.Collection<io.kubernetes.client.openapi.models.V1KeyToPath> items);
  public A removeFromItems(io.kubernetes.client.openapi.models.V1KeyToPath... items);
  public A removeAllFromItems(java.util.Collection<io.kubernetes.client.openapi.models.V1KeyToPath> items);
  public A removeMatchingFromItems(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1KeyToPathBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildItems instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1KeyToPath> getItems();
  public java.util.List<io.kubernetes.client.openapi.models.V1KeyToPath> buildItems();
  public io.kubernetes.client.openapi.models.V1KeyToPath buildItem(java.lang.Integer index);
  public io.kubernetes.client.openapi.models.V1KeyToPath buildFirstItem();
  public io.kubernetes.client.openapi.models.V1KeyToPath buildLastItem();
  public io.kubernetes.client.openapi.models.V1KeyToPath buildMatchingItem(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1KeyToPathBuilder> predicate);
  public java.lang.Boolean hasMatchingItem(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1KeyToPathBuilder> predicate);
  public A withItems(java.util.List<io.kubernetes.client.openapi.models.V1KeyToPath> items);
  public A withItems(io.kubernetes.client.openapi.models.V1KeyToPath... items);
  public java.lang.Boolean hasItems();
  public io.kubernetes.client.openapi.models.V1ConfigMapVolumeSourceFluent.ItemsNested<A> addNewItem();
  public io.kubernetes.client.openapi.models.V1ConfigMapVolumeSourceFluent.ItemsNested<A> addNewItemLike(io.kubernetes.client.openapi.models.V1KeyToPath item);
  public io.kubernetes.client.openapi.models.V1ConfigMapVolumeSourceFluent.ItemsNested<A> setNewItemLike(java.lang.Integer index,io.kubernetes.client.openapi.models.V1KeyToPath item);
  public io.kubernetes.client.openapi.models.V1ConfigMapVolumeSourceFluent.ItemsNested<A> editItem(java.lang.Integer index);
  public io.kubernetes.client.openapi.models.V1ConfigMapVolumeSourceFluent.ItemsNested<A> editFirstItem();
  public io.kubernetes.client.openapi.models.V1ConfigMapVolumeSourceFluent.ItemsNested<A> editLastItem();
  public io.kubernetes.client.openapi.models.V1ConfigMapVolumeSourceFluent.ItemsNested<A> editMatchingItem(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1KeyToPathBuilder> predicate);
  public java.lang.String getName();
  public A withName(java.lang.String name);
  public java.lang.Boolean hasName();
  
  /**
   * Method is deprecated. use withName instead.
   */
  @java.lang.Deprecated
  public A withNewName(java.lang.String original);
  public java.lang.Boolean getOptional();
  public A withOptional(java.lang.Boolean optional);
  public java.lang.Boolean hasOptional();
  public interface ItemsNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1KeyToPathFluent<io.kubernetes.client.openapi.models.V1ConfigMapVolumeSourceFluent.ItemsNested<N>>{
    public N and();
    public N endItem();
    
  }
  
}