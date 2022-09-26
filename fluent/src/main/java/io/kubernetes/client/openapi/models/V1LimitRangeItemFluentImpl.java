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
public class V1LimitRangeItemFluentImpl<A extends V1LimitRangeItemFluent<A>> extends BaseFluent<A>
    implements V1LimitRangeItemFluent<A> {
  public V1LimitRangeItemFluentImpl() {}

  public V1LimitRangeItemFluentImpl(V1LimitRangeItem instance) {
    this.withDefault(instance.getDefault());

    this.withDefaultRequest(instance.getDefaultRequest());

    this.withMax(instance.getMax());

    this.withMaxLimitRequestRatio(instance.getMaxLimitRequestRatio());

    this.withMin(instance.getMin());

    this.withType(instance.getType());
  }

  private Map<String, Quantity> _default;
  private Map<String, Quantity> defaultRequest;
  private Map<String, Quantity> max;
  private Map<String, Quantity> maxLimitRequestRatio;
  private Map<String, Quantity> min;
  private String type;

  public A addToDefault(String key, Quantity value) {
    if (this._default == null && key != null && value != null) {
      this._default = new LinkedHashMap();
    }
    if (key != null && value != null) {
      this._default.put(key, value);
    }
    return (A) this;
  }

  public A addToDefault(Map<String, Quantity> map) {
    if (this._default == null && map != null) {
      this._default = new LinkedHashMap();
    }
    if (map != null) {
      this._default.putAll(map);
    }
    return (A) this;
  }

  public A removeFromDefault(String key) {
    if (this._default == null) {
      return (A) this;
    }
    if (key != null && this._default != null) {
      this._default.remove(key);
    }
    return (A) this;
  }

  public A removeFromDefault(Map<String, Quantity> map) {
    if (this._default == null) {
      return (A) this;
    }
    if (map != null) {
      for (Object key : map.keySet()) {
        if (this._default != null) {
          this._default.remove(key);
        }
      }
    }
    return (A) this;
  }

  public Map<String, Quantity> getDefault() {
    return this._default;
  }

  public <K, V> A withDefault(Map<String, Quantity> _default) {
    if (_default == null) {
      this._default = null;
    } else {
      this._default = new LinkedHashMap(_default);
    }
    return (A) this;
  }

  public Boolean hasDefault() {
    return this._default != null;
  }

  public A addToDefaultRequest(String key, Quantity value) {
    if (this.defaultRequest == null && key != null && value != null) {
      this.defaultRequest = new LinkedHashMap();
    }
    if (key != null && value != null) {
      this.defaultRequest.put(key, value);
    }
    return (A) this;
  }

  public A addToDefaultRequest(Map<String, Quantity> map) {
    if (this.defaultRequest == null && map != null) {
      this.defaultRequest = new LinkedHashMap();
    }
    if (map != null) {
      this.defaultRequest.putAll(map);
    }
    return (A) this;
  }

  public A removeFromDefaultRequest(String key) {
    if (this.defaultRequest == null) {
      return (A) this;
    }
    if (key != null && this.defaultRequest != null) {
      this.defaultRequest.remove(key);
    }
    return (A) this;
  }

  public A removeFromDefaultRequest(Map<String, Quantity> map) {
    if (this.defaultRequest == null) {
      return (A) this;
    }
    if (map != null) {
      for (Object key : map.keySet()) {
        if (this.defaultRequest != null) {
          this.defaultRequest.remove(key);
        }
      }
    }
    return (A) this;
  }

  public Map<String, Quantity> getDefaultRequest() {
    return this.defaultRequest;
  }

  public <K, V> A withDefaultRequest(Map<String, Quantity> defaultRequest) {
    if (defaultRequest == null) {
      this.defaultRequest = null;
    } else {
      this.defaultRequest = new LinkedHashMap(defaultRequest);
    }
    return (A) this;
  }

  public Boolean hasDefaultRequest() {
    return this.defaultRequest != null;
  }

  public A addToMax(String key, Quantity value) {
    if (this.max == null && key != null && value != null) {
      this.max = new LinkedHashMap();
    }
    if (key != null && value != null) {
      this.max.put(key, value);
    }
    return (A) this;
  }

  public A addToMax(Map<String, Quantity> map) {
    if (this.max == null && map != null) {
      this.max = new LinkedHashMap();
    }
    if (map != null) {
      this.max.putAll(map);
    }
    return (A) this;
  }

  public A removeFromMax(String key) {
    if (this.max == null) {
      return (A) this;
    }
    if (key != null && this.max != null) {
      this.max.remove(key);
    }
    return (A) this;
  }

  public A removeFromMax(Map<String, Quantity> map) {
    if (this.max == null) {
      return (A) this;
    }
    if (map != null) {
      for (Object key : map.keySet()) {
        if (this.max != null) {
          this.max.remove(key);
        }
      }
    }
    return (A) this;
  }

  public Map<String, Quantity> getMax() {
    return this.max;
  }

  public <K, V> A withMax(Map<String, Quantity> max) {
    if (max == null) {
      this.max = null;
    } else {
      this.max = new LinkedHashMap(max);
    }
    return (A) this;
  }

  public Boolean hasMax() {
    return this.max != null;
  }

  public A addToMaxLimitRequestRatio(String key, Quantity value) {
    if (this.maxLimitRequestRatio == null && key != null && value != null) {
      this.maxLimitRequestRatio = new LinkedHashMap();
    }
    if (key != null && value != null) {
      this.maxLimitRequestRatio.put(key, value);
    }
    return (A) this;
  }

  public A addToMaxLimitRequestRatio(Map<String, Quantity> map) {
    if (this.maxLimitRequestRatio == null && map != null) {
      this.maxLimitRequestRatio = new LinkedHashMap();
    }
    if (map != null) {
      this.maxLimitRequestRatio.putAll(map);
    }
    return (A) this;
  }

  public A removeFromMaxLimitRequestRatio(String key) {
    if (this.maxLimitRequestRatio == null) {
      return (A) this;
    }
    if (key != null && this.maxLimitRequestRatio != null) {
      this.maxLimitRequestRatio.remove(key);
    }
    return (A) this;
  }

  public A removeFromMaxLimitRequestRatio(Map<String, Quantity> map) {
    if (this.maxLimitRequestRatio == null) {
      return (A) this;
    }
    if (map != null) {
      for (Object key : map.keySet()) {
        if (this.maxLimitRequestRatio != null) {
          this.maxLimitRequestRatio.remove(key);
        }
      }
    }
    return (A) this;
  }

  public Map<String, Quantity> getMaxLimitRequestRatio() {
    return this.maxLimitRequestRatio;
  }

  public <K, V> A withMaxLimitRequestRatio(Map<String, Quantity> maxLimitRequestRatio) {
    if (maxLimitRequestRatio == null) {
      this.maxLimitRequestRatio = null;
    } else {
      this.maxLimitRequestRatio = new LinkedHashMap(maxLimitRequestRatio);
    }
    return (A) this;
  }

  public Boolean hasMaxLimitRequestRatio() {
    return this.maxLimitRequestRatio != null;
  }

  public A addToMin(String key, Quantity value) {
    if (this.min == null && key != null && value != null) {
      this.min = new LinkedHashMap();
    }
    if (key != null && value != null) {
      this.min.put(key, value);
    }
    return (A) this;
  }

  public A addToMin(Map<String, Quantity> map) {
    if (this.min == null && map != null) {
      this.min = new LinkedHashMap();
    }
    if (map != null) {
      this.min.putAll(map);
    }
    return (A) this;
  }

  public A removeFromMin(String key) {
    if (this.min == null) {
      return (A) this;
    }
    if (key != null && this.min != null) {
      this.min.remove(key);
    }
    return (A) this;
  }

  public A removeFromMin(Map<String, Quantity> map) {
    if (this.min == null) {
      return (A) this;
    }
    if (map != null) {
      for (Object key : map.keySet()) {
        if (this.min != null) {
          this.min.remove(key);
        }
      }
    }
    return (A) this;
  }

  public Map<String, Quantity> getMin() {
    return this.min;
  }

  public <K, V> A withMin(Map<String, Quantity> min) {
    if (min == null) {
      this.min = null;
    } else {
      this.min = new LinkedHashMap(min);
    }
    return (A) this;
  }

  public Boolean hasMin() {
    return this.min != null;
  }

  public String getType() {
    return this.type;
  }

  public A withType(String type) {
    this.type = type;
    return (A) this;
  }

  public Boolean hasType() {
    return this.type != null;
  }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1LimitRangeItemFluentImpl that = (V1LimitRangeItemFluentImpl) o;
    if (_default != null ? !_default.equals(that._default) : that._default != null) return false;
    if (defaultRequest != null
        ? !defaultRequest.equals(that.defaultRequest)
        : that.defaultRequest != null) return false;
    if (max != null ? !max.equals(that.max) : that.max != null) return false;
    if (maxLimitRequestRatio != null
        ? !maxLimitRequestRatio.equals(that.maxLimitRequestRatio)
        : that.maxLimitRequestRatio != null) return false;
    if (min != null ? !min.equals(that.min) : that.min != null) return false;
    if (type != null ? !type.equals(that.type) : that.type != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(
        _default, defaultRequest, max, maxLimitRequestRatio, min, type, super.hashCode());
  }

  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (_default != null && !_default.isEmpty()) {
      sb.append("_default:");
      sb.append(_default + ",");
    }
    if (defaultRequest != null && !defaultRequest.isEmpty()) {
      sb.append("defaultRequest:");
      sb.append(defaultRequest + ",");
    }
    if (max != null && !max.isEmpty()) {
      sb.append("max:");
      sb.append(max + ",");
    }
    if (maxLimitRequestRatio != null && !maxLimitRequestRatio.isEmpty()) {
      sb.append("maxLimitRequestRatio:");
      sb.append(maxLimitRequestRatio + ",");
    }
    if (min != null && !min.isEmpty()) {
      sb.append("min:");
      sb.append(min + ",");
    }
    if (type != null) {
      sb.append("type:");
      sb.append(type);
    }
    sb.append("}");
    return sb.toString();
  }
}
