package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

 /**
  * Generated
  */
public class V1DaemonSetUpdateStrategyFluentImpl<A extends io.kubernetes.client.openapi.models.V1DaemonSetUpdateStrategyFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1DaemonSetUpdateStrategyFluent<A>{
  public V1DaemonSetUpdateStrategyFluentImpl() {
  }
  public V1DaemonSetUpdateStrategyFluentImpl(io.kubernetes.client.openapi.models.V1DaemonSetUpdateStrategy instance) {
    this.withRollingUpdate(instance.getRollingUpdate());

    this.withType(instance.getType());

  }
  private io.kubernetes.client.openapi.models.V1RollingUpdateDaemonSetBuilder rollingUpdate;
  private java.lang.String type;
  
  /**
   * This method has been deprecated, please use method buildRollingUpdate instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1RollingUpdateDaemonSet getRollingUpdate() {
    return this.rollingUpdate!=null?this.rollingUpdate.build():null;
  }
  public io.kubernetes.client.openapi.models.V1RollingUpdateDaemonSet buildRollingUpdate() {
    return this.rollingUpdate!=null?this.rollingUpdate.build():null;
  }
  public A withRollingUpdate(io.kubernetes.client.openapi.models.V1RollingUpdateDaemonSet rollingUpdate) {
    _visitables.get("rollingUpdate").remove(this.rollingUpdate);
    if (rollingUpdate!=null){ this.rollingUpdate= new io.kubernetes.client.openapi.models.V1RollingUpdateDaemonSetBuilder(rollingUpdate); _visitables.get("rollingUpdate").add(this.rollingUpdate);} return (A) this;
  }
  public java.lang.Boolean hasRollingUpdate() {
    return this.rollingUpdate != null;
  }
  public io.kubernetes.client.openapi.models.V1DaemonSetUpdateStrategyFluent.RollingUpdateNested<A> withNewRollingUpdate() {
    return new io.kubernetes.client.openapi.models.V1DaemonSetUpdateStrategyFluentImpl.RollingUpdateNestedImpl();
  }
  public io.kubernetes.client.openapi.models.V1DaemonSetUpdateStrategyFluent.RollingUpdateNested<A> withNewRollingUpdateLike(io.kubernetes.client.openapi.models.V1RollingUpdateDaemonSet item) {
    return new io.kubernetes.client.openapi.models.V1DaemonSetUpdateStrategyFluentImpl.RollingUpdateNestedImpl(item);
  }
  public io.kubernetes.client.openapi.models.V1DaemonSetUpdateStrategyFluent.RollingUpdateNested<A> editRollingUpdate() {
    return withNewRollingUpdateLike(getRollingUpdate());
  }
  public io.kubernetes.client.openapi.models.V1DaemonSetUpdateStrategyFluent.RollingUpdateNested<A> editOrNewRollingUpdate() {
    return withNewRollingUpdateLike(getRollingUpdate() != null ? getRollingUpdate(): new io.kubernetes.client.openapi.models.V1RollingUpdateDaemonSetBuilder().build());
  }
  public io.kubernetes.client.openapi.models.V1DaemonSetUpdateStrategyFluent.RollingUpdateNested<A> editOrNewRollingUpdateLike(io.kubernetes.client.openapi.models.V1RollingUpdateDaemonSet item) {
    return withNewRollingUpdateLike(getRollingUpdate() != null ? getRollingUpdate(): item);
  }
  public java.lang.String getType() {
    return this.type;
  }
  public A withType(java.lang.String type) {
    this.type=type; return (A) this;
  }
  public java.lang.Boolean hasType() {
    return this.type != null;
  }
  
  /**
   * Method is deprecated. use withType instead.
   */
  @java.lang.Deprecated
  public A withNewType(java.lang.String original) {
    return (A)withType(new String(original));
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1DaemonSetUpdateStrategyFluentImpl that = (V1DaemonSetUpdateStrategyFluentImpl) o;
    if (rollingUpdate != null ? !rollingUpdate.equals(that.rollingUpdate) :that.rollingUpdate != null) return false;
    if (type != null ? !type.equals(that.type) :that.type != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(rollingUpdate,  type,  super.hashCode());
  }
  public class RollingUpdateNestedImpl<N> extends io.kubernetes.client.openapi.models.V1RollingUpdateDaemonSetFluentImpl<io.kubernetes.client.openapi.models.V1DaemonSetUpdateStrategyFluent.RollingUpdateNested<N>> implements io.kubernetes.client.openapi.models.V1DaemonSetUpdateStrategyFluent.RollingUpdateNested<N>,io.kubernetes.client.fluent.Nested<N>{
    RollingUpdateNestedImpl(io.kubernetes.client.openapi.models.V1RollingUpdateDaemonSet item) {
      this.builder = new io.kubernetes.client.openapi.models.V1RollingUpdateDaemonSetBuilder(this, item);
    }
    RollingUpdateNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1RollingUpdateDaemonSetBuilder(this);
    }
    io.kubernetes.client.openapi.models.V1RollingUpdateDaemonSetBuilder builder;
    public N and() {
      return (N) V1DaemonSetUpdateStrategyFluentImpl.this.withRollingUpdate(builder.build());
    }
    public N endRollingUpdate() {
      return and();
    }
    
  }
  
}