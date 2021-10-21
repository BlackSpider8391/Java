package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V1IngressStatusBuilder extends io.kubernetes.client.openapi.models.V1IngressStatusFluentImpl<io.kubernetes.client.openapi.models.V1IngressStatusBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1IngressStatus,io.kubernetes.client.openapi.models.V1IngressStatusBuilder>{
  public V1IngressStatusBuilder() {
    this(false);
  }
  public V1IngressStatusBuilder(java.lang.Boolean validationEnabled) {
    this(new V1IngressStatus(), validationEnabled);
  }
  public V1IngressStatusBuilder(io.kubernetes.client.openapi.models.V1IngressStatusFluent<?> fluent) {
    this(fluent, false);
  }
  public V1IngressStatusBuilder(io.kubernetes.client.openapi.models.V1IngressStatusFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V1IngressStatus(), validationEnabled);
  }
  public V1IngressStatusBuilder(io.kubernetes.client.openapi.models.V1IngressStatusFluent<?> fluent,io.kubernetes.client.openapi.models.V1IngressStatus instance) {
    this(fluent, instance, false);
  }
  public V1IngressStatusBuilder(io.kubernetes.client.openapi.models.V1IngressStatusFluent<?> fluent,io.kubernetes.client.openapi.models.V1IngressStatus instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withLoadBalancer(instance.getLoadBalancer());

    this.validationEnabled = validationEnabled; 
  }
  public V1IngressStatusBuilder(io.kubernetes.client.openapi.models.V1IngressStatus instance) {
    this(instance,false);
  }
  public V1IngressStatusBuilder(io.kubernetes.client.openapi.models.V1IngressStatus instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withLoadBalancer(instance.getLoadBalancer());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V1IngressStatusFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V1IngressStatus build() {
    V1IngressStatus buildable = new V1IngressStatus();
    buildable.setLoadBalancer(fluent.getLoadBalancer());
    return buildable;
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1IngressStatusBuilder that = (V1IngressStatusBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}