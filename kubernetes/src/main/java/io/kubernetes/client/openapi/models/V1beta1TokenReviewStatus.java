/*
 * Kubernetes
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1.15.7
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.kubernetes.client.openapi.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubernetes.client.openapi.models.V1beta1UserInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * TokenReviewStatus is the result of the token authentication request.
 */
@ApiModel(description = "TokenReviewStatus is the result of the token authentication request.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-11-28T14:07:30.308Z[Etc/UTC]")
public class V1beta1TokenReviewStatus {
  public static final String SERIALIZED_NAME_AUDIENCES = "audiences";
  @SerializedName(SERIALIZED_NAME_AUDIENCES)
  private List<String> audiences = null;

  public static final String SERIALIZED_NAME_AUTHENTICATED = "authenticated";
  @SerializedName(SERIALIZED_NAME_AUTHENTICATED)
  private Boolean authenticated;

  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private String error;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private V1beta1UserInfo user;


  public V1beta1TokenReviewStatus audiences(List<String> audiences) {
    
    this.audiences = audiences;
    return this;
  }

  public V1beta1TokenReviewStatus addAudiencesItem(String audiencesItem) {
    if (this.audiences == null) {
      this.audiences = new ArrayList<String>();
    }
    this.audiences.add(audiencesItem);
    return this;
  }

   /**
   * Audiences are audience identifiers chosen by the authenticator that are compatible with both the TokenReview and token. An identifier is any identifier in the intersection of the TokenReviewSpec audiences and the token&#39;s audiences. A client of the TokenReview API that sets the spec.audiences field should validate that a compatible audience identifier is returned in the status.audiences field to ensure that the TokenReview server is audience aware. If a TokenReview returns an empty status.audience field where status.authenticated is \&quot;true\&quot;, the token is valid against the audience of the Kubernetes API server.
   * @return audiences
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Audiences are audience identifiers chosen by the authenticator that are compatible with both the TokenReview and token. An identifier is any identifier in the intersection of the TokenReviewSpec audiences and the token's audiences. A client of the TokenReview API that sets the spec.audiences field should validate that a compatible audience identifier is returned in the status.audiences field to ensure that the TokenReview server is audience aware. If a TokenReview returns an empty status.audience field where status.authenticated is \"true\", the token is valid against the audience of the Kubernetes API server.")

  public List<String> getAudiences() {
    return audiences;
  }


  public void setAudiences(List<String> audiences) {
    this.audiences = audiences;
  }


  public V1beta1TokenReviewStatus authenticated(Boolean authenticated) {
    
    this.authenticated = authenticated;
    return this;
  }

   /**
   * Authenticated indicates that the token was associated with a known user.
   * @return authenticated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Authenticated indicates that the token was associated with a known user.")

  public Boolean getAuthenticated() {
    return authenticated;
  }


  public void setAuthenticated(Boolean authenticated) {
    this.authenticated = authenticated;
  }


  public V1beta1TokenReviewStatus error(String error) {
    
    this.error = error;
    return this;
  }

   /**
   * Error indicates that the token couldn&#39;t be checked
   * @return error
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Error indicates that the token couldn't be checked")

  public String getError() {
    return error;
  }


  public void setError(String error) {
    this.error = error;
  }


  public V1beta1TokenReviewStatus user(V1beta1UserInfo user) {
    
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1beta1UserInfo getUser() {
    return user;
  }


  public void setUser(V1beta1UserInfo user) {
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
    V1beta1TokenReviewStatus v1beta1TokenReviewStatus = (V1beta1TokenReviewStatus) o;
    return Objects.equals(this.audiences, v1beta1TokenReviewStatus.audiences) &&
        Objects.equals(this.authenticated, v1beta1TokenReviewStatus.authenticated) &&
        Objects.equals(this.error, v1beta1TokenReviewStatus.error) &&
        Objects.equals(this.user, v1beta1TokenReviewStatus.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audiences, authenticated, error, user);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1TokenReviewStatus {\n");
    sb.append("    audiences: ").append(toIndentedString(audiences)).append("\n");
    sb.append("    authenticated: ").append(toIndentedString(authenticated)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

