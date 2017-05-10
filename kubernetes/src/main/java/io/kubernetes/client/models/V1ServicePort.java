/*
 * Kubernetes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.6.3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.kubernetes.client.models;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ServicePort contains information on service&#39;s port.
 */
@ApiModel(description = "ServicePort contains information on service's port.")

public class V1ServicePort {
  @SerializedName("name")
  private String name = null;

  @SerializedName("nodePort")
  private Integer nodePort = null;

  @SerializedName("port")
  private Integer port = null;

  @SerializedName("protocol")
  private String protocol = null;

  @SerializedName("targetPort")
  private String targetPort = null;

  public V1ServicePort name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of this port within the service. This must be a DNS_LABEL. All ports within a ServiceSpec must have unique names. This maps to the 'Name' field in EndpointPort objects. Optional if only one ServicePort is defined on this service.
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "The name of this port within the service. This must be a DNS_LABEL. All ports within a ServiceSpec must have unique names. This maps to the 'Name' field in EndpointPort objects. Optional if only one ServicePort is defined on this service.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public V1ServicePort nodePort(Integer nodePort) {
    this.nodePort = nodePort;
    return this;
  }

   /**
   * The port on each node on which this service is exposed when type=NodePort or LoadBalancer. Usually assigned by the system. If specified, it will be allocated to the service if unused or else creation of the service will fail. Default is to auto-allocate a port if the ServiceType of this Service requires one. More info: http://kubernetes.io/docs/user-guide/services#type--nodeport
   * @return nodePort
  **/
  @ApiModelProperty(example = "null", value = "The port on each node on which this service is exposed when type=NodePort or LoadBalancer. Usually assigned by the system. If specified, it will be allocated to the service if unused or else creation of the service will fail. Default is to auto-allocate a port if the ServiceType of this Service requires one. More info: http://kubernetes.io/docs/user-guide/services#type--nodeport")
  public Integer getNodePort() {
    return nodePort;
  }

  public void setNodePort(Integer nodePort) {
    this.nodePort = nodePort;
  }

  public V1ServicePort port(Integer port) {
    this.port = port;
    return this;
  }

   /**
   * The port that will be exposed by this service.
   * @return port
  **/
  @ApiModelProperty(example = "null", required = true, value = "The port that will be exposed by this service.")
  public Integer getPort() {
    return port;
  }

  public void setPort(Integer port) {
    this.port = port;
  }

  public V1ServicePort protocol(String protocol) {
    this.protocol = protocol;
    return this;
  }

   /**
   * The IP protocol for this port. Supports \"TCP\" and \"UDP\". Default is TCP.
   * @return protocol
  **/
  @ApiModelProperty(example = "null", value = "The IP protocol for this port. Supports \"TCP\" and \"UDP\". Default is TCP.")
  public String getProtocol() {
    return protocol;
  }

  public void setProtocol(String protocol) {
    this.protocol = protocol;
  }

  public V1ServicePort targetPort(String targetPort) {
    this.targetPort = targetPort;
    return this;
  }

   /**
   * Number or name of the port to access on the pods targeted by the service. Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME. If this is a string, it will be looked up as a named port in the target Pod's container ports. If this is not specified, the value of the 'port' field is used (an identity map). This field is ignored for services with clusterIP=None, and should be omitted or set equal to the 'port' field. More info: http://kubernetes.io/docs/user-guide/services#defining-a-service
   * @return targetPort
  **/
  @ApiModelProperty(example = "null", value = "Number or name of the port to access on the pods targeted by the service. Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME. If this is a string, it will be looked up as a named port in the target Pod's container ports. If this is not specified, the value of the 'port' field is used (an identity map). This field is ignored for services with clusterIP=None, and should be omitted or set equal to the 'port' field. More info: http://kubernetes.io/docs/user-guide/services#defining-a-service")
  public String getTargetPort() {
    return targetPort;
  }

  public void setTargetPort(String targetPort) {
    this.targetPort = targetPort;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ServicePort v1ServicePort = (V1ServicePort) o;
    return Objects.equals(this.name, v1ServicePort.name) &&
        Objects.equals(this.nodePort, v1ServicePort.nodePort) &&
        Objects.equals(this.port, v1ServicePort.port) &&
        Objects.equals(this.protocol, v1ServicePort.protocol) &&
        Objects.equals(this.targetPort, v1ServicePort.targetPort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, nodePort, port, protocol, targetPort);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ServicePort {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nodePort: ").append(toIndentedString(nodePort)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    targetPort: ").append(toIndentedString(targetPort)).append("\n");
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

