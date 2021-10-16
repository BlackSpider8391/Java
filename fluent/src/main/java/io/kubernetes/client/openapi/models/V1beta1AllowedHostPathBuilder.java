package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V1beta1AllowedHostPathBuilder extends io.kubernetes.client.openapi.models.V1beta1AllowedHostPathFluentImpl<io.kubernetes.client.openapi.models.V1beta1AllowedHostPathBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1beta1AllowedHostPath,io.kubernetes.client.openapi.models.V1beta1AllowedHostPathBuilder>{
  public V1beta1AllowedHostPathBuilder() {
    this(false);
  }
  public V1beta1AllowedHostPathBuilder(java.lang.Boolean validationEnabled) {
    this(new V1beta1AllowedHostPath(), validationEnabled);
  }
  public V1beta1AllowedHostPathBuilder(io.kubernetes.client.openapi.models.V1beta1AllowedHostPathFluent<?> fluent) {
    this(fluent, false);
  }
  public V1beta1AllowedHostPathBuilder(io.kubernetes.client.openapi.models.V1beta1AllowedHostPathFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V1beta1AllowedHostPath(), validationEnabled);
  }
  public V1beta1AllowedHostPathBuilder(io.kubernetes.client.openapi.models.V1beta1AllowedHostPathFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta1AllowedHostPath instance) {
    this(fluent, instance, false);
  }
  public V1beta1AllowedHostPathBuilder(io.kubernetes.client.openapi.models.V1beta1AllowedHostPathFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta1AllowedHostPath instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withPathPrefix(instance.getPathPrefix());

    fluent.withReadOnly(instance.getReadOnly());

    this.validationEnabled = validationEnabled; 
  }
  public V1beta1AllowedHostPathBuilder(io.kubernetes.client.openapi.models.V1beta1AllowedHostPath instance) {
    this(instance,false);
  }
  public V1beta1AllowedHostPathBuilder(io.kubernetes.client.openapi.models.V1beta1AllowedHostPath instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withPathPrefix(instance.getPathPrefix());

    this.withReadOnly(instance.getReadOnly());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V1beta1AllowedHostPathFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V1beta1AllowedHostPath build() {
    V1beta1AllowedHostPath buildable = new V1beta1AllowedHostPath();
    buildable.setPathPrefix(fluent.getPathPrefix());
    buildable.setReadOnly(fluent.getReadOnly());
    return buildable;
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1beta1AllowedHostPathBuilder that = (V1beta1AllowedHostPathBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}