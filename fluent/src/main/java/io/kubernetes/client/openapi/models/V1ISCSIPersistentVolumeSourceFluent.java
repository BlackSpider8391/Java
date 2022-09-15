/*
Copyright 2022 The Kubernetes Authors.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

/** Generated */
public interface V1ISCSIPersistentVolumeSourceFluent<
        A extends V1ISCSIPersistentVolumeSourceFluent<A>>
    extends Fluent<A> {
  public Boolean getChapAuthDiscovery();

  public A withChapAuthDiscovery(Boolean chapAuthDiscovery);

  public Boolean hasChapAuthDiscovery();

  public Boolean getChapAuthSession();

  public A withChapAuthSession(Boolean chapAuthSession);

  public Boolean hasChapAuthSession();

  public String getFsType();

  public A withFsType(String fsType);

  public Boolean hasFsType();

  public String getInitiatorName();

  public A withInitiatorName(String initiatorName);

  public Boolean hasInitiatorName();

  public String getIqn();

  public A withIqn(String iqn);

  public Boolean hasIqn();

  public String getIscsiInterface();

  public A withIscsiInterface(String iscsiInterface);

  public Boolean hasIscsiInterface();

  public Integer getLun();

  public A withLun(Integer lun);

  public Boolean hasLun();

  public A addToPortals(Integer index, String item);

  public A setToPortals(Integer index, String item);

  public A addToPortals(java.lang.String... items);

  public A addAllToPortals(Collection<String> items);

  public A removeFromPortals(java.lang.String... items);

  public A removeAllFromPortals(Collection<String> items);

  public List<String> getPortals();

  public String getPortal(Integer index);

  public String getFirstPortal();

  public String getLastPortal();

  public String getMatchingPortal(Predicate<String> predicate);

  public Boolean hasMatchingPortal(Predicate<String> predicate);

  public A withPortals(List<String> portals);

  public A withPortals(java.lang.String... portals);

  public Boolean hasPortals();

  public Boolean getReadOnly();

  public A withReadOnly(Boolean readOnly);

  public Boolean hasReadOnly();

  /**
   * This method has been deprecated, please use method buildSecretRef instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V1SecretReference getSecretRef();

  public V1SecretReference buildSecretRef();

  public A withSecretRef(V1SecretReference secretRef);

  public Boolean hasSecretRef();

  public V1ISCSIPersistentVolumeSourceFluent.SecretRefNested<A> withNewSecretRef();

  public V1ISCSIPersistentVolumeSourceFluent.SecretRefNested<A> withNewSecretRefLike(
      V1SecretReference item);

  public V1ISCSIPersistentVolumeSourceFluent.SecretRefNested<A> editSecretRef();

  public V1ISCSIPersistentVolumeSourceFluent.SecretRefNested<A> editOrNewSecretRef();

  public V1ISCSIPersistentVolumeSourceFluent.SecretRefNested<A> editOrNewSecretRefLike(
      V1SecretReference item);

  public String getTargetPortal();

  public A withTargetPortal(String targetPortal);

  public Boolean hasTargetPortal();

  public A withChapAuthDiscovery();

  public A withChapAuthSession();

  public A withReadOnly();

  public interface SecretRefNested<N>
      extends Nested<N>,
          V1SecretReferenceFluent<V1ISCSIPersistentVolumeSourceFluent.SecretRefNested<N>> {
    public N and();

    public N endSecretRef();
  }
}
