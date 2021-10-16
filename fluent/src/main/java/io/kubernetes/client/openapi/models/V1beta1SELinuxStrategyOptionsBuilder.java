package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V1beta1SELinuxStrategyOptionsBuilder extends io.kubernetes.client.openapi.models.V1beta1SELinuxStrategyOptionsFluentImpl<io.kubernetes.client.openapi.models.V1beta1SELinuxStrategyOptionsBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1beta1SELinuxStrategyOptions,io.kubernetes.client.openapi.models.V1beta1SELinuxStrategyOptionsBuilder>{
  public V1beta1SELinuxStrategyOptionsBuilder() {
    this(false);
  }
  public V1beta1SELinuxStrategyOptionsBuilder(java.lang.Boolean validationEnabled) {
    this(new V1beta1SELinuxStrategyOptions(), validationEnabled);
  }
  public V1beta1SELinuxStrategyOptionsBuilder(io.kubernetes.client.openapi.models.V1beta1SELinuxStrategyOptionsFluent<?> fluent) {
    this(fluent, false);
  }
  public V1beta1SELinuxStrategyOptionsBuilder(io.kubernetes.client.openapi.models.V1beta1SELinuxStrategyOptionsFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V1beta1SELinuxStrategyOptions(), validationEnabled);
  }
  public V1beta1SELinuxStrategyOptionsBuilder(io.kubernetes.client.openapi.models.V1beta1SELinuxStrategyOptionsFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta1SELinuxStrategyOptions instance) {
    this(fluent, instance, false);
  }
  public V1beta1SELinuxStrategyOptionsBuilder(io.kubernetes.client.openapi.models.V1beta1SELinuxStrategyOptionsFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta1SELinuxStrategyOptions instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withRule(instance.getRule());

    fluent.withSeLinuxOptions(instance.getSeLinuxOptions());

    this.validationEnabled = validationEnabled; 
  }
  public V1beta1SELinuxStrategyOptionsBuilder(io.kubernetes.client.openapi.models.V1beta1SELinuxStrategyOptions instance) {
    this(instance,false);
  }
  public V1beta1SELinuxStrategyOptionsBuilder(io.kubernetes.client.openapi.models.V1beta1SELinuxStrategyOptions instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withRule(instance.getRule());

    this.withSeLinuxOptions(instance.getSeLinuxOptions());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V1beta1SELinuxStrategyOptionsFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V1beta1SELinuxStrategyOptions build() {
    V1beta1SELinuxStrategyOptions buildable = new V1beta1SELinuxStrategyOptions();
    buildable.setRule(fluent.getRule());
    buildable.setSeLinuxOptions(fluent.getSeLinuxOptions());
    return buildable;
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1beta1SELinuxStrategyOptionsBuilder that = (V1beta1SELinuxStrategyOptionsBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}