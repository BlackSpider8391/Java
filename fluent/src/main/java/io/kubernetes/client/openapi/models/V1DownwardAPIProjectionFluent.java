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
public interface V1DownwardAPIProjectionFluent<A extends io.kubernetes.client.openapi.models.V1DownwardAPIProjectionFluent<A>> extends io.kubernetes.client.fluent.Fluent<A>{
  public A addToItems(java.lang.Integer index,io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFile item);
  public A setToItems(java.lang.Integer index,io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFile item);
  public A addToItems(io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFile... items);
  public A addAllToItems(java.util.Collection<io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFile> items);
  public A removeFromItems(io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFile... items);
  public A removeAllFromItems(java.util.Collection<io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFile> items);
  public A removeMatchingFromItems(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFileBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildItems instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFile> getItems();
  public java.util.List<io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFile> buildItems();
  public io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFile buildItem(java.lang.Integer index);
  public io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFile buildFirstItem();
  public io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFile buildLastItem();
  public io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFile buildMatchingItem(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFileBuilder> predicate);
  public java.lang.Boolean hasMatchingItem(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFileBuilder> predicate);
  public A withItems(java.util.List<io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFile> items);
  public A withItems(io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFile... items);
  public java.lang.Boolean hasItems();
  public io.kubernetes.client.openapi.models.V1DownwardAPIProjectionFluent.ItemsNested<A> addNewItem();
  public io.kubernetes.client.openapi.models.V1DownwardAPIProjectionFluent.ItemsNested<A> addNewItemLike(io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFile item);
  public io.kubernetes.client.openapi.models.V1DownwardAPIProjectionFluent.ItemsNested<A> setNewItemLike(java.lang.Integer index,io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFile item);
  public io.kubernetes.client.openapi.models.V1DownwardAPIProjectionFluent.ItemsNested<A> editItem(java.lang.Integer index);
  public io.kubernetes.client.openapi.models.V1DownwardAPIProjectionFluent.ItemsNested<A> editFirstItem();
  public io.kubernetes.client.openapi.models.V1DownwardAPIProjectionFluent.ItemsNested<A> editLastItem();
  public io.kubernetes.client.openapi.models.V1DownwardAPIProjectionFluent.ItemsNested<A> editMatchingItem(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFileBuilder> predicate);
  public interface ItemsNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFileFluent<io.kubernetes.client.openapi.models.V1DownwardAPIProjectionFluent.ItemsNested<N>>{
    public N and();
    public N endItem();
    
  }
  
}