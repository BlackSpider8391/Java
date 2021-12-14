package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public class V1SubjectFluentImpl<A extends io.kubernetes.client.openapi.models.V1SubjectFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1SubjectFluent<A>{
  public V1SubjectFluentImpl() {
  }
  public V1SubjectFluentImpl(io.kubernetes.client.openapi.models.V1Subject instance) {
    this.withApiGroup(instance.getApiGroup());

    this.withKind(instance.getKind());

    this.withName(instance.getName());

    this.withNamespace(instance.getNamespace());

  }
  private java.lang.String apiGroup;
  private java.lang.String kind;
  private java.lang.String name;
  private java.lang.String namespace;
  public java.lang.String getApiGroup() {
    return this.apiGroup;
  }
  public A withApiGroup(java.lang.String apiGroup) {
    this.apiGroup=apiGroup; return (A) this;
  }
  public java.lang.Boolean hasApiGroup() {
    return this.apiGroup != null;
  }
  
  /**
   * Method is deprecated. use withApiGroup instead.
   */
  @java.lang.Deprecated
  public A withNewApiGroup(java.lang.String original) {
    return (A)withApiGroup(new String(original));
  }
  public java.lang.String getKind() {
    return this.kind;
  }
  public A withKind(java.lang.String kind) {
    this.kind=kind; return (A) this;
  }
  public java.lang.Boolean hasKind() {
    return this.kind != null;
  }
  
  /**
   * Method is deprecated. use withKind instead.
   */
  @java.lang.Deprecated
  public A withNewKind(java.lang.String original) {
    return (A)withKind(new String(original));
  }
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
  public java.lang.String getNamespace() {
    return this.namespace;
  }
  public A withNamespace(java.lang.String namespace) {
    this.namespace=namespace; return (A) this;
  }
  public java.lang.Boolean hasNamespace() {
    return this.namespace != null;
  }
  
  /**
   * Method is deprecated. use withNamespace instead.
   */
  @java.lang.Deprecated
  public A withNewNamespace(java.lang.String original) {
    return (A)withNamespace(new String(original));
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1SubjectFluentImpl that = (V1SubjectFluentImpl) o;
    if (apiGroup != null ? !apiGroup.equals(that.apiGroup) :that.apiGroup != null) return false;
    if (kind != null ? !kind.equals(that.kind) :that.kind != null) return false;
    if (name != null ? !name.equals(that.name) :that.name != null) return false;
    if (namespace != null ? !namespace.equals(that.namespace) :that.namespace != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(apiGroup,  kind,  name,  namespace,  super.hashCode());
  }
  
}