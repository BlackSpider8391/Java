package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V1CSIVolumeSourceBuilder extends io.kubernetes.client.openapi.models.V1CSIVolumeSourceFluentImpl<io.kubernetes.client.openapi.models.V1CSIVolumeSourceBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1CSIVolumeSource,io.kubernetes.client.openapi.models.V1CSIVolumeSourceBuilder>{
  public V1CSIVolumeSourceBuilder() {
    this(false);
  }
  public V1CSIVolumeSourceBuilder(java.lang.Boolean validationEnabled) {
    this(new V1CSIVolumeSource(), validationEnabled);
  }
  public V1CSIVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1CSIVolumeSourceFluent<?> fluent) {
    this(fluent, false);
  }
  public V1CSIVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1CSIVolumeSourceFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V1CSIVolumeSource(), validationEnabled);
  }
  public V1CSIVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1CSIVolumeSourceFluent<?> fluent,io.kubernetes.client.openapi.models.V1CSIVolumeSource instance) {
    this(fluent, instance, false);
  }
  public V1CSIVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1CSIVolumeSourceFluent<?> fluent,io.kubernetes.client.openapi.models.V1CSIVolumeSource instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withDriver(instance.getDriver());

    fluent.withFsType(instance.getFsType());

    fluent.withNodePublishSecretRef(instance.getNodePublishSecretRef());

    fluent.withReadOnly(instance.getReadOnly());

    fluent.withVolumeAttributes(instance.getVolumeAttributes());

    this.validationEnabled = validationEnabled; 
  }
  public V1CSIVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1CSIVolumeSource instance) {
    this(instance,false);
  }
  public V1CSIVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1CSIVolumeSource instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withDriver(instance.getDriver());

    this.withFsType(instance.getFsType());

    this.withNodePublishSecretRef(instance.getNodePublishSecretRef());

    this.withReadOnly(instance.getReadOnly());

    this.withVolumeAttributes(instance.getVolumeAttributes());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V1CSIVolumeSourceFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V1CSIVolumeSource build() {
    V1CSIVolumeSource buildable = new V1CSIVolumeSource();
    buildable.setDriver(fluent.getDriver());
    buildable.setFsType(fluent.getFsType());
    buildable.setNodePublishSecretRef(fluent.getNodePublishSecretRef());
    buildable.setReadOnly(fluent.getReadOnly());
    buildable.setVolumeAttributes(fluent.getVolumeAttributes());
    return buildable;
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1CSIVolumeSourceBuilder that = (V1CSIVolumeSourceBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}