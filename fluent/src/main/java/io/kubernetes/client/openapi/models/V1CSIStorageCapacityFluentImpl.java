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
import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.fluent.Nested;

/** Generated */
@SuppressWarnings(value = "unchecked")
public class V1CSIStorageCapacityFluentImpl<A extends V1CSIStorageCapacityFluent<A>>
    extends BaseFluent<A> implements V1CSIStorageCapacityFluent<A> {
  public V1CSIStorageCapacityFluentImpl() {}

  public V1CSIStorageCapacityFluentImpl(
      io.kubernetes.client.openapi.models.V1CSIStorageCapacity instance) {
    this.withApiVersion(instance.getApiVersion());

    this.withCapacity(instance.getCapacity());

    this.withKind(instance.getKind());

    this.withMaximumVolumeSize(instance.getMaximumVolumeSize());

    this.withMetadata(instance.getMetadata());

    this.withNodeTopology(instance.getNodeTopology());

    this.withStorageClassName(instance.getStorageClassName());
  }

  private String apiVersion;
  private Quantity capacity;
  private java.lang.String kind;
  private io.kubernetes.client.custom.Quantity maximumVolumeSize;
  private V1ObjectMetaBuilder metadata;
  private V1LabelSelectorBuilder nodeTopology;
  private java.lang.String storageClassName;

  public java.lang.String getApiVersion() {
    return this.apiVersion;
  }

  public A withApiVersion(java.lang.String apiVersion) {
    this.apiVersion = apiVersion;
    return (A) this;
  }

  public Boolean hasApiVersion() {
    return this.apiVersion != null;
  }

  public io.kubernetes.client.custom.Quantity getCapacity() {
    return this.capacity;
  }

  public A withCapacity(io.kubernetes.client.custom.Quantity capacity) {
    this.capacity = capacity;
    return (A) this;
  }

  public java.lang.Boolean hasCapacity() {
    return this.capacity != null;
  }

  public A withNewCapacity(java.lang.String value) {
    return (A) withCapacity(new Quantity(value));
  }

  public java.lang.String getKind() {
    return this.kind;
  }

  public A withKind(java.lang.String kind) {
    this.kind = kind;
    return (A) this;
  }

  public java.lang.Boolean hasKind() {
    return this.kind != null;
  }

  public io.kubernetes.client.custom.Quantity getMaximumVolumeSize() {
    return this.maximumVolumeSize;
  }

  public A withMaximumVolumeSize(io.kubernetes.client.custom.Quantity maximumVolumeSize) {
    this.maximumVolumeSize = maximumVolumeSize;
    return (A) this;
  }

  public java.lang.Boolean hasMaximumVolumeSize() {
    return this.maximumVolumeSize != null;
  }

  public A withNewMaximumVolumeSize(java.lang.String value) {
    return (A) withMaximumVolumeSize(new Quantity(value));
  }

  /**
   * This method has been deprecated, please use method buildMetadata instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public io.kubernetes.client.openapi.models.V1ObjectMeta getMetadata() {
    return this.metadata != null ? this.metadata.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1ObjectMeta buildMetadata() {
    return this.metadata != null ? this.metadata.build() : null;
  }

  public A withMetadata(io.kubernetes.client.openapi.models.V1ObjectMeta metadata) {
    _visitables.get("metadata").remove(this.metadata);
    if (metadata != null) {
      this.metadata = new V1ObjectMetaBuilder(metadata);
      _visitables.get("metadata").add(this.metadata);
    }
    return (A) this;
  }

  public java.lang.Boolean hasMetadata() {
    return this.metadata != null;
  }

  public V1CSIStorageCapacityFluent.MetadataNested<A> withNewMetadata() {
    return new V1CSIStorageCapacityFluentImpl.MetadataNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1CSIStorageCapacityFluent.MetadataNested<A>
      withNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item) {
    return new V1CSIStorageCapacityFluentImpl.MetadataNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1CSIStorageCapacityFluent.MetadataNested<A>
      editMetadata() {
    return withNewMetadataLike(getMetadata());
  }

  public io.kubernetes.client.openapi.models.V1CSIStorageCapacityFluent.MetadataNested<A>
      editOrNewMetadata() {
    return withNewMetadataLike(
        getMetadata() != null
            ? getMetadata()
            : new io.kubernetes.client.openapi.models.V1ObjectMetaBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1CSIStorageCapacityFluent.MetadataNested<A>
      editOrNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item) {
    return withNewMetadataLike(getMetadata() != null ? getMetadata() : item);
  }

  /**
   * This method has been deprecated, please use method buildNodeTopology instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1LabelSelector getNodeTopology() {
    return this.nodeTopology != null ? this.nodeTopology.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1LabelSelector buildNodeTopology() {
    return this.nodeTopology != null ? this.nodeTopology.build() : null;
  }

  public A withNodeTopology(io.kubernetes.client.openapi.models.V1LabelSelector nodeTopology) {
    _visitables.get("nodeTopology").remove(this.nodeTopology);
    if (nodeTopology != null) {
      this.nodeTopology = new V1LabelSelectorBuilder(nodeTopology);
      _visitables.get("nodeTopology").add(this.nodeTopology);
    }
    return (A) this;
  }

  public java.lang.Boolean hasNodeTopology() {
    return this.nodeTopology != null;
  }

  public V1CSIStorageCapacityFluent.NodeTopologyNested<A> withNewNodeTopology() {
    return new V1CSIStorageCapacityFluentImpl.NodeTopologyNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1CSIStorageCapacityFluent.NodeTopologyNested<A>
      withNewNodeTopologyLike(io.kubernetes.client.openapi.models.V1LabelSelector item) {
    return new io.kubernetes.client.openapi.models.V1CSIStorageCapacityFluentImpl
        .NodeTopologyNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1CSIStorageCapacityFluent.NodeTopologyNested<A>
      editNodeTopology() {
    return withNewNodeTopologyLike(getNodeTopology());
  }

  public io.kubernetes.client.openapi.models.V1CSIStorageCapacityFluent.NodeTopologyNested<A>
      editOrNewNodeTopology() {
    return withNewNodeTopologyLike(
        getNodeTopology() != null
            ? getNodeTopology()
            : new io.kubernetes.client.openapi.models.V1LabelSelectorBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1CSIStorageCapacityFluent.NodeTopologyNested<A>
      editOrNewNodeTopologyLike(io.kubernetes.client.openapi.models.V1LabelSelector item) {
    return withNewNodeTopologyLike(getNodeTopology() != null ? getNodeTopology() : item);
  }

  public java.lang.String getStorageClassName() {
    return this.storageClassName;
  }

  public A withStorageClassName(java.lang.String storageClassName) {
    this.storageClassName = storageClassName;
    return (A) this;
  }

  public java.lang.Boolean hasStorageClassName() {
    return this.storageClassName != null;
  }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1CSIStorageCapacityFluentImpl that = (V1CSIStorageCapacityFluentImpl) o;
    if (apiVersion != null ? !apiVersion.equals(that.apiVersion) : that.apiVersion != null)
      return false;
    if (capacity != null ? !capacity.equals(that.capacity) : that.capacity != null) return false;
    if (kind != null ? !kind.equals(that.kind) : that.kind != null) return false;
    if (maximumVolumeSize != null
        ? !maximumVolumeSize.equals(that.maximumVolumeSize)
        : that.maximumVolumeSize != null) return false;
    if (metadata != null ? !metadata.equals(that.metadata) : that.metadata != null) return false;
    if (nodeTopology != null ? !nodeTopology.equals(that.nodeTopology) : that.nodeTopology != null)
      return false;
    if (storageClassName != null
        ? !storageClassName.equals(that.storageClassName)
        : that.storageClassName != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(
        apiVersion,
        capacity,
        kind,
        maximumVolumeSize,
        metadata,
        nodeTopology,
        storageClassName,
        super.hashCode());
  }

  public java.lang.String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (apiVersion != null) {
      sb.append("apiVersion:");
      sb.append(apiVersion + ",");
    }
    if (capacity != null) {
      sb.append("capacity:");
      sb.append(capacity + ",");
    }
    if (kind != null) {
      sb.append("kind:");
      sb.append(kind + ",");
    }
    if (maximumVolumeSize != null) {
      sb.append("maximumVolumeSize:");
      sb.append(maximumVolumeSize + ",");
    }
    if (metadata != null) {
      sb.append("metadata:");
      sb.append(metadata + ",");
    }
    if (nodeTopology != null) {
      sb.append("nodeTopology:");
      sb.append(nodeTopology + ",");
    }
    if (storageClassName != null) {
      sb.append("storageClassName:");
      sb.append(storageClassName);
    }
    sb.append("}");
    return sb.toString();
  }

  class MetadataNestedImpl<N>
      extends V1ObjectMetaFluentImpl<V1CSIStorageCapacityFluent.MetadataNested<N>>
      implements io.kubernetes.client.openapi.models.V1CSIStorageCapacityFluent.MetadataNested<N>,
          Nested<N> {
    MetadataNestedImpl(V1ObjectMeta item) {
      this.builder = new V1ObjectMetaBuilder(this, item);
    }

    MetadataNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1ObjectMetaBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1ObjectMetaBuilder builder;

    public N and() {
      return (N) V1CSIStorageCapacityFluentImpl.this.withMetadata(builder.build());
    }

    public N endMetadata() {
      return and();
    }
  }

  class NodeTopologyNestedImpl<N>
      extends V1LabelSelectorFluentImpl<V1CSIStorageCapacityFluent.NodeTopologyNested<N>>
      implements io.kubernetes.client.openapi.models.V1CSIStorageCapacityFluent.NodeTopologyNested<
              N>,
          io.kubernetes.client.fluent.Nested<N> {
    NodeTopologyNestedImpl(V1LabelSelector item) {
      this.builder = new V1LabelSelectorBuilder(this, item);
    }

    NodeTopologyNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1LabelSelectorBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1LabelSelectorBuilder builder;

    public N and() {
      return (N) V1CSIStorageCapacityFluentImpl.this.withNodeTopology(builder.build());
    }

    public N endNodeTopology() {
      return and();
    }
  }
}
