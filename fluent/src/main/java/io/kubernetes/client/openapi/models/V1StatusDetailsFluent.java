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
public interface V1StatusDetailsFluent<A extends V1StatusDetailsFluent<A>> extends Fluent<A> {
  public A addToCauses(Integer index, V1StatusCause item);

  public A setToCauses(Integer index, V1StatusCause item);

  public A addToCauses(io.kubernetes.client.openapi.models.V1StatusCause... items);

  public A addAllToCauses(Collection<V1StatusCause> items);

  public A removeFromCauses(io.kubernetes.client.openapi.models.V1StatusCause... items);

  public A removeAllFromCauses(Collection<V1StatusCause> items);

  public A removeMatchingFromCauses(Predicate<V1StatusCauseBuilder> predicate);

  /**
   * This method has been deprecated, please use method buildCauses instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public List<V1StatusCause> getCauses();

  public List<V1StatusCause> buildCauses();

  public V1StatusCause buildCause(Integer index);

  public V1StatusCause buildFirstCause();

  public V1StatusCause buildLastCause();

  public V1StatusCause buildMatchingCause(Predicate<V1StatusCauseBuilder> predicate);

  public Boolean hasMatchingCause(Predicate<V1StatusCauseBuilder> predicate);

  public A withCauses(List<V1StatusCause> causes);

  public A withCauses(io.kubernetes.client.openapi.models.V1StatusCause... causes);

  public Boolean hasCauses();

  public V1StatusDetailsFluent.CausesNested<A> addNewCause();

  public V1StatusDetailsFluent.CausesNested<A> addNewCauseLike(V1StatusCause item);

  public V1StatusDetailsFluent.CausesNested<A> setNewCauseLike(Integer index, V1StatusCause item);

  public V1StatusDetailsFluent.CausesNested<A> editCause(Integer index);

  public V1StatusDetailsFluent.CausesNested<A> editFirstCause();

  public V1StatusDetailsFluent.CausesNested<A> editLastCause();

  public V1StatusDetailsFluent.CausesNested<A> editMatchingCause(
      Predicate<V1StatusCauseBuilder> predicate);

  public String getGroup();

  public A withGroup(String group);

  public Boolean hasGroup();

  public String getKind();

  public A withKind(String kind);

  public Boolean hasKind();

  public String getName();

  public A withName(String name);

  public Boolean hasName();

  public Integer getRetryAfterSeconds();

  public A withRetryAfterSeconds(Integer retryAfterSeconds);

  public Boolean hasRetryAfterSeconds();

  public String getUid();

  public A withUid(String uid);

  public Boolean hasUid();

  public interface CausesNested<N>
      extends Nested<N>, V1StatusCauseFluent<V1StatusDetailsFluent.CausesNested<N>> {
    public N and();

    public N endCause();
  }
}
