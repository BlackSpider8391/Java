/*
 * Kubernetes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.8.9
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.kubernetes.client.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubernetes.client.models.AppsV1beta1RollingUpdateDeployment;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * DeploymentStrategy describes how to replace existing pods with new ones.
 */
@ApiModel(description = "DeploymentStrategy describes how to replace existing pods with new ones.")

public class AppsV1beta1DeploymentStrategy {
  @SerializedName("rollingUpdate")
  private AppsV1beta1RollingUpdateDeployment rollingUpdate = null;

  @SerializedName("type")
  private String type = null;

  public AppsV1beta1DeploymentStrategy rollingUpdate(AppsV1beta1RollingUpdateDeployment rollingUpdate) {
    this.rollingUpdate = rollingUpdate;
    return this;
  }

   /**
   * Rolling update config params. Present only if DeploymentStrategyType &#x3D; RollingUpdate.
   * @return rollingUpdate
  **/
  @ApiModelProperty(value = "Rolling update config params. Present only if DeploymentStrategyType = RollingUpdate.")
  public AppsV1beta1RollingUpdateDeployment getRollingUpdate() {
    return rollingUpdate;
  }

  public void setRollingUpdate(AppsV1beta1RollingUpdateDeployment rollingUpdate) {
    this.rollingUpdate = rollingUpdate;
  }

  public AppsV1beta1DeploymentStrategy type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type of deployment. Can be \&quot;Recreate\&quot; or \&quot;RollingUpdate\&quot;. Default is RollingUpdate.
   * @return type
  **/
  @ApiModelProperty(value = "Type of deployment. Can be \"Recreate\" or \"RollingUpdate\". Default is RollingUpdate.")
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
    AppsV1beta1DeploymentStrategy appsV1beta1DeploymentStrategy = (AppsV1beta1DeploymentStrategy) o;
    return Objects.equals(this.rollingUpdate, appsV1beta1DeploymentStrategy.rollingUpdate) &&
        Objects.equals(this.type, appsV1beta1DeploymentStrategy.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rollingUpdate, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppsV1beta1DeploymentStrategy {\n");
    
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

