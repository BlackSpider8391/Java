/*
 * Kubernetes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.12.2
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
 * Represents a Quobyte mount that lasts the lifetime of a pod. Quobyte volumes do not support ownership management or SELinux relabeling.
 */
@ApiModel(description = "Represents a Quobyte mount that lasts the lifetime of a pod. Quobyte volumes do not support ownership management or SELinux relabeling.")

public class V1QuobyteVolumeSource {
  @SerializedName("group")
  private String group = null;

  @SerializedName("readOnly")
  private Boolean readOnly = null;

  @SerializedName("registry")
  private String registry = null;

  @SerializedName("user")
  private String user = null;

  @SerializedName("volume")
  private String volume = null;

  public V1QuobyteVolumeSource group(String group) {
    this.group = group;
    return this;
  }

   /**
   * Group to map volume access to Default is no group
   * @return group
  **/
  @ApiModelProperty(value = "Group to map volume access to Default is no group")
  public String getGroup() {
    return group;
  }

  public void setGroup(String group) {
    this.group = group;
  }

  public V1QuobyteVolumeSource readOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

   /**
   * ReadOnly here will force the Quobyte volume to be mounted with read-only permissions. Defaults to false.
   * @return readOnly
  **/
  @ApiModelProperty(value = "ReadOnly here will force the Quobyte volume to be mounted with read-only permissions. Defaults to false.")
  public Boolean isReadOnly() {
    return readOnly;
  }

  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }

  public V1QuobyteVolumeSource registry(String registry) {
    this.registry = registry;
    return this;
  }

   /**
   * Registry represents a single or multiple Quobyte Registry services specified as a string as host:port pair (multiple entries are separated with commas) which acts as the central registry for volumes
   * @return registry
  **/
  @ApiModelProperty(required = true, value = "Registry represents a single or multiple Quobyte Registry services specified as a string as host:port pair (multiple entries are separated with commas) which acts as the central registry for volumes")
  public String getRegistry() {
    return registry;
  }

  public void setRegistry(String registry) {
    this.registry = registry;
  }

  public V1QuobyteVolumeSource user(String user) {
    this.user = user;
    return this;
  }

   /**
   * User to map volume access to Defaults to serivceaccount user
   * @return user
  **/
  @ApiModelProperty(value = "User to map volume access to Defaults to serivceaccount user")
  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }

  public V1QuobyteVolumeSource volume(String volume) {
    this.volume = volume;
    return this;
  }

   /**
   * Volume is a string that references an already created Quobyte volume by name.
   * @return volume
  **/
  @ApiModelProperty(required = true, value = "Volume is a string that references an already created Quobyte volume by name.")
  public String getVolume() {
    return volume;
  }

  public void setVolume(String volume) {
    this.volume = volume;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1QuobyteVolumeSource v1QuobyteVolumeSource = (V1QuobyteVolumeSource) o;
    return Objects.equals(this.group, v1QuobyteVolumeSource.group) &&
        Objects.equals(this.readOnly, v1QuobyteVolumeSource.readOnly) &&
        Objects.equals(this.registry, v1QuobyteVolumeSource.registry) &&
        Objects.equals(this.user, v1QuobyteVolumeSource.user) &&
        Objects.equals(this.volume, v1QuobyteVolumeSource.volume);
  }

  @Override
  public int hashCode() {
    return Objects.hash(group, readOnly, registry, user, volume);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1QuobyteVolumeSource {\n");
    
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("    registry: ").append(toIndentedString(registry)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
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

