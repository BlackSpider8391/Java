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
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

/** Generated */
@SuppressWarnings(value = "unchecked")
public class V1ResourceRuleFluentImpl<A extends V1ResourceRuleFluent<A>> extends BaseFluent<A>
    implements V1ResourceRuleFluent<A> {
  public V1ResourceRuleFluentImpl() {}

  public V1ResourceRuleFluentImpl(V1ResourceRule instance) {
    this.withApiGroups(instance.getApiGroups());

    this.withResourceNames(instance.getResourceNames());

    this.withResources(instance.getResources());

    this.withVerbs(instance.getVerbs());
  }

  private List<String> apiGroups;
  private List<String> resourceNames;
  private List<String> resources;
  private List<String> verbs;

  public A addToApiGroups(Integer index, String item) {
    if (this.apiGroups == null) {
      this.apiGroups = new ArrayList<String>();
    }
    this.apiGroups.add(index, item);
    return (A) this;
  }

  public A setToApiGroups(Integer index, String item) {
    if (this.apiGroups == null) {
      this.apiGroups = new ArrayList<String>();
    }
    this.apiGroups.set(index, item);
    return (A) this;
  }

  public A addToApiGroups(java.lang.String... items) {
    if (this.apiGroups == null) {
      this.apiGroups = new ArrayList<String>();
    }
    for (String item : items) {
      this.apiGroups.add(item);
    }
    return (A) this;
  }

  public A addAllToApiGroups(Collection<String> items) {
    if (this.apiGroups == null) {
      this.apiGroups = new ArrayList<String>();
    }
    for (String item : items) {
      this.apiGroups.add(item);
    }
    return (A) this;
  }

  public A removeFromApiGroups(java.lang.String... items) {
    for (String item : items) {
      if (this.apiGroups != null) {
        this.apiGroups.remove(item);
      }
    }
    return (A) this;
  }

  public A removeAllFromApiGroups(Collection<String> items) {
    for (String item : items) {
      if (this.apiGroups != null) {
        this.apiGroups.remove(item);
      }
    }
    return (A) this;
  }

  public List<String> getApiGroups() {
    return this.apiGroups;
  }

  public String getApiGroup(Integer index) {
    return this.apiGroups.get(index);
  }

  public String getFirstApiGroup() {
    return this.apiGroups.get(0);
  }

  public String getLastApiGroup() {
    return this.apiGroups.get(apiGroups.size() - 1);
  }

  public String getMatchingApiGroup(Predicate<String> predicate) {
    for (String item : apiGroups) {
      if (predicate.test(item)) {
        return item;
      }
    }
    return null;
  }

  public Boolean hasMatchingApiGroup(Predicate<String> predicate) {
    for (String item : apiGroups) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withApiGroups(List<String> apiGroups) {
    if (apiGroups != null) {
      this.apiGroups = new ArrayList();
      for (String item : apiGroups) {
        this.addToApiGroups(item);
      }
    } else {
      this.apiGroups = null;
    }
    return (A) this;
  }

  public A withApiGroups(java.lang.String... apiGroups) {
    if (this.apiGroups != null) {
      this.apiGroups.clear();
    }
    if (apiGroups != null) {
      for (String item : apiGroups) {
        this.addToApiGroups(item);
      }
    }
    return (A) this;
  }

  public Boolean hasApiGroups() {
    return apiGroups != null && !apiGroups.isEmpty();
  }

  public A addToResourceNames(Integer index, String item) {
    if (this.resourceNames == null) {
      this.resourceNames = new ArrayList<String>();
    }
    this.resourceNames.add(index, item);
    return (A) this;
  }

  public A setToResourceNames(Integer index, String item) {
    if (this.resourceNames == null) {
      this.resourceNames = new ArrayList<String>();
    }
    this.resourceNames.set(index, item);
    return (A) this;
  }

  public A addToResourceNames(java.lang.String... items) {
    if (this.resourceNames == null) {
      this.resourceNames = new ArrayList<String>();
    }
    for (String item : items) {
      this.resourceNames.add(item);
    }
    return (A) this;
  }

  public A addAllToResourceNames(Collection<String> items) {
    if (this.resourceNames == null) {
      this.resourceNames = new ArrayList<String>();
    }
    for (String item : items) {
      this.resourceNames.add(item);
    }
    return (A) this;
  }

  public A removeFromResourceNames(java.lang.String... items) {
    for (String item : items) {
      if (this.resourceNames != null) {
        this.resourceNames.remove(item);
      }
    }
    return (A) this;
  }

  public A removeAllFromResourceNames(Collection<String> items) {
    for (String item : items) {
      if (this.resourceNames != null) {
        this.resourceNames.remove(item);
      }
    }
    return (A) this;
  }

  public List<String> getResourceNames() {
    return this.resourceNames;
  }

  public String getResourceName(Integer index) {
    return this.resourceNames.get(index);
  }

  public String getFirstResourceName() {
    return this.resourceNames.get(0);
  }

  public String getLastResourceName() {
    return this.resourceNames.get(resourceNames.size() - 1);
  }

  public String getMatchingResourceName(Predicate<String> predicate) {
    for (String item : resourceNames) {
      if (predicate.test(item)) {
        return item;
      }
    }
    return null;
  }

  public Boolean hasMatchingResourceName(Predicate<String> predicate) {
    for (String item : resourceNames) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withResourceNames(List<String> resourceNames) {
    if (resourceNames != null) {
      this.resourceNames = new ArrayList();
      for (String item : resourceNames) {
        this.addToResourceNames(item);
      }
    } else {
      this.resourceNames = null;
    }
    return (A) this;
  }

  public A withResourceNames(java.lang.String... resourceNames) {
    if (this.resourceNames != null) {
      this.resourceNames.clear();
    }
    if (resourceNames != null) {
      for (String item : resourceNames) {
        this.addToResourceNames(item);
      }
    }
    return (A) this;
  }

  public Boolean hasResourceNames() {
    return resourceNames != null && !resourceNames.isEmpty();
  }

  public A addToResources(Integer index, String item) {
    if (this.resources == null) {
      this.resources = new ArrayList<String>();
    }
    this.resources.add(index, item);
    return (A) this;
  }

  public A setToResources(Integer index, String item) {
    if (this.resources == null) {
      this.resources = new ArrayList<String>();
    }
    this.resources.set(index, item);
    return (A) this;
  }

  public A addToResources(java.lang.String... items) {
    if (this.resources == null) {
      this.resources = new ArrayList<String>();
    }
    for (String item : items) {
      this.resources.add(item);
    }
    return (A) this;
  }

  public A addAllToResources(Collection<String> items) {
    if (this.resources == null) {
      this.resources = new ArrayList<String>();
    }
    for (String item : items) {
      this.resources.add(item);
    }
    return (A) this;
  }

  public A removeFromResources(java.lang.String... items) {
    for (String item : items) {
      if (this.resources != null) {
        this.resources.remove(item);
      }
    }
    return (A) this;
  }

  public A removeAllFromResources(Collection<String> items) {
    for (String item : items) {
      if (this.resources != null) {
        this.resources.remove(item);
      }
    }
    return (A) this;
  }

  public List<String> getResources() {
    return this.resources;
  }

  public String getResource(Integer index) {
    return this.resources.get(index);
  }

  public String getFirstResource() {
    return this.resources.get(0);
  }

  public String getLastResource() {
    return this.resources.get(resources.size() - 1);
  }

  public String getMatchingResource(Predicate<String> predicate) {
    for (String item : resources) {
      if (predicate.test(item)) {
        return item;
      }
    }
    return null;
  }

  public Boolean hasMatchingResource(Predicate<String> predicate) {
    for (String item : resources) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withResources(List<String> resources) {
    if (resources != null) {
      this.resources = new ArrayList();
      for (String item : resources) {
        this.addToResources(item);
      }
    } else {
      this.resources = null;
    }
    return (A) this;
  }

  public A withResources(java.lang.String... resources) {
    if (this.resources != null) {
      this.resources.clear();
    }
    if (resources != null) {
      for (String item : resources) {
        this.addToResources(item);
      }
    }
    return (A) this;
  }

  public Boolean hasResources() {
    return resources != null && !resources.isEmpty();
  }

  public A addToVerbs(Integer index, String item) {
    if (this.verbs == null) {
      this.verbs = new ArrayList<String>();
    }
    this.verbs.add(index, item);
    return (A) this;
  }

  public A setToVerbs(Integer index, String item) {
    if (this.verbs == null) {
      this.verbs = new ArrayList<String>();
    }
    this.verbs.set(index, item);
    return (A) this;
  }

  public A addToVerbs(java.lang.String... items) {
    if (this.verbs == null) {
      this.verbs = new ArrayList<String>();
    }
    for (String item : items) {
      this.verbs.add(item);
    }
    return (A) this;
  }

  public A addAllToVerbs(Collection<String> items) {
    if (this.verbs == null) {
      this.verbs = new ArrayList<String>();
    }
    for (String item : items) {
      this.verbs.add(item);
    }
    return (A) this;
  }

  public A removeFromVerbs(java.lang.String... items) {
    for (String item : items) {
      if (this.verbs != null) {
        this.verbs.remove(item);
      }
    }
    return (A) this;
  }

  public A removeAllFromVerbs(Collection<String> items) {
    for (String item : items) {
      if (this.verbs != null) {
        this.verbs.remove(item);
      }
    }
    return (A) this;
  }

  public List<String> getVerbs() {
    return this.verbs;
  }

  public String getVerb(Integer index) {
    return this.verbs.get(index);
  }

  public String getFirstVerb() {
    return this.verbs.get(0);
  }

  public String getLastVerb() {
    return this.verbs.get(verbs.size() - 1);
  }

  public String getMatchingVerb(Predicate<String> predicate) {
    for (String item : verbs) {
      if (predicate.test(item)) {
        return item;
      }
    }
    return null;
  }

  public Boolean hasMatchingVerb(Predicate<String> predicate) {
    for (String item : verbs) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withVerbs(List<String> verbs) {
    if (verbs != null) {
      this.verbs = new ArrayList();
      for (String item : verbs) {
        this.addToVerbs(item);
      }
    } else {
      this.verbs = null;
    }
    return (A) this;
  }

  public A withVerbs(java.lang.String... verbs) {
    if (this.verbs != null) {
      this.verbs.clear();
    }
    if (verbs != null) {
      for (String item : verbs) {
        this.addToVerbs(item);
      }
    }
    return (A) this;
  }

  public Boolean hasVerbs() {
    return verbs != null && !verbs.isEmpty();
  }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1ResourceRuleFluentImpl that = (V1ResourceRuleFluentImpl) o;
    if (apiGroups != null ? !apiGroups.equals(that.apiGroups) : that.apiGroups != null)
      return false;
    if (resourceNames != null
        ? !resourceNames.equals(that.resourceNames)
        : that.resourceNames != null) return false;
    if (resources != null ? !resources.equals(that.resources) : that.resources != null)
      return false;
    if (verbs != null ? !verbs.equals(that.verbs) : that.verbs != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(apiGroups, resourceNames, resources, verbs, super.hashCode());
  }

  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (apiGroups != null && !apiGroups.isEmpty()) {
      sb.append("apiGroups:");
      sb.append(apiGroups + ",");
    }
    if (resourceNames != null && !resourceNames.isEmpty()) {
      sb.append("resourceNames:");
      sb.append(resourceNames + ",");
    }
    if (resources != null && !resources.isEmpty()) {
      sb.append("resources:");
      sb.append(resources + ",");
    }
    if (verbs != null && !verbs.isEmpty()) {
      sb.append("verbs:");
      sb.append(verbs);
    }
    sb.append("}");
    return sb.toString();
  }
}
