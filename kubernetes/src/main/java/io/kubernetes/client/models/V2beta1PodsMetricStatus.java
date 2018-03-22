/*
 * Kubernetes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.8.11
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.kubernetes.client.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PodsMetricStatus indicates the current value of a metric describing each pod in the current scale target (for example, transactions-processed-per-second).
 */
@ApiModel(description = "PodsMetricStatus indicates the current value of a metric describing each pod in the current scale target (for example, transactions-processed-per-second).")

public class V2beta1PodsMetricStatus {
  @SerializedName("currentAverageValue")
  private String currentAverageValue = null;

  @SerializedName("metricName")
  private String metricName = null;

  public V2beta1PodsMetricStatus currentAverageValue(String currentAverageValue) {
    this.currentAverageValue = currentAverageValue;
    return this;
  }

   /**
   * currentAverageValue is the current value of the average of the metric across all relevant pods (as a quantity)
   * @return currentAverageValue
  **/
  @ApiModelProperty(required = true, value = "currentAverageValue is the current value of the average of the metric across all relevant pods (as a quantity)")
  public String getCurrentAverageValue() {
    return currentAverageValue;
  }

  public void setCurrentAverageValue(String currentAverageValue) {
    this.currentAverageValue = currentAverageValue;
  }

  public V2beta1PodsMetricStatus metricName(String metricName) {
    this.metricName = metricName;
    return this;
  }

   /**
   * metricName is the name of the metric in question
   * @return metricName
  **/
  @ApiModelProperty(required = true, value = "metricName is the name of the metric in question")
  public String getMetricName() {
    return metricName;
  }

  public void setMetricName(String metricName) {
    this.metricName = metricName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2beta1PodsMetricStatus v2beta1PodsMetricStatus = (V2beta1PodsMetricStatus) o;
    return Objects.equals(this.currentAverageValue, v2beta1PodsMetricStatus.currentAverageValue) &&
        Objects.equals(this.metricName, v2beta1PodsMetricStatus.metricName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentAverageValue, metricName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2beta1PodsMetricStatus {\n");
    
    sb.append("    currentAverageValue: ").append(toIndentedString(currentAverageValue)).append("\n");
    sb.append("    metricName: ").append(toIndentedString(metricName)).append("\n");
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

