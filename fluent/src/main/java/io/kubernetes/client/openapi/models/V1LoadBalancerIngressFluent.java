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

import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

/** Generated */
public interface V1LoadBalancerIngressFluent<A extends V1LoadBalancerIngressFluent<A>>
    extends Fluent<A> {
  public String getHostname();

  public A withHostname(String hostname);

  public Boolean hasHostname();

  public String getIp();

  public A withIp(String ip);

  public Boolean hasIp();

  public A addToPorts(Integer index, V1PortStatus item);

  public A setToPorts(Integer index, V1PortStatus item);

  public A addToPorts(io.kubernetes.client.openapi.models.V1PortStatus... items);

  public A addAllToPorts(Collection<V1PortStatus> items);

  public A removeFromPorts(io.kubernetes.client.openapi.models.V1PortStatus... items);

  public A removeAllFromPorts(Collection<V1PortStatus> items);

  public A removeMatchingFromPorts(Predicate<V1PortStatusBuilder> predicate);

  /**
   * This method has been deprecated, please use method buildPorts instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public List<V1PortStatus> getPorts();

  public List<V1PortStatus> buildPorts();

  public V1PortStatus buildPort(Integer index);

  public V1PortStatus buildFirstPort();

  public V1PortStatus buildLastPort();

  public V1PortStatus buildMatchingPort(Predicate<V1PortStatusBuilder> predicate);

  public Boolean hasMatchingPort(Predicate<V1PortStatusBuilder> predicate);

  public A withPorts(List<V1PortStatus> ports);

  public A withPorts(io.kubernetes.client.openapi.models.V1PortStatus... ports);

  public Boolean hasPorts();

  public V1LoadBalancerIngressFluent.PortsNested<A> addNewPort();

  public V1LoadBalancerIngressFluent.PortsNested<A> addNewPortLike(V1PortStatus item);

  public V1LoadBalancerIngressFluent.PortsNested<A> setNewPortLike(
      Integer index, V1PortStatus item);

  public V1LoadBalancerIngressFluent.PortsNested<A> editPort(Integer index);

  public V1LoadBalancerIngressFluent.PortsNested<A> editFirstPort();

  public V1LoadBalancerIngressFluent.PortsNested<A> editLastPort();

  public V1LoadBalancerIngressFluent.PortsNested<A> editMatchingPort(
      Predicate<V1PortStatusBuilder> predicate);

  public interface PortsNested<N>
      extends Nested<N>, V1PortStatusFluent<V1LoadBalancerIngressFluent.PortsNested<N>> {
    public N and();

    public N endPort();
  }
}
