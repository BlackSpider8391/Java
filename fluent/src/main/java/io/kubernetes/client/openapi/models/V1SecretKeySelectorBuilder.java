package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V1SecretKeySelectorBuilder extends io.kubernetes.client.openapi.models.V1SecretKeySelectorFluentImpl<io.kubernetes.client.openapi.models.V1SecretKeySelectorBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1SecretKeySelector,io.kubernetes.client.openapi.models.V1SecretKeySelectorBuilder>{
  public V1SecretKeySelectorBuilder() {
    this(false);
  }
  public V1SecretKeySelectorBuilder(java.lang.Boolean validationEnabled) {
    this(new V1SecretKeySelector(), validationEnabled);
  }
  public V1SecretKeySelectorBuilder(io.kubernetes.client.openapi.models.V1SecretKeySelectorFluent<?> fluent) {
    this(fluent, false);
  }
  public V1SecretKeySelectorBuilder(io.kubernetes.client.openapi.models.V1SecretKeySelectorFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V1SecretKeySelector(), validationEnabled);
  }
  public V1SecretKeySelectorBuilder(io.kubernetes.client.openapi.models.V1SecretKeySelectorFluent<?> fluent,io.kubernetes.client.openapi.models.V1SecretKeySelector instance) {
    this(fluent, instance, false);
  }
  public V1SecretKeySelectorBuilder(io.kubernetes.client.openapi.models.V1SecretKeySelectorFluent<?> fluent,io.kubernetes.client.openapi.models.V1SecretKeySelector instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withKey(instance.getKey());

    fluent.withName(instance.getName());

    fluent.withOptional(instance.getOptional());

    this.validationEnabled = validationEnabled; 
  }
  public V1SecretKeySelectorBuilder(io.kubernetes.client.openapi.models.V1SecretKeySelector instance) {
    this(instance,false);
  }
  public V1SecretKeySelectorBuilder(io.kubernetes.client.openapi.models.V1SecretKeySelector instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withKey(instance.getKey());

    this.withName(instance.getName());

    this.withOptional(instance.getOptional());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V1SecretKeySelectorFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V1SecretKeySelector build() {
    V1SecretKeySelector buildable = new V1SecretKeySelector();
    buildable.setKey(fluent.getKey());
    buildable.setName(fluent.getName());
    buildable.setOptional(fluent.getOptional());
    return buildable;
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1SecretKeySelectorBuilder that = (V1SecretKeySelectorBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}