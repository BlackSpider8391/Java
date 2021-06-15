package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1TokenReviewSpecBuilder extends io.kubernetes.client.openapi.models.V1TokenReviewSpecFluentImpl<io.kubernetes.client.openapi.models.V1TokenReviewSpecBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1TokenReviewSpec,io.kubernetes.client.openapi.models.V1TokenReviewSpecBuilder> {

    io.kubernetes.client.openapi.models.V1TokenReviewSpecFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1TokenReviewSpecBuilder() {
        this(true);
    }

    public V1TokenReviewSpecBuilder(java.lang.Boolean validationEnabled) {
        this(new V1TokenReviewSpec(), validationEnabled);
    }

    public V1TokenReviewSpecBuilder(io.kubernetes.client.openapi.models.V1TokenReviewSpecFluent<?> fluent) {
        this(fluent, true);
    }

    public V1TokenReviewSpecBuilder(io.kubernetes.client.openapi.models.V1TokenReviewSpecFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1TokenReviewSpec(), validationEnabled);
    }

    public V1TokenReviewSpecBuilder(io.kubernetes.client.openapi.models.V1TokenReviewSpecFluent<?> fluent,io.kubernetes.client.openapi.models.V1TokenReviewSpec instance) {
        this(fluent, instance, true);
    }

    public V1TokenReviewSpecBuilder(io.kubernetes.client.openapi.models.V1TokenReviewSpecFluent<?> fluent,io.kubernetes.client.openapi.models.V1TokenReviewSpec instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withAudiences(instance.getAudiences());
        
        fluent.withToken(instance.getToken());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1TokenReviewSpecBuilder(io.kubernetes.client.openapi.models.V1TokenReviewSpec instance) {
        this(instance,true);
    }

    public V1TokenReviewSpecBuilder(io.kubernetes.client.openapi.models.V1TokenReviewSpec instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withAudiences(instance.getAudiences());
        
        this.withToken(instance.getToken());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1TokenReviewSpec build() {
        V1TokenReviewSpec buildable = new V1TokenReviewSpec();
        buildable.setAudiences(fluent.getAudiences());
        buildable.setToken(fluent.getToken());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1TokenReviewSpecBuilder that = (V1TokenReviewSpecBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
