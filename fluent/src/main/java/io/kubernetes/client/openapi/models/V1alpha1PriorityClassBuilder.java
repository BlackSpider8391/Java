package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V1alpha1PriorityClassBuilder extends io.kubernetes.client.openapi.models.V1alpha1PriorityClassFluentImpl<io.kubernetes.client.openapi.models.V1alpha1PriorityClassBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1alpha1PriorityClass,io.kubernetes.client.openapi.models.V1alpha1PriorityClassBuilder>{
  public V1alpha1PriorityClassBuilder() {
    this(false);
  }
  public V1alpha1PriorityClassBuilder(java.lang.Boolean validationEnabled) {
    this(new V1alpha1PriorityClass(), validationEnabled);
  }
  public V1alpha1PriorityClassBuilder(io.kubernetes.client.openapi.models.V1alpha1PriorityClassFluent<?> fluent) {
    this(fluent, false);
  }
  public V1alpha1PriorityClassBuilder(io.kubernetes.client.openapi.models.V1alpha1PriorityClassFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V1alpha1PriorityClass(), validationEnabled);
  }
  public V1alpha1PriorityClassBuilder(io.kubernetes.client.openapi.models.V1alpha1PriorityClassFluent<?> fluent,io.kubernetes.client.openapi.models.V1alpha1PriorityClass instance) {
    this(fluent, instance, false);
  }
  public V1alpha1PriorityClassBuilder(io.kubernetes.client.openapi.models.V1alpha1PriorityClassFluent<?> fluent,io.kubernetes.client.openapi.models.V1alpha1PriorityClass instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withDescription(instance.getDescription());

    fluent.withGlobalDefault(instance.getGlobalDefault());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    fluent.withPreemptionPolicy(instance.getPreemptionPolicy());

    fluent.withValue(instance.getValue());

    this.validationEnabled = validationEnabled; 
  }
  public V1alpha1PriorityClassBuilder(io.kubernetes.client.openapi.models.V1alpha1PriorityClass instance) {
    this(instance,false);
  }
  public V1alpha1PriorityClassBuilder(io.kubernetes.client.openapi.models.V1alpha1PriorityClass instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withDescription(instance.getDescription());

    this.withGlobalDefault(instance.getGlobalDefault());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.withPreemptionPolicy(instance.getPreemptionPolicy());

    this.withValue(instance.getValue());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V1alpha1PriorityClassFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V1alpha1PriorityClass build() {
    V1alpha1PriorityClass buildable = new V1alpha1PriorityClass();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setDescription(fluent.getDescription());
    buildable.setGlobalDefault(fluent.getGlobalDefault());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    buildable.setPreemptionPolicy(fluent.getPreemptionPolicy());
    buildable.setValue(fluent.getValue());
    return buildable;
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1alpha1PriorityClassBuilder that = (V1alpha1PriorityClassBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}