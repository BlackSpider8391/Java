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
public class V1CephFSVolumeSourceFluentImpl<A extends V1CephFSVolumeSourceFluent<A>>
    extends BaseFluent<A> implements V1CephFSVolumeSourceFluent<A> {
  public V1CephFSVolumeSourceFluentImpl() {}

  public V1CephFSVolumeSourceFluentImpl(V1CephFSVolumeSource instance) {
    this.withMonitors(instance.getMonitors());

    this.withPath(instance.getPath());

    this.withReadOnly(instance.getReadOnly());

    this.withSecretFile(instance.getSecretFile());

    this.withSecretRef(instance.getSecretRef());

    this.withUser(instance.getUser());
  }

  private List<String> monitors;
  private String path;
  private Boolean readOnly;
  private String secretFile;
  private V1LocalObjectReferenceBuilder secretRef;
  private String user;

  public A addToMonitors(Integer index, String item) {
    if (this.monitors == null) {
      this.monitors = new ArrayList<String>();
    }
    this.monitors.add(index, item);
    return (A) this;
  }

  public A setToMonitors(Integer index, String item) {
    if (this.monitors == null) {
      this.monitors = new ArrayList<String>();
    }
    this.monitors.set(index, item);
    return (A) this;
  }

  public A addToMonitors(java.lang.String... items) {
    if (this.monitors == null) {
      this.monitors = new ArrayList<String>();
    }
    for (String item : items) {
      this.monitors.add(item);
    }
    return (A) this;
  }

  public A addAllToMonitors(Collection<String> items) {
    if (this.monitors == null) {
      this.monitors = new ArrayList<String>();
    }
    for (String item : items) {
      this.monitors.add(item);
    }
    return (A) this;
  }

  public A removeFromMonitors(java.lang.String... items) {
    for (String item : items) {
      if (this.monitors != null) {
        this.monitors.remove(item);
      }
    }
    return (A) this;
  }

  public A removeAllFromMonitors(Collection<String> items) {
    for (String item : items) {
      if (this.monitors != null) {
        this.monitors.remove(item);
      }
    }
    return (A) this;
  }

  public List<String> getMonitors() {
    return this.monitors;
  }

  public String getMonitor(Integer index) {
    return this.monitors.get(index);
  }

  public String getFirstMonitor() {
    return this.monitors.get(0);
  }

  public String getLastMonitor() {
    return this.monitors.get(monitors.size() - 1);
  }

  public String getMatchingMonitor(Predicate<String> predicate) {
    for (String item : monitors) {
      if (predicate.test(item)) {
        return item;
      }
    }
    return null;
  }

  public Boolean hasMatchingMonitor(Predicate<String> predicate) {
    for (String item : monitors) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withMonitors(List<String> monitors) {
    if (monitors != null) {
      this.monitors = new ArrayList();
      for (String item : monitors) {
        this.addToMonitors(item);
      }
    } else {
      this.monitors = null;
    }
    return (A) this;
  }

  public A withMonitors(java.lang.String... monitors) {
    if (this.monitors != null) {
      this.monitors.clear();
    }
    if (monitors != null) {
      for (String item : monitors) {
        this.addToMonitors(item);
      }
    }
    return (A) this;
  }

  public Boolean hasMonitors() {
    return monitors != null && !monitors.isEmpty();
  }

  public String getPath() {
    return this.path;
  }

  public A withPath(String path) {
    this.path = path;
    return (A) this;
  }

  public Boolean hasPath() {
    return this.path != null;
  }

  public Boolean getReadOnly() {
    return this.readOnly;
  }

  public A withReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return (A) this;
  }

  public Boolean hasReadOnly() {
    return this.readOnly != null;
  }

  public String getSecretFile() {
    return this.secretFile;
  }

  public A withSecretFile(String secretFile) {
    this.secretFile = secretFile;
    return (A) this;
  }

  public Boolean hasSecretFile() {
    return this.secretFile != null;
  }

  /**
   * This method has been deprecated, please use method buildSecretRef instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V1LocalObjectReference getSecretRef() {
    return this.secretRef != null ? this.secretRef.build() : null;
  }

  public V1LocalObjectReference buildSecretRef() {
    return this.secretRef != null ? this.secretRef.build() : null;
  }

  public A withSecretRef(V1LocalObjectReference secretRef) {
    _visitables.get("secretRef").remove(this.secretRef);
    if (secretRef != null) {
      this.secretRef = new V1LocalObjectReferenceBuilder(secretRef);
      _visitables.get("secretRef").add(this.secretRef);
    } else {
      this.secretRef = null;
      _visitables.get("secretRef").remove(this.secretRef);
    }
    return (A) this;
  }

  public Boolean hasSecretRef() {
    return this.secretRef != null;
  }

  public V1CephFSVolumeSourceFluent.SecretRefNested<A> withNewSecretRef() {
    return new V1CephFSVolumeSourceFluentImpl.SecretRefNestedImpl();
  }

  public V1CephFSVolumeSourceFluent.SecretRefNested<A> withNewSecretRefLike(
      V1LocalObjectReference item) {
    return new V1CephFSVolumeSourceFluentImpl.SecretRefNestedImpl(item);
  }

  public V1CephFSVolumeSourceFluent.SecretRefNested<A> editSecretRef() {
    return withNewSecretRefLike(getSecretRef());
  }

  public V1CephFSVolumeSourceFluent.SecretRefNested<A> editOrNewSecretRef() {
    return withNewSecretRefLike(
        getSecretRef() != null ? getSecretRef() : new V1LocalObjectReferenceBuilder().build());
  }

  public V1CephFSVolumeSourceFluent.SecretRefNested<A> editOrNewSecretRefLike(
      V1LocalObjectReference item) {
    return withNewSecretRefLike(getSecretRef() != null ? getSecretRef() : item);
  }

  public String getUser() {
    return this.user;
  }

  public A withUser(String user) {
    this.user = user;
    return (A) this;
  }

  public Boolean hasUser() {
    return this.user != null;
  }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1CephFSVolumeSourceFluentImpl that = (V1CephFSVolumeSourceFluentImpl) o;
    if (monitors != null ? !monitors.equals(that.monitors) : that.monitors != null) return false;
    if (path != null ? !path.equals(that.path) : that.path != null) return false;
    if (readOnly != null ? !readOnly.equals(that.readOnly) : that.readOnly != null) return false;
    if (secretFile != null ? !secretFile.equals(that.secretFile) : that.secretFile != null)
      return false;
    if (secretRef != null ? !secretRef.equals(that.secretRef) : that.secretRef != null)
      return false;
    if (user != null ? !user.equals(that.user) : that.user != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(
        monitors, path, readOnly, secretFile, secretRef, user, super.hashCode());
  }

  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (monitors != null && !monitors.isEmpty()) {
      sb.append("monitors:");
      sb.append(monitors + ",");
    }
    if (path != null) {
      sb.append("path:");
      sb.append(path + ",");
    }
    if (readOnly != null) {
      sb.append("readOnly:");
      sb.append(readOnly + ",");
    }
    if (secretFile != null) {
      sb.append("secretFile:");
      sb.append(secretFile + ",");
    }
    if (secretRef != null) {
      sb.append("secretRef:");
      sb.append(secretRef + ",");
    }
    if (user != null) {
      sb.append("user:");
      sb.append(user);
    }
    sb.append("}");
    return sb.toString();
  }

  public A withReadOnly() {
    return withReadOnly(true);
  }

  class SecretRefNestedImpl<N>
      extends V1LocalObjectReferenceFluentImpl<V1CephFSVolumeSourceFluent.SecretRefNested<N>>
      implements V1CephFSVolumeSourceFluent.SecretRefNested<N>, Nested<N> {
    SecretRefNestedImpl(V1LocalObjectReference item) {
      this.builder = new V1LocalObjectReferenceBuilder(this, item);
    }

    SecretRefNestedImpl() {
      this.builder = new V1LocalObjectReferenceBuilder(this);
    }

    V1LocalObjectReferenceBuilder builder;

    public N and() {
      return (N) V1CephFSVolumeSourceFluentImpl.this.withSecretRef(builder.build());
    }

    public N endSecretRef() {
      return and();
    }
  }
}
