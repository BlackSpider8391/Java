package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Nested;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

 /**
  * Generated
  */
public class V1IngressStatusFluentImpl<A extends io.kubernetes.client.openapi.models.V1IngressStatusFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1IngressStatusFluent<A>{
  public V1IngressStatusFluentImpl() {
  }
  public V1IngressStatusFluentImpl(io.kubernetes.client.openapi.models.V1IngressStatus instance) {
    this.withLoadBalancer(instance.getLoadBalancer());

  }
  private io.kubernetes.client.openapi.models.V1LoadBalancerStatusBuilder loadBalancer;
  
  /**
   * This method has been deprecated, please use method buildLoadBalancer instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1LoadBalancerStatus getLoadBalancer() {
    return this.loadBalancer!=null?this.loadBalancer.build():null;
  }
  public io.kubernetes.client.openapi.models.V1LoadBalancerStatus buildLoadBalancer() {
    return this.loadBalancer!=null?this.loadBalancer.build():null;
  }
  public A withLoadBalancer(io.kubernetes.client.openapi.models.V1LoadBalancerStatus loadBalancer) {
    _visitables.get("loadBalancer").remove(this.loadBalancer);
    if (loadBalancer!=null){ this.loadBalancer= new io.kubernetes.client.openapi.models.V1LoadBalancerStatusBuilder(loadBalancer); _visitables.get("loadBalancer").add(this.loadBalancer);} return (A) this;
  }
  public java.lang.Boolean hasLoadBalancer() {
    return this.loadBalancer != null;
  }
  public io.kubernetes.client.openapi.models.V1IngressStatusFluent.LoadBalancerNested<A> withNewLoadBalancer() {
    return new io.kubernetes.client.openapi.models.V1IngressStatusFluentImpl.LoadBalancerNestedImpl();
  }
  public io.kubernetes.client.openapi.models.V1IngressStatusFluent.LoadBalancerNested<A> withNewLoadBalancerLike(io.kubernetes.client.openapi.models.V1LoadBalancerStatus item) {
    return new io.kubernetes.client.openapi.models.V1IngressStatusFluentImpl.LoadBalancerNestedImpl(item);
  }
  public io.kubernetes.client.openapi.models.V1IngressStatusFluent.LoadBalancerNested<A> editLoadBalancer() {
    return withNewLoadBalancerLike(getLoadBalancer());
  }
  public io.kubernetes.client.openapi.models.V1IngressStatusFluent.LoadBalancerNested<A> editOrNewLoadBalancer() {
    return withNewLoadBalancerLike(getLoadBalancer() != null ? getLoadBalancer(): new io.kubernetes.client.openapi.models.V1LoadBalancerStatusBuilder().build());
  }
  public io.kubernetes.client.openapi.models.V1IngressStatusFluent.LoadBalancerNested<A> editOrNewLoadBalancerLike(io.kubernetes.client.openapi.models.V1LoadBalancerStatus item) {
    return withNewLoadBalancerLike(getLoadBalancer() != null ? getLoadBalancer(): item);
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1IngressStatusFluentImpl that = (V1IngressStatusFluentImpl) o;
    if (loadBalancer != null ? !loadBalancer.equals(that.loadBalancer) :that.loadBalancer != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(loadBalancer,  super.hashCode());
  }
  public class LoadBalancerNestedImpl<N> extends io.kubernetes.client.openapi.models.V1LoadBalancerStatusFluentImpl<io.kubernetes.client.openapi.models.V1IngressStatusFluent.LoadBalancerNested<N>> implements io.kubernetes.client.openapi.models.V1IngressStatusFluent.LoadBalancerNested<N>,io.kubernetes.client.fluent.Nested<N>{
    LoadBalancerNestedImpl(io.kubernetes.client.openapi.models.V1LoadBalancerStatus item) {
      this.builder = new io.kubernetes.client.openapi.models.V1LoadBalancerStatusBuilder(this, item);
    }
    LoadBalancerNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1LoadBalancerStatusBuilder(this);
    }
    io.kubernetes.client.openapi.models.V1LoadBalancerStatusBuilder builder;
    public N and() {
      return (N) V1IngressStatusFluentImpl.this.withLoadBalancer(builder.build());
    }
    public N endLoadBalancer() {
      return and();
    }
    
  }
  
}