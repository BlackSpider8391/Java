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
public class V1PodIPFluentImpl<A extends V1PodIPFluent<A>> extends BaseFluent<A>
    implements V1PodIPFluent<A> {
  public V1PodIPFluentImpl() {}

  public V1PodIPFluentImpl(V1PodIP instance) {
    this.withIp(instance.getIp());
  }

  private String ip;

  public String getIp() {
    return this.ip;
  }

  public A withIp(String ip) {
    this.ip = ip;
    return (A) this;
  }

  public Boolean hasIp() {
    return this.ip != null;
  }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1PodIPFluentImpl that = (V1PodIPFluentImpl) o;
    if (ip != null ? !ip.equals(that.ip) : that.ip != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(ip, super.hashCode());
  }

  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (ip != null) {
      sb.append("ip:");
      sb.append(ip);
    }
    sb.append("}");
    return sb.toString();
  }
}
