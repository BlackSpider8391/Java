package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1VolumeAttachmentSourceBuilder extends io.kubernetes.client.openapi.models.V1VolumeAttachmentSourceFluentImpl<io.kubernetes.client.openapi.models.V1VolumeAttachmentSourceBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1VolumeAttachmentSource,io.kubernetes.client.openapi.models.V1VolumeAttachmentSourceBuilder> {

    io.kubernetes.client.openapi.models.V1VolumeAttachmentSourceFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1VolumeAttachmentSourceBuilder() {
        this(true);
    }

    public V1VolumeAttachmentSourceBuilder(java.lang.Boolean validationEnabled) {
        this(new V1VolumeAttachmentSource(), validationEnabled);
    }

    public V1VolumeAttachmentSourceBuilder(io.kubernetes.client.openapi.models.V1VolumeAttachmentSourceFluent<?> fluent) {
        this(fluent, true);
    }

    public V1VolumeAttachmentSourceBuilder(io.kubernetes.client.openapi.models.V1VolumeAttachmentSourceFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1VolumeAttachmentSource(), validationEnabled);
    }

    public V1VolumeAttachmentSourceBuilder(io.kubernetes.client.openapi.models.V1VolumeAttachmentSourceFluent<?> fluent,io.kubernetes.client.openapi.models.V1VolumeAttachmentSource instance) {
        this(fluent, instance, true);
    }

    public V1VolumeAttachmentSourceBuilder(io.kubernetes.client.openapi.models.V1VolumeAttachmentSourceFluent<?> fluent,io.kubernetes.client.openapi.models.V1VolumeAttachmentSource instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withInlineVolumeSpec(instance.getInlineVolumeSpec());
        
        fluent.withPersistentVolumeName(instance.getPersistentVolumeName());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1VolumeAttachmentSourceBuilder(io.kubernetes.client.openapi.models.V1VolumeAttachmentSource instance) {
        this(instance,true);
    }

    public V1VolumeAttachmentSourceBuilder(io.kubernetes.client.openapi.models.V1VolumeAttachmentSource instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withInlineVolumeSpec(instance.getInlineVolumeSpec());
        
        this.withPersistentVolumeName(instance.getPersistentVolumeName());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1VolumeAttachmentSource build() {
        V1VolumeAttachmentSource buildable = new V1VolumeAttachmentSource();
        buildable.setInlineVolumeSpec(fluent.getInlineVolumeSpec());
        buildable.setPersistentVolumeName(fluent.getPersistentVolumeName());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1VolumeAttachmentSourceBuilder that = (V1VolumeAttachmentSourceBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
