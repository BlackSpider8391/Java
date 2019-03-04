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
import io.kubernetes.client.models.V1SELinuxOptions;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * SELinuxStrategyOptions defines the strategy type and any options used to create the strategy.
 */
@ApiModel(description = "SELinuxStrategyOptions defines the strategy type and any options used to create the strategy.")

public class PolicyV1beta1SELinuxStrategyOptions {
  @SerializedName("rule")
  private String rule = null;

  @SerializedName("seLinuxOptions")
  private V1SELinuxOptions seLinuxOptions = null;

  public PolicyV1beta1SELinuxStrategyOptions rule(String rule) {
    this.rule = rule;
    return this;
  }

   /**
   * rule is the strategy that will dictate the allowable labels that may be set.
   * @return rule
  **/
  @ApiModelProperty(required = true, value = "rule is the strategy that will dictate the allowable labels that may be set.")
  public String getRule() {
    return rule;
  }

  public void setRule(String rule) {
    this.rule = rule;
  }

  public PolicyV1beta1SELinuxStrategyOptions seLinuxOptions(V1SELinuxOptions seLinuxOptions) {
    this.seLinuxOptions = seLinuxOptions;
    return this;
  }

   /**
   * seLinuxOptions required to run as; required for MustRunAs More info: https://kubernetes.io/docs/tasks/configure-pod-container/security-context/
   * @return seLinuxOptions
  **/
  @ApiModelProperty(value = "seLinuxOptions required to run as; required for MustRunAs More info: https://kubernetes.io/docs/tasks/configure-pod-container/security-context/")
  public V1SELinuxOptions getSeLinuxOptions() {
    return seLinuxOptions;
  }

  public void setSeLinuxOptions(V1SELinuxOptions seLinuxOptions) {
    this.seLinuxOptions = seLinuxOptions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PolicyV1beta1SELinuxStrategyOptions policyV1beta1SELinuxStrategyOptions = (PolicyV1beta1SELinuxStrategyOptions) o;
    return Objects.equals(this.rule, policyV1beta1SELinuxStrategyOptions.rule) &&
        Objects.equals(this.seLinuxOptions, policyV1beta1SELinuxStrategyOptions.seLinuxOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rule, seLinuxOptions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PolicyV1beta1SELinuxStrategyOptions {\n");
    
    sb.append("    rule: ").append(toIndentedString(rule)).append("\n");
    sb.append("    seLinuxOptions: ").append(toIndentedString(seLinuxOptions)).append("\n");
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

