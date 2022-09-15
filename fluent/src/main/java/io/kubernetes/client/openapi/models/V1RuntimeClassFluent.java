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

/** Generated */
public interface V1RuntimeClassFluent<A extends V1RuntimeClassFluent<A>> extends Fluent<A> {
  public String getApiVersion();

  public A withApiVersion(String apiVersion);

  public Boolean hasApiVersion();

  public String getHandler();

  public A withHandler(String handler);

  public Boolean hasHandler();

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

  public V1RuntimeClassFluent.MetadataNested<A> withNewMetadata();

  public V1RuntimeClassFluent.MetadataNested<A> withNewMetadataLike(V1ObjectMeta item);

  public V1RuntimeClassFluent.MetadataNested<A> editMetadata();

  public V1RuntimeClassFluent.MetadataNested<A> editOrNewMetadata();

  public V1RuntimeClassFluent.MetadataNested<A> editOrNewMetadataLike(V1ObjectMeta item);

  /**
   * This method has been deprecated, please use method buildOverhead instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V1Overhead getOverhead();

  public V1Overhead buildOverhead();

  public A withOverhead(V1Overhead overhead);

  public Boolean hasOverhead();

  public V1RuntimeClassFluent.OverheadNested<A> withNewOverhead();

  public V1RuntimeClassFluent.OverheadNested<A> withNewOverheadLike(V1Overhead item);

  public V1RuntimeClassFluent.OverheadNested<A> editOverhead();

  public V1RuntimeClassFluent.OverheadNested<A> editOrNewOverhead();

  public V1RuntimeClassFluent.OverheadNested<A> editOrNewOverheadLike(V1Overhead item);

  /**
   * This method has been deprecated, please use method buildScheduling instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V1Scheduling getScheduling();

  public V1Scheduling buildScheduling();

  public A withScheduling(V1Scheduling scheduling);

  public Boolean hasScheduling();

  public V1RuntimeClassFluent.SchedulingNested<A> withNewScheduling();

  public V1RuntimeClassFluent.SchedulingNested<A> withNewSchedulingLike(V1Scheduling item);

  public V1RuntimeClassFluent.SchedulingNested<A> editScheduling();

  public V1RuntimeClassFluent.SchedulingNested<A> editOrNewScheduling();

  public V1RuntimeClassFluent.SchedulingNested<A> editOrNewSchedulingLike(V1Scheduling item);

  public interface MetadataNested<N>
      extends Nested<N>, V1ObjectMetaFluent<V1RuntimeClassFluent.MetadataNested<N>> {
    public N and();

    public N endMetadata();
  }

  public interface OverheadNested<N>
      extends Nested<N>, V1OverheadFluent<V1RuntimeClassFluent.OverheadNested<N>> {
    public N and();

    public N endOverhead();
  }

  public interface SchedulingNested<N>
      extends Nested<N>, V1SchedulingFluent<V1RuntimeClassFluent.SchedulingNested<N>> {
    public N and();

    public N endScheduling();
  }
}
