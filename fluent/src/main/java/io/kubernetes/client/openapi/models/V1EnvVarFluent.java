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
public interface V1EnvVarFluent<A extends io.kubernetes.client.openapi.models.V1EnvVarFluent<A>> extends io.kubernetes.client.fluent.Fluent<A>{
  public java.lang.String getName();
  public A withName(java.lang.String name);
  public java.lang.Boolean hasName();
  
  /**
   * Method is deprecated. use withName instead.
   */
  @java.lang.Deprecated
  public A withNewName(java.lang.String original);
  public java.lang.String getValue();
  public A withValue(java.lang.String value);
  public java.lang.Boolean hasValue();
  
  /**
   * Method is deprecated. use withValue instead.
   */
  @java.lang.Deprecated
  public A withNewValue(java.lang.String original);
  
  /**
   * This method has been deprecated, please use method buildValueFrom instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1EnvVarSource getValueFrom();
  public io.kubernetes.client.openapi.models.V1EnvVarSource buildValueFrom();
  public A withValueFrom(io.kubernetes.client.openapi.models.V1EnvVarSource valueFrom);
  public java.lang.Boolean hasValueFrom();
  public io.kubernetes.client.openapi.models.V1EnvVarFluent.ValueFromNested<A> withNewValueFrom();
  public io.kubernetes.client.openapi.models.V1EnvVarFluent.ValueFromNested<A> withNewValueFromLike(io.kubernetes.client.openapi.models.V1EnvVarSource item);
  public io.kubernetes.client.openapi.models.V1EnvVarFluent.ValueFromNested<A> editValueFrom();
  public io.kubernetes.client.openapi.models.V1EnvVarFluent.ValueFromNested<A> editOrNewValueFrom();
  public io.kubernetes.client.openapi.models.V1EnvVarFluent.ValueFromNested<A> editOrNewValueFromLike(io.kubernetes.client.openapi.models.V1EnvVarSource item);
  public interface ValueFromNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1EnvVarSourceFluent<io.kubernetes.client.openapi.models.V1EnvVarFluent.ValueFromNested<N>>{
    public N and();
    public N endValueFrom();
    
  }
  
}