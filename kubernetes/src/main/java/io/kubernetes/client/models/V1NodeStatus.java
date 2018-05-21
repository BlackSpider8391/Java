/*
 * Kubernetes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.10.4
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
import io.kubernetes.client.custom.Quantity;
import io.kubernetes.client.models.V1AttachedVolume;
import io.kubernetes.client.models.V1ContainerImage;
import io.kubernetes.client.models.V1NodeAddress;
import io.kubernetes.client.models.V1NodeCondition;
import io.kubernetes.client.models.V1NodeDaemonEndpoints;
import io.kubernetes.client.models.V1NodeSystemInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * NodeStatus is information about the current status of a node.
 */
@ApiModel(description = "NodeStatus is information about the current status of a node.")

public class V1NodeStatus {
  @SerializedName("addresses")
  private List<V1NodeAddress> addresses = null;

  @SerializedName("allocatable")
  private Map<String, Quantity> allocatable = null;

  @SerializedName("capacity")
  private Map<String, Quantity> capacity = null;

  @SerializedName("conditions")
  private List<V1NodeCondition> conditions = null;

  @SerializedName("daemonEndpoints")
  private V1NodeDaemonEndpoints daemonEndpoints = null;

  @SerializedName("images")
  private List<V1ContainerImage> images = null;

  @SerializedName("nodeInfo")
  private V1NodeSystemInfo nodeInfo = null;

  @SerializedName("phase")
  private String phase = null;

  @SerializedName("volumesAttached")
  private List<V1AttachedVolume> volumesAttached = null;

  @SerializedName("volumesInUse")
  private List<String> volumesInUse = null;

  public V1NodeStatus addresses(List<V1NodeAddress> addresses) {
    this.addresses = addresses;
    return this;
  }

  public V1NodeStatus addAddressesItem(V1NodeAddress addressesItem) {
    if (this.addresses == null) {
      this.addresses = new ArrayList<V1NodeAddress>();
    }
    this.addresses.add(addressesItem);
    return this;
  }

   /**
   * List of addresses reachable to the node. Queried from cloud provider, if available. More info: https://kubernetes.io/docs/concepts/nodes/node/#addresses
   * @return addresses
  **/
  @ApiModelProperty(value = "List of addresses reachable to the node. Queried from cloud provider, if available. More info: https://kubernetes.io/docs/concepts/nodes/node/#addresses")
  public List<V1NodeAddress> getAddresses() {
    return addresses;
  }

  public void setAddresses(List<V1NodeAddress> addresses) {
    this.addresses = addresses;
  }

  public V1NodeStatus allocatable(Map<String, Quantity> allocatable) {
    this.allocatable = allocatable;
    return this;
  }

  public V1NodeStatus putAllocatableItem(String key, Quantity allocatableItem) {
    if (this.allocatable == null) {
      this.allocatable = new HashMap<String, Quantity>();
    }
    this.allocatable.put(key, allocatableItem);
    return this;
  }

   /**
   * Allocatable represents the resources of a node that are available for scheduling. Defaults to Capacity.
   * @return allocatable
  **/
  @ApiModelProperty(value = "Allocatable represents the resources of a node that are available for scheduling. Defaults to Capacity.")
  public Map<String, Quantity> getAllocatable() {
    return allocatable;
  }

  public void setAllocatable(Map<String, Quantity> allocatable) {
    this.allocatable = allocatable;
  }

  public V1NodeStatus capacity(Map<String, Quantity> capacity) {
    this.capacity = capacity;
    return this;
  }

  public V1NodeStatus putCapacityItem(String key, Quantity capacityItem) {
    if (this.capacity == null) {
      this.capacity = new HashMap<String, Quantity>();
    }
    this.capacity.put(key, capacityItem);
    return this;
  }

   /**
   * Capacity represents the total resources of a node. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#capacity
   * @return capacity
  **/
  @ApiModelProperty(value = "Capacity represents the total resources of a node. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#capacity")
  public Map<String, Quantity> getCapacity() {
    return capacity;
  }

  public void setCapacity(Map<String, Quantity> capacity) {
    this.capacity = capacity;
  }

  public V1NodeStatus conditions(List<V1NodeCondition> conditions) {
    this.conditions = conditions;
    return this;
  }

  public V1NodeStatus addConditionsItem(V1NodeCondition conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<V1NodeCondition>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

   /**
   * Conditions is an array of current observed node conditions. More info: https://kubernetes.io/docs/concepts/nodes/node/#condition
   * @return conditions
  **/
  @ApiModelProperty(value = "Conditions is an array of current observed node conditions. More info: https://kubernetes.io/docs/concepts/nodes/node/#condition")
  public List<V1NodeCondition> getConditions() {
    return conditions;
  }

  public void setConditions(List<V1NodeCondition> conditions) {
    this.conditions = conditions;
  }

  public V1NodeStatus daemonEndpoints(V1NodeDaemonEndpoints daemonEndpoints) {
    this.daemonEndpoints = daemonEndpoints;
    return this;
  }

   /**
   * Endpoints of daemons running on the Node.
   * @return daemonEndpoints
  **/
  @ApiModelProperty(value = "Endpoints of daemons running on the Node.")
  public V1NodeDaemonEndpoints getDaemonEndpoints() {
    return daemonEndpoints;
  }

  public void setDaemonEndpoints(V1NodeDaemonEndpoints daemonEndpoints) {
    this.daemonEndpoints = daemonEndpoints;
  }

  public V1NodeStatus images(List<V1ContainerImage> images) {
    this.images = images;
    return this;
  }

  public V1NodeStatus addImagesItem(V1ContainerImage imagesItem) {
    if (this.images == null) {
      this.images = new ArrayList<V1ContainerImage>();
    }
    this.images.add(imagesItem);
    return this;
  }

   /**
   * List of container images on this node
   * @return images
  **/
  @ApiModelProperty(value = "List of container images on this node")
  public List<V1ContainerImage> getImages() {
    return images;
  }

  public void setImages(List<V1ContainerImage> images) {
    this.images = images;
  }

  public V1NodeStatus nodeInfo(V1NodeSystemInfo nodeInfo) {
    this.nodeInfo = nodeInfo;
    return this;
  }

   /**
   * Set of ids/uuids to uniquely identify the node. More info: https://kubernetes.io/docs/concepts/nodes/node/#info
   * @return nodeInfo
  **/
  @ApiModelProperty(value = "Set of ids/uuids to uniquely identify the node. More info: https://kubernetes.io/docs/concepts/nodes/node/#info")
  public V1NodeSystemInfo getNodeInfo() {
    return nodeInfo;
  }

  public void setNodeInfo(V1NodeSystemInfo nodeInfo) {
    this.nodeInfo = nodeInfo;
  }

  public V1NodeStatus phase(String phase) {
    this.phase = phase;
    return this;
  }

   /**
   * NodePhase is the recently observed lifecycle phase of the node. More info: https://kubernetes.io/docs/concepts/nodes/node/#phase The field is never populated, and now is deprecated.
   * @return phase
  **/
  @ApiModelProperty(value = "NodePhase is the recently observed lifecycle phase of the node. More info: https://kubernetes.io/docs/concepts/nodes/node/#phase The field is never populated, and now is deprecated.")
  public String getPhase() {
    return phase;
  }

  public void setPhase(String phase) {
    this.phase = phase;
  }

  public V1NodeStatus volumesAttached(List<V1AttachedVolume> volumesAttached) {
    this.volumesAttached = volumesAttached;
    return this;
  }

  public V1NodeStatus addVolumesAttachedItem(V1AttachedVolume volumesAttachedItem) {
    if (this.volumesAttached == null) {
      this.volumesAttached = new ArrayList<V1AttachedVolume>();
    }
    this.volumesAttached.add(volumesAttachedItem);
    return this;
  }

   /**
   * List of volumes that are attached to the node.
   * @return volumesAttached
  **/
  @ApiModelProperty(value = "List of volumes that are attached to the node.")
  public List<V1AttachedVolume> getVolumesAttached() {
    return volumesAttached;
  }

  public void setVolumesAttached(List<V1AttachedVolume> volumesAttached) {
    this.volumesAttached = volumesAttached;
  }

  public V1NodeStatus volumesInUse(List<String> volumesInUse) {
    this.volumesInUse = volumesInUse;
    return this;
  }

  public V1NodeStatus addVolumesInUseItem(String volumesInUseItem) {
    if (this.volumesInUse == null) {
      this.volumesInUse = new ArrayList<String>();
    }
    this.volumesInUse.add(volumesInUseItem);
    return this;
  }

   /**
   * List of attachable volumes in use (mounted) by the node.
   * @return volumesInUse
  **/
  @ApiModelProperty(value = "List of attachable volumes in use (mounted) by the node.")
  public List<String> getVolumesInUse() {
    return volumesInUse;
  }

  public void setVolumesInUse(List<String> volumesInUse) {
    this.volumesInUse = volumesInUse;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1NodeStatus v1NodeStatus = (V1NodeStatus) o;
    return Objects.equals(this.addresses, v1NodeStatus.addresses) &&
        Objects.equals(this.allocatable, v1NodeStatus.allocatable) &&
        Objects.equals(this.capacity, v1NodeStatus.capacity) &&
        Objects.equals(this.conditions, v1NodeStatus.conditions) &&
        Objects.equals(this.daemonEndpoints, v1NodeStatus.daemonEndpoints) &&
        Objects.equals(this.images, v1NodeStatus.images) &&
        Objects.equals(this.nodeInfo, v1NodeStatus.nodeInfo) &&
        Objects.equals(this.phase, v1NodeStatus.phase) &&
        Objects.equals(this.volumesAttached, v1NodeStatus.volumesAttached) &&
        Objects.equals(this.volumesInUse, v1NodeStatus.volumesInUse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addresses, allocatable, capacity, conditions, daemonEndpoints, images, nodeInfo, phase, volumesAttached, volumesInUse);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1NodeStatus {\n");
    
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    allocatable: ").append(toIndentedString(allocatable)).append("\n");
    sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    daemonEndpoints: ").append(toIndentedString(daemonEndpoints)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    nodeInfo: ").append(toIndentedString(nodeInfo)).append("\n");
    sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
    sb.append("    volumesAttached: ").append(toIndentedString(volumesAttached)).append("\n");
    sb.append("    volumesInUse: ").append(toIndentedString(volumesInUse)).append("\n");
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

