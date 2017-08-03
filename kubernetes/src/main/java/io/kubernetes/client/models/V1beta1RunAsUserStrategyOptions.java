/*
 * Kubernetes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.6.9
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
import io.kubernetes.client.models.V1beta1IDRange;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Run A sUser Strategy Options defines the strategy type and any options used to create the strategy.
 */
@ApiModel(description = "Run A sUser Strategy Options defines the strategy type and any options used to create the strategy.")

public class V1beta1RunAsUserStrategyOptions {
  @SerializedName("ranges")
  private List<V1beta1IDRange> ranges = null;

  @SerializedName("rule")
  private String rule = null;

  public V1beta1RunAsUserStrategyOptions ranges(List<V1beta1IDRange> ranges) {
    this.ranges = ranges;
    return this;
  }

  public V1beta1RunAsUserStrategyOptions addRangesItem(V1beta1IDRange rangesItem) {
    if (this.ranges == null) {
      this.ranges = new ArrayList<V1beta1IDRange>();
    }
    this.ranges.add(rangesItem);
    return this;
  }

   /**
   * Ranges are the allowed ranges of uids that may be used.
   * @return ranges
  **/
  @ApiModelProperty(value = "Ranges are the allowed ranges of uids that may be used.")
  public List<V1beta1IDRange> getRanges() {
    return ranges;
  }

  public void setRanges(List<V1beta1IDRange> ranges) {
    this.ranges = ranges;
  }

  public V1beta1RunAsUserStrategyOptions rule(String rule) {
    this.rule = rule;
    return this;
  }

   /**
   * Rule is the strategy that will dictate the allowable RunAsUser values that may be set.
   * @return rule
  **/
  @ApiModelProperty(required = true, value = "Rule is the strategy that will dictate the allowable RunAsUser values that may be set.")
  public String getRule() {
    return rule;
  }

  public void setRule(String rule) {
    this.rule = rule;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1RunAsUserStrategyOptions v1beta1RunAsUserStrategyOptions = (V1beta1RunAsUserStrategyOptions) o;
    return Objects.equals(this.ranges, v1beta1RunAsUserStrategyOptions.ranges) &&
        Objects.equals(this.rule, v1beta1RunAsUserStrategyOptions.rule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ranges, rule);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1RunAsUserStrategyOptions {\n");
    
    sb.append("    ranges: ").append(toIndentedString(ranges)).append("\n");
    sb.append("    rule: ").append(toIndentedString(rule)).append("\n");
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

