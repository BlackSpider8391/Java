package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1beta1LimitedPriorityLevelConfigurationBuilder extends io.kubernetes.client.openapi.models.V1beta1LimitedPriorityLevelConfigurationFluentImpl<io.kubernetes.client.openapi.models.V1beta1LimitedPriorityLevelConfigurationBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1beta1LimitedPriorityLevelConfiguration,io.kubernetes.client.openapi.models.V1beta1LimitedPriorityLevelConfigurationBuilder> {

    io.kubernetes.client.openapi.models.V1beta1LimitedPriorityLevelConfigurationFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1beta1LimitedPriorityLevelConfigurationBuilder() {
        this(true);
    }

    public V1beta1LimitedPriorityLevelConfigurationBuilder(java.lang.Boolean validationEnabled) {
        this(new V1beta1LimitedPriorityLevelConfiguration(), validationEnabled);
    }

    public V1beta1LimitedPriorityLevelConfigurationBuilder(io.kubernetes.client.openapi.models.V1beta1LimitedPriorityLevelConfigurationFluent<?> fluent) {
        this(fluent, true);
    }

    public V1beta1LimitedPriorityLevelConfigurationBuilder(io.kubernetes.client.openapi.models.V1beta1LimitedPriorityLevelConfigurationFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1beta1LimitedPriorityLevelConfiguration(), validationEnabled);
    }

    public V1beta1LimitedPriorityLevelConfigurationBuilder(io.kubernetes.client.openapi.models.V1beta1LimitedPriorityLevelConfigurationFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta1LimitedPriorityLevelConfiguration instance) {
        this(fluent, instance, true);
    }

    public V1beta1LimitedPriorityLevelConfigurationBuilder(io.kubernetes.client.openapi.models.V1beta1LimitedPriorityLevelConfigurationFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta1LimitedPriorityLevelConfiguration instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withAssuredConcurrencyShares(instance.getAssuredConcurrencyShares());
        
        fluent.withLimitResponse(instance.getLimitResponse());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1beta1LimitedPriorityLevelConfigurationBuilder(io.kubernetes.client.openapi.models.V1beta1LimitedPriorityLevelConfiguration instance) {
        this(instance,true);
    }

    public V1beta1LimitedPriorityLevelConfigurationBuilder(io.kubernetes.client.openapi.models.V1beta1LimitedPriorityLevelConfiguration instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withAssuredConcurrencyShares(instance.getAssuredConcurrencyShares());
        
        this.withLimitResponse(instance.getLimitResponse());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1beta1LimitedPriorityLevelConfiguration build() {
        V1beta1LimitedPriorityLevelConfiguration buildable = new V1beta1LimitedPriorityLevelConfiguration();
        buildable.setAssuredConcurrencyShares(fluent.getAssuredConcurrencyShares());
        buildable.setLimitResponse(fluent.getLimitResponse());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1beta1LimitedPriorityLevelConfigurationBuilder that = (V1beta1LimitedPriorityLevelConfigurationBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
