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

import io.kubernetes.client.fluent.BaseFluent;

/** Generated */
@SuppressWarnings(value = "unchecked")
public class DiscoveryV1EndpointPortFluentImpl<A extends DiscoveryV1EndpointPortFluent<A>>
    extends BaseFluent<A> implements DiscoveryV1EndpointPortFluent<A> {
  public DiscoveryV1EndpointPortFluentImpl() {}

  public DiscoveryV1EndpointPortFluentImpl(DiscoveryV1EndpointPort instance) {
    this.withAppProtocol(instance.getAppProtocol());

    this.withName(instance.getName());

    this.withPort(instance.getPort());

    this.withProtocol(instance.getProtocol());
  }

  private String appProtocol;
  private String name;
  private Integer port;
  private String protocol;

  public String getAppProtocol() {
    return this.appProtocol;
  }

  public A withAppProtocol(String appProtocol) {
    this.appProtocol = appProtocol;
    return (A) this;
  }

  public Boolean hasAppProtocol() {
    return this.appProtocol != null;
  }

  public String getName() {
    return this.name;
  }

  public A withName(String name) {
    this.name = name;
    return (A) this;
  }

  public Boolean hasName() {
    return this.name != null;
  }

  public Integer getPort() {
    return this.port;
  }

  public A withPort(Integer port) {
    this.port = port;
    return (A) this;
  }

  public Boolean hasPort() {
    return this.port != null;
  }

  public String getProtocol() {
    return this.protocol;
  }

  public A withProtocol(String protocol) {
    this.protocol = protocol;
    return (A) this;
  }

  public Boolean hasProtocol() {
    return this.protocol != null;
  }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscoveryV1EndpointPortFluentImpl that = (DiscoveryV1EndpointPortFluentImpl) o;
    if (appProtocol != null ? !appProtocol.equals(that.appProtocol) : that.appProtocol != null)
      return false;
    if (name != null ? !name.equals(that.name) : that.name != null) return false;
    if (port != null ? !port.equals(that.port) : that.port != null) return false;
    if (protocol != null ? !protocol.equals(that.protocol) : that.protocol != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(appProtocol, name, port, protocol, super.hashCode());
  }

  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (appProtocol != null) {
      sb.append("appProtocol:");
      sb.append(appProtocol + ",");
    }
    if (name != null) {
      sb.append("name:");
      sb.append(name + ",");
    }
    if (port != null) {
      sb.append("port:");
      sb.append(port + ",");
    }
    if (protocol != null) {
      sb.append("protocol:");
      sb.append(protocol);
    }
    sb.append("}");
    return sb.toString();
  }
}
