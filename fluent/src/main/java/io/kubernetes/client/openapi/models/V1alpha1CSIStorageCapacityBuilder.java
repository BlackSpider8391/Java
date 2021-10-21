package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V1alpha1CSIStorageCapacityBuilder extends io.kubernetes.client.openapi.models.V1alpha1CSIStorageCapacityFluentImpl<io.kubernetes.client.openapi.models.V1alpha1CSIStorageCapacityBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1alpha1CSIStorageCapacity,io.kubernetes.client.openapi.models.V1alpha1CSIStorageCapacityBuilder>{
  public V1alpha1CSIStorageCapacityBuilder() {
    this(false);
  }
  public V1alpha1CSIStorageCapacityBuilder(java.lang.Boolean validationEnabled) {
    this(new V1alpha1CSIStorageCapacity(), validationEnabled);
  }
  public V1alpha1CSIStorageCapacityBuilder(io.kubernetes.client.openapi.models.V1alpha1CSIStorageCapacityFluent<?> fluent) {
    this(fluent, false);
  }
  public V1alpha1CSIStorageCapacityBuilder(io.kubernetes.client.openapi.models.V1alpha1CSIStorageCapacityFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V1alpha1CSIStorageCapacity(), validationEnabled);
  }
  public V1alpha1CSIStorageCapacityBuilder(io.kubernetes.client.openapi.models.V1alpha1CSIStorageCapacityFluent<?> fluent,io.kubernetes.client.openapi.models.V1alpha1CSIStorageCapacity instance) {
    this(fluent, instance, false);
  }
  public V1alpha1CSIStorageCapacityBuilder(io.kubernetes.client.openapi.models.V1alpha1CSIStorageCapacityFluent<?> fluent,io.kubernetes.client.openapi.models.V1alpha1CSIStorageCapacity instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withCapacity(instance.getCapacity());

    fluent.withKind(instance.getKind());

    fluent.withMaximumVolumeSize(instance.getMaximumVolumeSize());

    fluent.withMetadata(instance.getMetadata());

    fluent.withNodeTopology(instance.getNodeTopology());

    fluent.withStorageClassName(instance.getStorageClassName());

    this.validationEnabled = validationEnabled; 
  }
  public V1alpha1CSIStorageCapacityBuilder(io.kubernetes.client.openapi.models.V1alpha1CSIStorageCapacity instance) {
    this(instance,false);
  }
  public V1alpha1CSIStorageCapacityBuilder(io.kubernetes.client.openapi.models.V1alpha1CSIStorageCapacity instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withCapacity(instance.getCapacity());

    this.withKind(instance.getKind());

    this.withMaximumVolumeSize(instance.getMaximumVolumeSize());

    this.withMetadata(instance.getMetadata());

    this.withNodeTopology(instance.getNodeTopology());

    this.withStorageClassName(instance.getStorageClassName());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V1alpha1CSIStorageCapacityFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V1alpha1CSIStorageCapacity build() {
    V1alpha1CSIStorageCapacity buildable = new V1alpha1CSIStorageCapacity();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setCapacity(fluent.getCapacity());
    buildable.setKind(fluent.getKind());
    buildable.setMaximumVolumeSize(fluent.getMaximumVolumeSize());
    buildable.setMetadata(fluent.getMetadata());
    buildable.setNodeTopology(fluent.getNodeTopology());
    buildable.setStorageClassName(fluent.getStorageClassName());
    return buildable;
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1alpha1CSIStorageCapacityBuilder that = (V1alpha1CSIStorageCapacityBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}