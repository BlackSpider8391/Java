package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Integer;
import java.lang.Deprecated;
import java.util.Iterator;
import java.util.Collection;
import java.util.List;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1NamespaceStatusFluent<A extends io.kubernetes.client.openapi.models.V1NamespaceStatusFluent<A>> extends io.kubernetes.client.fluent.Fluent<A>{
  public A addToConditions(java.lang.Integer index,io.kubernetes.client.openapi.models.V1NamespaceCondition item);
  public A setToConditions(java.lang.Integer index,io.kubernetes.client.openapi.models.V1NamespaceCondition item);
  public A addToConditions(io.kubernetes.client.openapi.models.V1NamespaceCondition... items);
  public A addAllToConditions(java.util.Collection<io.kubernetes.client.openapi.models.V1NamespaceCondition> items);
  public A removeFromConditions(io.kubernetes.client.openapi.models.V1NamespaceCondition... items);
  public A removeAllFromConditions(java.util.Collection<io.kubernetes.client.openapi.models.V1NamespaceCondition> items);
  public A removeMatchingFromConditions(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1NamespaceConditionBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildConditions instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1NamespaceCondition> getConditions();
  public java.util.List<io.kubernetes.client.openapi.models.V1NamespaceCondition> buildConditions();
  public io.kubernetes.client.openapi.models.V1NamespaceCondition buildCondition(java.lang.Integer index);
  public io.kubernetes.client.openapi.models.V1NamespaceCondition buildFirstCondition();
  public io.kubernetes.client.openapi.models.V1NamespaceCondition buildLastCondition();
  public io.kubernetes.client.openapi.models.V1NamespaceCondition buildMatchingCondition(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1NamespaceConditionBuilder> predicate);
  public java.lang.Boolean hasMatchingCondition(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1NamespaceConditionBuilder> predicate);
  public A withConditions(java.util.List<io.kubernetes.client.openapi.models.V1NamespaceCondition> conditions);
  public A withConditions(io.kubernetes.client.openapi.models.V1NamespaceCondition... conditions);
  public java.lang.Boolean hasConditions();
  public io.kubernetes.client.openapi.models.V1NamespaceStatusFluent.ConditionsNested<A> addNewCondition();
  public io.kubernetes.client.openapi.models.V1NamespaceStatusFluent.ConditionsNested<A> addNewConditionLike(io.kubernetes.client.openapi.models.V1NamespaceCondition item);
  public io.kubernetes.client.openapi.models.V1NamespaceStatusFluent.ConditionsNested<A> setNewConditionLike(java.lang.Integer index,io.kubernetes.client.openapi.models.V1NamespaceCondition item);
  public io.kubernetes.client.openapi.models.V1NamespaceStatusFluent.ConditionsNested<A> editCondition(java.lang.Integer index);
  public io.kubernetes.client.openapi.models.V1NamespaceStatusFluent.ConditionsNested<A> editFirstCondition();
  public io.kubernetes.client.openapi.models.V1NamespaceStatusFluent.ConditionsNested<A> editLastCondition();
  public io.kubernetes.client.openapi.models.V1NamespaceStatusFluent.ConditionsNested<A> editMatchingCondition(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1NamespaceConditionBuilder> predicate);
  public java.lang.String getPhase();
  public A withPhase(java.lang.String phase);
  public java.lang.Boolean hasPhase();
  
  /**
   * Method is deprecated. use withPhase instead.
   */
  @java.lang.Deprecated
  public A withNewPhase(java.lang.String original);
  public interface ConditionsNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1NamespaceConditionFluent<io.kubernetes.client.openapi.models.V1NamespaceStatusFluent.ConditionsNested<N>>{
    public N and();
    public N endCondition();
    
  }
  
}