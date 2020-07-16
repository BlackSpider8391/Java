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
package io.kubernetes.client.openapi.models;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * MutatingWebhookConfiguration describes the configuration of and admission webhook that accept or
 * reject and may change the object. Deprecated in v1.16, planned for removal in v1.19. Use
 * admissionregistration.k8s.io/v1 MutatingWebhookConfiguration instead.
 */
@ApiModel(
    description =
        "MutatingWebhookConfiguration describes the configuration of and admission webhook that accept or reject and may change the object. Deprecated in v1.16, planned for removal in v1.19. Use admissionregistration.k8s.io/v1 MutatingWebhookConfiguration instead.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-06-19T10:47:33.387Z[Etc/UTC]")
public class V1beta1MutatingWebhookConfiguration
    implements io.kubernetes.client.common.KubernetesObject {
  public static final String SERIALIZED_NAME_API_VERSION = "apiVersion";

  @SerializedName(SERIALIZED_NAME_API_VERSION)
  private String apiVersion;

  public static final String SERIALIZED_NAME_KIND = "kind";

  @SerializedName(SERIALIZED_NAME_KIND)
  private String kind;

  public static final String SERIALIZED_NAME_METADATA = "metadata";

  @SerializedName(SERIALIZED_NAME_METADATA)
  private V1ObjectMeta metadata;

  public static final String SERIALIZED_NAME_WEBHOOKS = "webhooks";

  @SerializedName(SERIALIZED_NAME_WEBHOOKS)
  private List<V1beta1MutatingWebhook> webhooks = null;

  public V1beta1MutatingWebhookConfiguration apiVersion(String apiVersion) {

    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should
   * convert recognized schemas to the latest internal value, and may reject unrecognized values.
   * More info:
   * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   *
   * @return apiVersion
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources")
  public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  public V1beta1MutatingWebhookConfiguration kind(String kind) {

    this.kind = kind;
    return this;
  }

  /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer
   * this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More
   * info:
   * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   *
   * @return kind
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public V1beta1MutatingWebhookConfiguration metadata(V1ObjectMeta metadata) {

    this.metadata = metadata;
    return this;
  }

  /**
   * Get metadata
   *
   * @return metadata
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1ObjectMeta getMetadata() {
    return metadata;
  }

  public void setMetadata(V1ObjectMeta metadata) {
    this.metadata = metadata;
  }

  public V1beta1MutatingWebhookConfiguration webhooks(List<V1beta1MutatingWebhook> webhooks) {

    this.webhooks = webhooks;
    return this;
  }

  public V1beta1MutatingWebhookConfiguration addWebhooksItem(V1beta1MutatingWebhook webhooksItem) {
    if (this.webhooks == null) {
      this.webhooks = new ArrayList<V1beta1MutatingWebhook>();
    }
    this.webhooks.add(webhooksItem);
    return this;
  }

  /**
   * Webhooks is a list of webhooks and the affected resources and operations.
   *
   * @return webhooks
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value = "Webhooks is a list of webhooks and the affected resources and operations.")
  public List<V1beta1MutatingWebhook> getWebhooks() {
    return webhooks;
  }

  public void setWebhooks(List<V1beta1MutatingWebhook> webhooks) {
    this.webhooks = webhooks;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1MutatingWebhookConfiguration v1beta1MutatingWebhookConfiguration =
        (V1beta1MutatingWebhookConfiguration) o;
    return Objects.equals(this.apiVersion, v1beta1MutatingWebhookConfiguration.apiVersion)
        && Objects.equals(this.kind, v1beta1MutatingWebhookConfiguration.kind)
        && Objects.equals(this.metadata, v1beta1MutatingWebhookConfiguration.metadata)
        && Objects.equals(this.webhooks, v1beta1MutatingWebhookConfiguration.webhooks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, kind, metadata, webhooks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1MutatingWebhookConfiguration {\n");
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    webhooks: ").append(toIndentedString(webhooks)).append("\n");
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
