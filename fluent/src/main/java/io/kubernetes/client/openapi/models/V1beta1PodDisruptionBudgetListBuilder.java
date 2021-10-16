package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V1beta1PodDisruptionBudgetListBuilder extends io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetListFluentImpl<io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetListBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetList,io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetListBuilder>{
  public V1beta1PodDisruptionBudgetListBuilder() {
    this(false);
  }
  public V1beta1PodDisruptionBudgetListBuilder(java.lang.Boolean validationEnabled) {
    this(new V1beta1PodDisruptionBudgetList(), validationEnabled);
  }
  public V1beta1PodDisruptionBudgetListBuilder(io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetListFluent<?> fluent) {
    this(fluent, false);
  }
  public V1beta1PodDisruptionBudgetListBuilder(io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetListFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V1beta1PodDisruptionBudgetList(), validationEnabled);
  }
  public V1beta1PodDisruptionBudgetListBuilder(io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetListFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetList instance) {
    this(fluent, instance, false);
  }
  public V1beta1PodDisruptionBudgetListBuilder(io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetListFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetList instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withItems(instance.getItems());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  public V1beta1PodDisruptionBudgetListBuilder(io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetList instance) {
    this(instance,false);
  }
  public V1beta1PodDisruptionBudgetListBuilder(io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetList instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withItems(instance.getItems());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetListFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetList build() {
    V1beta1PodDisruptionBudgetList buildable = new V1beta1PodDisruptionBudgetList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.getItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    return buildable;
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1beta1PodDisruptionBudgetListBuilder that = (V1beta1PodDisruptionBudgetListBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}