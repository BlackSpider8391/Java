package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import java.time.OffsetDateTime;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1TaintFluent<A extends io.kubernetes.client.openapi.models.V1TaintFluent<A>> extends io.kubernetes.client.fluent.Fluent<A>{
  public java.lang.String getEffect();
  public A withEffect(java.lang.String effect);
  public java.lang.Boolean hasEffect();
  
  /**
   * Method is deprecated. use withEffect instead.
   */
  @java.lang.Deprecated
  public A withNewEffect(java.lang.String original);
  public java.lang.String getKey();
  public A withKey(java.lang.String key);
  public java.lang.Boolean hasKey();
  
  /**
   * Method is deprecated. use withKey instead.
   */
  @java.lang.Deprecated
  public A withNewKey(java.lang.String original);
  public java.time.OffsetDateTime getTimeAdded();
  public A withTimeAdded(java.time.OffsetDateTime timeAdded);
  public java.lang.Boolean hasTimeAdded();
  public java.lang.String getValue();
  public A withValue(java.lang.String value);
  public java.lang.Boolean hasValue();
  
  /**
   * Method is deprecated. use withValue instead.
   */
  @java.lang.Deprecated
  public A withNewValue(java.lang.String original);
  
}