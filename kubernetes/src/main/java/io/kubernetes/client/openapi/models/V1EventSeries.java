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
import org.joda.time.DateTime;

/**
 * EventSeries contain information on series of events, i.e. thing that was/is happening continuously for some time.
 */
@ApiModel(description = "EventSeries contain information on series of events, i.e. thing that was/is happening continuously for some time.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-11-28T14:07:30.308Z[Etc/UTC]")
public class V1EventSeries {
  public static final String SERIALIZED_NAME_COUNT = "count";
  @SerializedName(SERIALIZED_NAME_COUNT)
  private Integer count;

  public static final String SERIALIZED_NAME_LAST_OBSERVED_TIME = "lastObservedTime";
  @SerializedName(SERIALIZED_NAME_LAST_OBSERVED_TIME)
  private DateTime lastObservedTime;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;


  public V1EventSeries count(Integer count) {
    
    this.count = count;
    return this;
  }

   /**
   * Number of occurrences in this series up to the last heartbeat time
   * @return count
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of occurrences in this series up to the last heartbeat time")

  public Integer getCount() {
    return count;
  }


  public void setCount(Integer count) {
    this.count = count;
  }


  public V1EventSeries lastObservedTime(DateTime lastObservedTime) {
    
    this.lastObservedTime = lastObservedTime;
    return this;
  }

   /**
   * Time of the last occurrence observed
   * @return lastObservedTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Time of the last occurrence observed")

  public DateTime getLastObservedTime() {
    return lastObservedTime;
  }


  public void setLastObservedTime(DateTime lastObservedTime) {
    this.lastObservedTime = lastObservedTime;
  }


  public V1EventSeries state(String state) {
    
    this.state = state;
    return this;
  }

   /**
   * State of this Series: Ongoing or Finished Deprecated. Planned removal for 1.18
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "State of this Series: Ongoing or Finished Deprecated. Planned removal for 1.18")

  public String getState() {
    return state;
  }


  public void setState(String state) {
    this.state = state;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1EventSeries v1EventSeries = (V1EventSeries) o;
    return Objects.equals(this.count, v1EventSeries.count) &&
        Objects.equals(this.lastObservedTime, v1EventSeries.lastObservedTime) &&
        Objects.equals(this.state, v1EventSeries.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, lastObservedTime, state);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1EventSeries {\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    lastObservedTime: ").append(toIndentedString(lastObservedTime)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

