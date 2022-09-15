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
public class V1ResourceRequirementsFluentImpl<A extends V1ResourceRequirementsFluent<A>>
    extends BaseFluent<A> implements V1ResourceRequirementsFluent<A> {
  public V1ResourceRequirementsFluentImpl() {}

  public V1ResourceRequirementsFluentImpl(V1ResourceRequirements instance) {
    this.withLimits(instance.getLimits());

    this.withRequests(instance.getRequests());
  }

  private Map<String, Quantity> limits;
  private Map<String, Quantity> requests;

  public A addToLimits(String key, Quantity value) {
    if (this.limits == null && key != null && value != null) {
      this.limits = new LinkedHashMap();
    }
    if (key != null && value != null) {
      this.limits.put(key, value);
    }
    return (A) this;
  }

  public A addToLimits(Map<String, Quantity> map) {
    if (this.limits == null && map != null) {
      this.limits = new LinkedHashMap();
    }
    if (map != null) {
      this.limits.putAll(map);
    }
    return (A) this;
  }

  public A removeFromLimits(String key) {
    if (this.limits == null) {
      return (A) this;
    }
    if (key != null && this.limits != null) {
      this.limits.remove(key);
    }
    return (A) this;
  }

  public A removeFromLimits(Map<String, Quantity> map) {
    if (this.limits == null) {
      return (A) this;
    }
    if (map != null) {
      for (Object key : map.keySet()) {
        if (this.limits != null) {
          this.limits.remove(key);
        }
      }
    }
    return (A) this;
  }

  public Map<String, Quantity> getLimits() {
    return this.limits;
  }

  public <K, V> A withLimits(Map<String, Quantity> limits) {
    if (limits == null) {
      this.limits = null;
    } else {
      this.limits = new LinkedHashMap(limits);
    }
    return (A) this;
  }

  public Boolean hasLimits() {
    return this.limits != null;
  }

  public A addToRequests(String key, Quantity value) {
    if (this.requests == null && key != null && value != null) {
      this.requests = new LinkedHashMap();
    }
    if (key != null && value != null) {
      this.requests.put(key, value);
    }
    return (A) this;
  }

  public A addToRequests(Map<String, Quantity> map) {
    if (this.requests == null && map != null) {
      this.requests = new LinkedHashMap();
    }
    if (map != null) {
      this.requests.putAll(map);
    }
    return (A) this;
  }

  public A removeFromRequests(String key) {
    if (this.requests == null) {
      return (A) this;
    }
    if (key != null && this.requests != null) {
      this.requests.remove(key);
    }
    return (A) this;
  }

  public A removeFromRequests(Map<String, Quantity> map) {
    if (this.requests == null) {
      return (A) this;
    }
    if (map != null) {
      for (Object key : map.keySet()) {
        if (this.requests != null) {
          this.requests.remove(key);
        }
      }
    }
    return (A) this;
  }

  public Map<String, Quantity> getRequests() {
    return this.requests;
  }

  public <K, V> A withRequests(Map<String, Quantity> requests) {
    if (requests == null) {
      this.requests = null;
    } else {
      this.requests = new LinkedHashMap(requests);
    }
    return (A) this;
  }

  public Boolean hasRequests() {
    return this.requests != null;
  }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1ResourceRequirementsFluentImpl that = (V1ResourceRequirementsFluentImpl) o;
    if (limits != null ? !limits.equals(that.limits) : that.limits != null) return false;
    if (requests != null ? !requests.equals(that.requests) : that.requests != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(limits, requests, super.hashCode());
  }

  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (limits != null && !limits.isEmpty()) {
      sb.append("limits:");
      sb.append(limits + ",");
    }
    if (requests != null && !requests.isEmpty()) {
      sb.append("requests:");
      sb.append(requests);
    }
    sb.append("}");
    return sb.toString();
  }
}
