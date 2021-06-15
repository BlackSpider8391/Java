package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1APIResourceBuilder extends io.kubernetes.client.openapi.models.V1APIResourceFluentImpl<io.kubernetes.client.openapi.models.V1APIResourceBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1APIResource,io.kubernetes.client.openapi.models.V1APIResourceBuilder> {

    io.kubernetes.client.openapi.models.V1APIResourceFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1APIResourceBuilder() {
        this(true);
    }

    public V1APIResourceBuilder(java.lang.Boolean validationEnabled) {
        this(new V1APIResource(), validationEnabled);
    }

    public V1APIResourceBuilder(io.kubernetes.client.openapi.models.V1APIResourceFluent<?> fluent) {
        this(fluent, true);
    }

    public V1APIResourceBuilder(io.kubernetes.client.openapi.models.V1APIResourceFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1APIResource(), validationEnabled);
    }

    public V1APIResourceBuilder(io.kubernetes.client.openapi.models.V1APIResourceFluent<?> fluent,io.kubernetes.client.openapi.models.V1APIResource instance) {
        this(fluent, instance, true);
    }

    public V1APIResourceBuilder(io.kubernetes.client.openapi.models.V1APIResourceFluent<?> fluent,io.kubernetes.client.openapi.models.V1APIResource instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withCategories(instance.getCategories());
        
        fluent.withGroup(instance.getGroup());
        
        fluent.withKind(instance.getKind());
        
        fluent.withName(instance.getName());
        
        fluent.withNamespaced(instance.getNamespaced());
        
        fluent.withShortNames(instance.getShortNames());
        
        fluent.withSingularName(instance.getSingularName());
        
        fluent.withStorageVersionHash(instance.getStorageVersionHash());
        
        fluent.withVerbs(instance.getVerbs());
        
        fluent.withVersion(instance.getVersion());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1APIResourceBuilder(io.kubernetes.client.openapi.models.V1APIResource instance) {
        this(instance,true);
    }

    public V1APIResourceBuilder(io.kubernetes.client.openapi.models.V1APIResource instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withCategories(instance.getCategories());
        
        this.withGroup(instance.getGroup());
        
        this.withKind(instance.getKind());
        
        this.withName(instance.getName());
        
        this.withNamespaced(instance.getNamespaced());
        
        this.withShortNames(instance.getShortNames());
        
        this.withSingularName(instance.getSingularName());
        
        this.withStorageVersionHash(instance.getStorageVersionHash());
        
        this.withVerbs(instance.getVerbs());
        
        this.withVersion(instance.getVersion());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1APIResource build() {
        V1APIResource buildable = new V1APIResource();
        buildable.setCategories(fluent.getCategories());
        buildable.setGroup(fluent.getGroup());
        buildable.setKind(fluent.getKind());
        buildable.setName(fluent.getName());
        buildable.setNamespaced(fluent.getNamespaced());
        buildable.setShortNames(fluent.getShortNames());
        buildable.setSingularName(fluent.getSingularName());
        buildable.setStorageVersionHash(fluent.getStorageVersionHash());
        buildable.setVerbs(fluent.getVerbs());
        buildable.setVersion(fluent.getVersion());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1APIResourceBuilder that = (V1APIResourceBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
