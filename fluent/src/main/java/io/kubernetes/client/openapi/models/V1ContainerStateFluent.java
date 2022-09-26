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
public interface V1ContainerStateFluent<A extends V1ContainerStateFluent<A>> extends Fluent<A> {

  /**
   * This method has been deprecated, please use method buildRunning instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V1ContainerStateRunning getRunning();

  public V1ContainerStateRunning buildRunning();

  public A withRunning(V1ContainerStateRunning running);

  public Boolean hasRunning();

  public V1ContainerStateFluent.RunningNested<A> withNewRunning();

  public V1ContainerStateFluent.RunningNested<A> withNewRunningLike(V1ContainerStateRunning item);

  public V1ContainerStateFluent.RunningNested<A> editRunning();

  public V1ContainerStateFluent.RunningNested<A> editOrNewRunning();

  public V1ContainerStateFluent.RunningNested<A> editOrNewRunningLike(V1ContainerStateRunning item);

  /**
   * This method has been deprecated, please use method buildTerminated instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V1ContainerStateTerminated getTerminated();

  public V1ContainerStateTerminated buildTerminated();

  public A withTerminated(V1ContainerStateTerminated terminated);

  public Boolean hasTerminated();

  public V1ContainerStateFluent.TerminatedNested<A> withNewTerminated();

  public V1ContainerStateFluent.TerminatedNested<A> withNewTerminatedLike(
      V1ContainerStateTerminated item);

  public V1ContainerStateFluent.TerminatedNested<A> editTerminated();

  public V1ContainerStateFluent.TerminatedNested<A> editOrNewTerminated();

  public V1ContainerStateFluent.TerminatedNested<A> editOrNewTerminatedLike(
      V1ContainerStateTerminated item);

  /**
   * This method has been deprecated, please use method buildWaiting instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V1ContainerStateWaiting getWaiting();

  public V1ContainerStateWaiting buildWaiting();

  public A withWaiting(V1ContainerStateWaiting waiting);

  public Boolean hasWaiting();

  public V1ContainerStateFluent.WaitingNested<A> withNewWaiting();

  public V1ContainerStateFluent.WaitingNested<A> withNewWaitingLike(V1ContainerStateWaiting item);

  public V1ContainerStateFluent.WaitingNested<A> editWaiting();

  public V1ContainerStateFluent.WaitingNested<A> editOrNewWaiting();

  public V1ContainerStateFluent.WaitingNested<A> editOrNewWaitingLike(V1ContainerStateWaiting item);

  public interface RunningNested<N>
      extends Nested<N>, V1ContainerStateRunningFluent<V1ContainerStateFluent.RunningNested<N>> {
    public N and();

    public N endRunning();
  }

  public interface TerminatedNested<N>
      extends Nested<N>,
          V1ContainerStateTerminatedFluent<V1ContainerStateFluent.TerminatedNested<N>> {
    public N and();

    public N endTerminated();
  }

  public interface WaitingNested<N>
      extends Nested<N>, V1ContainerStateWaitingFluent<V1ContainerStateFluent.WaitingNested<N>> {
    public N and();

    public N endWaiting();
  }
}
