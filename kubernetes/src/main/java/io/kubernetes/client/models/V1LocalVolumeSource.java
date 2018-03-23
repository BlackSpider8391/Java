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
 * Local represents directly-attached storage with node affinity
 */
@ApiModel(description = "Local represents directly-attached storage with node affinity")

public class V1LocalVolumeSource {
  @SerializedName("path")
  private String path = null;

  public V1LocalVolumeSource path(String path) {
    this.path = path;
    return this;
  }

   /**
   * The full path to the volume on the node For alpha, this path must be a directory Once block as a source is supported, then this path can point to a block device
   * @return path
  **/
  @ApiModelProperty(required = true, value = "The full path to the volume on the node For alpha, this path must be a directory Once block as a source is supported, then this path can point to a block device")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1LocalVolumeSource v1LocalVolumeSource = (V1LocalVolumeSource) o;
    return Objects.equals(this.path, v1LocalVolumeSource.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1LocalVolumeSource {\n");
    
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
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

