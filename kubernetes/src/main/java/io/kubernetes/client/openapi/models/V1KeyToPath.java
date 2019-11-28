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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Maps a string key to a path within a volume.
 */
@ApiModel(description = "Maps a string key to a path within a volume.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-11-28T14:07:30.308Z[Etc/UTC]")
public class V1KeyToPath {
  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_MODE = "mode";
  @SerializedName(SERIALIZED_NAME_MODE)
  private Integer mode;

  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;


  public V1KeyToPath key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * The key to project.
   * @return key
  **/
  @ApiModelProperty(required = true, value = "The key to project.")

  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    this.key = key;
  }


  public V1KeyToPath mode(Integer mode) {
    
    this.mode = mode;
    return this;
  }

   /**
   * Optional: mode bits to use on this file, must be a value between 0 and 0777. If not specified, the volume defaultMode will be used. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
   * @return mode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional: mode bits to use on this file, must be a value between 0 and 0777. If not specified, the volume defaultMode will be used. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.")

  public Integer getMode() {
    return mode;
  }


  public void setMode(Integer mode) {
    this.mode = mode;
  }


  public V1KeyToPath path(String path) {
    
    this.path = path;
    return this;
  }

   /**
   * The relative path of the file to map the key to. May not be an absolute path. May not contain the path element &#39;..&#39;. May not start with the string &#39;..&#39;.
   * @return path
  **/
  @ApiModelProperty(required = true, value = "The relative path of the file to map the key to. May not be an absolute path. May not contain the path element '..'. May not start with the string '..'.")

  public String getPath() {
    return path;
  }


  public void setPath(String path) {
    this.path = path;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1KeyToPath v1KeyToPath = (V1KeyToPath) o;
    return Objects.equals(this.key, v1KeyToPath.key) &&
        Objects.equals(this.mode, v1KeyToPath.mode) &&
        Objects.equals(this.path, v1KeyToPath.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, mode, path);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1KeyToPath {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
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

