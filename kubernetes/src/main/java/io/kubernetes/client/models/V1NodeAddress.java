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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * NodeAddress contains information for the node&#39;s address.
 */
@ApiModel(description = "NodeAddress contains information for the node's address.")

public class V1NodeAddress {
  @SerializedName("address")
  private String address = null;

  @SerializedName("type")
  private String type = null;

  public V1NodeAddress address(String address) {
    this.address = address;
    return this;
  }

   /**
   * The node address.
   * @return address
  **/
  @ApiModelProperty(required = true, value = "The node address.")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public V1NodeAddress type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Node address type, one of Hostname, ExternalIP or InternalIP.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Node address type, one of Hostname, ExternalIP or InternalIP.")
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
    V1NodeAddress v1NodeAddress = (V1NodeAddress) o;
    return Objects.equals(this.address, v1NodeAddress.address) &&
        Objects.equals(this.type, v1NodeAddress.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1NodeAddress {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
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

