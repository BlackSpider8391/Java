/*
 * Kubernetes
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1.16.5
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Describe a container image
 */
@ApiModel(description = "Describe a container image")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-12-17T11:16:41.964Z[Etc/UTC]")
public class V1ContainerImage {
  public static final String SERIALIZED_NAME_NAMES = "names";
  @SerializedName(SERIALIZED_NAME_NAMES)
  private List<String> names = new ArrayList<String>();

  public static final String SERIALIZED_NAME_SIZE_BYTES = "sizeBytes";
  @SerializedName(SERIALIZED_NAME_SIZE_BYTES)
  private Long sizeBytes;


  public V1ContainerImage names(List<String> names) {
    
    this.names = names;
    return this;
  }

  public V1ContainerImage addNamesItem(String namesItem) {
    this.names.add(namesItem);
    return this;
  }

   /**
   * Names by which this image is known. e.g. [\&quot;k8s.gcr.io/hyperkube:v1.0.7\&quot;, \&quot;dockerhub.io/google_containers/hyperkube:v1.0.7\&quot;]
   * @return names
  **/
  @ApiModelProperty(required = true, value = "Names by which this image is known. e.g. [\"k8s.gcr.io/hyperkube:v1.0.7\", \"dockerhub.io/google_containers/hyperkube:v1.0.7\"]")

  public List<String> getNames() {
    return names;
  }


  public void setNames(List<String> names) {
    this.names = names;
  }


  public V1ContainerImage sizeBytes(Long sizeBytes) {
    
    this.sizeBytes = sizeBytes;
    return this;
  }

   /**
   * The size of the image in bytes.
   * @return sizeBytes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The size of the image in bytes.")

  public Long getSizeBytes() {
    return sizeBytes;
  }


  public void setSizeBytes(Long sizeBytes) {
    this.sizeBytes = sizeBytes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ContainerImage v1ContainerImage = (V1ContainerImage) o;
    return Objects.equals(this.names, v1ContainerImage.names) &&
        Objects.equals(this.sizeBytes, v1ContainerImage.sizeBytes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(names, sizeBytes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ContainerImage {\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    sizeBytes: ").append(toIndentedString(sizeBytes)).append("\n");
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

