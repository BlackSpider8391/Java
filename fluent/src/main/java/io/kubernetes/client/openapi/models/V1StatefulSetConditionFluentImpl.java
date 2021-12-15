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
public class V1StatefulSetConditionFluentImpl<A extends io.kubernetes.client.openapi.models.V1StatefulSetConditionFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1StatefulSetConditionFluent<A>{
  public V1StatefulSetConditionFluentImpl() {
  }
  public V1StatefulSetConditionFluentImpl(io.kubernetes.client.openapi.models.V1StatefulSetCondition instance) {
    this.withLastTransitionTime(instance.getLastTransitionTime());

    this.withMessage(instance.getMessage());

    this.withReason(instance.getReason());

    this.withStatus(instance.getStatus());

    this.withType(instance.getType());

  }
  private java.time.OffsetDateTime lastTransitionTime;
  private java.lang.String message;
  private java.lang.String reason;
  private java.lang.String status;
  private java.lang.String type;
  public java.time.OffsetDateTime getLastTransitionTime() {
    return this.lastTransitionTime;
  }
  public A withLastTransitionTime(java.time.OffsetDateTime lastTransitionTime) {
    this.lastTransitionTime=lastTransitionTime; return (A) this;
  }
  public java.lang.Boolean hasLastTransitionTime() {
    return this.lastTransitionTime != null;
  }
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
  public java.lang.String getReason() {
    return this.reason;
  }
  public A withReason(java.lang.String reason) {
    this.reason=reason; return (A) this;
  }
  public java.lang.Boolean hasReason() {
    return this.reason != null;
  }
  
  /**
   * Method is deprecated. use withReason instead.
   */
  @java.lang.Deprecated
  public A withNewReason(java.lang.String original) {
    return (A)withReason(new String(original));
  }
  public java.lang.String getStatus() {
    return this.status;
  }
  public A withStatus(java.lang.String status) {
    this.status=status; return (A) this;
  }
  public java.lang.Boolean hasStatus() {
    return this.status != null;
  }
  
  /**
   * Method is deprecated. use withStatus instead.
   */
  @java.lang.Deprecated
  public A withNewStatus(java.lang.String original) {
    return (A)withStatus(new String(original));
  }
  public java.lang.String getType() {
    return this.type;
  }
  public A withType(java.lang.String type) {
    this.type=type; return (A) this;
  }
  public java.lang.Boolean hasType() {
    return this.type != null;
  }
  
  /**
   * Method is deprecated. use withType instead.
   */
  @java.lang.Deprecated
  public A withNewType(java.lang.String original) {
    return (A)withType(new String(original));
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1StatefulSetConditionFluentImpl that = (V1StatefulSetConditionFluentImpl) o;
    if (lastTransitionTime != null ? !lastTransitionTime.equals(that.lastTransitionTime) :that.lastTransitionTime != null) return false;
    if (message != null ? !message.equals(that.message) :that.message != null) return false;
    if (reason != null ? !reason.equals(that.reason) :that.reason != null) return false;
    if (status != null ? !status.equals(that.status) :that.status != null) return false;
    if (type != null ? !type.equals(that.type) :that.type != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(lastTransitionTime,  message,  reason,  status,  type,  super.hashCode());
  }
  
}