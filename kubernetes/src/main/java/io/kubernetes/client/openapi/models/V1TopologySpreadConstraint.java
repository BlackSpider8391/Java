/*
Copyright 2022 The Kubernetes Authors.
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

/** TopologySpreadConstraint specifies how to spread matching pods among the given topology. */
@ApiModel(
    description =
        "TopologySpreadConstraint specifies how to spread matching pods among the given topology.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-05-06T16:45:00.555Z[Etc/UTC]")
public class V1TopologySpreadConstraint {
  public static final String SERIALIZED_NAME_LABEL_SELECTOR = "labelSelector";

  @SerializedName(SERIALIZED_NAME_LABEL_SELECTOR)
  private V1LabelSelector labelSelector;

  public static final String SERIALIZED_NAME_MAX_SKEW = "maxSkew";

  @SerializedName(SERIALIZED_NAME_MAX_SKEW)
  private Integer maxSkew;

  public static final String SERIALIZED_NAME_MIN_DOMAINS = "minDomains";

  @SerializedName(SERIALIZED_NAME_MIN_DOMAINS)
  private Integer minDomains;

  public static final String SERIALIZED_NAME_TOPOLOGY_KEY = "topologyKey";

  @SerializedName(SERIALIZED_NAME_TOPOLOGY_KEY)
  private String topologyKey;

  public static final String SERIALIZED_NAME_WHEN_UNSATISFIABLE = "whenUnsatisfiable";

  @SerializedName(SERIALIZED_NAME_WHEN_UNSATISFIABLE)
  private String whenUnsatisfiable;

  public V1TopologySpreadConstraint labelSelector(V1LabelSelector labelSelector) {

    this.labelSelector = labelSelector;
    return this;
  }

  /**
   * Get labelSelector
   *
   * @return labelSelector
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1LabelSelector getLabelSelector() {
    return labelSelector;
  }

  public void setLabelSelector(V1LabelSelector labelSelector) {
    this.labelSelector = labelSelector;
  }

  public V1TopologySpreadConstraint maxSkew(Integer maxSkew) {

    this.maxSkew = maxSkew;
    return this;
  }

  /**
   * MaxSkew describes the degree to which pods may be unevenly distributed. When
   * &#x60;whenUnsatisfiable&#x3D;DoNotSchedule&#x60;, it is the maximum permitted difference
   * between the number of matching pods in the target topology and the global minimum. The global
   * minimum is the minimum number of matching pods in an eligible domain or zero if the number of
   * eligible domains is less than MinDomains. For example, in a 3-zone cluster, MaxSkew is set to
   * 1, and pods with the same labelSelector spread as 2/2/1: In this case, the global minimum is 1.
   * | zone1 | zone2 | zone3 | | P P | P P | P | - if MaxSkew is 1, incoming pod can only be
   * scheduled to zone3 to become 2/2/2; scheduling it onto zone1(zone2) would make the
   * ActualSkew(3-1) on zone1(zone2) violate MaxSkew(1). - if MaxSkew is 2, incoming pod can be
   * scheduled onto any zone. When &#x60;whenUnsatisfiable&#x3D;ScheduleAnyway&#x60;, it is used to
   * give higher precedence to topologies that satisfy it. It&#39;s a required field. Default value
   * is 1 and 0 is not allowed.
   *
   * @return maxSkew
   */
  @ApiModelProperty(
      required = true,
      value =
          "MaxSkew describes the degree to which pods may be unevenly distributed. When `whenUnsatisfiable=DoNotSchedule`, it is the maximum permitted difference between the number of matching pods in the target topology and the global minimum. The global minimum is the minimum number of matching pods in an eligible domain or zero if the number of eligible domains is less than MinDomains. For example, in a 3-zone cluster, MaxSkew is set to 1, and pods with the same labelSelector spread as 2/2/1: In this case, the global minimum is 1. | zone1 | zone2 | zone3 | |  P P  |  P P  |   P   | - if MaxSkew is 1, incoming pod can only be scheduled to zone3 to become 2/2/2; scheduling it onto zone1(zone2) would make the ActualSkew(3-1) on zone1(zone2) violate MaxSkew(1). - if MaxSkew is 2, incoming pod can be scheduled onto any zone. When `whenUnsatisfiable=ScheduleAnyway`, it is used to give higher precedence to topologies that satisfy it. It's a required field. Default value is 1 and 0 is not allowed.")
  public Integer getMaxSkew() {
    return maxSkew;
  }

  public void setMaxSkew(Integer maxSkew) {
    this.maxSkew = maxSkew;
  }

  public V1TopologySpreadConstraint minDomains(Integer minDomains) {

    this.minDomains = minDomains;
    return this;
  }

  /**
   * MinDomains indicates a minimum number of eligible domains. When the number of eligible domains
   * with matching topology keys is less than minDomains, Pod Topology Spread treats \&quot;global
   * minimum\&quot; as 0, and then the calculation of Skew is performed. And when the number of
   * eligible domains with matching topology keys equals or greater than minDomains, this value has
   * no effect on scheduling. As a result, when the number of eligible domains is less than
   * minDomains, scheduler won&#39;t schedule more than maxSkew Pods to those domains. If value is
   * nil, the constraint behaves as if MinDomains is equal to 1. Valid values are integers greater
   * than 0. When value is not nil, WhenUnsatisfiable must be DoNotSchedule. For example, in a
   * 3-zone cluster, MaxSkew is set to 2, MinDomains is set to 5 and pods with the same
   * labelSelector spread as 2/2/2: | zone1 | zone2 | zone3 | | P P | P P | P P | The number of
   * domains is less than 5(MinDomains), so \&quot;global minimum\&quot; is treated as 0. In this
   * situation, new pod with the same labelSelector cannot be scheduled, because computed skew will
   * be 3(3 - 0) if new Pod is scheduled to any of the three zones, it will violate MaxSkew. This is
   * an alpha field and requires enabling MinDomainsInPodTopologySpread feature gate.
   *
   * @return minDomains
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "MinDomains indicates a minimum number of eligible domains. When the number of eligible domains with matching topology keys is less than minDomains, Pod Topology Spread treats \"global minimum\" as 0, and then the calculation of Skew is performed. And when the number of eligible domains with matching topology keys equals or greater than minDomains, this value has no effect on scheduling. As a result, when the number of eligible domains is less than minDomains, scheduler won't schedule more than maxSkew Pods to those domains. If value is nil, the constraint behaves as if MinDomains is equal to 1. Valid values are integers greater than 0. When value is not nil, WhenUnsatisfiable must be DoNotSchedule.  For example, in a 3-zone cluster, MaxSkew is set to 2, MinDomains is set to 5 and pods with the same labelSelector spread as 2/2/2: | zone1 | zone2 | zone3 | |  P P  |  P P  |  P P  | The number of domains is less than 5(MinDomains), so \"global minimum\" is treated as 0. In this situation, new pod with the same labelSelector cannot be scheduled, because computed skew will be 3(3 - 0) if new Pod is scheduled to any of the three zones, it will violate MaxSkew.  This is an alpha field and requires enabling MinDomainsInPodTopologySpread feature gate.")
  public Integer getMinDomains() {
    return minDomains;
  }

  public void setMinDomains(Integer minDomains) {
    this.minDomains = minDomains;
  }

  public V1TopologySpreadConstraint topologyKey(String topologyKey) {

    this.topologyKey = topologyKey;
    return this;
  }

  /**
   * TopologyKey is the key of node labels. Nodes that have a label with this key and identical
   * values are considered to be in the same topology. We consider each &lt;key, value&gt; as a
   * \&quot;bucket\&quot;, and try to put balanced number of pods into each bucket. We define a
   * domain as a particular instance of a topology. Also, we define an eligible domain as a domain
   * whose nodes match the node selector. e.g. If TopologyKey is
   * \&quot;kubernetes.io/hostname\&quot;, each Node is a domain of that topology. And, if
   * TopologyKey is \&quot;topology.kubernetes.io/zone\&quot;, each zone is a domain of that
   * topology. It&#39;s a required field.
   *
   * @return topologyKey
   */
  @ApiModelProperty(
      required = true,
      value =
          "TopologyKey is the key of node labels. Nodes that have a label with this key and identical values are considered to be in the same topology. We consider each <key, value> as a \"bucket\", and try to put balanced number of pods into each bucket. We define a domain as a particular instance of a topology. Also, we define an eligible domain as a domain whose nodes match the node selector. e.g. If TopologyKey is \"kubernetes.io/hostname\", each Node is a domain of that topology. And, if TopologyKey is \"topology.kubernetes.io/zone\", each zone is a domain of that topology. It's a required field.")
  public String getTopologyKey() {
    return topologyKey;
  }

  public void setTopologyKey(String topologyKey) {
    this.topologyKey = topologyKey;
  }

  public V1TopologySpreadConstraint whenUnsatisfiable(String whenUnsatisfiable) {

    this.whenUnsatisfiable = whenUnsatisfiable;
    return this;
  }

  /**
   * WhenUnsatisfiable indicates how to deal with a pod if it doesn&#39;t satisfy the spread
   * constraint. - DoNotSchedule (default) tells the scheduler not to schedule it. - ScheduleAnyway
   * tells the scheduler to schedule the pod in any location, but giving higher precedence to
   * topologies that would help reduce the skew. A constraint is considered
   * \&quot;Unsatisfiable\&quot; for an incoming pod if and only if every possible node assignment
   * for that pod would violate \&quot;MaxSkew\&quot; on some topology. For example, in a 3-zone
   * cluster, MaxSkew is set to 1, and pods with the same labelSelector spread as 3/1/1: | zone1 |
   * zone2 | zone3 | | P P P | P | P | If WhenUnsatisfiable is set to DoNotSchedule, incoming pod
   * can only be scheduled to zone2(zone3) to become 3/2/1(3/1/2) as ActualSkew(2-1) on zone2(zone3)
   * satisfies MaxSkew(1). In other words, the cluster can still be imbalanced, but scheduler
   * won&#39;t make it *more* imbalanced. It&#39;s a required field.
   *
   * @return whenUnsatisfiable
   */
  @ApiModelProperty(
      required = true,
      value =
          "WhenUnsatisfiable indicates how to deal with a pod if it doesn't satisfy the spread constraint. - DoNotSchedule (default) tells the scheduler not to schedule it. - ScheduleAnyway tells the scheduler to schedule the pod in any location,   but giving higher precedence to topologies that would help reduce the   skew. A constraint is considered \"Unsatisfiable\" for an incoming pod if and only if every possible node assignment for that pod would violate \"MaxSkew\" on some topology. For example, in a 3-zone cluster, MaxSkew is set to 1, and pods with the same labelSelector spread as 3/1/1: | zone1 | zone2 | zone3 | | P P P |   P   |   P   | If WhenUnsatisfiable is set to DoNotSchedule, incoming pod can only be scheduled to zone2(zone3) to become 3/2/1(3/1/2) as ActualSkew(2-1) on zone2(zone3) satisfies MaxSkew(1). In other words, the cluster can still be imbalanced, but scheduler won't make it *more* imbalanced. It's a required field.  ")
  public String getWhenUnsatisfiable() {
    return whenUnsatisfiable;
  }

  public void setWhenUnsatisfiable(String whenUnsatisfiable) {
    this.whenUnsatisfiable = whenUnsatisfiable;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1TopologySpreadConstraint v1TopologySpreadConstraint = (V1TopologySpreadConstraint) o;
    return Objects.equals(this.labelSelector, v1TopologySpreadConstraint.labelSelector)
        && Objects.equals(this.maxSkew, v1TopologySpreadConstraint.maxSkew)
        && Objects.equals(this.minDomains, v1TopologySpreadConstraint.minDomains)
        && Objects.equals(this.topologyKey, v1TopologySpreadConstraint.topologyKey)
        && Objects.equals(this.whenUnsatisfiable, v1TopologySpreadConstraint.whenUnsatisfiable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(labelSelector, maxSkew, minDomains, topologyKey, whenUnsatisfiable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1TopologySpreadConstraint {\n");
    sb.append("    labelSelector: ").append(toIndentedString(labelSelector)).append("\n");
    sb.append("    maxSkew: ").append(toIndentedString(maxSkew)).append("\n");
    sb.append("    minDomains: ").append(toIndentedString(minDomains)).append("\n");
    sb.append("    topologyKey: ").append(toIndentedString(topologyKey)).append("\n");
    sb.append("    whenUnsatisfiable: ").append(toIndentedString(whenUnsatisfiable)).append("\n");
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
