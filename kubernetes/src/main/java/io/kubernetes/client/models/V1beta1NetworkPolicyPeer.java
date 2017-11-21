/*
 * Kubernetes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.8.4
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.kubernetes.client.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubernetes.client.models.V1LabelSelector;
import io.kubernetes.client.models.V1beta1IPBlock;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * V1beta1NetworkPolicyPeer
 */

public class V1beta1NetworkPolicyPeer {
  @SerializedName("ipBlock")
  private V1beta1IPBlock ipBlock = null;

  @SerializedName("namespaceSelector")
  private V1LabelSelector namespaceSelector = null;

  @SerializedName("podSelector")
  private V1LabelSelector podSelector = null;

  public V1beta1NetworkPolicyPeer ipBlock(V1beta1IPBlock ipBlock) {
    this.ipBlock = ipBlock;
    return this;
  }

   /**
   * IPBlock defines policy on a particular IPBlock
   * @return ipBlock
  **/
  @ApiModelProperty(value = "IPBlock defines policy on a particular IPBlock")
  public V1beta1IPBlock getIpBlock() {
    return ipBlock;
  }

  public void setIpBlock(V1beta1IPBlock ipBlock) {
    this.ipBlock = ipBlock;
  }

  public V1beta1NetworkPolicyPeer namespaceSelector(V1LabelSelector namespaceSelector) {
    this.namespaceSelector = namespaceSelector;
    return this;
  }

   /**
   * Selects Namespaces using cluster scoped-labels.  This matches all pods in all namespaces selected by this label selector. This field follows standard label selector semantics. If present but empty, this selector selects all namespaces.
   * @return namespaceSelector
  **/
  @ApiModelProperty(value = "Selects Namespaces using cluster scoped-labels.  This matches all pods in all namespaces selected by this label selector. This field follows standard label selector semantics. If present but empty, this selector selects all namespaces.")
  public V1LabelSelector getNamespaceSelector() {
    return namespaceSelector;
  }

  public void setNamespaceSelector(V1LabelSelector namespaceSelector) {
    this.namespaceSelector = namespaceSelector;
  }

  public V1beta1NetworkPolicyPeer podSelector(V1LabelSelector podSelector) {
    this.podSelector = podSelector;
    return this;
  }

   /**
   * This is a label selector which selects Pods in this namespace. This field follows standard label selector semantics. If present but empty, this selector selects all pods in this namespace.
   * @return podSelector
  **/
  @ApiModelProperty(value = "This is a label selector which selects Pods in this namespace. This field follows standard label selector semantics. If present but empty, this selector selects all pods in this namespace.")
  public V1LabelSelector getPodSelector() {
    return podSelector;
  }

  public void setPodSelector(V1LabelSelector podSelector) {
    this.podSelector = podSelector;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1NetworkPolicyPeer v1beta1NetworkPolicyPeer = (V1beta1NetworkPolicyPeer) o;
    return Objects.equals(this.ipBlock, v1beta1NetworkPolicyPeer.ipBlock) &&
        Objects.equals(this.namespaceSelector, v1beta1NetworkPolicyPeer.namespaceSelector) &&
        Objects.equals(this.podSelector, v1beta1NetworkPolicyPeer.podSelector);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipBlock, namespaceSelector, podSelector);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1NetworkPolicyPeer {\n");
    
    sb.append("    ipBlock: ").append(toIndentedString(ipBlock)).append("\n");
    sb.append("    namespaceSelector: ").append(toIndentedString(namespaceSelector)).append("\n");
    sb.append("    podSelector: ").append(toIndentedString(podSelector)).append("\n");
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

