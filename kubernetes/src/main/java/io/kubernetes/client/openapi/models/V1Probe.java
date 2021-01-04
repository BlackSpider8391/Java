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
 * Probe describes a health check to be performed against a container to determine whether it is
 * alive or ready to receive traffic.
 */
@ApiModel(
    description =
        "Probe describes a health check to be performed against a container to determine whether it is alive or ready to receive traffic.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2021-01-04T08:47:01.853Z[Etc/UTC]")
public class V1Probe {
  public static final String SERIALIZED_NAME_EXEC = "exec";

  @SerializedName(SERIALIZED_NAME_EXEC)
  private V1ExecAction exec;

  public static final String SERIALIZED_NAME_FAILURE_THRESHOLD = "failureThreshold";

  @SerializedName(SERIALIZED_NAME_FAILURE_THRESHOLD)
  private Integer failureThreshold;

  public static final String SERIALIZED_NAME_HTTP_GET = "httpGet";

  @SerializedName(SERIALIZED_NAME_HTTP_GET)
  private V1HTTPGetAction httpGet;

  public static final String SERIALIZED_NAME_INITIAL_DELAY_SECONDS = "initialDelaySeconds";

  @SerializedName(SERIALIZED_NAME_INITIAL_DELAY_SECONDS)
  private Integer initialDelaySeconds;

  public static final String SERIALIZED_NAME_PERIOD_SECONDS = "periodSeconds";

  @SerializedName(SERIALIZED_NAME_PERIOD_SECONDS)
  private Integer periodSeconds;

  public static final String SERIALIZED_NAME_SUCCESS_THRESHOLD = "successThreshold";

  @SerializedName(SERIALIZED_NAME_SUCCESS_THRESHOLD)
  private Integer successThreshold;

  public static final String SERIALIZED_NAME_TCP_SOCKET = "tcpSocket";

  @SerializedName(SERIALIZED_NAME_TCP_SOCKET)
  private V1TCPSocketAction tcpSocket;

  public static final String SERIALIZED_NAME_TIMEOUT_SECONDS = "timeoutSeconds";

  @SerializedName(SERIALIZED_NAME_TIMEOUT_SECONDS)
  private Integer timeoutSeconds;

  public V1Probe exec(V1ExecAction exec) {

    this.exec = exec;
    return this;
  }

  /**
   * Get exec
   *
   * @return exec
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1ExecAction getExec() {
    return exec;
  }

  public void setExec(V1ExecAction exec) {
    this.exec = exec;
  }

  public V1Probe failureThreshold(Integer failureThreshold) {

    this.failureThreshold = failureThreshold;
    return this;
  }

  /**
   * Minimum consecutive failures for the probe to be considered failed after having succeeded.
   * Defaults to 3. Minimum value is 1.
   *
   * @return failureThreshold
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Minimum consecutive failures for the probe to be considered failed after having succeeded. Defaults to 3. Minimum value is 1.")
  public Integer getFailureThreshold() {
    return failureThreshold;
  }

  public void setFailureThreshold(Integer failureThreshold) {
    this.failureThreshold = failureThreshold;
  }

  public V1Probe httpGet(V1HTTPGetAction httpGet) {

    this.httpGet = httpGet;
    return this;
  }

  /**
   * Get httpGet
   *
   * @return httpGet
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1HTTPGetAction getHttpGet() {
    return httpGet;
  }

  public void setHttpGet(V1HTTPGetAction httpGet) {
    this.httpGet = httpGet;
  }

  public V1Probe initialDelaySeconds(Integer initialDelaySeconds) {

    this.initialDelaySeconds = initialDelaySeconds;
    return this;
  }

  /**
   * Number of seconds after the container has started before liveness probes are initiated. More
   * info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
   *
   * @return initialDelaySeconds
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Number of seconds after the container has started before liveness probes are initiated. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes")
  public Integer getInitialDelaySeconds() {
    return initialDelaySeconds;
  }

  public void setInitialDelaySeconds(Integer initialDelaySeconds) {
    this.initialDelaySeconds = initialDelaySeconds;
  }

  public V1Probe periodSeconds(Integer periodSeconds) {

    this.periodSeconds = periodSeconds;
    return this;
  }

  /**
   * How often (in seconds) to perform the probe. Default to 10 seconds. Minimum value is 1.
   *
   * @return periodSeconds
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "How often (in seconds) to perform the probe. Default to 10 seconds. Minimum value is 1.")
  public Integer getPeriodSeconds() {
    return periodSeconds;
  }

  public void setPeriodSeconds(Integer periodSeconds) {
    this.periodSeconds = periodSeconds;
  }

  public V1Probe successThreshold(Integer successThreshold) {

    this.successThreshold = successThreshold;
    return this;
  }

  /**
   * Minimum consecutive successes for the probe to be considered successful after having failed.
   * Defaults to 1. Must be 1 for liveness and startup. Minimum value is 1.
   *
   * @return successThreshold
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Minimum consecutive successes for the probe to be considered successful after having failed. Defaults to 1. Must be 1 for liveness and startup. Minimum value is 1.")
  public Integer getSuccessThreshold() {
    return successThreshold;
  }

  public void setSuccessThreshold(Integer successThreshold) {
    this.successThreshold = successThreshold;
  }

  public V1Probe tcpSocket(V1TCPSocketAction tcpSocket) {

    this.tcpSocket = tcpSocket;
    return this;
  }

  /**
   * Get tcpSocket
   *
   * @return tcpSocket
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1TCPSocketAction getTcpSocket() {
    return tcpSocket;
  }

  public void setTcpSocket(V1TCPSocketAction tcpSocket) {
    this.tcpSocket = tcpSocket;
  }

  public V1Probe timeoutSeconds(Integer timeoutSeconds) {

    this.timeoutSeconds = timeoutSeconds;
    return this;
  }

  /**
   * Number of seconds after which the probe times out. Defaults to 1 second. Minimum value is 1.
   * More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
   *
   * @return timeoutSeconds
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Number of seconds after which the probe times out. Defaults to 1 second. Minimum value is 1. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes")
  public Integer getTimeoutSeconds() {
    return timeoutSeconds;
  }

  public void setTimeoutSeconds(Integer timeoutSeconds) {
    this.timeoutSeconds = timeoutSeconds;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1Probe v1Probe = (V1Probe) o;
    return Objects.equals(this.exec, v1Probe.exec)
        && Objects.equals(this.failureThreshold, v1Probe.failureThreshold)
        && Objects.equals(this.httpGet, v1Probe.httpGet)
        && Objects.equals(this.initialDelaySeconds, v1Probe.initialDelaySeconds)
        && Objects.equals(this.periodSeconds, v1Probe.periodSeconds)
        && Objects.equals(this.successThreshold, v1Probe.successThreshold)
        && Objects.equals(this.tcpSocket, v1Probe.tcpSocket)
        && Objects.equals(this.timeoutSeconds, v1Probe.timeoutSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        exec,
        failureThreshold,
        httpGet,
        initialDelaySeconds,
        periodSeconds,
        successThreshold,
        tcpSocket,
        timeoutSeconds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1Probe {\n");
    sb.append("    exec: ").append(toIndentedString(exec)).append("\n");
    sb.append("    failureThreshold: ").append(toIndentedString(failureThreshold)).append("\n");
    sb.append("    httpGet: ").append(toIndentedString(httpGet)).append("\n");
    sb.append("    initialDelaySeconds: ")
        .append(toIndentedString(initialDelaySeconds))
        .append("\n");
    sb.append("    periodSeconds: ").append(toIndentedString(periodSeconds)).append("\n");
    sb.append("    successThreshold: ").append(toIndentedString(successThreshold)).append("\n");
    sb.append("    tcpSocket: ").append(toIndentedString(tcpSocket)).append("\n");
    sb.append("    timeoutSeconds: ").append(toIndentedString(timeoutSeconds)).append("\n");
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
