/*
Copyright 2020 The Kubernetes Authors.
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
package io.kubernetes.client.extended.kubectl;

import io.kubernetes.client.Discovery;
import io.kubernetes.client.apimachinery.GroupVersionResource;
import io.kubernetes.client.common.KubernetesListObject;
import io.kubernetes.client.common.KubernetesObject;
import io.kubernetes.client.extended.kubectl.exception.KubectlException;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.Configuration;
import io.kubernetes.client.util.ModelMapper;
import io.kubernetes.client.util.generic.GenericKubernetesApi;

/**
 * Kubectl provides a set of helper functions that has the same functionalities as corresponding
 * kubectl commands.
 */
public class Kubectl {
  /** Equivalent for `kubectl drain` */
  public static KubectlDrain drain() {
    return new KubectlDrain();
  }

  /** Equivalent for `kubectl cordon` */
  public static KubectlCordon cordon() {
    return new KubectlCordon(true);
  }

  /** Equivalent for `kubectl uncordon` */
  public static KubectlCordon uncordon() {
    return new KubectlCordon(false);
  }

  /**
   * Equivalent for `kubectl create`
   *
   * @return the kubectl create
   */
  public static KubectlCreate create() {
    return new KubectlCreate();
  }

  /**
   * Equivalent for `kubectl apply`
   *
   * @return the kubectl create
   */
  public static KubectlApply apply() {
    return new KubectlApply();
  }
  /**
   * Equivalent for `kubectl top`
   *
   * @param apiTypeClass Must be either V1Pod.class or V1Node.class
   * @return the kubectl top implementation
   */
  public static <ApiType extends KubernetesObject, MetricsType>
      KubectlTop<ApiType, MetricsType> top(
          Class<ApiType> apiTypeClass, Class<MetricsType> metricsTypeClass) {
    return new KubectlTop<ApiType, MetricsType>(apiTypeClass);
  }

  /** Equivalence for `kubectl taint`. */
  public static KubectlTaint taint() {
    return new KubectlTaint();
  }

  /**
   * Equivalence for `kubectl cp`.
   *
   * @return the kubectl copy
   */
  public static KubectlCopy copy() {
    return new KubectlCopy();
  }

  /**
   * Equivalence for `kubectl label`.
   *
   * @param <ApiType> the target api type
   * @param apiTypeClass the api type class
   * @return the kubectl label
   */
  public static <ApiType extends KubernetesObject> KubectlLabel<ApiType> label(
      Class<ApiType> apiTypeClass) {
    return new KubectlLabel<>(apiTypeClass);
  }

  /**
   * Equivalence for `kubectl annotate`.
   *
   * @param <ApiType> the target api type
   * @param apiTypeClass the api type class
   * @return the kubectl annotation
   */
  public static <ApiType extends KubernetesObject> KubectlAnnotate<ApiType> annotate(
      Class<ApiType> apiTypeClass) {
    return new KubectlAnnotate<>(apiTypeClass);
  }

  /**
   * Equivalence for `kubectl version`.
   *
   * @return the kubectl version
   */
  public static KubectlVersion version() {
    return new KubectlVersion();
  }

  /*
   * Equivalent for `kubectl scale`
   *
   * @param <ApiType> the target api type
   * @param apiTypeClass the api type class
   * @return the kubectl scale operator
   */
  public static <ApiType extends KubernetesObject> KubectlScale<ApiType> scale(
      Class<ApiType> apiTypeClass) {
    return new KubectlScale<>(apiTypeClass);
  }

  /**
   * Equivalent for `kubectl exec`
   *
   * @return the kubectl exec operator
   */
  public static KubectlExec exec() {
    return new KubectlExec();
  }

  /**
   * Equivalent for `kubectl log`
   *
   * @return the kubectl log operator
   */
  public static KubectlLog log() {
    return new KubectlLog();
  }

  public static KubectlPortForward portforward() {
    return new KubectlPortForward();
  }

  public static KubectlApiResources apiResources() {
    return new KubectlApiResources();
  }

  /**
   * Executable executes a kubectl helper.
   *
   * @param <OUTPUT> the type parameter
   */
  public static interface Executable<OUTPUT> {

    /**
     * Run and retrieve the output from the kubectl helpers.
     *
     * @return the output, can be Void
     * @throws KubectlException the kubectl exception
     */
    OUTPUT execute() throws KubectlException;
  }

  abstract static class NamespacedApiClientBuilder<T extends NamespacedApiClientBuilder>
      extends ApiClientBuilder<T> {
    String namespace;

    public T namespace(String namespace) {
      this.namespace = namespace;
      return (T) this;
    }
  }

  abstract static class ApiClientBuilder<T extends ApiClientBuilder> {
    ApiClient apiClient = Configuration.getDefaultApiClient();
    boolean skipDiscovery = false;

    protected void refreshDiscovery() throws KubectlException {
      if (skipDiscovery) {
        return;
      }
      try {
        ModelMapper.refresh(new Discovery(apiClient));
      } catch (ApiException e) {
        throw new KubectlException(e);
      }
    }

    protected GenericKubernetesApi<? extends KubernetesObject, KubernetesListObject> getGenericApi(
        Class<? extends KubernetesObject> apiTypeClass) {
      GroupVersionResource groupVersionResource =
          ModelMapper.getGroupVersionResourceByClass(apiTypeClass);

      GenericKubernetesApi<? extends KubernetesObject, KubernetesListObject> api =
          new GenericKubernetesApi<>(
              apiTypeClass,
              KubernetesListObject.class,
              groupVersionResource.getGroup(),
              groupVersionResource.getVersion(),
              groupVersionResource.getResource(),
              apiClient);
      return api;
    }

    public T apiClient(ApiClient apiClient) {
      this.apiClient = apiClient;
      return (T) this;
    }

    public T skipDiscovery() {
      this.skipDiscovery = true;
      return (T) this;
    }
  }

  abstract static class ResourceBuilder<
          ApiType extends KubernetesObject, T extends ResourceBuilder<ApiType, T>>
      extends NamespacedApiClientBuilder<T> {
    final Class<ApiType> apiTypeClass;
    String name;

    ResourceBuilder(Class<ApiType> apiTypeClass) {
      this.apiTypeClass = apiTypeClass;
    }

    public T name(String name) {
      this.name = name;
      return (T) this;
    }

    protected GenericKubernetesApi<ApiType, KubernetesListObject> getGenericApi() {
      GroupVersionResource groupVersionResource =
          ModelMapper.getGroupVersionResourceByClass(apiTypeClass);

      GenericKubernetesApi<ApiType, KubernetesListObject> api =
          new GenericKubernetesApi<>(
              apiTypeClass,
              KubernetesListObject.class,
              groupVersionResource.getGroup(),
              groupVersionResource.getVersion(),
              groupVersionResource.getResource(),
              apiClient);
      return api;
    }
  }

  abstract static class ResourceAndContainerBuilder<
          ApiType extends KubernetesObject, T extends ResourceAndContainerBuilder<ApiType, T>>
      extends ResourceBuilder<ApiType, T> {
    String container;

    ResourceAndContainerBuilder(Class<ApiType> apiTypeClass) {
      super(apiTypeClass);
    }

    public T container(String container) {
      this.container = container;
      return (T) this;
    }
  }
}
