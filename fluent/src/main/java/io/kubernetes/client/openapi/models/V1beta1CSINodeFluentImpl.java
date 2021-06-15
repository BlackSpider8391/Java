package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

public class V1beta1CSINodeFluentImpl<A extends io.kubernetes.client.openapi.models.V1beta1CSINodeFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1beta1CSINodeFluent<A> {

    private java.lang.String apiVersion;
    private java.lang.String kind;
    private io.kubernetes.client.openapi.models.V1ObjectMetaBuilder metadata;
    private io.kubernetes.client.openapi.models.V1beta1CSINodeSpecBuilder spec;

    public V1beta1CSINodeFluentImpl() {
    }

    public V1beta1CSINodeFluentImpl(io.kubernetes.client.openapi.models.V1beta1CSINode instance) {
        this.withApiVersion(instance.getApiVersion());
        
        this.withKind(instance.getKind());
        
        this.withMetadata(instance.getMetadata());
        
        this.withSpec(instance.getSpec());
    }

    public java.lang.String getApiVersion() {
        return this.apiVersion;
    }

    public A withApiVersion(java.lang.String apiVersion) {
        this.apiVersion=apiVersion; return (A) this;
    }

    public java.lang.Boolean hasApiVersion() {
        return this.apiVersion != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withApiVersion instead.
     */
        public A withNewApiVersion(java.lang.String original) {
        return (A)withApiVersion(new String(original));
    }

    public java.lang.String getKind() {
        return this.kind;
    }

    public A withKind(java.lang.String kind) {
        this.kind=kind; return (A) this;
    }

    public java.lang.Boolean hasKind() {
        return this.kind != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withKind instead.
     */
        public A withNewKind(java.lang.String original) {
        return (A)withKind(new String(original));
    }

    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildMetadata instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1ObjectMeta getMetadata() {
        return this.metadata!=null?this.metadata.build():null;
    }

    public io.kubernetes.client.openapi.models.V1ObjectMeta buildMetadata() {
        return this.metadata!=null?this.metadata.build():null;
    }

    public A withMetadata(io.kubernetes.client.openapi.models.V1ObjectMeta metadata) {
        _visitables.get("metadata").remove(this.metadata);
        if (metadata!=null){ this.metadata= new io.kubernetes.client.openapi.models.V1ObjectMetaBuilder(metadata); _visitables.get("metadata").add(this.metadata);} return (A) this;
    }

    public java.lang.Boolean hasMetadata() {
        return this.metadata != null;
    }

    public io.kubernetes.client.openapi.models.V1beta1CSINodeFluent.MetadataNested<A> withNewMetadata() {
        return new io.kubernetes.client.openapi.models.V1beta1CSINodeFluentImpl.MetadataNestedImpl();
    }

    public io.kubernetes.client.openapi.models.V1beta1CSINodeFluent.MetadataNested<A> withNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item) {
        return new io.kubernetes.client.openapi.models.V1beta1CSINodeFluentImpl.MetadataNestedImpl(item);
    }

    public io.kubernetes.client.openapi.models.V1beta1CSINodeFluent.MetadataNested<A> editMetadata() {
        return withNewMetadataLike(getMetadata());
    }

    public io.kubernetes.client.openapi.models.V1beta1CSINodeFluent.MetadataNested<A> editOrNewMetadata() {
        return withNewMetadataLike(getMetadata() != null ? getMetadata(): new io.kubernetes.client.openapi.models.V1ObjectMetaBuilder().build());
    }

    public io.kubernetes.client.openapi.models.V1beta1CSINodeFluent.MetadataNested<A> editOrNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item) {
        return withNewMetadataLike(getMetadata() != null ? getMetadata(): item);
    }

    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildSpec instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1beta1CSINodeSpec getSpec() {
        return this.spec!=null?this.spec.build():null;
    }

    public io.kubernetes.client.openapi.models.V1beta1CSINodeSpec buildSpec() {
        return this.spec!=null?this.spec.build():null;
    }

    public A withSpec(io.kubernetes.client.openapi.models.V1beta1CSINodeSpec spec) {
        _visitables.get("spec").remove(this.spec);
        if (spec!=null){ this.spec= new io.kubernetes.client.openapi.models.V1beta1CSINodeSpecBuilder(spec); _visitables.get("spec").add(this.spec);} return (A) this;
    }

    public java.lang.Boolean hasSpec() {
        return this.spec != null;
    }

    public io.kubernetes.client.openapi.models.V1beta1CSINodeFluent.SpecNested<A> withNewSpec() {
        return new io.kubernetes.client.openapi.models.V1beta1CSINodeFluentImpl.SpecNestedImpl();
    }

    public io.kubernetes.client.openapi.models.V1beta1CSINodeFluent.SpecNested<A> withNewSpecLike(io.kubernetes.client.openapi.models.V1beta1CSINodeSpec item) {
        return new io.kubernetes.client.openapi.models.V1beta1CSINodeFluentImpl.SpecNestedImpl(item);
    }

    public io.kubernetes.client.openapi.models.V1beta1CSINodeFluent.SpecNested<A> editSpec() {
        return withNewSpecLike(getSpec());
    }

    public io.kubernetes.client.openapi.models.V1beta1CSINodeFluent.SpecNested<A> editOrNewSpec() {
        return withNewSpecLike(getSpec() != null ? getSpec(): new io.kubernetes.client.openapi.models.V1beta1CSINodeSpecBuilder().build());
    }

    public io.kubernetes.client.openapi.models.V1beta1CSINodeFluent.SpecNested<A> editOrNewSpecLike(io.kubernetes.client.openapi.models.V1beta1CSINodeSpec item) {
        return withNewSpecLike(getSpec() != null ? getSpec(): item);
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        V1beta1CSINodeFluentImpl that = (V1beta1CSINodeFluentImpl) o;
        if (apiVersion != null ? !apiVersion.equals(that.apiVersion) :that.apiVersion != null) return false;
        if (kind != null ? !kind.equals(that.kind) :that.kind != null) return false;
        if (metadata != null ? !metadata.equals(that.metadata) :that.metadata != null) return false;
        if (spec != null ? !spec.equals(that.spec) :that.spec != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(apiVersion,  kind,  metadata,  spec,  super.hashCode());
    }

    public class MetadataNestedImpl<N> extends io.kubernetes.client.openapi.models.V1ObjectMetaFluentImpl<io.kubernetes.client.openapi.models.V1beta1CSINodeFluent.MetadataNested<N>> implements io.kubernetes.client.openapi.models.V1beta1CSINodeFluent.MetadataNested<N>,io.kubernetes.client.fluent.Nested<N> {
        private final io.kubernetes.client.openapi.models.V1ObjectMetaBuilder builder;

            MetadataNestedImpl(io.kubernetes.client.openapi.models.V1ObjectMeta item) {
                this.builder = new io.kubernetes.client.openapi.models.V1ObjectMetaBuilder(this, item);
                        
            }

            MetadataNestedImpl() {
                this.builder = new io.kubernetes.client.openapi.models.V1ObjectMetaBuilder(this);
                        
            }

            public N and() {
                return (N) V1beta1CSINodeFluentImpl.this.withMetadata(builder.build());
            }

            public N endMetadata() {
                return and();
            }
    }


    public class SpecNestedImpl<N> extends io.kubernetes.client.openapi.models.V1beta1CSINodeSpecFluentImpl<io.kubernetes.client.openapi.models.V1beta1CSINodeFluent.SpecNested<N>> implements io.kubernetes.client.openapi.models.V1beta1CSINodeFluent.SpecNested<N>,io.kubernetes.client.fluent.Nested<N> {
        private final io.kubernetes.client.openapi.models.V1beta1CSINodeSpecBuilder builder;

            SpecNestedImpl(io.kubernetes.client.openapi.models.V1beta1CSINodeSpec item) {
                this.builder = new io.kubernetes.client.openapi.models.V1beta1CSINodeSpecBuilder(this, item);
                        
            }

            SpecNestedImpl() {
                this.builder = new io.kubernetes.client.openapi.models.V1beta1CSINodeSpecBuilder(this);
                        
            }

            public N and() {
                return (N) V1beta1CSINodeFluentImpl.this.withSpec(builder.build());
            }

            public N endSpec() {
                return and();
            }
    }


}
