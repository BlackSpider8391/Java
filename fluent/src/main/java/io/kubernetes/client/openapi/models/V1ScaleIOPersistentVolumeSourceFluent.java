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
public interface V1ScaleIOPersistentVolumeSourceFluent<A extends io.kubernetes.client.openapi.models.V1ScaleIOPersistentVolumeSourceFluent<A>> extends io.kubernetes.client.fluent.Fluent<A>{
  public java.lang.String getFsType();
  public A withFsType(java.lang.String fsType);
  public java.lang.Boolean hasFsType();
  
  /**
   * Method is deprecated. use withFsType instead.
   */
  @java.lang.Deprecated
  public A withNewFsType(java.lang.String original);
  public java.lang.String getGateway();
  public A withGateway(java.lang.String gateway);
  public java.lang.Boolean hasGateway();
  
  /**
   * Method is deprecated. use withGateway instead.
   */
  @java.lang.Deprecated
  public A withNewGateway(java.lang.String original);
  public java.lang.String getProtectionDomain();
  public A withProtectionDomain(java.lang.String protectionDomain);
  public java.lang.Boolean hasProtectionDomain();
  
  /**
   * Method is deprecated. use withProtectionDomain instead.
   */
  @java.lang.Deprecated
  public A withNewProtectionDomain(java.lang.String original);
  public java.lang.Boolean getReadOnly();
  public A withReadOnly(java.lang.Boolean readOnly);
  public java.lang.Boolean hasReadOnly();
  
  /**
   * This method has been deprecated, please use method buildSecretRef instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1SecretReference getSecretRef();
  public io.kubernetes.client.openapi.models.V1SecretReference buildSecretRef();
  public A withSecretRef(io.kubernetes.client.openapi.models.V1SecretReference secretRef);
  public java.lang.Boolean hasSecretRef();
  public io.kubernetes.client.openapi.models.V1ScaleIOPersistentVolumeSourceFluent.SecretRefNested<A> withNewSecretRef();
  public io.kubernetes.client.openapi.models.V1ScaleIOPersistentVolumeSourceFluent.SecretRefNested<A> withNewSecretRefLike(io.kubernetes.client.openapi.models.V1SecretReference item);
  public io.kubernetes.client.openapi.models.V1ScaleIOPersistentVolumeSourceFluent.SecretRefNested<A> editSecretRef();
  public io.kubernetes.client.openapi.models.V1ScaleIOPersistentVolumeSourceFluent.SecretRefNested<A> editOrNewSecretRef();
  public io.kubernetes.client.openapi.models.V1ScaleIOPersistentVolumeSourceFluent.SecretRefNested<A> editOrNewSecretRefLike(io.kubernetes.client.openapi.models.V1SecretReference item);
  public java.lang.Boolean getSslEnabled();
  public A withSslEnabled(java.lang.Boolean sslEnabled);
  public java.lang.Boolean hasSslEnabled();
  public java.lang.String getStorageMode();
  public A withStorageMode(java.lang.String storageMode);
  public java.lang.Boolean hasStorageMode();
  
  /**
   * Method is deprecated. use withStorageMode instead.
   */
  @java.lang.Deprecated
  public A withNewStorageMode(java.lang.String original);
  public java.lang.String getStoragePool();
  public A withStoragePool(java.lang.String storagePool);
  public java.lang.Boolean hasStoragePool();
  
  /**
   * Method is deprecated. use withStoragePool instead.
   */
  @java.lang.Deprecated
  public A withNewStoragePool(java.lang.String original);
  public java.lang.String getSystem();
  public A withSystem(java.lang.String system);
  public java.lang.Boolean hasSystem();
  
  /**
   * Method is deprecated. use withSystem instead.
   */
  @java.lang.Deprecated
  public A withNewSystem(java.lang.String original);
  public java.lang.String getVolumeName();
  public A withVolumeName(java.lang.String volumeName);
  public java.lang.Boolean hasVolumeName();
  
  /**
   * Method is deprecated. use withVolumeName instead.
   */
  @java.lang.Deprecated
  public A withNewVolumeName(java.lang.String original);
  public interface SecretRefNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1SecretReferenceFluent<io.kubernetes.client.openapi.models.V1ScaleIOPersistentVolumeSourceFluent.SecretRefNested<N>>{
    public N and();
    public N endSecretRef();
    
  }
  
}