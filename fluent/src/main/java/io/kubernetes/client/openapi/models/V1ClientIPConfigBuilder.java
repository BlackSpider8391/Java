package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V1ClientIPConfigBuilder extends io.kubernetes.client.openapi.models.V1ClientIPConfigFluentImpl<io.kubernetes.client.openapi.models.V1ClientIPConfigBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1ClientIPConfig,io.kubernetes.client.openapi.models.V1ClientIPConfigBuilder>{
  public V1ClientIPConfigBuilder() {
    this(false);
  }
  public V1ClientIPConfigBuilder(java.lang.Boolean validationEnabled) {
    this(new V1ClientIPConfig(), validationEnabled);
  }
  public V1ClientIPConfigBuilder(io.kubernetes.client.openapi.models.V1ClientIPConfigFluent<?> fluent) {
    this(fluent, false);
  }
  public V1ClientIPConfigBuilder(io.kubernetes.client.openapi.models.V1ClientIPConfigFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V1ClientIPConfig(), validationEnabled);
  }
  public V1ClientIPConfigBuilder(io.kubernetes.client.openapi.models.V1ClientIPConfigFluent<?> fluent,io.kubernetes.client.openapi.models.V1ClientIPConfig instance) {
    this(fluent, instance, false);
  }
  public V1ClientIPConfigBuilder(io.kubernetes.client.openapi.models.V1ClientIPConfigFluent<?> fluent,io.kubernetes.client.openapi.models.V1ClientIPConfig instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withTimeoutSeconds(instance.getTimeoutSeconds());

    this.validationEnabled = validationEnabled; 
  }
  public V1ClientIPConfigBuilder(io.kubernetes.client.openapi.models.V1ClientIPConfig instance) {
    this(instance,false);
  }
  public V1ClientIPConfigBuilder(io.kubernetes.client.openapi.models.V1ClientIPConfig instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withTimeoutSeconds(instance.getTimeoutSeconds());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V1ClientIPConfigFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V1ClientIPConfig build() {
    V1ClientIPConfig buildable = new V1ClientIPConfig();
    buildable.setTimeoutSeconds(fluent.getTimeoutSeconds());
    return buildable;
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1ClientIPConfigBuilder that = (V1ClientIPConfigBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}