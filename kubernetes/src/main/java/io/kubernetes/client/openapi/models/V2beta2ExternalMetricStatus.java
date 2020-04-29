/*
 * Kubernetes
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: release-1.16
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
import io.kubernetes.client.openapi.models.V2beta2MetricIdentifier;
import io.kubernetes.client.openapi.models.V2beta2MetricValueStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ExternalMetricStatus indicates the current value of a global metric not associated with any Kubernetes object.
 */
@ApiModel(description = "ExternalMetricStatus indicates the current value of a global metric not associated with any Kubernetes object.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-29T07:27:12.312Z[Etc/UTC]")
public class V2beta2ExternalMetricStatus {
  public static final String SERIALIZED_NAME_CURRENT = "current";
  @SerializedName(SERIALIZED_NAME_CURRENT)
  private V2beta2MetricValueStatus current;

  public static final String SERIALIZED_NAME_METRIC = "metric";
  @SerializedName(SERIALIZED_NAME_METRIC)
  private V2beta2MetricIdentifier metric;


  public V2beta2ExternalMetricStatus current(V2beta2MetricValueStatus current) {
    
    this.current = current;
    return this;
  }

   /**
   * Get current
   * @return current
  **/
  @ApiModelProperty(required = true, value = "")

  public V2beta2MetricValueStatus getCurrent() {
    return current;
  }


  public void setCurrent(V2beta2MetricValueStatus current) {
    this.current = current;
  }


  public V2beta2ExternalMetricStatus metric(V2beta2MetricIdentifier metric) {
    
    this.metric = metric;
    return this;
  }

   /**
   * Get metric
   * @return metric
  **/
  @ApiModelProperty(required = true, value = "")

  public V2beta2MetricIdentifier getMetric() {
    return metric;
  }


  public void setMetric(V2beta2MetricIdentifier metric) {
    this.metric = metric;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2beta2ExternalMetricStatus v2beta2ExternalMetricStatus = (V2beta2ExternalMetricStatus) o;
    return Objects.equals(this.current, v2beta2ExternalMetricStatus.current) &&
        Objects.equals(this.metric, v2beta2ExternalMetricStatus.metric);
  }

  @Override
  public int hashCode() {
    return Objects.hash(current, metric);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2beta2ExternalMetricStatus {\n");
    sb.append("    current: ").append(toIndentedString(current)).append("\n");
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
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

