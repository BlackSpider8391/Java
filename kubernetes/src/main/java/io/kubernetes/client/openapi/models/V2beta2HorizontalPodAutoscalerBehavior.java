/*
 * Kubernetes
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: release-1.23
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
import io.kubernetes.client.openapi.models.V2beta2HPAScalingRules;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * HorizontalPodAutoscalerBehavior configures the scaling behavior of the target in both Up and Down directions (scaleUp and scaleDown fields respectively).
 */
@ApiModel(description = "HorizontalPodAutoscalerBehavior configures the scaling behavior of the target in both Up and Down directions (scaleUp and scaleDown fields respectively).")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-10T19:11:23.904Z[Etc/UTC]")
public class V2beta2HorizontalPodAutoscalerBehavior {
  public static final String SERIALIZED_NAME_SCALE_DOWN = "scaleDown";
  @SerializedName(SERIALIZED_NAME_SCALE_DOWN)
  private V2beta2HPAScalingRules scaleDown;

  public static final String SERIALIZED_NAME_SCALE_UP = "scaleUp";
  @SerializedName(SERIALIZED_NAME_SCALE_UP)
  private V2beta2HPAScalingRules scaleUp;


  public V2beta2HorizontalPodAutoscalerBehavior scaleDown(V2beta2HPAScalingRules scaleDown) {
    
    this.scaleDown = scaleDown;
    return this;
  }

   /**
   * Get scaleDown
   * @return scaleDown
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V2beta2HPAScalingRules getScaleDown() {
    return scaleDown;
  }


  public void setScaleDown(V2beta2HPAScalingRules scaleDown) {
    this.scaleDown = scaleDown;
  }


  public V2beta2HorizontalPodAutoscalerBehavior scaleUp(V2beta2HPAScalingRules scaleUp) {
    
    this.scaleUp = scaleUp;
    return this;
  }

   /**
   * Get scaleUp
   * @return scaleUp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V2beta2HPAScalingRules getScaleUp() {
    return scaleUp;
  }


  public void setScaleUp(V2beta2HPAScalingRules scaleUp) {
    this.scaleUp = scaleUp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2beta2HorizontalPodAutoscalerBehavior v2beta2HorizontalPodAutoscalerBehavior = (V2beta2HorizontalPodAutoscalerBehavior) o;
    return Objects.equals(this.scaleDown, v2beta2HorizontalPodAutoscalerBehavior.scaleDown) &&
        Objects.equals(this.scaleUp, v2beta2HorizontalPodAutoscalerBehavior.scaleUp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scaleDown, scaleUp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2beta2HorizontalPodAutoscalerBehavior {\n");
    sb.append("    scaleDown: ").append(toIndentedString(scaleDown)).append("\n");
    sb.append("    scaleUp: ").append(toIndentedString(scaleUp)).append("\n");
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

