package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1AzureFileVolumeSourceBuilder extends io.kubernetes.client.openapi.models.V1AzureFileVolumeSourceFluentImpl<io.kubernetes.client.openapi.models.V1AzureFileVolumeSourceBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1AzureFileVolumeSource,io.kubernetes.client.openapi.models.V1AzureFileVolumeSourceBuilder> {

    io.kubernetes.client.openapi.models.V1AzureFileVolumeSourceFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1AzureFileVolumeSourceBuilder() {
        this(true);
    }

    public V1AzureFileVolumeSourceBuilder(java.lang.Boolean validationEnabled) {
        this(new V1AzureFileVolumeSource(), validationEnabled);
    }

    public V1AzureFileVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1AzureFileVolumeSourceFluent<?> fluent) {
        this(fluent, true);
    }

    public V1AzureFileVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1AzureFileVolumeSourceFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1AzureFileVolumeSource(), validationEnabled);
    }

    public V1AzureFileVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1AzureFileVolumeSourceFluent<?> fluent,io.kubernetes.client.openapi.models.V1AzureFileVolumeSource instance) {
        this(fluent, instance, true);
    }

    public V1AzureFileVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1AzureFileVolumeSourceFluent<?> fluent,io.kubernetes.client.openapi.models.V1AzureFileVolumeSource instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withReadOnly(instance.getReadOnly());
        
        fluent.withSecretName(instance.getSecretName());
        
        fluent.withShareName(instance.getShareName());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1AzureFileVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1AzureFileVolumeSource instance) {
        this(instance,true);
    }

    public V1AzureFileVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1AzureFileVolumeSource instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withReadOnly(instance.getReadOnly());
        
        this.withSecretName(instance.getSecretName());
        
        this.withShareName(instance.getShareName());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1AzureFileVolumeSource build() {
        V1AzureFileVolumeSource buildable = new V1AzureFileVolumeSource();
        buildable.setReadOnly(fluent.getReadOnly());
        buildable.setSecretName(fluent.getSecretName());
        buildable.setShareName(fluent.getShareName());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1AzureFileVolumeSourceBuilder that = (V1AzureFileVolumeSourceBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
