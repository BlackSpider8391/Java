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

/** Generated */
public interface V1OwnerReferenceFluent<A extends V1OwnerReferenceFluent<A>> extends Fluent<A> {
  public String getApiVersion();

  public A withApiVersion(String apiVersion);

  public Boolean hasApiVersion();

  public Boolean getBlockOwnerDeletion();

  public A withBlockOwnerDeletion(Boolean blockOwnerDeletion);

  public Boolean hasBlockOwnerDeletion();

  public Boolean getController();

  public A withController(Boolean controller);

  public Boolean hasController();

  public String getKind();

  public A withKind(String kind);

  public Boolean hasKind();

  public String getName();

  public A withName(String name);

  public Boolean hasName();

  public String getUid();

  public A withUid(String uid);

  public Boolean hasUid();

  public A withBlockOwnerDeletion();

  public A withController();
}
