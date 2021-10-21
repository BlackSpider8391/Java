package io.kubernetes.client.openapi.models;

import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1DaemonSetFluent<A extends io.kubernetes.client.openapi.models.V1DaemonSetFluent<A>> extends io.kubernetes.client.fluent.Fluent<A>{
  public java.lang.String getApiVersion();
  public A withApiVersion(java.lang.String apiVersion);
  public java.lang.Boolean hasApiVersion();
  
  /**
   * Method is deprecated. use withApiVersion instead.
   */
  @java.lang.Deprecated
  public A withNewApiVersion(java.lang.String original);
  public java.lang.String getKind();
  public A withKind(java.lang.String kind);
  public java.lang.Boolean hasKind();
  
  /**
   * Method is deprecated. use withKind instead.
   */
  @java.lang.Deprecated
  public A withNewKind(java.lang.String original);
  
  /**
   * This method has been deprecated, please use method buildMetadata instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1ObjectMeta getMetadata();
  public io.kubernetes.client.openapi.models.V1ObjectMeta buildMetadata();
  public A withMetadata(io.kubernetes.client.openapi.models.V1ObjectMeta metadata);
  public java.lang.Boolean hasMetadata();
  public io.kubernetes.client.openapi.models.V1DaemonSetFluent.MetadataNested<A> withNewMetadata();
  public io.kubernetes.client.openapi.models.V1DaemonSetFluent.MetadataNested<A> withNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item);
  public io.kubernetes.client.openapi.models.V1DaemonSetFluent.MetadataNested<A> editMetadata();
  public io.kubernetes.client.openapi.models.V1DaemonSetFluent.MetadataNested<A> editOrNewMetadata();
  public io.kubernetes.client.openapi.models.V1DaemonSetFluent.MetadataNested<A> editOrNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item);
  
  /**
   * This method has been deprecated, please use method buildSpec instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1DaemonSetSpec getSpec();
  public io.kubernetes.client.openapi.models.V1DaemonSetSpec buildSpec();
  public A withSpec(io.kubernetes.client.openapi.models.V1DaemonSetSpec spec);
  public java.lang.Boolean hasSpec();
  public io.kubernetes.client.openapi.models.V1DaemonSetFluent.SpecNested<A> withNewSpec();
  public io.kubernetes.client.openapi.models.V1DaemonSetFluent.SpecNested<A> withNewSpecLike(io.kubernetes.client.openapi.models.V1DaemonSetSpec item);
  public io.kubernetes.client.openapi.models.V1DaemonSetFluent.SpecNested<A> editSpec();
  public io.kubernetes.client.openapi.models.V1DaemonSetFluent.SpecNested<A> editOrNewSpec();
  public io.kubernetes.client.openapi.models.V1DaemonSetFluent.SpecNested<A> editOrNewSpecLike(io.kubernetes.client.openapi.models.V1DaemonSetSpec item);
  
  /**
   * This method has been deprecated, please use method buildStatus instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1DaemonSetStatus getStatus();
  public io.kubernetes.client.openapi.models.V1DaemonSetStatus buildStatus();
  public A withStatus(io.kubernetes.client.openapi.models.V1DaemonSetStatus status);
  public java.lang.Boolean hasStatus();
  public io.kubernetes.client.openapi.models.V1DaemonSetFluent.StatusNested<A> withNewStatus();
  public io.kubernetes.client.openapi.models.V1DaemonSetFluent.StatusNested<A> withNewStatusLike(io.kubernetes.client.openapi.models.V1DaemonSetStatus item);
  public io.kubernetes.client.openapi.models.V1DaemonSetFluent.StatusNested<A> editStatus();
  public io.kubernetes.client.openapi.models.V1DaemonSetFluent.StatusNested<A> editOrNewStatus();
  public io.kubernetes.client.openapi.models.V1DaemonSetFluent.StatusNested<A> editOrNewStatusLike(io.kubernetes.client.openapi.models.V1DaemonSetStatus item);
  public interface MetadataNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1ObjectMetaFluent<io.kubernetes.client.openapi.models.V1DaemonSetFluent.MetadataNested<N>>{
    public N and();
    public N endMetadata();
    
  }
  public interface SpecNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1DaemonSetSpecFluent<io.kubernetes.client.openapi.models.V1DaemonSetFluent.SpecNested<N>>{
    public N and();
    public N endSpec();
    
  }
  public interface StatusNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1DaemonSetStatusFluent<io.kubernetes.client.openapi.models.V1DaemonSetFluent.StatusNested<N>>{
    public N and();
    public N endStatus();
    
  }
  
}