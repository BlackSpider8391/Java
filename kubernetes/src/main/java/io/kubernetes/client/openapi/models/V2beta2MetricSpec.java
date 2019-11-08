/*
 * Kubernetes
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1.15.6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.kubernetes.client.openapi.models;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubernetes.client.openapi.models.V2beta2ExternalMetricSource;
import io.kubernetes.client.openapi.models.V2beta2ObjectMetricSource;
import io.kubernetes.client.openapi.models.V2beta2PodsMetricSource;
import io.kubernetes.client.openapi.models.V2beta2ResourceMetricSource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * MetricSpec specifies how to scale based on a single metric (only &#x60;type&#x60; and one other matching field should be set at once).
 */
@ApiModel(description = "MetricSpec specifies how to scale based on a single metric (only `type` and one other matching field should be set at once).")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-11-06T10:41:07.822Z[Etc/UTC]")
public class V2beta2MetricSpec {
  public static final String SERIALIZED_NAME_EXTERNAL = "external";
  @SerializedName(SERIALIZED_NAME_EXTERNAL)
  private V2beta2ExternalMetricSource external;

  public static final String SERIALIZED_NAME_OBJECT = "object";
  @SerializedName(SERIALIZED_NAME_OBJECT)
  private V2beta2ObjectMetricSource _object;

  public static final String SERIALIZED_NAME_PODS = "pods";
  @SerializedName(SERIALIZED_NAME_PODS)
  private V2beta2PodsMetricSource pods;

  public static final String SERIALIZED_NAME_RESOURCE = "resource";
  @SerializedName(SERIALIZED_NAME_RESOURCE)
  private V2beta2ResourceMetricSource resource;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;


  public V2beta2MetricSpec external(V2beta2ExternalMetricSource external) {
    
    this.external = external;
    return this;
  }

   /**
   * Get external
   * @return external
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V2beta2ExternalMetricSource getExternal() {
    return external;
  }


  public void setExternal(V2beta2ExternalMetricSource external) {
    this.external = external;
  }


  public V2beta2MetricSpec _object(V2beta2ObjectMetricSource _object) {
    
    this._object = _object;
    return this;
  }

   /**
   * Get _object
   * @return _object
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V2beta2ObjectMetricSource getObject() {
    return _object;
  }


  public void setObject(V2beta2ObjectMetricSource _object) {
    this._object = _object;
  }


  public V2beta2MetricSpec pods(V2beta2PodsMetricSource pods) {
    
    this.pods = pods;
    return this;
  }

   /**
   * Get pods
   * @return pods
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V2beta2PodsMetricSource getPods() {
    return pods;
  }


  public void setPods(V2beta2PodsMetricSource pods) {
    this.pods = pods;
  }


  public V2beta2MetricSpec resource(V2beta2ResourceMetricSource resource) {
    
    this.resource = resource;
    return this;
  }

   /**
   * Get resource
   * @return resource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V2beta2ResourceMetricSource getResource() {
    return resource;
  }


  public void setResource(V2beta2ResourceMetricSource resource) {
    this.resource = resource;
  }


  public V2beta2MetricSpec type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * type is the type of metric source.  It should be one of \&quot;Object\&quot;, \&quot;Pods\&quot; or \&quot;Resource\&quot;, each mapping to a matching field in the object.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "type is the type of metric source.  It should be one of \"Object\", \"Pods\" or \"Resource\", each mapping to a matching field in the object.")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    return EqualsBuilder.reflectionEquals(this, o);
  }

  @Override
  public int hashCode() {
    return HashCodeBuilder.reflectionHashCode(this);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2beta2MetricSpec {\n");
    sb.append("    external: ").append(toIndentedString(external)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    pods: ").append(toIndentedString(pods)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

