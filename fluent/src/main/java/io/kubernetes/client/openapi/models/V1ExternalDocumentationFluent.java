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

/** Generated */
public interface V1ExternalDocumentationFluent<
        A extends io.kubernetes.client.openapi.models.V1ExternalDocumentationFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {
  public java.lang.String getDescription();

  public A withDescription(java.lang.String description);

  public java.lang.Boolean hasDescription();

  /** Method is deprecated. use withDescription instead. */
  @java.lang.Deprecated
  public A withNewDescription(java.lang.String original);

  public java.lang.String getUrl();

  public A withUrl(java.lang.String url);

  public java.lang.Boolean hasUrl();

  /** Method is deprecated. use withUrl instead. */
  @java.lang.Deprecated
  public A withNewUrl(java.lang.String original);
}
