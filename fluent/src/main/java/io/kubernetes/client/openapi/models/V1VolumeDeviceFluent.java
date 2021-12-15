package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1VolumeDeviceFluent<A extends io.kubernetes.client.openapi.models.V1VolumeDeviceFluent<A>> extends io.kubernetes.client.fluent.Fluent<A>{
  public java.lang.String getDevicePath();
  public A withDevicePath(java.lang.String devicePath);
  public java.lang.Boolean hasDevicePath();
  
  /**
   * Method is deprecated. use withDevicePath instead.
   */
  @java.lang.Deprecated
  public A withNewDevicePath(java.lang.String original);
  public java.lang.String getName();
  public A withName(java.lang.String name);
  public java.lang.Boolean hasName();
  
  /**
   * Method is deprecated. use withName instead.
   */
  @java.lang.Deprecated
  public A withNewName(java.lang.String original);
  
}