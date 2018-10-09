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
import java.util.ArrayList;
import java.util.List;

/**
 * IPBlock describes a particular CIDR (Ex. \&quot;192.168.1.1/24\&quot;) that is allowed to the pods matched by a NetworkPolicySpec&#39;s podSelector. The except entry describes CIDRs that should not be included within this rule.
 */
@ApiModel(description = "IPBlock describes a particular CIDR (Ex. \"192.168.1.1/24\") that is allowed to the pods matched by a NetworkPolicySpec's podSelector. The except entry describes CIDRs that should not be included within this rule.")

public class V1IPBlock {
  @SerializedName("cidr")
  private String cidr = null;

  @SerializedName("except")
  private List<String> except = null;

  public V1IPBlock cidr(String cidr) {
    this.cidr = cidr;
    return this;
  }

   /**
   * CIDR is a string representing the IP Block Valid examples are \&quot;192.168.1.1/24\&quot;
   * @return cidr
  **/
  @ApiModelProperty(required = true, value = "CIDR is a string representing the IP Block Valid examples are \"192.168.1.1/24\"")
  public String getCidr() {
    return cidr;
  }

  public void setCidr(String cidr) {
    this.cidr = cidr;
  }

  public V1IPBlock except(List<String> except) {
    this.except = except;
    return this;
  }

  public V1IPBlock addExceptItem(String exceptItem) {
    if (this.except == null) {
      this.except = new ArrayList<String>();
    }
    this.except.add(exceptItem);
    return this;
  }

   /**
   * Except is a slice of CIDRs that should not be included within an IP Block Valid examples are \&quot;192.168.1.1/24\&quot; Except values will be rejected if they are outside the CIDR range
   * @return except
  **/
  @ApiModelProperty(value = "Except is a slice of CIDRs that should not be included within an IP Block Valid examples are \"192.168.1.1/24\" Except values will be rejected if they are outside the CIDR range")
  public List<String> getExcept() {
    return except;
  }

  public void setExcept(List<String> except) {
    this.except = except;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1IPBlock v1IPBlock = (V1IPBlock) o;
    return Objects.equals(this.cidr, v1IPBlock.cidr) &&
        Objects.equals(this.except, v1IPBlock.except);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cidr, except);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1IPBlock {\n");
    
    sb.append("    cidr: ").append(toIndentedString(cidr)).append("\n");
    sb.append("    except: ").append(toIndentedString(except)).append("\n");
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

