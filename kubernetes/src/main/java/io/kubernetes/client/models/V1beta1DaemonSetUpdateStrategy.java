/*
 * Kubernetes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.13.5
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
import io.kubernetes.client.models.V1beta1RollingUpdateDaemonSet;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * V1beta1DaemonSetUpdateStrategy
 */

public class V1beta1DaemonSetUpdateStrategy {
  @SerializedName("rollingUpdate")
  private V1beta1RollingUpdateDaemonSet rollingUpdate = null;

  @SerializedName("type")
  private String type = null;

  public V1beta1DaemonSetUpdateStrategy rollingUpdate(V1beta1RollingUpdateDaemonSet rollingUpdate) {
    this.rollingUpdate = rollingUpdate;
    return this;
  }

   /**
   * Rolling update config params. Present only if type &#x3D; \&quot;RollingUpdate\&quot;.
   * @return rollingUpdate
  **/
  @ApiModelProperty(value = "Rolling update config params. Present only if type = \"RollingUpdate\".")
  public V1beta1RollingUpdateDaemonSet getRollingUpdate() {
    return rollingUpdate;
  }

  public void setRollingUpdate(V1beta1RollingUpdateDaemonSet rollingUpdate) {
    this.rollingUpdate = rollingUpdate;
  }

  public V1beta1DaemonSetUpdateStrategy type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type of daemon set update. Can be \&quot;RollingUpdate\&quot; or \&quot;OnDelete\&quot;. Default is OnDelete.
   * @return type
  **/
  @ApiModelProperty(value = "Type of daemon set update. Can be \"RollingUpdate\" or \"OnDelete\". Default is OnDelete.")
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
    V1beta1DaemonSetUpdateStrategy v1beta1DaemonSetUpdateStrategy = (V1beta1DaemonSetUpdateStrategy) o;
    return Objects.equals(this.rollingUpdate, v1beta1DaemonSetUpdateStrategy.rollingUpdate) &&
        Objects.equals(this.type, v1beta1DaemonSetUpdateStrategy.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rollingUpdate, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1DaemonSetUpdateStrategy {\n");
    
    sb.append("    rollingUpdate: ").append(toIndentedString(rollingUpdate)).append("\n");
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

