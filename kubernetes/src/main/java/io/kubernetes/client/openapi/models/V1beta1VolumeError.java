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
import java.util.Objects;
import org.joda.time.DateTime;

/** VolumeError captures an error encountered during a volume operation. */
@ApiModel(description = "VolumeError captures an error encountered during a volume operation.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-11-06T08:58:17.566Z[Etc/UTC]")
public class V1beta1VolumeError {
  public static final String SERIALIZED_NAME_MESSAGE = "message";

  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_TIME = "time";

  @SerializedName(SERIALIZED_NAME_TIME)
  private DateTime time;

  public V1beta1VolumeError message(String message) {

    this.message = message;
    return this;
  }

  /**
   * String detailing the error encountered during Attach or Detach operation. This string may be
   * logged, so it should not contain sensitive information.
   *
   * @return message
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "String detailing the error encountered during Attach or Detach operation. This string may be logged, so it should not contain sensitive information.")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public V1beta1VolumeError time(DateTime time) {

    this.time = time;
    return this;
  }

  /**
   * Time the error was encountered.
   *
   * @return time
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Time the error was encountered.")
  public DateTime getTime() {
    return time;
  }

  public void setTime(DateTime time) {
    this.time = time;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1VolumeError v1beta1VolumeError = (V1beta1VolumeError) o;
    return Objects.equals(this.message, v1beta1VolumeError.message)
        && Objects.equals(this.time, v1beta1VolumeError.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, time);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1VolumeError {\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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
