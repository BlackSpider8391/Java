package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.lang.Integer;
import java.lang.Deprecated;
import java.lang.Byte;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;

 /**
  * Generated
  */
public class AdmissionregistrationV1WebhookClientConfigFluentImpl<A extends io.kubernetes.client.openapi.models.AdmissionregistrationV1WebhookClientConfigFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.AdmissionregistrationV1WebhookClientConfigFluent<A>{
  public AdmissionregistrationV1WebhookClientConfigFluentImpl() {
  }
  public AdmissionregistrationV1WebhookClientConfigFluentImpl(io.kubernetes.client.openapi.models.AdmissionregistrationV1WebhookClientConfig instance) {
    this.withCaBundle(instance.getCaBundle());

    this.withService(instance.getService());

    this.withUrl(instance.getUrl());

  }
  private java.util.List<java.lang.Byte> caBundle;
  private io.kubernetes.client.openapi.models.AdmissionregistrationV1ServiceReferenceBuilder service;
  private java.lang.String url;
  public A withCaBundle(byte... caBundle) {
    if (this.caBundle != null) {this.caBundle.clear();}
    if (caBundle != null) {for (byte item :caBundle){ this.addToCaBundle(item);}} return (A) this;
  }
  public byte[] getCaBundle() {
    //This needs to work with primitives, so we use arrays.
int size = caBundle != null ? caBundle.size() : 0;
byte[] result = new byte[size];
if (size == 0) {
   return result;
}
int index = 0;
for (byte item : caBundle) {
    result[index++]=item;
}
return result;

  }
  public A addToCaBundle(java.lang.Integer index,java.lang.Byte item) {
    if (this.caBundle == null) {this.caBundle =  new java.util.ArrayList<java.lang.Byte>();}
    this.caBundle.add(index, item);
    return (A)this;
  }
  public A setToCaBundle(java.lang.Integer index,java.lang.Byte item) {
    if (this.caBundle == null) {this.caBundle =  new java.util.ArrayList<java.lang.Byte>();}
    this.caBundle.set(index, item); return (A)this;
  }
  public A addToCaBundle(java.lang.Byte... items) {
    if (this.caBundle == null) {this.caBundle =  new java.util.ArrayList<java.lang.Byte>();}
    for (java.lang.Byte item : items) {this.caBundle.add(item);} return (A)this;
  }
  public A addAllToCaBundle(java.util.Collection<java.lang.Byte> items) {
    if (this.caBundle == null) {this.caBundle =  new java.util.ArrayList<java.lang.Byte>();}
    for (java.lang.Byte item : items) {this.caBundle.add(item);} return (A)this;
  }
  public A removeFromCaBundle(java.lang.Byte... items) {
    for (java.lang.Byte item : items) {if (this.caBundle!= null){ this.caBundle.remove(item);}} return (A)this;
  }
  public A removeAllFromCaBundle(java.util.Collection<java.lang.Byte> items) {
    for (java.lang.Byte item : items) {if (this.caBundle!= null){ this.caBundle.remove(item);}} return (A)this;
  }
  public java.lang.Boolean hasCaBundle() {
    return caBundle != null && !caBundle.isEmpty();
  }
  
  /**
   * This method has been deprecated, please use method buildService instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.AdmissionregistrationV1ServiceReference getService() {
    return this.service!=null?this.service.build():null;
  }
  public io.kubernetes.client.openapi.models.AdmissionregistrationV1ServiceReference buildService() {
    return this.service!=null?this.service.build():null;
  }
  public A withService(io.kubernetes.client.openapi.models.AdmissionregistrationV1ServiceReference service) {
    _visitables.get("service").remove(this.service);
    if (service!=null){ this.service= new io.kubernetes.client.openapi.models.AdmissionregistrationV1ServiceReferenceBuilder(service); _visitables.get("service").add(this.service);} return (A) this;
  }
  public java.lang.Boolean hasService() {
    return this.service != null;
  }
  public io.kubernetes.client.openapi.models.AdmissionregistrationV1WebhookClientConfigFluent.ServiceNested<A> withNewService() {
    return new io.kubernetes.client.openapi.models.AdmissionregistrationV1WebhookClientConfigFluentImpl.ServiceNestedImpl();
  }
  public io.kubernetes.client.openapi.models.AdmissionregistrationV1WebhookClientConfigFluent.ServiceNested<A> withNewServiceLike(io.kubernetes.client.openapi.models.AdmissionregistrationV1ServiceReference item) {
    return new io.kubernetes.client.openapi.models.AdmissionregistrationV1WebhookClientConfigFluentImpl.ServiceNestedImpl(item);
  }
  public io.kubernetes.client.openapi.models.AdmissionregistrationV1WebhookClientConfigFluent.ServiceNested<A> editService() {
    return withNewServiceLike(getService());
  }
  public io.kubernetes.client.openapi.models.AdmissionregistrationV1WebhookClientConfigFluent.ServiceNested<A> editOrNewService() {
    return withNewServiceLike(getService() != null ? getService(): new io.kubernetes.client.openapi.models.AdmissionregistrationV1ServiceReferenceBuilder().build());
  }
  public io.kubernetes.client.openapi.models.AdmissionregistrationV1WebhookClientConfigFluent.ServiceNested<A> editOrNewServiceLike(io.kubernetes.client.openapi.models.AdmissionregistrationV1ServiceReference item) {
    return withNewServiceLike(getService() != null ? getService(): item);
  }
  public java.lang.String getUrl() {
    return this.url;
  }
  public A withUrl(java.lang.String url) {
    this.url=url; return (A) this;
  }
  public java.lang.Boolean hasUrl() {
    return this.url != null;
  }
  
  /**
   * Method is deprecated. use withUrl instead.
   */
  @java.lang.Deprecated
  public A withNewUrl(java.lang.String original) {
    return (A)withUrl(new String(original));
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AdmissionregistrationV1WebhookClientConfigFluentImpl that = (AdmissionregistrationV1WebhookClientConfigFluentImpl) o;
    if (caBundle != null ? !caBundle.equals(that.caBundle) :that.caBundle != null) return false;
    if (service != null ? !service.equals(that.service) :that.service != null) return false;
    if (url != null ? !url.equals(that.url) :that.url != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(caBundle,  service,  url,  super.hashCode());
  }
  public class ServiceNestedImpl<N> extends io.kubernetes.client.openapi.models.AdmissionregistrationV1ServiceReferenceFluentImpl<io.kubernetes.client.openapi.models.AdmissionregistrationV1WebhookClientConfigFluent.ServiceNested<N>> implements io.kubernetes.client.openapi.models.AdmissionregistrationV1WebhookClientConfigFluent.ServiceNested<N>,io.kubernetes.client.fluent.Nested<N>{
    ServiceNestedImpl(io.kubernetes.client.openapi.models.AdmissionregistrationV1ServiceReference item) {
      this.builder = new io.kubernetes.client.openapi.models.AdmissionregistrationV1ServiceReferenceBuilder(this, item);
    }
    ServiceNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.AdmissionregistrationV1ServiceReferenceBuilder(this);
    }
    io.kubernetes.client.openapi.models.AdmissionregistrationV1ServiceReferenceBuilder builder;
    public N and() {
      return (N) AdmissionregistrationV1WebhookClientConfigFluentImpl.this.withService(builder.build());
    }
    public N endService() {
      return and();
    }
    
  }
  
}