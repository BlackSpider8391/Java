package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1HTTPIngressPathFluent<A extends io.kubernetes.client.openapi.models.V1HTTPIngressPathFluent<A>> extends io.kubernetes.client.fluent.Fluent<A>{
  
  /**
   * This method has been deprecated, please use method buildBackend instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1IngressBackend getBackend();
  public io.kubernetes.client.openapi.models.V1IngressBackend buildBackend();
  public A withBackend(io.kubernetes.client.openapi.models.V1IngressBackend backend);
  public java.lang.Boolean hasBackend();
  public io.kubernetes.client.openapi.models.V1HTTPIngressPathFluent.BackendNested<A> withNewBackend();
  public io.kubernetes.client.openapi.models.V1HTTPIngressPathFluent.BackendNested<A> withNewBackendLike(io.kubernetes.client.openapi.models.V1IngressBackend item);
  public io.kubernetes.client.openapi.models.V1HTTPIngressPathFluent.BackendNested<A> editBackend();
  public io.kubernetes.client.openapi.models.V1HTTPIngressPathFluent.BackendNested<A> editOrNewBackend();
  public io.kubernetes.client.openapi.models.V1HTTPIngressPathFluent.BackendNested<A> editOrNewBackendLike(io.kubernetes.client.openapi.models.V1IngressBackend item);
  public java.lang.String getPath();
  public A withPath(java.lang.String path);
  public java.lang.Boolean hasPath();
  
  /**
   * Method is deprecated. use withPath instead.
   */
  @java.lang.Deprecated
  public A withNewPath(java.lang.String original);
  public java.lang.String getPathType();
  public A withPathType(java.lang.String pathType);
  public java.lang.Boolean hasPathType();
  
  /**
   * Method is deprecated. use withPathType instead.
   */
  @java.lang.Deprecated
  public A withNewPathType(java.lang.String original);
  public interface BackendNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1IngressBackendFluent<io.kubernetes.client.openapi.models.V1HTTPIngressPathFluent.BackendNested<N>>{
    public N and();
    public N endBackend();
    
  }
  
}