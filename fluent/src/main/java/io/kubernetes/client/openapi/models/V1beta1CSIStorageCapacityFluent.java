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
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;

/** Generated */
public interface V1beta1CSIStorageCapacityFluent<A extends V1beta1CSIStorageCapacityFluent<A>>
    extends Fluent<A> {
  public String getApiVersion();

  public A withApiVersion(String apiVersion);

  public Boolean hasApiVersion();

  public Quantity getCapacity();

  public A withCapacity(Quantity capacity);

  public Boolean hasCapacity();

  public A withNewCapacity(String value);

  public String getKind();

  public A withKind(String kind);

  public Boolean hasKind();

  public Quantity getMaximumVolumeSize();

  public A withMaximumVolumeSize(Quantity maximumVolumeSize);

  public Boolean hasMaximumVolumeSize();

  public A withNewMaximumVolumeSize(String value);

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

  public V1beta1CSIStorageCapacityFluent.MetadataNested<A> withNewMetadata();

  public V1beta1CSIStorageCapacityFluent.MetadataNested<A> withNewMetadataLike(V1ObjectMeta item);

  public V1beta1CSIStorageCapacityFluent.MetadataNested<A> editMetadata();

  public V1beta1CSIStorageCapacityFluent.MetadataNested<A> editOrNewMetadata();

  public V1beta1CSIStorageCapacityFluent.MetadataNested<A> editOrNewMetadataLike(V1ObjectMeta item);

  /**
   * This method has been deprecated, please use method buildNodeTopology instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V1LabelSelector getNodeTopology();

  public V1LabelSelector buildNodeTopology();

  public A withNodeTopology(V1LabelSelector nodeTopology);

  public Boolean hasNodeTopology();

  public V1beta1CSIStorageCapacityFluent.NodeTopologyNested<A> withNewNodeTopology();

  public V1beta1CSIStorageCapacityFluent.NodeTopologyNested<A> withNewNodeTopologyLike(
      V1LabelSelector item);

  public V1beta1CSIStorageCapacityFluent.NodeTopologyNested<A> editNodeTopology();

  public V1beta1CSIStorageCapacityFluent.NodeTopologyNested<A> editOrNewNodeTopology();

  public V1beta1CSIStorageCapacityFluent.NodeTopologyNested<A> editOrNewNodeTopologyLike(
      V1LabelSelector item);

  public String getStorageClassName();

  public A withStorageClassName(String storageClassName);

  public Boolean hasStorageClassName();

  public interface MetadataNested<N>
      extends Nested<N>, V1ObjectMetaFluent<V1beta1CSIStorageCapacityFluent.MetadataNested<N>> {
    public N and();

    public N endMetadata();
  }

  public interface NodeTopologyNested<N>
      extends Nested<N>,
          V1LabelSelectorFluent<V1beta1CSIStorageCapacityFluent.NodeTopologyNested<N>> {
    public N and();

    public N endNodeTopology();
  }
}
