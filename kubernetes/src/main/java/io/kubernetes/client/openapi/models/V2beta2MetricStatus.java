/*
 * Kubernetes
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1.16.4
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.kubernetes.client.openapi.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubernetes.client.openapi.models.V2beta2ExternalMetricStatus;
import io.kubernetes.client.openapi.models.V2beta2ObjectMetricStatus;
import io.kubernetes.client.openapi.models.V2beta2PodsMetricStatus;
import io.kubernetes.client.openapi.models.V2beta2ResourceMetricStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * MetricStatus describes the last-read state of a single metric.
 */
@ApiModel(description = "MetricStatus describes the last-read state of a single metric.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-12-10T11:32:23.773Z[Etc/UTC]")
public class V2beta2MetricStatus {
  public static final String SERIALIZED_NAME_EXTERNAL = "external";
  @SerializedName(SERIALIZED_NAME_EXTERNAL)
  private V2beta2ExternalMetricStatus external;

  public static final String SERIALIZED_NAME_OBJECT = "object";
  @SerializedName(SERIALIZED_NAME_OBJECT)
  private V2beta2ObjectMetricStatus _object;

  public static final String SERIALIZED_NAME_PODS = "pods";
  @SerializedName(SERIALIZED_NAME_PODS)
  private V2beta2PodsMetricStatus pods;

  public static final String SERIALIZED_NAME_RESOURCE = "resource";
  @SerializedName(SERIALIZED_NAME_RESOURCE)
  private V2beta2ResourceMetricStatus resource;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;


  public V2beta2MetricStatus external(V2beta2ExternalMetricStatus external) {
    
    this.external = external;
    return this;
  }

   /**
   * Get external
   * @return external
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V2beta2ExternalMetricStatus getExternal() {
    return external;
  }


  public void setExternal(V2beta2ExternalMetricStatus external) {
    this.external = external;
  }


  public V2beta2MetricStatus _object(V2beta2ObjectMetricStatus _object) {
    
    this._object = _object;
    return this;
  }

   /**
   * Get _object
   * @return _object
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V2beta2ObjectMetricStatus getObject() {
    return _object;
  }


  public void setObject(V2beta2ObjectMetricStatus _object) {
    this._object = _object;
  }


  public V2beta2MetricStatus pods(V2beta2PodsMetricStatus pods) {
    
    this.pods = pods;
    return this;
  }

   /**
   * Get pods
   * @return pods
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V2beta2PodsMetricStatus getPods() {
    return pods;
  }


  public void setPods(V2beta2PodsMetricStatus pods) {
    this.pods = pods;
  }


  public V2beta2MetricStatus resource(V2beta2ResourceMetricStatus resource) {
    
    this.resource = resource;
    return this;
  }

   /**
   * Get resource
   * @return resource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V2beta2ResourceMetricStatus getResource() {
    return resource;
  }


  public void setResource(V2beta2ResourceMetricStatus resource) {
    this.resource = resource;
  }


  public V2beta2MetricStatus type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * type is the type of metric source.  It will be one of \&quot;Object\&quot;, \&quot;Pods\&quot; or \&quot;Resource\&quot;, each corresponds to a matching field in the object.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "type is the type of metric source.  It will be one of \"Object\", \"Pods\" or \"Resource\", each corresponds to a matching field in the object.")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2beta2MetricStatus v2beta2MetricStatus = (V2beta2MetricStatus) o;
    return Objects.equals(this.external, v2beta2MetricStatus.external) &&
        Objects.equals(this._object, v2beta2MetricStatus._object) &&
        Objects.equals(this.pods, v2beta2MetricStatus.pods) &&
        Objects.equals(this.resource, v2beta2MetricStatus.resource) &&
        Objects.equals(this.type, v2beta2MetricStatus.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(external, _object, pods, resource, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2beta2MetricStatus {\n");
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

