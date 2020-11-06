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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** ServiceSpec describes the attributes that a user creates on a service. */
@ApiModel(description = "ServiceSpec describes the attributes that a user creates on a service.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-11-06T08:58:17.566Z[Etc/UTC]")
public class V1ServiceSpec {
  public static final String SERIALIZED_NAME_CLUSTER_I_P = "clusterIP";

  @SerializedName(SERIALIZED_NAME_CLUSTER_I_P)
  private String clusterIP;

  public static final String SERIALIZED_NAME_EXTERNAL_I_PS = "externalIPs";

  @SerializedName(SERIALIZED_NAME_EXTERNAL_I_PS)
  private List<String> externalIPs = null;

  public static final String SERIALIZED_NAME_EXTERNAL_NAME = "externalName";

  @SerializedName(SERIALIZED_NAME_EXTERNAL_NAME)
  private String externalName;

  public static final String SERIALIZED_NAME_EXTERNAL_TRAFFIC_POLICY = "externalTrafficPolicy";

  @SerializedName(SERIALIZED_NAME_EXTERNAL_TRAFFIC_POLICY)
  private String externalTrafficPolicy;

  public static final String SERIALIZED_NAME_HEALTH_CHECK_NODE_PORT = "healthCheckNodePort";

  @SerializedName(SERIALIZED_NAME_HEALTH_CHECK_NODE_PORT)
  private Integer healthCheckNodePort;

  public static final String SERIALIZED_NAME_IP_FAMILY = "ipFamily";

  @SerializedName(SERIALIZED_NAME_IP_FAMILY)
  private String ipFamily;

  public static final String SERIALIZED_NAME_LOAD_BALANCER_I_P = "loadBalancerIP";

  @SerializedName(SERIALIZED_NAME_LOAD_BALANCER_I_P)
  private String loadBalancerIP;

  public static final String SERIALIZED_NAME_LOAD_BALANCER_SOURCE_RANGES =
      "loadBalancerSourceRanges";

  @SerializedName(SERIALIZED_NAME_LOAD_BALANCER_SOURCE_RANGES)
  private List<String> loadBalancerSourceRanges = null;

  public static final String SERIALIZED_NAME_PORTS = "ports";

  @SerializedName(SERIALIZED_NAME_PORTS)
  private List<V1ServicePort> ports = null;

  public static final String SERIALIZED_NAME_PUBLISH_NOT_READY_ADDRESSES =
      "publishNotReadyAddresses";

  @SerializedName(SERIALIZED_NAME_PUBLISH_NOT_READY_ADDRESSES)
  private Boolean publishNotReadyAddresses;

  public static final String SERIALIZED_NAME_SELECTOR = "selector";

  @SerializedName(SERIALIZED_NAME_SELECTOR)
  private Map<String, String> selector = null;

  public static final String SERIALIZED_NAME_SESSION_AFFINITY = "sessionAffinity";

  @SerializedName(SERIALIZED_NAME_SESSION_AFFINITY)
  private String sessionAffinity;

  public static final String SERIALIZED_NAME_SESSION_AFFINITY_CONFIG = "sessionAffinityConfig";

  @SerializedName(SERIALIZED_NAME_SESSION_AFFINITY_CONFIG)
  private V1SessionAffinityConfig sessionAffinityConfig;

  public static final String SERIALIZED_NAME_TOPOLOGY_KEYS = "topologyKeys";

  @SerializedName(SERIALIZED_NAME_TOPOLOGY_KEYS)
  private List<String> topologyKeys = null;

  public static final String SERIALIZED_NAME_TYPE = "type";

  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public V1ServiceSpec clusterIP(String clusterIP) {

    this.clusterIP = clusterIP;
    return this;
  }

  /**
   * clusterIP is the IP address of the service and is usually assigned randomly by the master. If
   * an address is specified manually and is not in use by others, it will be allocated to the
   * service; otherwise, creation of the service will fail. This field can not be changed through
   * updates. Valid values are \&quot;None\&quot;, empty string (\&quot;\&quot;), or a valid IP
   * address. \&quot;None\&quot; can be specified for headless services when proxying is not
   * required. Only applies to types ClusterIP, NodePort, and LoadBalancer. Ignored if type is
   * ExternalName. More info:
   * https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies
   *
   * @return clusterIP
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "clusterIP is the IP address of the service and is usually assigned randomly by the master. If an address is specified manually and is not in use by others, it will be allocated to the service; otherwise, creation of the service will fail. This field can not be changed through updates. Valid values are \"None\", empty string (\"\"), or a valid IP address. \"None\" can be specified for headless services when proxying is not required. Only applies to types ClusterIP, NodePort, and LoadBalancer. Ignored if type is ExternalName. More info: https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies")
  public String getClusterIP() {
    return clusterIP;
  }

  public void setClusterIP(String clusterIP) {
    this.clusterIP = clusterIP;
  }

  public V1ServiceSpec externalIPs(List<String> externalIPs) {

    this.externalIPs = externalIPs;
    return this;
  }

  public V1ServiceSpec addExternalIPsItem(String externalIPsItem) {
    if (this.externalIPs == null) {
      this.externalIPs = new ArrayList<String>();
    }
    this.externalIPs.add(externalIPsItem);
    return this;
  }

  /**
   * externalIPs is a list of IP addresses for which nodes in the cluster will also accept traffic
   * for this service. These IPs are not managed by Kubernetes. The user is responsible for ensuring
   * that traffic arrives at a node with this IP. A common example is external load-balancers that
   * are not part of the Kubernetes system.
   *
   * @return externalIPs
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "externalIPs is a list of IP addresses for which nodes in the cluster will also accept traffic for this service.  These IPs are not managed by Kubernetes.  The user is responsible for ensuring that traffic arrives at a node with this IP.  A common example is external load-balancers that are not part of the Kubernetes system.")
  public List<String> getExternalIPs() {
    return externalIPs;
  }

  public void setExternalIPs(List<String> externalIPs) {
    this.externalIPs = externalIPs;
  }

  public V1ServiceSpec externalName(String externalName) {

    this.externalName = externalName;
    return this;
  }

  /**
   * externalName is the external reference that kubedns or equivalent will return as a CNAME record
   * for this service. No proxying will be involved. Must be a valid RFC-1123 hostname
   * (https://tools.ietf.org/html/rfc1123) and requires Type to be ExternalName.
   *
   * @return externalName
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "externalName is the external reference that kubedns or equivalent will return as a CNAME record for this service. No proxying will be involved. Must be a valid RFC-1123 hostname (https://tools.ietf.org/html/rfc1123) and requires Type to be ExternalName.")
  public String getExternalName() {
    return externalName;
  }

  public void setExternalName(String externalName) {
    this.externalName = externalName;
  }

  public V1ServiceSpec externalTrafficPolicy(String externalTrafficPolicy) {

    this.externalTrafficPolicy = externalTrafficPolicy;
    return this;
  }

  /**
   * externalTrafficPolicy denotes if this Service desires to route external traffic to node-local
   * or cluster-wide endpoints. \&quot;Local\&quot; preserves the client source IP and avoids a
   * second hop for LoadBalancer and Nodeport type services, but risks potentially imbalanced
   * traffic spreading. \&quot;Cluster\&quot; obscures the client source IP and may cause a second
   * hop to another node, but should have good overall load-spreading.
   *
   * @return externalTrafficPolicy
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "externalTrafficPolicy denotes if this Service desires to route external traffic to node-local or cluster-wide endpoints. \"Local\" preserves the client source IP and avoids a second hop for LoadBalancer and Nodeport type services, but risks potentially imbalanced traffic spreading. \"Cluster\" obscures the client source IP and may cause a second hop to another node, but should have good overall load-spreading.")
  public String getExternalTrafficPolicy() {
    return externalTrafficPolicy;
  }

  public void setExternalTrafficPolicy(String externalTrafficPolicy) {
    this.externalTrafficPolicy = externalTrafficPolicy;
  }

  public V1ServiceSpec healthCheckNodePort(Integer healthCheckNodePort) {

    this.healthCheckNodePort = healthCheckNodePort;
    return this;
  }

  /**
   * healthCheckNodePort specifies the healthcheck nodePort for the service. If not specified,
   * HealthCheckNodePort is created by the service api backend with the allocated nodePort. Will use
   * user-specified nodePort value if specified by the client. Only effects when Type is set to
   * LoadBalancer and ExternalTrafficPolicy is set to Local.
   *
   * @return healthCheckNodePort
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "healthCheckNodePort specifies the healthcheck nodePort for the service. If not specified, HealthCheckNodePort is created by the service api backend with the allocated nodePort. Will use user-specified nodePort value if specified by the client. Only effects when Type is set to LoadBalancer and ExternalTrafficPolicy is set to Local.")
  public Integer getHealthCheckNodePort() {
    return healthCheckNodePort;
  }

  public void setHealthCheckNodePort(Integer healthCheckNodePort) {
    this.healthCheckNodePort = healthCheckNodePort;
  }

  public V1ServiceSpec ipFamily(String ipFamily) {

    this.ipFamily = ipFamily;
    return this;
  }

  /**
   * ipFamily specifies whether this Service has a preference for a particular IP family (e.g. IPv4
   * vs. IPv6) when the IPv6DualStack feature gate is enabled. In a dual-stack cluster, you can
   * specify ipFamily when creating a ClusterIP Service to determine whether the controller will
   * allocate an IPv4 or IPv6 IP for it, and you can specify ipFamily when creating a headless
   * Service to determine whether it will have IPv4 or IPv6 Endpoints. In either case, if you do not
   * specify an ipFamily explicitly, it will default to the cluster&#39;s primary IP family. This
   * field is part of an alpha feature, and you should not make any assumptions about its semantics
   * other than those described above. In particular, you should not assume that it can (or cannot)
   * be changed after creation time; that it can only have the values \&quot;IPv4\&quot; and
   * \&quot;IPv6\&quot;; or that its current value on a given Service correctly reflects the current
   * state of that Service. (For ClusterIP Services, look at clusterIP to see if the Service is IPv4
   * or IPv6. For headless Services, look at the endpoints, which may be dual-stack in the future.
   * For ExternalName Services, ipFamily has no meaning, but it may be set to an irrelevant value
   * anyway.)
   *
   * @return ipFamily
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "ipFamily specifies whether this Service has a preference for a particular IP family (e.g. IPv4 vs. IPv6) when the IPv6DualStack feature gate is enabled. In a dual-stack cluster, you can specify ipFamily when creating a ClusterIP Service to determine whether the controller will allocate an IPv4 or IPv6 IP for it, and you can specify ipFamily when creating a headless Service to determine whether it will have IPv4 or IPv6 Endpoints. In either case, if you do not specify an ipFamily explicitly, it will default to the cluster's primary IP family. This field is part of an alpha feature, and you should not make any assumptions about its semantics other than those described above. In particular, you should not assume that it can (or cannot) be changed after creation time; that it can only have the values \"IPv4\" and \"IPv6\"; or that its current value on a given Service correctly reflects the current state of that Service. (For ClusterIP Services, look at clusterIP to see if the Service is IPv4 or IPv6. For headless Services, look at the endpoints, which may be dual-stack in the future. For ExternalName Services, ipFamily has no meaning, but it may be set to an irrelevant value anyway.)")
  public String getIpFamily() {
    return ipFamily;
  }

  public void setIpFamily(String ipFamily) {
    this.ipFamily = ipFamily;
  }

  public V1ServiceSpec loadBalancerIP(String loadBalancerIP) {

    this.loadBalancerIP = loadBalancerIP;
    return this;
  }

  /**
   * Only applies to Service Type: LoadBalancer LoadBalancer will get created with the IP specified
   * in this field. This feature depends on whether the underlying cloud-provider supports
   * specifying the loadBalancerIP when a load balancer is created. This field will be ignored if
   * the cloud-provider does not support the feature.
   *
   * @return loadBalancerIP
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Only applies to Service Type: LoadBalancer LoadBalancer will get created with the IP specified in this field. This feature depends on whether the underlying cloud-provider supports specifying the loadBalancerIP when a load balancer is created. This field will be ignored if the cloud-provider does not support the feature.")
  public String getLoadBalancerIP() {
    return loadBalancerIP;
  }

  public void setLoadBalancerIP(String loadBalancerIP) {
    this.loadBalancerIP = loadBalancerIP;
  }

  public V1ServiceSpec loadBalancerSourceRanges(List<String> loadBalancerSourceRanges) {

    this.loadBalancerSourceRanges = loadBalancerSourceRanges;
    return this;
  }

  public V1ServiceSpec addLoadBalancerSourceRangesItem(String loadBalancerSourceRangesItem) {
    if (this.loadBalancerSourceRanges == null) {
      this.loadBalancerSourceRanges = new ArrayList<String>();
    }
    this.loadBalancerSourceRanges.add(loadBalancerSourceRangesItem);
    return this;
  }

  /**
   * If specified and supported by the platform, this will restrict traffic through the
   * cloud-provider load-balancer will be restricted to the specified client IPs. This field will be
   * ignored if the cloud-provider does not support the feature.\&quot; More info:
   * https://kubernetes.io/docs/tasks/access-application-cluster/configure-cloud-provider-firewall/
   *
   * @return loadBalancerSourceRanges
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "If specified and supported by the platform, this will restrict traffic through the cloud-provider load-balancer will be restricted to the specified client IPs. This field will be ignored if the cloud-provider does not support the feature.\" More info: https://kubernetes.io/docs/tasks/access-application-cluster/configure-cloud-provider-firewall/")
  public List<String> getLoadBalancerSourceRanges() {
    return loadBalancerSourceRanges;
  }

  public void setLoadBalancerSourceRanges(List<String> loadBalancerSourceRanges) {
    this.loadBalancerSourceRanges = loadBalancerSourceRanges;
  }

  public V1ServiceSpec ports(List<V1ServicePort> ports) {

    this.ports = ports;
    return this;
  }

  public V1ServiceSpec addPortsItem(V1ServicePort portsItem) {
    if (this.ports == null) {
      this.ports = new ArrayList<V1ServicePort>();
    }
    this.ports.add(portsItem);
    return this;
  }

  /**
   * The list of ports that are exposed by this service. More info:
   * https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies
   *
   * @return ports
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "The list of ports that are exposed by this service. More info: https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies")
  public List<V1ServicePort> getPorts() {
    return ports;
  }

  public void setPorts(List<V1ServicePort> ports) {
    this.ports = ports;
  }

  public V1ServiceSpec publishNotReadyAddresses(Boolean publishNotReadyAddresses) {

    this.publishNotReadyAddresses = publishNotReadyAddresses;
    return this;
  }

  /**
   * publishNotReadyAddresses indicates that any agent which deals with endpoints for this Service
   * should disregard any indications of ready/not-ready. The primary use case for setting this
   * field is for a StatefulSet&#39;s Headless Service to propagate SRV DNS records for its Pods for
   * the purpose of peer discovery. The Kubernetes controllers that generate Endpoints and
   * EndpointSlice resources for Services interpret this to mean that all endpoints are considered
   * \&quot;ready\&quot; even if the Pods themselves are not. Agents which consume only Kubernetes
   * generated endpoints through the Endpoints or EndpointSlice resources can safely assume this
   * behavior.
   *
   * @return publishNotReadyAddresses
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "publishNotReadyAddresses indicates that any agent which deals with endpoints for this Service should disregard any indications of ready/not-ready. The primary use case for setting this field is for a StatefulSet's Headless Service to propagate SRV DNS records for its Pods for the purpose of peer discovery. The Kubernetes controllers that generate Endpoints and EndpointSlice resources for Services interpret this to mean that all endpoints are considered \"ready\" even if the Pods themselves are not. Agents which consume only Kubernetes generated endpoints through the Endpoints or EndpointSlice resources can safely assume this behavior.")
  public Boolean getPublishNotReadyAddresses() {
    return publishNotReadyAddresses;
  }

  public void setPublishNotReadyAddresses(Boolean publishNotReadyAddresses) {
    this.publishNotReadyAddresses = publishNotReadyAddresses;
  }

  public V1ServiceSpec selector(Map<String, String> selector) {

    this.selector = selector;
    return this;
  }

  public V1ServiceSpec putSelectorItem(String key, String selectorItem) {
    if (this.selector == null) {
      this.selector = new HashMap<String, String>();
    }
    this.selector.put(key, selectorItem);
    return this;
  }

  /**
   * Route service traffic to pods with label keys and values matching this selector. If empty or
   * not present, the service is assumed to have an external process managing its endpoints, which
   * Kubernetes will not modify. Only applies to types ClusterIP, NodePort, and LoadBalancer.
   * Ignored if type is ExternalName. More info:
   * https://kubernetes.io/docs/concepts/services-networking/service/
   *
   * @return selector
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Route service traffic to pods with label keys and values matching this selector. If empty or not present, the service is assumed to have an external process managing its endpoints, which Kubernetes will not modify. Only applies to types ClusterIP, NodePort, and LoadBalancer. Ignored if type is ExternalName. More info: https://kubernetes.io/docs/concepts/services-networking/service/")
  public Map<String, String> getSelector() {
    return selector;
  }

  public void setSelector(Map<String, String> selector) {
    this.selector = selector;
  }

  public V1ServiceSpec sessionAffinity(String sessionAffinity) {

    this.sessionAffinity = sessionAffinity;
    return this;
  }

  /**
   * Supports \&quot;ClientIP\&quot; and \&quot;None\&quot;. Used to maintain session affinity.
   * Enable client IP based session affinity. Must be ClientIP or None. Defaults to None. More info:
   * https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies
   *
   * @return sessionAffinity
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Supports \"ClientIP\" and \"None\". Used to maintain session affinity. Enable client IP based session affinity. Must be ClientIP or None. Defaults to None. More info: https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies")
  public String getSessionAffinity() {
    return sessionAffinity;
  }

  public void setSessionAffinity(String sessionAffinity) {
    this.sessionAffinity = sessionAffinity;
  }

  public V1ServiceSpec sessionAffinityConfig(V1SessionAffinityConfig sessionAffinityConfig) {

    this.sessionAffinityConfig = sessionAffinityConfig;
    return this;
  }

  /**
   * Get sessionAffinityConfig
   *
   * @return sessionAffinityConfig
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1SessionAffinityConfig getSessionAffinityConfig() {
    return sessionAffinityConfig;
  }

  public void setSessionAffinityConfig(V1SessionAffinityConfig sessionAffinityConfig) {
    this.sessionAffinityConfig = sessionAffinityConfig;
  }

  public V1ServiceSpec topologyKeys(List<String> topologyKeys) {

    this.topologyKeys = topologyKeys;
    return this;
  }

  public V1ServiceSpec addTopologyKeysItem(String topologyKeysItem) {
    if (this.topologyKeys == null) {
      this.topologyKeys = new ArrayList<String>();
    }
    this.topologyKeys.add(topologyKeysItem);
    return this;
  }

  /**
   * topologyKeys is a preference-order list of topology keys which implementations of services
   * should use to preferentially sort endpoints when accessing this Service, it can not be used at
   * the same time as externalTrafficPolicy&#x3D;Local. Topology keys must be valid label keys and
   * at most 16 keys may be specified. Endpoints are chosen based on the first topology key with
   * available backends. If this field is specified and all entries have no backends that match the
   * topology of the client, the service has no backends for that client and connections should
   * fail. The special value \&quot;*\&quot; may be used to mean \&quot;any topology\&quot;. This
   * catch-all value, if used, only makes sense as the last value in the list. If this is not
   * specified or empty, no topology constraints will be applied.
   *
   * @return topologyKeys
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "topologyKeys is a preference-order list of topology keys which implementations of services should use to preferentially sort endpoints when accessing this Service, it can not be used at the same time as externalTrafficPolicy=Local. Topology keys must be valid label keys and at most 16 keys may be specified. Endpoints are chosen based on the first topology key with available backends. If this field is specified and all entries have no backends that match the topology of the client, the service has no backends for that client and connections should fail. The special value \"*\" may be used to mean \"any topology\". This catch-all value, if used, only makes sense as the last value in the list. If this is not specified or empty, no topology constraints will be applied.")
  public List<String> getTopologyKeys() {
    return topologyKeys;
  }

  public void setTopologyKeys(List<String> topologyKeys) {
    this.topologyKeys = topologyKeys;
  }

  public V1ServiceSpec type(String type) {

    this.type = type;
    return this;
  }

  /**
   * type determines how the Service is exposed. Defaults to ClusterIP. Valid options are
   * ExternalName, ClusterIP, NodePort, and LoadBalancer. \&quot;ExternalName\&quot; maps to the
   * specified externalName. \&quot;ClusterIP\&quot; allocates a cluster-internal IP address for
   * load-balancing to endpoints. Endpoints are determined by the selector or if that is not
   * specified, by manual construction of an Endpoints object. If clusterIP is \&quot;None\&quot;,
   * no virtual IP is allocated and the endpoints are published as a set of endpoints rather than a
   * stable IP. \&quot;NodePort\&quot; builds on ClusterIP and allocates a port on every node which
   * routes to the clusterIP. \&quot;LoadBalancer\&quot; builds on NodePort and creates an external
   * load-balancer (if supported in the current cloud) which routes to the clusterIP. More info:
   * https://kubernetes.io/docs/concepts/services-networking/service/#publishing-services-service-types
   *
   * @return type
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "type determines how the Service is exposed. Defaults to ClusterIP. Valid options are ExternalName, ClusterIP, NodePort, and LoadBalancer. \"ExternalName\" maps to the specified externalName. \"ClusterIP\" allocates a cluster-internal IP address for load-balancing to endpoints. Endpoints are determined by the selector or if that is not specified, by manual construction of an Endpoints object. If clusterIP is \"None\", no virtual IP is allocated and the endpoints are published as a set of endpoints rather than a stable IP. \"NodePort\" builds on ClusterIP and allocates a port on every node which routes to the clusterIP. \"LoadBalancer\" builds on NodePort and creates an external load-balancer (if supported in the current cloud) which routes to the clusterIP. More info: https://kubernetes.io/docs/concepts/services-networking/service/#publishing-services-service-types")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ServiceSpec v1ServiceSpec = (V1ServiceSpec) o;
    return Objects.equals(this.clusterIP, v1ServiceSpec.clusterIP)
        && Objects.equals(this.externalIPs, v1ServiceSpec.externalIPs)
        && Objects.equals(this.externalName, v1ServiceSpec.externalName)
        && Objects.equals(this.externalTrafficPolicy, v1ServiceSpec.externalTrafficPolicy)
        && Objects.equals(this.healthCheckNodePort, v1ServiceSpec.healthCheckNodePort)
        && Objects.equals(this.ipFamily, v1ServiceSpec.ipFamily)
        && Objects.equals(this.loadBalancerIP, v1ServiceSpec.loadBalancerIP)
        && Objects.equals(this.loadBalancerSourceRanges, v1ServiceSpec.loadBalancerSourceRanges)
        && Objects.equals(this.ports, v1ServiceSpec.ports)
        && Objects.equals(this.publishNotReadyAddresses, v1ServiceSpec.publishNotReadyAddresses)
        && Objects.equals(this.selector, v1ServiceSpec.selector)
        && Objects.equals(this.sessionAffinity, v1ServiceSpec.sessionAffinity)
        && Objects.equals(this.sessionAffinityConfig, v1ServiceSpec.sessionAffinityConfig)
        && Objects.equals(this.topologyKeys, v1ServiceSpec.topologyKeys)
        && Objects.equals(this.type, v1ServiceSpec.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        clusterIP,
        externalIPs,
        externalName,
        externalTrafficPolicy,
        healthCheckNodePort,
        ipFamily,
        loadBalancerIP,
        loadBalancerSourceRanges,
        ports,
        publishNotReadyAddresses,
        selector,
        sessionAffinity,
        sessionAffinityConfig,
        topologyKeys,
        type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ServiceSpec {\n");
    sb.append("    clusterIP: ").append(toIndentedString(clusterIP)).append("\n");
    sb.append("    externalIPs: ").append(toIndentedString(externalIPs)).append("\n");
    sb.append("    externalName: ").append(toIndentedString(externalName)).append("\n");
    sb.append("    externalTrafficPolicy: ")
        .append(toIndentedString(externalTrafficPolicy))
        .append("\n");
    sb.append("    healthCheckNodePort: ")
        .append(toIndentedString(healthCheckNodePort))
        .append("\n");
    sb.append("    ipFamily: ").append(toIndentedString(ipFamily)).append("\n");
    sb.append("    loadBalancerIP: ").append(toIndentedString(loadBalancerIP)).append("\n");
    sb.append("    loadBalancerSourceRanges: ")
        .append(toIndentedString(loadBalancerSourceRanges))
        .append("\n");
    sb.append("    ports: ").append(toIndentedString(ports)).append("\n");
    sb.append("    publishNotReadyAddresses: ")
        .append(toIndentedString(publishNotReadyAddresses))
        .append("\n");
    sb.append("    selector: ").append(toIndentedString(selector)).append("\n");
    sb.append("    sessionAffinity: ").append(toIndentedString(sessionAffinity)).append("\n");
    sb.append("    sessionAffinityConfig: ")
        .append(toIndentedString(sessionAffinityConfig))
        .append("\n");
    sb.append("    topologyKeys: ").append(toIndentedString(topologyKeys)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
