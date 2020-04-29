/*
 * Kubernetes
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: release-1.16
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
 * EndpointPort represents a Port used by an EndpointSlice
 */
@ApiModel(description = "EndpointPort represents a Port used by an EndpointSlice")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-29T07:27:12.312Z[Etc/UTC]")
public class V1alpha1EndpointPort {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PORT = "port";
  @SerializedName(SERIALIZED_NAME_PORT)
  private Integer port;

  public static final String SERIALIZED_NAME_PROTOCOL = "protocol";
  @SerializedName(SERIALIZED_NAME_PROTOCOL)
  private String protocol;


  public V1alpha1EndpointPort name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of this port. All ports in an EndpointSlice must have a unique name. If the EndpointSlice is dervied from a Kubernetes service, this corresponds to the Service.ports[].name. Name must either be an empty string or pass IANA_SVC_NAME validation: * must be no more than 15 characters long * may contain only [-a-z0-9] * must contain at least one letter [a-z] * it must not start or end with a hyphen, nor contain adjacent hyphens Default is empty string.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of this port. All ports in an EndpointSlice must have a unique name. If the EndpointSlice is dervied from a Kubernetes service, this corresponds to the Service.ports[].name. Name must either be an empty string or pass IANA_SVC_NAME validation: * must be no more than 15 characters long * may contain only [-a-z0-9] * must contain at least one letter [a-z] * it must not start or end with a hyphen, nor contain adjacent hyphens Default is empty string.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public V1alpha1EndpointPort port(Integer port) {
    
    this.port = port;
    return this;
  }

   /**
   * The port number of the endpoint. If this is not specified, ports are not restricted and must be interpreted in the context of the specific consumer.
   * @return port
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The port number of the endpoint. If this is not specified, ports are not restricted and must be interpreted in the context of the specific consumer.")

  public Integer getPort() {
    return port;
  }


  public void setPort(Integer port) {
    this.port = port;
  }


  public V1alpha1EndpointPort protocol(String protocol) {
    
    this.protocol = protocol;
    return this;
  }

   /**
   * The IP protocol for this port. Must be UDP, TCP, or SCTP. Default is TCP.
   * @return protocol
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The IP protocol for this port. Must be UDP, TCP, or SCTP. Default is TCP.")

  public String getProtocol() {
    return protocol;
  }


  public void setProtocol(String protocol) {
    this.protocol = protocol;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1EndpointPort v1alpha1EndpointPort = (V1alpha1EndpointPort) o;
    return Objects.equals(this.name, v1alpha1EndpointPort.name) &&
        Objects.equals(this.port, v1alpha1EndpointPort.port) &&
        Objects.equals(this.protocol, v1alpha1EndpointPort.protocol);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, port, protocol);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1EndpointPort {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
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

