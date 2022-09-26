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
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

/** Generated */
@SuppressWarnings(value = "unchecked")
public class V1WebhookConversionFluentImpl<A extends V1WebhookConversionFluent<A>>
    extends BaseFluent<A> implements V1WebhookConversionFluent<A> {
  public V1WebhookConversionFluentImpl() {}

  public V1WebhookConversionFluentImpl(V1WebhookConversion instance) {
    this.withClientConfig(instance.getClientConfig());

    this.withConversionReviewVersions(instance.getConversionReviewVersions());
  }

  private ApiextensionsV1WebhookClientConfigBuilder clientConfig;
  private List<String> conversionReviewVersions;

  /**
   * This method has been deprecated, please use method buildClientConfig instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public ApiextensionsV1WebhookClientConfig getClientConfig() {
    return this.clientConfig != null ? this.clientConfig.build() : null;
  }

  public ApiextensionsV1WebhookClientConfig buildClientConfig() {
    return this.clientConfig != null ? this.clientConfig.build() : null;
  }

  public A withClientConfig(ApiextensionsV1WebhookClientConfig clientConfig) {
    _visitables.get("clientConfig").remove(this.clientConfig);
    if (clientConfig != null) {
      this.clientConfig = new ApiextensionsV1WebhookClientConfigBuilder(clientConfig);
      _visitables.get("clientConfig").add(this.clientConfig);
    } else {
      this.clientConfig = null;
      _visitables.get("clientConfig").remove(this.clientConfig);
    }
    return (A) this;
  }

  public Boolean hasClientConfig() {
    return this.clientConfig != null;
  }

  public V1WebhookConversionFluent.ClientConfigNested<A> withNewClientConfig() {
    return new V1WebhookConversionFluentImpl.ClientConfigNestedImpl();
  }

  public V1WebhookConversionFluent.ClientConfigNested<A> withNewClientConfigLike(
      ApiextensionsV1WebhookClientConfig item) {
    return new V1WebhookConversionFluentImpl.ClientConfigNestedImpl(item);
  }

  public V1WebhookConversionFluent.ClientConfigNested<A> editClientConfig() {
    return withNewClientConfigLike(getClientConfig());
  }

  public V1WebhookConversionFluent.ClientConfigNested<A> editOrNewClientConfig() {
    return withNewClientConfigLike(
        getClientConfig() != null
            ? getClientConfig()
            : new ApiextensionsV1WebhookClientConfigBuilder().build());
  }

  public V1WebhookConversionFluent.ClientConfigNested<A> editOrNewClientConfigLike(
      ApiextensionsV1WebhookClientConfig item) {
    return withNewClientConfigLike(getClientConfig() != null ? getClientConfig() : item);
  }

  public A addToConversionReviewVersions(Integer index, String item) {
    if (this.conversionReviewVersions == null) {
      this.conversionReviewVersions = new ArrayList<String>();
    }
    this.conversionReviewVersions.add(index, item);
    return (A) this;
  }

  public A setToConversionReviewVersions(Integer index, String item) {
    if (this.conversionReviewVersions == null) {
      this.conversionReviewVersions = new ArrayList<String>();
    }
    this.conversionReviewVersions.set(index, item);
    return (A) this;
  }

  public A addToConversionReviewVersions(java.lang.String... items) {
    if (this.conversionReviewVersions == null) {
      this.conversionReviewVersions = new ArrayList<String>();
    }
    for (String item : items) {
      this.conversionReviewVersions.add(item);
    }
    return (A) this;
  }

  public A addAllToConversionReviewVersions(Collection<String> items) {
    if (this.conversionReviewVersions == null) {
      this.conversionReviewVersions = new ArrayList<String>();
    }
    for (String item : items) {
      this.conversionReviewVersions.add(item);
    }
    return (A) this;
  }

  public A removeFromConversionReviewVersions(java.lang.String... items) {
    for (String item : items) {
      if (this.conversionReviewVersions != null) {
        this.conversionReviewVersions.remove(item);
      }
    }
    return (A) this;
  }

  public A removeAllFromConversionReviewVersions(Collection<String> items) {
    for (String item : items) {
      if (this.conversionReviewVersions != null) {
        this.conversionReviewVersions.remove(item);
      }
    }
    return (A) this;
  }

  public List<String> getConversionReviewVersions() {
    return this.conversionReviewVersions;
  }

  public String getConversionReviewVersion(Integer index) {
    return this.conversionReviewVersions.get(index);
  }

  public String getFirstConversionReviewVersion() {
    return this.conversionReviewVersions.get(0);
  }

  public String getLastConversionReviewVersion() {
    return this.conversionReviewVersions.get(conversionReviewVersions.size() - 1);
  }

  public String getMatchingConversionReviewVersion(Predicate<String> predicate) {
    for (String item : conversionReviewVersions) {
      if (predicate.test(item)) {
        return item;
      }
    }
    return null;
  }

  public Boolean hasMatchingConversionReviewVersion(Predicate<String> predicate) {
    for (String item : conversionReviewVersions) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withConversionReviewVersions(List<String> conversionReviewVersions) {
    if (conversionReviewVersions != null) {
      this.conversionReviewVersions = new ArrayList();
      for (String item : conversionReviewVersions) {
        this.addToConversionReviewVersions(item);
      }
    } else {
      this.conversionReviewVersions = null;
    }
    return (A) this;
  }

  public A withConversionReviewVersions(java.lang.String... conversionReviewVersions) {
    if (this.conversionReviewVersions != null) {
      this.conversionReviewVersions.clear();
    }
    if (conversionReviewVersions != null) {
      for (String item : conversionReviewVersions) {
        this.addToConversionReviewVersions(item);
      }
    }
    return (A) this;
  }

  public Boolean hasConversionReviewVersions() {
    return conversionReviewVersions != null && !conversionReviewVersions.isEmpty();
  }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1WebhookConversionFluentImpl that = (V1WebhookConversionFluentImpl) o;
    if (clientConfig != null ? !clientConfig.equals(that.clientConfig) : that.clientConfig != null)
      return false;
    if (conversionReviewVersions != null
        ? !conversionReviewVersions.equals(that.conversionReviewVersions)
        : that.conversionReviewVersions != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(clientConfig, conversionReviewVersions, super.hashCode());
  }

  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (clientConfig != null) {
      sb.append("clientConfig:");
      sb.append(clientConfig + ",");
    }
    if (conversionReviewVersions != null && !conversionReviewVersions.isEmpty()) {
      sb.append("conversionReviewVersions:");
      sb.append(conversionReviewVersions);
    }
    sb.append("}");
    return sb.toString();
  }

  class ClientConfigNestedImpl<N>
      extends ApiextensionsV1WebhookClientConfigFluentImpl<
          V1WebhookConversionFluent.ClientConfigNested<N>>
      implements V1WebhookConversionFluent.ClientConfigNested<N>, Nested<N> {
    ClientConfigNestedImpl(ApiextensionsV1WebhookClientConfig item) {
      this.builder = new ApiextensionsV1WebhookClientConfigBuilder(this, item);
    }

    ClientConfigNestedImpl() {
      this.builder = new ApiextensionsV1WebhookClientConfigBuilder(this);
    }

    ApiextensionsV1WebhookClientConfigBuilder builder;

    public N and() {
      return (N) V1WebhookConversionFluentImpl.this.withClientConfig(builder.build());
    }

    public N endClientConfig() {
      return and();
    }
  }
}
