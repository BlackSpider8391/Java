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
import io.kubernetes.client.models.AppsV1beta1RollbackConfig;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * DEPRECATED. DeploymentRollback stores the information required to rollback a deployment.
 */
@ApiModel(description = "DEPRECATED. DeploymentRollback stores the information required to rollback a deployment.")

public class AppsV1beta1DeploymentRollback {
  @SerializedName("apiVersion")
  private String apiVersion = null;

  @SerializedName("kind")
  private String kind = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("rollbackTo")
  private AppsV1beta1RollbackConfig rollbackTo = null;

  @SerializedName("updatedAnnotations")
  private Map<String, String> updatedAnnotations = null;

  public AppsV1beta1DeploymentRollback apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

   /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
   * @return apiVersion
  **/
  @ApiModelProperty(value = "APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#resources")
  public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  public AppsV1beta1DeploymentRollback kind(String kind) {
    this.kind = kind;
    return this;
  }

   /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
   * @return kind
  **/
  @ApiModelProperty(value = "Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public AppsV1beta1DeploymentRollback name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Required: This must match the Name of a deployment.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Required: This must match the Name of a deployment.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AppsV1beta1DeploymentRollback rollbackTo(AppsV1beta1RollbackConfig rollbackTo) {
    this.rollbackTo = rollbackTo;
    return this;
  }

   /**
   * The config of this deployment rollback.
   * @return rollbackTo
  **/
  @ApiModelProperty(required = true, value = "The config of this deployment rollback.")
  public AppsV1beta1RollbackConfig getRollbackTo() {
    return rollbackTo;
  }

  public void setRollbackTo(AppsV1beta1RollbackConfig rollbackTo) {
    this.rollbackTo = rollbackTo;
  }

  public AppsV1beta1DeploymentRollback updatedAnnotations(Map<String, String> updatedAnnotations) {
    this.updatedAnnotations = updatedAnnotations;
    return this;
  }

  public AppsV1beta1DeploymentRollback putUpdatedAnnotationsItem(String key, String updatedAnnotationsItem) {
    if (this.updatedAnnotations == null) {
      this.updatedAnnotations = new HashMap<String, String>();
    }
    this.updatedAnnotations.put(key, updatedAnnotationsItem);
    return this;
  }

   /**
   * The annotations to be updated to a deployment
   * @return updatedAnnotations
  **/
  @ApiModelProperty(value = "The annotations to be updated to a deployment")
  public Map<String, String> getUpdatedAnnotations() {
    return updatedAnnotations;
  }

  public void setUpdatedAnnotations(Map<String, String> updatedAnnotations) {
    this.updatedAnnotations = updatedAnnotations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppsV1beta1DeploymentRollback appsV1beta1DeploymentRollback = (AppsV1beta1DeploymentRollback) o;
    return Objects.equals(this.apiVersion, appsV1beta1DeploymentRollback.apiVersion) &&
        Objects.equals(this.kind, appsV1beta1DeploymentRollback.kind) &&
        Objects.equals(this.name, appsV1beta1DeploymentRollback.name) &&
        Objects.equals(this.rollbackTo, appsV1beta1DeploymentRollback.rollbackTo) &&
        Objects.equals(this.updatedAnnotations, appsV1beta1DeploymentRollback.updatedAnnotations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, kind, name, rollbackTo, updatedAnnotations);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppsV1beta1DeploymentRollback {\n");
    
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rollbackTo: ").append(toIndentedString(rollbackTo)).append("\n");
    sb.append("    updatedAnnotations: ").append(toIndentedString(updatedAnnotations)).append("\n");
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

