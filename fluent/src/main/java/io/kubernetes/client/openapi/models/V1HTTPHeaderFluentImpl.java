package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public class V1HTTPHeaderFluentImpl<A extends io.kubernetes.client.openapi.models.V1HTTPHeaderFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1HTTPHeaderFluent<A>{
  public V1HTTPHeaderFluentImpl() {
  }
  public V1HTTPHeaderFluentImpl(io.kubernetes.client.openapi.models.V1HTTPHeader instance) {
    this.withName(instance.getName());

    this.withValue(instance.getValue());

  }
  private java.lang.String name;
  private java.lang.String value;
  public java.lang.String getName() {
    return this.name;
  }
  public A withName(java.lang.String name) {
    this.name=name; return (A) this;
  }
  public java.lang.Boolean hasName() {
    return this.name != null;
  }
  
  /**
   * Method is deprecated. use withName instead.
   */
  @java.lang.Deprecated
  public A withNewName(java.lang.String original) {
    return (A)withName(new String(original));
  }
  public java.lang.String getValue() {
    return this.value;
  }
  public A withValue(java.lang.String value) {
    this.value=value; return (A) this;
  }
  public java.lang.Boolean hasValue() {
    return this.value != null;
  }
  
  /**
   * Method is deprecated. use withValue instead.
   */
  @java.lang.Deprecated
  public A withNewValue(java.lang.String original) {
    return (A)withValue(new String(original));
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1HTTPHeaderFluentImpl that = (V1HTTPHeaderFluentImpl) o;
    if (name != null ? !name.equals(that.name) :that.name != null) return false;
    if (value != null ? !value.equals(that.value) :that.value != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(name,  value,  super.hashCode());
  }
  
}