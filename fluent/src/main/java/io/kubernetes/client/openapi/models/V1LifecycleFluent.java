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
public interface V1LifecycleFluent<A extends V1LifecycleFluent<A>> extends Fluent<A> {

  /**
   * This method has been deprecated, please use method buildPostStart instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V1LifecycleHandler getPostStart();

  public V1LifecycleHandler buildPostStart();

  public A withPostStart(V1LifecycleHandler postStart);

  public Boolean hasPostStart();

  public V1LifecycleFluent.PostStartNested<A> withNewPostStart();

  public V1LifecycleFluent.PostStartNested<A> withNewPostStartLike(V1LifecycleHandler item);

  public V1LifecycleFluent.PostStartNested<A> editPostStart();

  public V1LifecycleFluent.PostStartNested<A> editOrNewPostStart();

  public V1LifecycleFluent.PostStartNested<A> editOrNewPostStartLike(V1LifecycleHandler item);

  /**
   * This method has been deprecated, please use method buildPreStop instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V1LifecycleHandler getPreStop();

  public V1LifecycleHandler buildPreStop();

  public A withPreStop(V1LifecycleHandler preStop);

  public Boolean hasPreStop();

  public V1LifecycleFluent.PreStopNested<A> withNewPreStop();

  public V1LifecycleFluent.PreStopNested<A> withNewPreStopLike(V1LifecycleHandler item);

  public V1LifecycleFluent.PreStopNested<A> editPreStop();

  public V1LifecycleFluent.PreStopNested<A> editOrNewPreStop();

  public V1LifecycleFluent.PreStopNested<A> editOrNewPreStopLike(V1LifecycleHandler item);

  public interface PostStartNested<N>
      extends Nested<N>, V1LifecycleHandlerFluent<V1LifecycleFluent.PostStartNested<N>> {
    public N and();

    public N endPostStart();
  }

  public interface PreStopNested<N>
      extends Nested<N>, V1LifecycleHandlerFluent<V1LifecycleFluent.PreStopNested<N>> {
    public N and();

    public N endPreStop();
  }
}
