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
public interface V1PersistentVolumeClaimTemplateFluent<A extends io.kubernetes.client.openapi.models.V1PersistentVolumeClaimTemplateFluent<A>> extends io.kubernetes.client.fluent.Fluent<A>{
  
  /**
   * This method has been deprecated, please use method buildMetadata instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1ObjectMeta getMetadata();
  public io.kubernetes.client.openapi.models.V1ObjectMeta buildMetadata();
  public A withMetadata(io.kubernetes.client.openapi.models.V1ObjectMeta metadata);
  public java.lang.Boolean hasMetadata();
  public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimTemplateFluent.MetadataNested<A> withNewMetadata();
  public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimTemplateFluent.MetadataNested<A> withNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item);
  public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimTemplateFluent.MetadataNested<A> editMetadata();
  public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimTemplateFluent.MetadataNested<A> editOrNewMetadata();
  public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimTemplateFluent.MetadataNested<A> editOrNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item);
  
  /**
   * This method has been deprecated, please use method buildSpec instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimSpec getSpec();
  public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimSpec buildSpec();
  public A withSpec(io.kubernetes.client.openapi.models.V1PersistentVolumeClaimSpec spec);
  public java.lang.Boolean hasSpec();
  public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimTemplateFluent.SpecNested<A> withNewSpec();
  public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimTemplateFluent.SpecNested<A> withNewSpecLike(io.kubernetes.client.openapi.models.V1PersistentVolumeClaimSpec item);
  public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimTemplateFluent.SpecNested<A> editSpec();
  public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimTemplateFluent.SpecNested<A> editOrNewSpec();
  public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimTemplateFluent.SpecNested<A> editOrNewSpecLike(io.kubernetes.client.openapi.models.V1PersistentVolumeClaimSpec item);
  public interface MetadataNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1ObjectMetaFluent<io.kubernetes.client.openapi.models.V1PersistentVolumeClaimTemplateFluent.MetadataNested<N>>{
    public N and();
    public N endMetadata();
    
  }
  public interface SpecNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1PersistentVolumeClaimSpecFluent<io.kubernetes.client.openapi.models.V1PersistentVolumeClaimTemplateFluent.SpecNested<N>>{
    public N and();
    public N endSpec();
    
  }
  
}