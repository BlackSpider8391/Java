/*
 * Kubernetes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.11.4
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
import io.kubernetes.client.models.V1beta1CustomResourceSubresourceScale;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * CustomResourceSubresources defines the status and scale subresources for CustomResources.
 */
@ApiModel(description = "CustomResourceSubresources defines the status and scale subresources for CustomResources.")

public class V1beta1CustomResourceSubresources {
  @SerializedName("scale")
  private V1beta1CustomResourceSubresourceScale scale = null;

  @SerializedName("status")
  private Object status = null;

  public V1beta1CustomResourceSubresources scale(V1beta1CustomResourceSubresourceScale scale) {
    this.scale = scale;
    return this;
  }

   /**
   * Scale denotes the scale subresource for CustomResources
   * @return scale
  **/
  @ApiModelProperty(value = "Scale denotes the scale subresource for CustomResources")
  public V1beta1CustomResourceSubresourceScale getScale() {
    return scale;
  }

  public void setScale(V1beta1CustomResourceSubresourceScale scale) {
    this.scale = scale;
  }

  public V1beta1CustomResourceSubresources status(Object status) {
    this.status = status;
    return this;
  }

   /**
   * Status denotes the status subresource for CustomResources
   * @return status
  **/
  @ApiModelProperty(value = "Status denotes the status subresource for CustomResources")
  public Object getStatus() {
    return status;
  }

  public void setStatus(Object status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1CustomResourceSubresources v1beta1CustomResourceSubresources = (V1beta1CustomResourceSubresources) o;
    return Objects.equals(this.scale, v1beta1CustomResourceSubresources.scale) &&
        Objects.equals(this.status, v1beta1CustomResourceSubresources.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scale, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1CustomResourceSubresources {\n");
    
    sb.append("    scale: ").append(toIndentedString(scale)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

