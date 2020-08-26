/*
Copyright 2020 The Kubernetes Authors.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package io.cert.manager.models;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** A node selector term, associated with the corresponding weight. */
@ApiModel(description = "A node selector term, associated with the corresponding weight.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-18T19:55:23.947Z[Etc/UTC]")
public class V1alpha2IssuerSpecAcmeHttp01IngressPodTemplateSpecAffinityNodeAffinityPreference {
  public static final String SERIALIZED_NAME_MATCH_EXPRESSIONS = "matchExpressions";

  @SerializedName(SERIALIZED_NAME_MATCH_EXPRESSIONS)
  private List<
          V1alpha2IssuerSpecAcmeHttp01IngressPodTemplateSpecAffinityNodeAffinityPreferenceMatchExpressions>
      matchExpressions = null;

  public static final String SERIALIZED_NAME_MATCH_FIELDS = "matchFields";

  @SerializedName(SERIALIZED_NAME_MATCH_FIELDS)
  private List<
          V1alpha2IssuerSpecAcmeHttp01IngressPodTemplateSpecAffinityNodeAffinityPreferenceMatchExpressions>
      matchFields = null;

  public V1alpha2IssuerSpecAcmeHttp01IngressPodTemplateSpecAffinityNodeAffinityPreference
      matchExpressions(
          List<
                  V1alpha2IssuerSpecAcmeHttp01IngressPodTemplateSpecAffinityNodeAffinityPreferenceMatchExpressions>
              matchExpressions) {

    this.matchExpressions = matchExpressions;
    return this;
  }

  public V1alpha2IssuerSpecAcmeHttp01IngressPodTemplateSpecAffinityNodeAffinityPreference
      addMatchExpressionsItem(
          V1alpha2IssuerSpecAcmeHttp01IngressPodTemplateSpecAffinityNodeAffinityPreferenceMatchExpressions
              matchExpressionsItem) {
    if (this.matchExpressions == null) {
      this.matchExpressions =
          new ArrayList<
              V1alpha2IssuerSpecAcmeHttp01IngressPodTemplateSpecAffinityNodeAffinityPreferenceMatchExpressions>();
    }
    this.matchExpressions.add(matchExpressionsItem);
    return this;
  }

  /**
   * A list of node selector requirements by node&#39;s labels.
   *
   * @return matchExpressions
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of node selector requirements by node's labels.")
  public List<
          V1alpha2IssuerSpecAcmeHttp01IngressPodTemplateSpecAffinityNodeAffinityPreferenceMatchExpressions>
      getMatchExpressions() {
    return matchExpressions;
  }

  public void setMatchExpressions(
      List<
              V1alpha2IssuerSpecAcmeHttp01IngressPodTemplateSpecAffinityNodeAffinityPreferenceMatchExpressions>
          matchExpressions) {
    this.matchExpressions = matchExpressions;
  }

  public V1alpha2IssuerSpecAcmeHttp01IngressPodTemplateSpecAffinityNodeAffinityPreference
      matchFields(
          List<
                  V1alpha2IssuerSpecAcmeHttp01IngressPodTemplateSpecAffinityNodeAffinityPreferenceMatchExpressions>
              matchFields) {

    this.matchFields = matchFields;
    return this;
  }

  public V1alpha2IssuerSpecAcmeHttp01IngressPodTemplateSpecAffinityNodeAffinityPreference
      addMatchFieldsItem(
          V1alpha2IssuerSpecAcmeHttp01IngressPodTemplateSpecAffinityNodeAffinityPreferenceMatchExpressions
              matchFieldsItem) {
    if (this.matchFields == null) {
      this.matchFields =
          new ArrayList<
              V1alpha2IssuerSpecAcmeHttp01IngressPodTemplateSpecAffinityNodeAffinityPreferenceMatchExpressions>();
    }
    this.matchFields.add(matchFieldsItem);
    return this;
  }

  /**
   * A list of node selector requirements by node&#39;s fields.
   *
   * @return matchFields
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of node selector requirements by node's fields.")
  public List<
          V1alpha2IssuerSpecAcmeHttp01IngressPodTemplateSpecAffinityNodeAffinityPreferenceMatchExpressions>
      getMatchFields() {
    return matchFields;
  }

  public void setMatchFields(
      List<
              V1alpha2IssuerSpecAcmeHttp01IngressPodTemplateSpecAffinityNodeAffinityPreferenceMatchExpressions>
          matchFields) {
    this.matchFields = matchFields;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha2IssuerSpecAcmeHttp01IngressPodTemplateSpecAffinityNodeAffinityPreference
        v1alpha2IssuerSpecAcmeHttp01IngressPodTemplateSpecAffinityNodeAffinityPreference =
            (V1alpha2IssuerSpecAcmeHttp01IngressPodTemplateSpecAffinityNodeAffinityPreference) o;
    return Objects.equals(
            this.matchExpressions,
            v1alpha2IssuerSpecAcmeHttp01IngressPodTemplateSpecAffinityNodeAffinityPreference
                .matchExpressions)
        && Objects.equals(
            this.matchFields,
            v1alpha2IssuerSpecAcmeHttp01IngressPodTemplateSpecAffinityNodeAffinityPreference
                .matchFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(matchExpressions, matchFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(
        "class V1alpha2IssuerSpecAcmeHttp01IngressPodTemplateSpecAffinityNodeAffinityPreference {\n");
    sb.append("    matchExpressions: ").append(toIndentedString(matchExpressions)).append("\n");
    sb.append("    matchFields: ").append(toIndentedString(matchFields)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
