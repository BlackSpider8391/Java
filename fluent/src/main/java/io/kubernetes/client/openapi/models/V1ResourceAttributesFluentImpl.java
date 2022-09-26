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
public class V1ResourceAttributesFluentImpl<A extends V1ResourceAttributesFluent<A>>
    extends BaseFluent<A> implements V1ResourceAttributesFluent<A> {
  public V1ResourceAttributesFluentImpl() {}

  public V1ResourceAttributesFluentImpl(V1ResourceAttributes instance) {
    this.withGroup(instance.getGroup());

    this.withName(instance.getName());

    this.withNamespace(instance.getNamespace());

    this.withResource(instance.getResource());

    this.withSubresource(instance.getSubresource());

    this.withVerb(instance.getVerb());

    this.withVersion(instance.getVersion());
  }

  private String group;
  private String name;
  private String namespace;
  private String resource;
  private String subresource;
  private String verb;
  private String version;

  public String getGroup() {
    return this.group;
  }

  public A withGroup(String group) {
    this.group = group;
    return (A) this;
  }

  public Boolean hasGroup() {
    return this.group != null;
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

  public String getNamespace() {
    return this.namespace;
  }

  public A withNamespace(String namespace) {
    this.namespace = namespace;
    return (A) this;
  }

  public Boolean hasNamespace() {
    return this.namespace != null;
  }

  public String getResource() {
    return this.resource;
  }

  public A withResource(String resource) {
    this.resource = resource;
    return (A) this;
  }

  public Boolean hasResource() {
    return this.resource != null;
  }

  public String getSubresource() {
    return this.subresource;
  }

  public A withSubresource(String subresource) {
    this.subresource = subresource;
    return (A) this;
  }

  public Boolean hasSubresource() {
    return this.subresource != null;
  }

  public String getVerb() {
    return this.verb;
  }

  public A withVerb(String verb) {
    this.verb = verb;
    return (A) this;
  }

  public Boolean hasVerb() {
    return this.verb != null;
  }

  public String getVersion() {
    return this.version;
  }

  public A withVersion(String version) {
    this.version = version;
    return (A) this;
  }

  public Boolean hasVersion() {
    return this.version != null;
  }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1ResourceAttributesFluentImpl that = (V1ResourceAttributesFluentImpl) o;
    if (group != null ? !group.equals(that.group) : that.group != null) return false;
    if (name != null ? !name.equals(that.name) : that.name != null) return false;
    if (namespace != null ? !namespace.equals(that.namespace) : that.namespace != null)
      return false;
    if (resource != null ? !resource.equals(that.resource) : that.resource != null) return false;
    if (subresource != null ? !subresource.equals(that.subresource) : that.subresource != null)
      return false;
    if (verb != null ? !verb.equals(that.verb) : that.verb != null) return false;
    if (version != null ? !version.equals(that.version) : that.version != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(
        group, name, namespace, resource, subresource, verb, version, super.hashCode());
  }

  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (group != null) {
      sb.append("group:");
      sb.append(group + ",");
    }
    if (name != null) {
      sb.append("name:");
      sb.append(name + ",");
    }
    if (namespace != null) {
      sb.append("namespace:");
      sb.append(namespace + ",");
    }
    if (resource != null) {
      sb.append("resource:");
      sb.append(resource + ",");
    }
    if (subresource != null) {
      sb.append("subresource:");
      sb.append(subresource + ",");
    }
    if (verb != null) {
      sb.append("verb:");
      sb.append(verb + ",");
    }
    if (version != null) {
      sb.append("version:");
      sb.append(version);
    }
    sb.append("}");
    return sb.toString();
  }
}
