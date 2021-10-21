package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V1IngressTLSBuilder extends io.kubernetes.client.openapi.models.V1IngressTLSFluentImpl<io.kubernetes.client.openapi.models.V1IngressTLSBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1IngressTLS,io.kubernetes.client.openapi.models.V1IngressTLSBuilder>{
  public V1IngressTLSBuilder() {
    this(false);
  }
  public V1IngressTLSBuilder(java.lang.Boolean validationEnabled) {
    this(new V1IngressTLS(), validationEnabled);
  }
  public V1IngressTLSBuilder(io.kubernetes.client.openapi.models.V1IngressTLSFluent<?> fluent) {
    this(fluent, false);
  }
  public V1IngressTLSBuilder(io.kubernetes.client.openapi.models.V1IngressTLSFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V1IngressTLS(), validationEnabled);
  }
  public V1IngressTLSBuilder(io.kubernetes.client.openapi.models.V1IngressTLSFluent<?> fluent,io.kubernetes.client.openapi.models.V1IngressTLS instance) {
    this(fluent, instance, false);
  }
  public V1IngressTLSBuilder(io.kubernetes.client.openapi.models.V1IngressTLSFluent<?> fluent,io.kubernetes.client.openapi.models.V1IngressTLS instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withHosts(instance.getHosts());

    fluent.withSecretName(instance.getSecretName());

    this.validationEnabled = validationEnabled; 
  }
  public V1IngressTLSBuilder(io.kubernetes.client.openapi.models.V1IngressTLS instance) {
    this(instance,false);
  }
  public V1IngressTLSBuilder(io.kubernetes.client.openapi.models.V1IngressTLS instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withHosts(instance.getHosts());

    this.withSecretName(instance.getSecretName());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V1IngressTLSFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V1IngressTLS build() {
    V1IngressTLS buildable = new V1IngressTLS();
    buildable.setHosts(fluent.getHosts());
    buildable.setSecretName(fluent.getSecretName());
    return buildable;
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1IngressTLSBuilder that = (V1IngressTLSBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}