package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1beta1SupplementalGroupsStrategyOptionsBuilder extends io.kubernetes.client.openapi.models.V1beta1SupplementalGroupsStrategyOptionsFluentImpl<io.kubernetes.client.openapi.models.V1beta1SupplementalGroupsStrategyOptionsBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1beta1SupplementalGroupsStrategyOptions,io.kubernetes.client.openapi.models.V1beta1SupplementalGroupsStrategyOptionsBuilder> {

    io.kubernetes.client.openapi.models.V1beta1SupplementalGroupsStrategyOptionsFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1beta1SupplementalGroupsStrategyOptionsBuilder() {
        this(true);
    }

    public V1beta1SupplementalGroupsStrategyOptionsBuilder(java.lang.Boolean validationEnabled) {
        this(new V1beta1SupplementalGroupsStrategyOptions(), validationEnabled);
    }

    public V1beta1SupplementalGroupsStrategyOptionsBuilder(io.kubernetes.client.openapi.models.V1beta1SupplementalGroupsStrategyOptionsFluent<?> fluent) {
        this(fluent, true);
    }

    public V1beta1SupplementalGroupsStrategyOptionsBuilder(io.kubernetes.client.openapi.models.V1beta1SupplementalGroupsStrategyOptionsFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1beta1SupplementalGroupsStrategyOptions(), validationEnabled);
    }

    public V1beta1SupplementalGroupsStrategyOptionsBuilder(io.kubernetes.client.openapi.models.V1beta1SupplementalGroupsStrategyOptionsFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta1SupplementalGroupsStrategyOptions instance) {
        this(fluent, instance, true);
    }

    public V1beta1SupplementalGroupsStrategyOptionsBuilder(io.kubernetes.client.openapi.models.V1beta1SupplementalGroupsStrategyOptionsFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta1SupplementalGroupsStrategyOptions instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withRanges(instance.getRanges());
        
        fluent.withRule(instance.getRule());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1beta1SupplementalGroupsStrategyOptionsBuilder(io.kubernetes.client.openapi.models.V1beta1SupplementalGroupsStrategyOptions instance) {
        this(instance,true);
    }

    public V1beta1SupplementalGroupsStrategyOptionsBuilder(io.kubernetes.client.openapi.models.V1beta1SupplementalGroupsStrategyOptions instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withRanges(instance.getRanges());
        
        this.withRule(instance.getRule());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1beta1SupplementalGroupsStrategyOptions build() {
        V1beta1SupplementalGroupsStrategyOptions buildable = new V1beta1SupplementalGroupsStrategyOptions();
        buildable.setRanges(fluent.getRanges());
        buildable.setRule(fluent.getRule());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1beta1SupplementalGroupsStrategyOptionsBuilder that = (V1beta1SupplementalGroupsStrategyOptionsBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
