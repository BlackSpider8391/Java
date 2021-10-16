package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V1alpha1CSIStorageCapacityListBuilder extends io.kubernetes.client.openapi.models.V1alpha1CSIStorageCapacityListFluentImpl<io.kubernetes.client.openapi.models.V1alpha1CSIStorageCapacityListBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1alpha1CSIStorageCapacityList,io.kubernetes.client.openapi.models.V1alpha1CSIStorageCapacityListBuilder>{
  public V1alpha1CSIStorageCapacityListBuilder() {
    this(false);
  }
  public V1alpha1CSIStorageCapacityListBuilder(java.lang.Boolean validationEnabled) {
    this(new V1alpha1CSIStorageCapacityList(), validationEnabled);
  }
  public V1alpha1CSIStorageCapacityListBuilder(io.kubernetes.client.openapi.models.V1alpha1CSIStorageCapacityListFluent<?> fluent) {
    this(fluent, false);
  }
  public V1alpha1CSIStorageCapacityListBuilder(io.kubernetes.client.openapi.models.V1alpha1CSIStorageCapacityListFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V1alpha1CSIStorageCapacityList(), validationEnabled);
  }
  public V1alpha1CSIStorageCapacityListBuilder(io.kubernetes.client.openapi.models.V1alpha1CSIStorageCapacityListFluent<?> fluent,io.kubernetes.client.openapi.models.V1alpha1CSIStorageCapacityList instance) {
    this(fluent, instance, false);
  }
  public V1alpha1CSIStorageCapacityListBuilder(io.kubernetes.client.openapi.models.V1alpha1CSIStorageCapacityListFluent<?> fluent,io.kubernetes.client.openapi.models.V1alpha1CSIStorageCapacityList instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withItems(instance.getItems());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  public V1alpha1CSIStorageCapacityListBuilder(io.kubernetes.client.openapi.models.V1alpha1CSIStorageCapacityList instance) {
    this(instance,false);
  }
  public V1alpha1CSIStorageCapacityListBuilder(io.kubernetes.client.openapi.models.V1alpha1CSIStorageCapacityList instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withItems(instance.getItems());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V1alpha1CSIStorageCapacityListFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V1alpha1CSIStorageCapacityList build() {
    V1alpha1CSIStorageCapacityList buildable = new V1alpha1CSIStorageCapacityList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.getItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    return buildable;
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1alpha1CSIStorageCapacityListBuilder that = (V1alpha1CSIStorageCapacityListBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}