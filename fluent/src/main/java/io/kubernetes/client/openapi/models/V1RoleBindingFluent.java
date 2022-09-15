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
public interface V1RoleBindingFluent<A extends V1RoleBindingFluent<A>> extends Fluent<A> {
  public String getApiVersion();

  public A withApiVersion(String apiVersion);

  public Boolean hasApiVersion();

  public String getKind();

  public A withKind(String kind);

  public Boolean hasKind();

  /**
   * This method has been deprecated, please use method buildMetadata instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V1ObjectMeta getMetadata();

  public V1ObjectMeta buildMetadata();

  public A withMetadata(V1ObjectMeta metadata);

  public Boolean hasMetadata();

  public V1RoleBindingFluent.MetadataNested<A> withNewMetadata();

  public V1RoleBindingFluent.MetadataNested<A> withNewMetadataLike(V1ObjectMeta item);

  public V1RoleBindingFluent.MetadataNested<A> editMetadata();

  public V1RoleBindingFluent.MetadataNested<A> editOrNewMetadata();

  public V1RoleBindingFluent.MetadataNested<A> editOrNewMetadataLike(V1ObjectMeta item);

  /**
   * This method has been deprecated, please use method buildRoleRef instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V1RoleRef getRoleRef();

  public V1RoleRef buildRoleRef();

  public A withRoleRef(V1RoleRef roleRef);

  public Boolean hasRoleRef();

  public V1RoleBindingFluent.RoleRefNested<A> withNewRoleRef();

  public V1RoleBindingFluent.RoleRefNested<A> withNewRoleRefLike(V1RoleRef item);

  public V1RoleBindingFluent.RoleRefNested<A> editRoleRef();

  public V1RoleBindingFluent.RoleRefNested<A> editOrNewRoleRef();

  public V1RoleBindingFluent.RoleRefNested<A> editOrNewRoleRefLike(V1RoleRef item);

  public A addToSubjects(Integer index, V1Subject item);

  public A setToSubjects(Integer index, V1Subject item);

  public A addToSubjects(io.kubernetes.client.openapi.models.V1Subject... items);

  public A addAllToSubjects(Collection<V1Subject> items);

  public A removeFromSubjects(io.kubernetes.client.openapi.models.V1Subject... items);

  public A removeAllFromSubjects(Collection<V1Subject> items);

  public A removeMatchingFromSubjects(Predicate<V1SubjectBuilder> predicate);

  /**
   * This method has been deprecated, please use method buildSubjects instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public List<V1Subject> getSubjects();

  public List<V1Subject> buildSubjects();

  public V1Subject buildSubject(Integer index);

  public V1Subject buildFirstSubject();

  public V1Subject buildLastSubject();

  public V1Subject buildMatchingSubject(Predicate<V1SubjectBuilder> predicate);

  public Boolean hasMatchingSubject(Predicate<V1SubjectBuilder> predicate);

  public A withSubjects(List<V1Subject> subjects);

  public A withSubjects(io.kubernetes.client.openapi.models.V1Subject... subjects);

  public Boolean hasSubjects();

  public V1RoleBindingFluent.SubjectsNested<A> addNewSubject();

  public V1RoleBindingFluent.SubjectsNested<A> addNewSubjectLike(V1Subject item);

  public V1RoleBindingFluent.SubjectsNested<A> setNewSubjectLike(Integer index, V1Subject item);

  public V1RoleBindingFluent.SubjectsNested<A> editSubject(Integer index);

  public V1RoleBindingFluent.SubjectsNested<A> editFirstSubject();

  public V1RoleBindingFluent.SubjectsNested<A> editLastSubject();

  public V1RoleBindingFluent.SubjectsNested<A> editMatchingSubject(
      Predicate<V1SubjectBuilder> predicate);

  public interface MetadataNested<N>
      extends Nested<N>, V1ObjectMetaFluent<V1RoleBindingFluent.MetadataNested<N>> {
    public N and();

    public N endMetadata();
  }

  public interface RoleRefNested<N>
      extends Nested<N>, V1RoleRefFluent<V1RoleBindingFluent.RoleRefNested<N>> {
    public N and();

    public N endRoleRef();
  }

  public interface SubjectsNested<N>
      extends Nested<N>, V1SubjectFluent<V1RoleBindingFluent.SubjectsNested<N>> {
    public N and();

    public N endSubject();
  }
}
