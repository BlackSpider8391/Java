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
import io.kubernetes.client.fluent.BaseFluent;
import java.util.LinkedHashMap;
import java.util.Map;

/** Generated */
@SuppressWarnings(value = "unchecked")
public class V1OverheadFluentImpl<A extends V1OverheadFluent<A>> extends BaseFluent<A>
    implements V1OverheadFluent<A> {
  public V1OverheadFluentImpl() {}

  public V1OverheadFluentImpl(V1Overhead instance) {
    this.withPodFixed(instance.getPodFixed());
  }

  private Map<String, Quantity> podFixed;

  public A addToPodFixed(String key, Quantity value) {
    if (this.podFixed == null && key != null && value != null) {
      this.podFixed = new LinkedHashMap();
    }
    if (key != null && value != null) {
      this.podFixed.put(key, value);
    }
    return (A) this;
  }

  public A addToPodFixed(Map<String, Quantity> map) {
    if (this.podFixed == null && map != null) {
      this.podFixed = new LinkedHashMap();
    }
    if (map != null) {
      this.podFixed.putAll(map);
    }
    return (A) this;
  }

  public A removeFromPodFixed(String key) {
    if (this.podFixed == null) {
      return (A) this;
    }
    if (key != null && this.podFixed != null) {
      this.podFixed.remove(key);
    }
    return (A) this;
  }

  public A removeFromPodFixed(Map<String, Quantity> map) {
    if (this.podFixed == null) {
      return (A) this;
    }
    if (map != null) {
      for (Object key : map.keySet()) {
        if (this.podFixed != null) {
          this.podFixed.remove(key);
        }
      }
    }
    return (A) this;
  }

  public Map<String, Quantity> getPodFixed() {
    return this.podFixed;
  }

  public <K, V> A withPodFixed(Map<String, Quantity> podFixed) {
    if (podFixed == null) {
      this.podFixed = null;
    } else {
      this.podFixed = new LinkedHashMap(podFixed);
    }
    return (A) this;
  }

  public Boolean hasPodFixed() {
    return this.podFixed != null;
  }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1OverheadFluentImpl that = (V1OverheadFluentImpl) o;
    if (podFixed != null ? !podFixed.equals(that.podFixed) : that.podFixed != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(podFixed, super.hashCode());
  }

  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (podFixed != null && !podFixed.isEmpty()) {
      sb.append("podFixed:");
      sb.append(podFixed);
    }
    sb.append("}");
    return sb.toString();
  }
}
