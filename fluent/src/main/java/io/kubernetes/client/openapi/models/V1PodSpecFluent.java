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

import io.kubernetes.client.custom.Quantity;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

/** Generated */
public interface V1PodSpecFluent<A extends V1PodSpecFluent<A>> extends Fluent<A> {
  public Long getActiveDeadlineSeconds();

  public A withActiveDeadlineSeconds(java.lang.Long activeDeadlineSeconds);

  public Boolean hasActiveDeadlineSeconds();

  /**
   * This method has been deprecated, please use method buildAffinity instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V1Affinity getAffinity();

  public io.kubernetes.client.openapi.models.V1Affinity buildAffinity();

  public A withAffinity(io.kubernetes.client.openapi.models.V1Affinity affinity);

  public java.lang.Boolean hasAffinity();

  public V1PodSpecFluent.AffinityNested<A> withNewAffinity();

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.AffinityNested<A> withNewAffinityLike(
      io.kubernetes.client.openapi.models.V1Affinity item);

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.AffinityNested<A> editAffinity();

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.AffinityNested<A> editOrNewAffinity();

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.AffinityNested<A>
      editOrNewAffinityLike(io.kubernetes.client.openapi.models.V1Affinity item);

  public java.lang.Boolean getAutomountServiceAccountToken();

  public A withAutomountServiceAccountToken(java.lang.Boolean automountServiceAccountToken);

  public java.lang.Boolean hasAutomountServiceAccountToken();

  public A addToContainers(Integer index, V1Container item);

  public A setToContainers(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1Container item);

  public A addToContainers(io.kubernetes.client.openapi.models.V1Container... items);

  public A addAllToContainers(Collection<io.kubernetes.client.openapi.models.V1Container> items);

  public A removeFromContainers(io.kubernetes.client.openapi.models.V1Container... items);

  public A removeAllFromContainers(
      java.util.Collection<io.kubernetes.client.openapi.models.V1Container> items);

  public A removeMatchingFromContainers(Predicate<V1ContainerBuilder> predicate);

  /**
   * This method has been deprecated, please use method buildContainers instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public List<io.kubernetes.client.openapi.models.V1Container> getContainers();

  public java.util.List<io.kubernetes.client.openapi.models.V1Container> buildContainers();

  public io.kubernetes.client.openapi.models.V1Container buildContainer(java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1Container buildFirstContainer();

  public io.kubernetes.client.openapi.models.V1Container buildLastContainer();

  public io.kubernetes.client.openapi.models.V1Container buildMatchingContainer(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ContainerBuilder>
          predicate);

  public java.lang.Boolean hasMatchingContainer(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ContainerBuilder>
          predicate);

  public A withContainers(
      java.util.List<io.kubernetes.client.openapi.models.V1Container> containers);

  public A withContainers(io.kubernetes.client.openapi.models.V1Container... containers);

  public java.lang.Boolean hasContainers();

  public V1PodSpecFluent.ContainersNested<A> addNewContainer();

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.ContainersNested<A>
      addNewContainerLike(io.kubernetes.client.openapi.models.V1Container item);

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.ContainersNested<A>
      setNewContainerLike(
          java.lang.Integer index, io.kubernetes.client.openapi.models.V1Container item);

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.ContainersNested<A> editContainer(
      java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.ContainersNested<A>
      editFirstContainer();

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.ContainersNested<A>
      editLastContainer();

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.ContainersNested<A>
      editMatchingContainer(
          java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ContainerBuilder>
              predicate);

  /**
   * This method has been deprecated, please use method buildDnsConfig instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public V1PodDNSConfig getDnsConfig();

  public io.kubernetes.client.openapi.models.V1PodDNSConfig buildDnsConfig();

  public A withDnsConfig(io.kubernetes.client.openapi.models.V1PodDNSConfig dnsConfig);

  public java.lang.Boolean hasDnsConfig();

  public V1PodSpecFluent.DnsConfigNested<A> withNewDnsConfig();

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.DnsConfigNested<A>
      withNewDnsConfigLike(io.kubernetes.client.openapi.models.V1PodDNSConfig item);

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.DnsConfigNested<A> editDnsConfig();

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.DnsConfigNested<A>
      editOrNewDnsConfig();

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.DnsConfigNested<A>
      editOrNewDnsConfigLike(io.kubernetes.client.openapi.models.V1PodDNSConfig item);

  public String getDnsPolicy();

  public A withDnsPolicy(java.lang.String dnsPolicy);

  public java.lang.Boolean hasDnsPolicy();

  public java.lang.Boolean getEnableServiceLinks();

  public A withEnableServiceLinks(java.lang.Boolean enableServiceLinks);

  public java.lang.Boolean hasEnableServiceLinks();

  public A addToEphemeralContainers(java.lang.Integer index, V1EphemeralContainer item);

  public A setToEphemeralContainers(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1EphemeralContainer item);

  public A addToEphemeralContainers(
      io.kubernetes.client.openapi.models.V1EphemeralContainer... items);

  public A addAllToEphemeralContainers(
      java.util.Collection<io.kubernetes.client.openapi.models.V1EphemeralContainer> items);

  public A removeFromEphemeralContainers(
      io.kubernetes.client.openapi.models.V1EphemeralContainer... items);

  public A removeAllFromEphemeralContainers(
      java.util.Collection<io.kubernetes.client.openapi.models.V1EphemeralContainer> items);

  public A removeMatchingFromEphemeralContainers(
      java.util.function.Predicate<V1EphemeralContainerBuilder> predicate);

  /**
   * This method has been deprecated, please use method buildEphemeralContainers instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1EphemeralContainer>
      getEphemeralContainers();

  public java.util.List<io.kubernetes.client.openapi.models.V1EphemeralContainer>
      buildEphemeralContainers();

  public io.kubernetes.client.openapi.models.V1EphemeralContainer buildEphemeralContainer(
      java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1EphemeralContainer buildFirstEphemeralContainer();

  public io.kubernetes.client.openapi.models.V1EphemeralContainer buildLastEphemeralContainer();

  public io.kubernetes.client.openapi.models.V1EphemeralContainer buildMatchingEphemeralContainer(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1EphemeralContainerBuilder>
          predicate);

  public java.lang.Boolean hasMatchingEphemeralContainer(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1EphemeralContainerBuilder>
          predicate);

  public A withEphemeralContainers(
      java.util.List<io.kubernetes.client.openapi.models.V1EphemeralContainer> ephemeralContainers);

  public A withEphemeralContainers(
      io.kubernetes.client.openapi.models.V1EphemeralContainer... ephemeralContainers);

  public java.lang.Boolean hasEphemeralContainers();

  public V1PodSpecFluent.EphemeralContainersNested<A> addNewEphemeralContainer();

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.EphemeralContainersNested<A>
      addNewEphemeralContainerLike(io.kubernetes.client.openapi.models.V1EphemeralContainer item);

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.EphemeralContainersNested<A>
      setNewEphemeralContainerLike(
          java.lang.Integer index, io.kubernetes.client.openapi.models.V1EphemeralContainer item);

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.EphemeralContainersNested<A>
      editEphemeralContainer(java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.EphemeralContainersNested<A>
      editFirstEphemeralContainer();

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.EphemeralContainersNested<A>
      editLastEphemeralContainer();

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.EphemeralContainersNested<A>
      editMatchingEphemeralContainer(
          java.util.function.Predicate<
                  io.kubernetes.client.openapi.models.V1EphemeralContainerBuilder>
              predicate);

  public A addToHostAliases(java.lang.Integer index, V1HostAlias item);

  public A setToHostAliases(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1HostAlias item);

  public A addToHostAliases(io.kubernetes.client.openapi.models.V1HostAlias... items);

  public A addAllToHostAliases(
      java.util.Collection<io.kubernetes.client.openapi.models.V1HostAlias> items);

  public A removeFromHostAliases(io.kubernetes.client.openapi.models.V1HostAlias... items);

  public A removeAllFromHostAliases(
      java.util.Collection<io.kubernetes.client.openapi.models.V1HostAlias> items);

  public A removeMatchingFromHostAliases(
      java.util.function.Predicate<V1HostAliasBuilder> predicate);

  /**
   * This method has been deprecated, please use method buildHostAliases instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1HostAlias> getHostAliases();

  public java.util.List<io.kubernetes.client.openapi.models.V1HostAlias> buildHostAliases();

  public io.kubernetes.client.openapi.models.V1HostAlias buildHostAlias(java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1HostAlias buildFirstHostAlias();

  public io.kubernetes.client.openapi.models.V1HostAlias buildLastHostAlias();

  public io.kubernetes.client.openapi.models.V1HostAlias buildMatchingHostAlias(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1HostAliasBuilder>
          predicate);

  public java.lang.Boolean hasMatchingHostAlias(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1HostAliasBuilder>
          predicate);

  public A withHostAliases(
      java.util.List<io.kubernetes.client.openapi.models.V1HostAlias> hostAliases);

  public A withHostAliases(io.kubernetes.client.openapi.models.V1HostAlias... hostAliases);

  public java.lang.Boolean hasHostAliases();

  public V1PodSpecFluent.HostAliasesNested<A> addNewHostAlias();

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.HostAliasesNested<A>
      addNewHostAliasLike(io.kubernetes.client.openapi.models.V1HostAlias item);

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.HostAliasesNested<A>
      setNewHostAliasLike(
          java.lang.Integer index, io.kubernetes.client.openapi.models.V1HostAlias item);

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.HostAliasesNested<A> editHostAlias(
      java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.HostAliasesNested<A>
      editFirstHostAlias();

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.HostAliasesNested<A>
      editLastHostAlias();

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.HostAliasesNested<A>
      editMatchingHostAlias(
          java.util.function.Predicate<io.kubernetes.client.openapi.models.V1HostAliasBuilder>
              predicate);

  public java.lang.Boolean getHostIPC();

  public A withHostIPC(java.lang.Boolean hostIPC);

  public java.lang.Boolean hasHostIPC();

  public java.lang.Boolean getHostNetwork();

  public A withHostNetwork(java.lang.Boolean hostNetwork);

  public java.lang.Boolean hasHostNetwork();

  public java.lang.Boolean getHostPID();

  public A withHostPID(java.lang.Boolean hostPID);

  public java.lang.Boolean hasHostPID();

  public java.lang.String getHostname();

  public A withHostname(java.lang.String hostname);

  public java.lang.Boolean hasHostname();

  public A addToImagePullSecrets(java.lang.Integer index, V1LocalObjectReference item);

  public A setToImagePullSecrets(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1LocalObjectReference item);

  public A addToImagePullSecrets(
      io.kubernetes.client.openapi.models.V1LocalObjectReference... items);

  public A addAllToImagePullSecrets(
      java.util.Collection<io.kubernetes.client.openapi.models.V1LocalObjectReference> items);

  public A removeFromImagePullSecrets(
      io.kubernetes.client.openapi.models.V1LocalObjectReference... items);

  public A removeAllFromImagePullSecrets(
      java.util.Collection<io.kubernetes.client.openapi.models.V1LocalObjectReference> items);

  public A removeMatchingFromImagePullSecrets(
      java.util.function.Predicate<V1LocalObjectReferenceBuilder> predicate);

  /**
   * This method has been deprecated, please use method buildImagePullSecrets instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1LocalObjectReference>
      getImagePullSecrets();

  public java.util.List<io.kubernetes.client.openapi.models.V1LocalObjectReference>
      buildImagePullSecrets();

  public io.kubernetes.client.openapi.models.V1LocalObjectReference buildImagePullSecret(
      java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1LocalObjectReference buildFirstImagePullSecret();

  public io.kubernetes.client.openapi.models.V1LocalObjectReference buildLastImagePullSecret();

  public io.kubernetes.client.openapi.models.V1LocalObjectReference buildMatchingImagePullSecret(
      java.util.function.Predicate<
              io.kubernetes.client.openapi.models.V1LocalObjectReferenceBuilder>
          predicate);

  public java.lang.Boolean hasMatchingImagePullSecret(
      java.util.function.Predicate<
              io.kubernetes.client.openapi.models.V1LocalObjectReferenceBuilder>
          predicate);

  public A withImagePullSecrets(
      java.util.List<io.kubernetes.client.openapi.models.V1LocalObjectReference> imagePullSecrets);

  public A withImagePullSecrets(
      io.kubernetes.client.openapi.models.V1LocalObjectReference... imagePullSecrets);

  public java.lang.Boolean hasImagePullSecrets();

  public V1PodSpecFluent.ImagePullSecretsNested<A> addNewImagePullSecret();

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.ImagePullSecretsNested<A>
      addNewImagePullSecretLike(io.kubernetes.client.openapi.models.V1LocalObjectReference item);

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.ImagePullSecretsNested<A>
      setNewImagePullSecretLike(
          java.lang.Integer index, io.kubernetes.client.openapi.models.V1LocalObjectReference item);

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.ImagePullSecretsNested<A>
      editImagePullSecret(java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.ImagePullSecretsNested<A>
      editFirstImagePullSecret();

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.ImagePullSecretsNested<A>
      editLastImagePullSecret();

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.ImagePullSecretsNested<A>
      editMatchingImagePullSecret(
          java.util.function.Predicate<
                  io.kubernetes.client.openapi.models.V1LocalObjectReferenceBuilder>
              predicate);

  public A addToInitContainers(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1Container item);

  public A setToInitContainers(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1Container item);

  public A addToInitContainers(io.kubernetes.client.openapi.models.V1Container... items);

  public A addAllToInitContainers(
      java.util.Collection<io.kubernetes.client.openapi.models.V1Container> items);

  public A removeFromInitContainers(io.kubernetes.client.openapi.models.V1Container... items);

  public A removeAllFromInitContainers(
      java.util.Collection<io.kubernetes.client.openapi.models.V1Container> items);

  public A removeMatchingFromInitContainers(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ContainerBuilder>
          predicate);

  /**
   * This method has been deprecated, please use method buildInitContainers instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1Container> getInitContainers();

  public java.util.List<io.kubernetes.client.openapi.models.V1Container> buildInitContainers();

  public io.kubernetes.client.openapi.models.V1Container buildInitContainer(
      java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1Container buildFirstInitContainer();

  public io.kubernetes.client.openapi.models.V1Container buildLastInitContainer();

  public io.kubernetes.client.openapi.models.V1Container buildMatchingInitContainer(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ContainerBuilder>
          predicate);

  public java.lang.Boolean hasMatchingInitContainer(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ContainerBuilder>
          predicate);

  public A withInitContainers(
      java.util.List<io.kubernetes.client.openapi.models.V1Container> initContainers);

  public A withInitContainers(io.kubernetes.client.openapi.models.V1Container... initContainers);

  public java.lang.Boolean hasInitContainers();

  public V1PodSpecFluent.InitContainersNested<A> addNewInitContainer();

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.InitContainersNested<A>
      addNewInitContainerLike(io.kubernetes.client.openapi.models.V1Container item);

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.InitContainersNested<A>
      setNewInitContainerLike(
          java.lang.Integer index, io.kubernetes.client.openapi.models.V1Container item);

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.InitContainersNested<A>
      editInitContainer(java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.InitContainersNested<A>
      editFirstInitContainer();

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.InitContainersNested<A>
      editLastInitContainer();

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.InitContainersNested<A>
      editMatchingInitContainer(
          java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ContainerBuilder>
              predicate);

  public java.lang.String getNodeName();

  public A withNodeName(java.lang.String nodeName);

  public java.lang.Boolean hasNodeName();

  public A addToNodeSelector(java.lang.String key, java.lang.String value);

  public A addToNodeSelector(Map<java.lang.String, java.lang.String> map);

  public A removeFromNodeSelector(java.lang.String key);

  public A removeFromNodeSelector(java.util.Map<java.lang.String, java.lang.String> map);

  public java.util.Map<java.lang.String, java.lang.String> getNodeSelector();

  public <K, V> A withNodeSelector(java.util.Map<java.lang.String, java.lang.String> nodeSelector);

  public java.lang.Boolean hasNodeSelector();

  /**
   * This method has been deprecated, please use method buildOs instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public V1PodOS getOs();

  public io.kubernetes.client.openapi.models.V1PodOS buildOs();

  public A withOs(io.kubernetes.client.openapi.models.V1PodOS os);

  public java.lang.Boolean hasOs();

  public V1PodSpecFluent.OsNested<A> withNewOs();

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.OsNested<A> withNewOsLike(
      io.kubernetes.client.openapi.models.V1PodOS item);

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.OsNested<A> editOs();

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.OsNested<A> editOrNewOs();

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.OsNested<A> editOrNewOsLike(
      io.kubernetes.client.openapi.models.V1PodOS item);

  public A addToOverhead(java.lang.String key, Quantity value);

  public A addToOverhead(java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity> map);

  public A removeFromOverhead(java.lang.String key);

  public A removeFromOverhead(
      java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity> map);

  public java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity> getOverhead();

  public <K, V> A withOverhead(
      java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity> overhead);

  public java.lang.Boolean hasOverhead();

  public java.lang.String getPreemptionPolicy();

  public A withPreemptionPolicy(java.lang.String preemptionPolicy);

  public java.lang.Boolean hasPreemptionPolicy();

  public java.lang.Integer getPriority();

  public A withPriority(java.lang.Integer priority);

  public java.lang.Boolean hasPriority();

  public java.lang.String getPriorityClassName();

  public A withPriorityClassName(java.lang.String priorityClassName);

  public java.lang.Boolean hasPriorityClassName();

  public A addToReadinessGates(java.lang.Integer index, V1PodReadinessGate item);

  public A setToReadinessGates(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1PodReadinessGate item);

  public A addToReadinessGates(io.kubernetes.client.openapi.models.V1PodReadinessGate... items);

  public A addAllToReadinessGates(
      java.util.Collection<io.kubernetes.client.openapi.models.V1PodReadinessGate> items);

  public A removeFromReadinessGates(
      io.kubernetes.client.openapi.models.V1PodReadinessGate... items);

  public A removeAllFromReadinessGates(
      java.util.Collection<io.kubernetes.client.openapi.models.V1PodReadinessGate> items);

  public A removeMatchingFromReadinessGates(
      java.util.function.Predicate<V1PodReadinessGateBuilder> predicate);

  /**
   * This method has been deprecated, please use method buildReadinessGates instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1PodReadinessGate> getReadinessGates();

  public java.util.List<io.kubernetes.client.openapi.models.V1PodReadinessGate>
      buildReadinessGates();

  public io.kubernetes.client.openapi.models.V1PodReadinessGate buildReadinessGate(
      java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1PodReadinessGate buildFirstReadinessGate();

  public io.kubernetes.client.openapi.models.V1PodReadinessGate buildLastReadinessGate();

  public io.kubernetes.client.openapi.models.V1PodReadinessGate buildMatchingReadinessGate(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1PodReadinessGateBuilder>
          predicate);

  public java.lang.Boolean hasMatchingReadinessGate(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1PodReadinessGateBuilder>
          predicate);

  public A withReadinessGates(
      java.util.List<io.kubernetes.client.openapi.models.V1PodReadinessGate> readinessGates);

  public A withReadinessGates(
      io.kubernetes.client.openapi.models.V1PodReadinessGate... readinessGates);

  public java.lang.Boolean hasReadinessGates();

  public V1PodSpecFluent.ReadinessGatesNested<A> addNewReadinessGate();

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.ReadinessGatesNested<A>
      addNewReadinessGateLike(io.kubernetes.client.openapi.models.V1PodReadinessGate item);

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.ReadinessGatesNested<A>
      setNewReadinessGateLike(
          java.lang.Integer index, io.kubernetes.client.openapi.models.V1PodReadinessGate item);

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.ReadinessGatesNested<A>
      editReadinessGate(java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.ReadinessGatesNested<A>
      editFirstReadinessGate();

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.ReadinessGatesNested<A>
      editLastReadinessGate();

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.ReadinessGatesNested<A>
      editMatchingReadinessGate(
          java.util.function.Predicate<
                  io.kubernetes.client.openapi.models.V1PodReadinessGateBuilder>
              predicate);

  public java.lang.String getRestartPolicy();

  public A withRestartPolicy(java.lang.String restartPolicy);

  public java.lang.Boolean hasRestartPolicy();

  public java.lang.String getRuntimeClassName();

  public A withRuntimeClassName(java.lang.String runtimeClassName);

  public java.lang.Boolean hasRuntimeClassName();

  public java.lang.String getSchedulerName();

  public A withSchedulerName(java.lang.String schedulerName);

  public java.lang.Boolean hasSchedulerName();

  /**
   * This method has been deprecated, please use method buildSecurityContext instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public V1PodSecurityContext getSecurityContext();

  public io.kubernetes.client.openapi.models.V1PodSecurityContext buildSecurityContext();

  public A withSecurityContext(
      io.kubernetes.client.openapi.models.V1PodSecurityContext securityContext);

  public java.lang.Boolean hasSecurityContext();

  public V1PodSpecFluent.SecurityContextNested<A> withNewSecurityContext();

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.SecurityContextNested<A>
      withNewSecurityContextLike(io.kubernetes.client.openapi.models.V1PodSecurityContext item);

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.SecurityContextNested<A>
      editSecurityContext();

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.SecurityContextNested<A>
      editOrNewSecurityContext();

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.SecurityContextNested<A>
      editOrNewSecurityContextLike(io.kubernetes.client.openapi.models.V1PodSecurityContext item);

  public java.lang.String getServiceAccount();

  public A withServiceAccount(java.lang.String serviceAccount);

  public java.lang.Boolean hasServiceAccount();

  public java.lang.String getServiceAccountName();

  public A withServiceAccountName(java.lang.String serviceAccountName);

  public java.lang.Boolean hasServiceAccountName();

  public java.lang.Boolean getSetHostnameAsFQDN();

  public A withSetHostnameAsFQDN(java.lang.Boolean setHostnameAsFQDN);

  public java.lang.Boolean hasSetHostnameAsFQDN();

  public java.lang.Boolean getShareProcessNamespace();

  public A withShareProcessNamespace(java.lang.Boolean shareProcessNamespace);

  public java.lang.Boolean hasShareProcessNamespace();

  public java.lang.String getSubdomain();

  public A withSubdomain(java.lang.String subdomain);

  public java.lang.Boolean hasSubdomain();

  public java.lang.Long getTerminationGracePeriodSeconds();

  public A withTerminationGracePeriodSeconds(java.lang.Long terminationGracePeriodSeconds);

  public java.lang.Boolean hasTerminationGracePeriodSeconds();

  public A addToTolerations(java.lang.Integer index, V1Toleration item);

  public A setToTolerations(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1Toleration item);

  public A addToTolerations(io.kubernetes.client.openapi.models.V1Toleration... items);

  public A addAllToTolerations(
      java.util.Collection<io.kubernetes.client.openapi.models.V1Toleration> items);

  public A removeFromTolerations(io.kubernetes.client.openapi.models.V1Toleration... items);

  public A removeAllFromTolerations(
      java.util.Collection<io.kubernetes.client.openapi.models.V1Toleration> items);

  public A removeMatchingFromTolerations(
      java.util.function.Predicate<V1TolerationBuilder> predicate);

  /**
   * This method has been deprecated, please use method buildTolerations instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1Toleration> getTolerations();

  public java.util.List<io.kubernetes.client.openapi.models.V1Toleration> buildTolerations();

  public io.kubernetes.client.openapi.models.V1Toleration buildToleration(java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1Toleration buildFirstToleration();

  public io.kubernetes.client.openapi.models.V1Toleration buildLastToleration();

  public io.kubernetes.client.openapi.models.V1Toleration buildMatchingToleration(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1TolerationBuilder>
          predicate);

  public java.lang.Boolean hasMatchingToleration(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1TolerationBuilder>
          predicate);

  public A withTolerations(
      java.util.List<io.kubernetes.client.openapi.models.V1Toleration> tolerations);

  public A withTolerations(io.kubernetes.client.openapi.models.V1Toleration... tolerations);

  public java.lang.Boolean hasTolerations();

  public V1PodSpecFluent.TolerationsNested<A> addNewToleration();

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.TolerationsNested<A>
      addNewTolerationLike(io.kubernetes.client.openapi.models.V1Toleration item);

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.TolerationsNested<A>
      setNewTolerationLike(
          java.lang.Integer index, io.kubernetes.client.openapi.models.V1Toleration item);

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.TolerationsNested<A> editToleration(
      java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.TolerationsNested<A>
      editFirstToleration();

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.TolerationsNested<A>
      editLastToleration();

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.TolerationsNested<A>
      editMatchingToleration(
          java.util.function.Predicate<io.kubernetes.client.openapi.models.V1TolerationBuilder>
              predicate);

  public A addToTopologySpreadConstraints(java.lang.Integer index, V1TopologySpreadConstraint item);

  public A setToTopologySpreadConstraints(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1TopologySpreadConstraint item);

  public A addToTopologySpreadConstraints(
      io.kubernetes.client.openapi.models.V1TopologySpreadConstraint... items);

  public A addAllToTopologySpreadConstraints(
      java.util.Collection<io.kubernetes.client.openapi.models.V1TopologySpreadConstraint> items);

  public A removeFromTopologySpreadConstraints(
      io.kubernetes.client.openapi.models.V1TopologySpreadConstraint... items);

  public A removeAllFromTopologySpreadConstraints(
      java.util.Collection<io.kubernetes.client.openapi.models.V1TopologySpreadConstraint> items);

  public A removeMatchingFromTopologySpreadConstraints(
      java.util.function.Predicate<V1TopologySpreadConstraintBuilder> predicate);

  /**
   * This method has been deprecated, please use method buildTopologySpreadConstraints instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1TopologySpreadConstraint>
      getTopologySpreadConstraints();

  public java.util.List<io.kubernetes.client.openapi.models.V1TopologySpreadConstraint>
      buildTopologySpreadConstraints();

  public io.kubernetes.client.openapi.models.V1TopologySpreadConstraint
      buildTopologySpreadConstraint(java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1TopologySpreadConstraint
      buildFirstTopologySpreadConstraint();

  public io.kubernetes.client.openapi.models.V1TopologySpreadConstraint
      buildLastTopologySpreadConstraint();

  public io.kubernetes.client.openapi.models.V1TopologySpreadConstraint
      buildMatchingTopologySpreadConstraint(
          java.util.function.Predicate<
                  io.kubernetes.client.openapi.models.V1TopologySpreadConstraintBuilder>
              predicate);

  public java.lang.Boolean hasMatchingTopologySpreadConstraint(
      java.util.function.Predicate<
              io.kubernetes.client.openapi.models.V1TopologySpreadConstraintBuilder>
          predicate);

  public A withTopologySpreadConstraints(
      java.util.List<io.kubernetes.client.openapi.models.V1TopologySpreadConstraint>
          topologySpreadConstraints);

  public A withTopologySpreadConstraints(
      io.kubernetes.client.openapi.models.V1TopologySpreadConstraint... topologySpreadConstraints);

  public java.lang.Boolean hasTopologySpreadConstraints();

  public V1PodSpecFluent.TopologySpreadConstraintsNested<A> addNewTopologySpreadConstraint();

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.TopologySpreadConstraintsNested<A>
      addNewTopologySpreadConstraintLike(
          io.kubernetes.client.openapi.models.V1TopologySpreadConstraint item);

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.TopologySpreadConstraintsNested<A>
      setNewTopologySpreadConstraintLike(
          java.lang.Integer index,
          io.kubernetes.client.openapi.models.V1TopologySpreadConstraint item);

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.TopologySpreadConstraintsNested<A>
      editTopologySpreadConstraint(java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.TopologySpreadConstraintsNested<A>
      editFirstTopologySpreadConstraint();

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.TopologySpreadConstraintsNested<A>
      editLastTopologySpreadConstraint();

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.TopologySpreadConstraintsNested<A>
      editMatchingTopologySpreadConstraint(
          java.util.function.Predicate<
                  io.kubernetes.client.openapi.models.V1TopologySpreadConstraintBuilder>
              predicate);

  public A addToVolumes(java.lang.Integer index, V1Volume item);

  public A setToVolumes(java.lang.Integer index, io.kubernetes.client.openapi.models.V1Volume item);

  public A addToVolumes(io.kubernetes.client.openapi.models.V1Volume... items);

  public A addAllToVolumes(
      java.util.Collection<io.kubernetes.client.openapi.models.V1Volume> items);

  public A removeFromVolumes(io.kubernetes.client.openapi.models.V1Volume... items);

  public A removeAllFromVolumes(
      java.util.Collection<io.kubernetes.client.openapi.models.V1Volume> items);

  public A removeMatchingFromVolumes(java.util.function.Predicate<V1VolumeBuilder> predicate);

  /**
   * This method has been deprecated, please use method buildVolumes instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1Volume> getVolumes();

  public java.util.List<io.kubernetes.client.openapi.models.V1Volume> buildVolumes();

  public io.kubernetes.client.openapi.models.V1Volume buildVolume(java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1Volume buildFirstVolume();

  public io.kubernetes.client.openapi.models.V1Volume buildLastVolume();

  public io.kubernetes.client.openapi.models.V1Volume buildMatchingVolume(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1VolumeBuilder> predicate);

  public java.lang.Boolean hasMatchingVolume(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1VolumeBuilder> predicate);

  public A withVolumes(java.util.List<io.kubernetes.client.openapi.models.V1Volume> volumes);

  public A withVolumes(io.kubernetes.client.openapi.models.V1Volume... volumes);

  public java.lang.Boolean hasVolumes();

  public V1PodSpecFluent.VolumesNested<A> addNewVolume();

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.VolumesNested<A> addNewVolumeLike(
      io.kubernetes.client.openapi.models.V1Volume item);

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.VolumesNested<A> setNewVolumeLike(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1Volume item);

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.VolumesNested<A> editVolume(
      java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.VolumesNested<A> editFirstVolume();

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.VolumesNested<A> editLastVolume();

  public io.kubernetes.client.openapi.models.V1PodSpecFluent.VolumesNested<A> editMatchingVolume(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1VolumeBuilder> predicate);

  public A withAutomountServiceAccountToken();

  public A withEnableServiceLinks();

  public A withHostIPC();

  public A withHostNetwork();

  public A withHostPID();

  public A withSetHostnameAsFQDN();

  public A withShareProcessNamespace();

  public interface AffinityNested<N>
      extends Nested<N>, V1AffinityFluent<V1PodSpecFluent.AffinityNested<N>> {
    public N and();

    public N endAffinity();
  }

  public interface ContainersNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          V1ContainerFluent<V1PodSpecFluent.ContainersNested<N>> {
    public N and();

    public N endContainer();
  }

  public interface DnsConfigNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          V1PodDNSConfigFluent<V1PodSpecFluent.DnsConfigNested<N>> {
    public N and();

    public N endDnsConfig();
  }

  public interface EphemeralContainersNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          V1EphemeralContainerFluent<V1PodSpecFluent.EphemeralContainersNested<N>> {
    public N and();

    public N endEphemeralContainer();
  }

  public interface HostAliasesNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          V1HostAliasFluent<V1PodSpecFluent.HostAliasesNested<N>> {
    public N and();

    public N endHostAlias();
  }

  public interface ImagePullSecretsNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          V1LocalObjectReferenceFluent<V1PodSpecFluent.ImagePullSecretsNested<N>> {
    public N and();

    public N endImagePullSecret();
  }

  public interface InitContainersNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          V1ContainerFluent<V1PodSpecFluent.InitContainersNested<N>> {
    public N and();

    public N endInitContainer();
  }

  public interface OsNested<N>
      extends io.kubernetes.client.fluent.Nested<N>, V1PodOSFluent<V1PodSpecFluent.OsNested<N>> {
    public N and();

    public N endOs();
  }

  public interface ReadinessGatesNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          V1PodReadinessGateFluent<V1PodSpecFluent.ReadinessGatesNested<N>> {
    public N and();

    public N endReadinessGate();
  }

  public interface SecurityContextNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          V1PodSecurityContextFluent<V1PodSpecFluent.SecurityContextNested<N>> {
    public N and();

    public N endSecurityContext();
  }

  public interface TolerationsNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          V1TolerationFluent<V1PodSpecFluent.TolerationsNested<N>> {
    public N and();

    public N endToleration();
  }

  public interface TopologySpreadConstraintsNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          V1TopologySpreadConstraintFluent<V1PodSpecFluent.TopologySpreadConstraintsNested<N>> {
    public N and();

    public N endTopologySpreadConstraint();
  }

  public interface VolumesNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          V1VolumeFluent<V1PodSpecFluent.VolumesNested<N>> {
    public N and();

    public N endVolume();
  }
}
