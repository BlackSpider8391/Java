/*
Copyright 2021 The Kubernetes Authors.
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
import java.util.Objects;

/**
 * Subject matches the originator of a request, as identified by the request authentication system.
 * There are three ways of matching an originator; by user, group, or service account.
 */
@ApiModel(
    description =
        "Subject matches the originator of a request, as identified by the request authentication system. There are three ways of matching an originator; by user, group, or service account.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2021-12-10T19:11:23.904Z[Etc/UTC]")
public class V1beta2Subject {
  public static final String SERIALIZED_NAME_GROUP = "group";

  @SerializedName(SERIALIZED_NAME_GROUP)
  private V1beta2GroupSubject group;

  public static final String SERIALIZED_NAME_KIND = "kind";

  @SerializedName(SERIALIZED_NAME_KIND)
  private String kind;

  public static final String SERIALIZED_NAME_SERVICE_ACCOUNT = "serviceAccount";

  @SerializedName(SERIALIZED_NAME_SERVICE_ACCOUNT)
  private V1beta2ServiceAccountSubject serviceAccount;

  public static final String SERIALIZED_NAME_USER = "user";

  @SerializedName(SERIALIZED_NAME_USER)
  private V1beta2UserSubject user;

  public V1beta2Subject group(V1beta2GroupSubject group) {

    this.group = group;
    return this;
  }

  /**
   * Get group
   *
   * @return group
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1beta2GroupSubject getGroup() {
    return group;
  }

  public void setGroup(V1beta2GroupSubject group) {
    this.group = group;
  }

  public V1beta2Subject kind(String kind) {

    this.kind = kind;
    return this;
  }

  /**
   * &#x60;kind&#x60; indicates which one of the other fields is non-empty. Required
   *
   * @return kind
   */
  @ApiModelProperty(
      required = true,
      value = "`kind` indicates which one of the other fields is non-empty. Required")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public V1beta2Subject serviceAccount(V1beta2ServiceAccountSubject serviceAccount) {

    this.serviceAccount = serviceAccount;
    return this;
  }

  /**
   * Get serviceAccount
   *
   * @return serviceAccount
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1beta2ServiceAccountSubject getServiceAccount() {
    return serviceAccount;
  }

  public void setServiceAccount(V1beta2ServiceAccountSubject serviceAccount) {
    this.serviceAccount = serviceAccount;
  }

  public V1beta2Subject user(V1beta2UserSubject user) {

    this.user = user;
    return this;
  }

  /**
   * Get user
   *
   * @return user
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1beta2UserSubject getUser() {
    return user;
  }

  public void setUser(V1beta2UserSubject user) {
    this.user = user;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta2Subject v1beta2Subject = (V1beta2Subject) o;
    return Objects.equals(this.group, v1beta2Subject.group)
        && Objects.equals(this.kind, v1beta2Subject.kind)
        && Objects.equals(this.serviceAccount, v1beta2Subject.serviceAccount)
        && Objects.equals(this.user, v1beta2Subject.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(group, kind, serviceAccount, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta2Subject {\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    serviceAccount: ").append(toIndentedString(serviceAccount)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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
