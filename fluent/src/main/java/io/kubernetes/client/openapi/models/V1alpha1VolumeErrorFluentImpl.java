package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import java.time.OffsetDateTime;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public class V1alpha1VolumeErrorFluentImpl<A extends io.kubernetes.client.openapi.models.V1alpha1VolumeErrorFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1alpha1VolumeErrorFluent<A>{
  public V1alpha1VolumeErrorFluentImpl() {
  }
  public V1alpha1VolumeErrorFluentImpl(io.kubernetes.client.openapi.models.V1alpha1VolumeError instance) {
    this.withMessage(instance.getMessage());

    this.withTime(instance.getTime());

  }
  private java.lang.String message;
  private java.time.OffsetDateTime time;
  public java.lang.String getMessage() {
    return this.message;
  }
  public A withMessage(java.lang.String message) {
    this.message=message; return (A) this;
  }
  public java.lang.Boolean hasMessage() {
    return this.message != null;
  }
  
  /**
   * Method is deprecated. use withMessage instead.
   */
  @java.lang.Deprecated
  public A withNewMessage(java.lang.String original) {
    return (A)withMessage(new String(original));
  }
  public java.time.OffsetDateTime getTime() {
    return this.time;
  }
  public A withTime(java.time.OffsetDateTime time) {
    this.time=time; return (A) this;
  }
  public java.lang.Boolean hasTime() {
    return this.time != null;
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1alpha1VolumeErrorFluentImpl that = (V1alpha1VolumeErrorFluentImpl) o;
    if (message != null ? !message.equals(that.message) :that.message != null) return false;
    if (time != null ? !time.equals(that.time) :that.time != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(message,  time,  super.hashCode());
  }
  
}