/*
Copyright 2021 The Kubernetes Authors.
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
package io.kubernetes.client.openapi.apis;

import com.google.gson.reflect.TypeToken;
import io.kubernetes.client.custom.V1Patch;
import io.kubernetes.client.openapi.ApiCallback;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.ApiResponse;
import io.kubernetes.client.openapi.Configuration;
import io.kubernetes.client.openapi.Pair;
import io.kubernetes.client.openapi.models.V1APIResourceList;
import io.kubernetes.client.openapi.models.V1DeleteOptions;
import io.kubernetes.client.openapi.models.V1Status;
import io.kubernetes.client.openapi.models.V1beta2FlowSchema;
import io.kubernetes.client.openapi.models.V1beta2FlowSchemaList;
import io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfiguration;
import io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationList;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlowcontrolApiserverV1beta2Api {
  private ApiClient localVarApiClient;

  public FlowcontrolApiserverV1beta2Api() {
    this(Configuration.getDefaultApiClient());
  }

  public FlowcontrolApiserverV1beta2Api(ApiClient apiClient) {
    this.localVarApiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return localVarApiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.localVarApiClient = apiClient;
  }

  /**
   * Build call for createFlowSchema
   *
   * @param body (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
   * @param fieldValidation fieldValidation determines how the server should respond to
   *     unknown/duplicate fields in the object in the request. Introduced as alpha in 1.23, older
   *     servers or servers with the &#x60;ServerSideFieldValidation&#x60; feature disabled will
   *     discard valid values specified in this param and not perform any server side field
   *     validation. Valid values are: - Ignore: ignores unknown/duplicate fields. - Warn: responds
   *     with a warning for each unknown/duplicate field, but successfully serves the request. -
   *     Strict: fails the request on unknown/duplicate fields. (optional)
   * @param _callback Callback for upload/download progress
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   * <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call createFlowSchemaCall(
      V1beta2FlowSchema body,
      String pretty,
      String dryRun,
      String fieldManager,
      String fieldValidation,
      final ApiCallback _callback)
      throws ApiException {
    Object localVarPostBody = body;

    // create path and map variables
    String localVarPath = "/apis/flowcontrol.apiserver.k8s.io/v1beta2/flowschemas";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    if (pretty != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("pretty", pretty));
    }

    if (dryRun != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("dryRun", dryRun));
    }

    if (fieldManager != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("fieldManager", fieldManager));
    }

    if (fieldValidation != null) {
      localVarQueryParams.addAll(
          localVarApiClient.parameterToPair("fieldValidation", fieldValidation));
    }

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();
    final String[] localVarAccepts = {
      "application/json", "application/yaml", "application/vnd.kubernetes.protobuf"
    };
    final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
    if (localVarAccept != null) {
      localVarHeaderParams.put("Accept", localVarAccept);
    }

    final String[] localVarContentTypes = {};

    final String localVarContentType =
        localVarApiClient.selectHeaderContentType(localVarContentTypes);
    localVarHeaderParams.put("Content-Type", localVarContentType);

    String[] localVarAuthNames = new String[] {"BearerToken"};
    return localVarApiClient.buildCall(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAuthNames,
        _callback);
  }

  @SuppressWarnings("rawtypes")
  private okhttp3.Call createFlowSchemaValidateBeforeCall(
      V1beta2FlowSchema body,
      String pretty,
      String dryRun,
      String fieldManager,
      String fieldValidation,
      final ApiCallback _callback)
      throws ApiException {

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          "Missing the required parameter 'body' when calling createFlowSchema(Async)");
    }

    okhttp3.Call localVarCall =
        createFlowSchemaCall(body, pretty, dryRun, fieldManager, fieldValidation, _callback);
    return localVarCall;
  }

  /**
   * create a FlowSchema
   *
   * @param body (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
   * @param fieldValidation fieldValidation determines how the server should respond to
   *     unknown/duplicate fields in the object in the request. Introduced as alpha in 1.23, older
   *     servers or servers with the &#x60;ServerSideFieldValidation&#x60; feature disabled will
   *     discard valid values specified in this param and not perform any server side field
   *     validation. Valid values are: - Ignore: ignores unknown/duplicate fields. - Warn: responds
   *     with a warning for each unknown/duplicate field, but successfully serves the request. -
   *     Strict: fails the request on unknown/duplicate fields. (optional)
   * @return V1beta2FlowSchema
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   * <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public V1beta2FlowSchema createFlowSchema(
      V1beta2FlowSchema body,
      String pretty,
      String dryRun,
      String fieldManager,
      String fieldValidation)
      throws ApiException {
    ApiResponse<V1beta2FlowSchema> localVarResp =
        createFlowSchemaWithHttpInfo(body, pretty, dryRun, fieldManager, fieldValidation);
    return localVarResp.getData();
  }

  /**
   * create a FlowSchema
   *
   * @param body (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
   * @param fieldValidation fieldValidation determines how the server should respond to
   *     unknown/duplicate fields in the object in the request. Introduced as alpha in 1.23, older
   *     servers or servers with the &#x60;ServerSideFieldValidation&#x60; feature disabled will
   *     discard valid values specified in this param and not perform any server side field
   *     validation. Valid values are: - Ignore: ignores unknown/duplicate fields. - Warn: responds
   *     with a warning for each unknown/duplicate field, but successfully serves the request. -
   *     Strict: fails the request on unknown/duplicate fields. (optional)
   * @return ApiResponse&lt;V1beta2FlowSchema&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   * <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public ApiResponse<V1beta2FlowSchema> createFlowSchemaWithHttpInfo(
      V1beta2FlowSchema body,
      String pretty,
      String dryRun,
      String fieldManager,
      String fieldValidation)
      throws ApiException {
    okhttp3.Call localVarCall =
        createFlowSchemaValidateBeforeCall(
            body, pretty, dryRun, fieldManager, fieldValidation, null);
    Type localVarReturnType = new TypeToken<V1beta2FlowSchema>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * (asynchronously) create a FlowSchema
   *
   * @param body (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
   * @param fieldValidation fieldValidation determines how the server should respond to
   *     unknown/duplicate fields in the object in the request. Introduced as alpha in 1.23, older
   *     servers or servers with the &#x60;ServerSideFieldValidation&#x60; feature disabled will
   *     discard valid values specified in this param and not perform any server side field
   *     validation. Valid values are: - Ignore: ignores unknown/duplicate fields. - Warn: responds
   *     with a warning for each unknown/duplicate field, but successfully serves the request. -
   *     Strict: fails the request on unknown/duplicate fields. (optional)
   * @param _callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   * <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call createFlowSchemaAsync(
      V1beta2FlowSchema body,
      String pretty,
      String dryRun,
      String fieldManager,
      String fieldValidation,
      final ApiCallback<V1beta2FlowSchema> _callback)
      throws ApiException {

    okhttp3.Call localVarCall =
        createFlowSchemaValidateBeforeCall(
            body, pretty, dryRun, fieldManager, fieldValidation, _callback);
    Type localVarReturnType = new TypeToken<V1beta2FlowSchema>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }
  /**
   * Build call for createPriorityLevelConfiguration
   *
   * @param body (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
   * @param fieldValidation fieldValidation determines how the server should respond to
   *     unknown/duplicate fields in the object in the request. Introduced as alpha in 1.23, older
   *     servers or servers with the &#x60;ServerSideFieldValidation&#x60; feature disabled will
   *     discard valid values specified in this param and not perform any server side field
   *     validation. Valid values are: - Ignore: ignores unknown/duplicate fields. - Warn: responds
   *     with a warning for each unknown/duplicate field, but successfully serves the request. -
   *     Strict: fails the request on unknown/duplicate fields. (optional)
   * @param _callback Callback for upload/download progress
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   * <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call createPriorityLevelConfigurationCall(
      V1beta2PriorityLevelConfiguration body,
      String pretty,
      String dryRun,
      String fieldManager,
      String fieldValidation,
      final ApiCallback _callback)
      throws ApiException {
    Object localVarPostBody = body;

    // create path and map variables
    String localVarPath = "/apis/flowcontrol.apiserver.k8s.io/v1beta2/prioritylevelconfigurations";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    if (pretty != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("pretty", pretty));
    }

    if (dryRun != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("dryRun", dryRun));
    }

    if (fieldManager != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("fieldManager", fieldManager));
    }

    if (fieldValidation != null) {
      localVarQueryParams.addAll(
          localVarApiClient.parameterToPair("fieldValidation", fieldValidation));
    }

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();
    final String[] localVarAccepts = {
      "application/json", "application/yaml", "application/vnd.kubernetes.protobuf"
    };
    final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
    if (localVarAccept != null) {
      localVarHeaderParams.put("Accept", localVarAccept);
    }

    final String[] localVarContentTypes = {};

    final String localVarContentType =
        localVarApiClient.selectHeaderContentType(localVarContentTypes);
    localVarHeaderParams.put("Content-Type", localVarContentType);

    String[] localVarAuthNames = new String[] {"BearerToken"};
    return localVarApiClient.buildCall(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAuthNames,
        _callback);
  }

  @SuppressWarnings("rawtypes")
  private okhttp3.Call createPriorityLevelConfigurationValidateBeforeCall(
      V1beta2PriorityLevelConfiguration body,
      String pretty,
      String dryRun,
      String fieldManager,
      String fieldValidation,
      final ApiCallback _callback)
      throws ApiException {

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          "Missing the required parameter 'body' when calling createPriorityLevelConfiguration(Async)");
    }

    okhttp3.Call localVarCall =
        createPriorityLevelConfigurationCall(
            body, pretty, dryRun, fieldManager, fieldValidation, _callback);
    return localVarCall;
  }

  /**
   * create a PriorityLevelConfiguration
   *
   * @param body (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
   * @param fieldValidation fieldValidation determines how the server should respond to
   *     unknown/duplicate fields in the object in the request. Introduced as alpha in 1.23, older
   *     servers or servers with the &#x60;ServerSideFieldValidation&#x60; feature disabled will
   *     discard valid values specified in this param and not perform any server side field
   *     validation. Valid values are: - Ignore: ignores unknown/duplicate fields. - Warn: responds
   *     with a warning for each unknown/duplicate field, but successfully serves the request. -
   *     Strict: fails the request on unknown/duplicate fields. (optional)
   * @return V1beta2PriorityLevelConfiguration
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   * <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public V1beta2PriorityLevelConfiguration createPriorityLevelConfiguration(
      V1beta2PriorityLevelConfiguration body,
      String pretty,
      String dryRun,
      String fieldManager,
      String fieldValidation)
      throws ApiException {
    ApiResponse<V1beta2PriorityLevelConfiguration> localVarResp =
        createPriorityLevelConfigurationWithHttpInfo(
            body, pretty, dryRun, fieldManager, fieldValidation);
    return localVarResp.getData();
  }

  /**
   * create a PriorityLevelConfiguration
   *
   * @param body (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
   * @param fieldValidation fieldValidation determines how the server should respond to
   *     unknown/duplicate fields in the object in the request. Introduced as alpha in 1.23, older
   *     servers or servers with the &#x60;ServerSideFieldValidation&#x60; feature disabled will
   *     discard valid values specified in this param and not perform any server side field
   *     validation. Valid values are: - Ignore: ignores unknown/duplicate fields. - Warn: responds
   *     with a warning for each unknown/duplicate field, but successfully serves the request. -
   *     Strict: fails the request on unknown/duplicate fields. (optional)
   * @return ApiResponse&lt;V1beta2PriorityLevelConfiguration&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   * <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public ApiResponse<V1beta2PriorityLevelConfiguration>
      createPriorityLevelConfigurationWithHttpInfo(
          V1beta2PriorityLevelConfiguration body,
          String pretty,
          String dryRun,
          String fieldManager,
          String fieldValidation)
          throws ApiException {
    okhttp3.Call localVarCall =
        createPriorityLevelConfigurationValidateBeforeCall(
            body, pretty, dryRun, fieldManager, fieldValidation, null);
    Type localVarReturnType = new TypeToken<V1beta2PriorityLevelConfiguration>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * (asynchronously) create a PriorityLevelConfiguration
   *
   * @param body (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
   * @param fieldValidation fieldValidation determines how the server should respond to
   *     unknown/duplicate fields in the object in the request. Introduced as alpha in 1.23, older
   *     servers or servers with the &#x60;ServerSideFieldValidation&#x60; feature disabled will
   *     discard valid values specified in this param and not perform any server side field
   *     validation. Valid values are: - Ignore: ignores unknown/duplicate fields. - Warn: responds
   *     with a warning for each unknown/duplicate field, but successfully serves the request. -
   *     Strict: fails the request on unknown/duplicate fields. (optional)
   * @param _callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   * <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call createPriorityLevelConfigurationAsync(
      V1beta2PriorityLevelConfiguration body,
      String pretty,
      String dryRun,
      String fieldManager,
      String fieldValidation,
      final ApiCallback<V1beta2PriorityLevelConfiguration> _callback)
      throws ApiException {

    okhttp3.Call localVarCall =
        createPriorityLevelConfigurationValidateBeforeCall(
            body, pretty, dryRun, fieldManager, fieldValidation, _callback);
    Type localVarReturnType = new TypeToken<V1beta2PriorityLevelConfiguration>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }
  /**
   * Build call for deleteCollectionFlowSchema
   *
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param _continue The continue option should be set when retrieving more results from the
   *     server. Since this value is server defined, clients may only use the continue value from a
   *     previous query result with identical query parameters (except for the value of continue)
   *     and the server may reject a continue value it does not recognize. If the specified continue
   *     value is no longer valid whether due to expiration (generally five to fifteen minutes) or a
   *     configuration change on the server, the server will respond with a 410 ResourceExpired
   *     error together with a continue token. If the client needs a consistent list, it must
   *     restart their list without the continue field. Otherwise, the client may send another list
   *     request with the token received with the 410 error, the server will respond with a list
   *     starting from the next key, but from the latest snapshot, which is inconsistent from the
   *     previous list results - objects that are created, modified, or deleted after the first list
   *     request will be included in the response, as long as their keys are after the \&quot;next
   *     key\&quot;. This field is not supported when watch is true. Clients may start a watch from
   *     the last resourceVersion value returned by the server and not miss any modifications.
   *     (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldSelector A selector to restrict the list of returned objects by their fields.
   *     Defaults to everything. (optional)
   * @param gracePeriodSeconds The duration in seconds before the object should be deleted. Value
   *     must be non-negative integer. The value zero indicates delete immediately. If this value is
   *     nil, the default grace period for the specified type will be used. Defaults to a per object
   *     value if not specified. zero means delete immediately. (optional)
   * @param labelSelector A selector to restrict the list of returned objects by their labels.
   *     Defaults to everything. (optional)
   * @param limit limit is a maximum number of responses to return for a list call. If more items
   *     exist, the server will set the &#x60;continue&#x60; field on the list metadata to a value
   *     that can be used with the same initial query to retrieve the next set of results. Setting a
   *     limit may return fewer than the requested amount of items (up to zero items) in the event
   *     all requested objects are filtered out and clients should only use the presence of the
   *     continue field to determine whether more results are available. Servers may choose not to
   *     support the limit argument and will return all of the available results. If limit is
   *     specified and the continue field is empty, clients may assume that no more results are
   *     available. This field is not supported if watch is true. The server guarantees that the
   *     objects returned when using continue will be identical to issuing a single list call
   *     without a limit - that is, no objects created, modified, or deleted after the first request
   *     is issued will be included in any subsequent continued requests. This is sometimes referred
   *     to as a consistent snapshot, and ensures that a client that is using limit to receive
   *     smaller chunks of a very large result can ensure they see all possible objects. If objects
   *     are updated during a chunked list the version of the object that was present at the time
   *     the first list result was calculated is returned. (optional)
   * @param orphanDependents Deprecated: please use the PropagationPolicy, this field will be
   *     deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the
   *     \&quot;orphan\&quot; finalizer will be added to/removed from the object&#39;s finalizers
   *     list. Either this field or PropagationPolicy may be set, but not both. (optional)
   * @param propagationPolicy Whether and how garbage collection will be performed. Either this
   *     field or OrphanDependents may be set, but not both. The default policy is decided by the
   *     existing finalizer set in the metadata.finalizers and the resource-specific default policy.
   *     Acceptable values are: &#39;Orphan&#39; - orphan the dependents; &#39;Background&#39; -
   *     allow the garbage collector to delete the dependents in the background;
   *     &#39;Foreground&#39; - a cascading policy that deletes all dependents in the foreground.
   *     (optional)
   * @param resourceVersion resourceVersion sets a constraint on what resource versions a request
   *     may be served from. See
   *     https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.
   *     Defaults to unset (optional)
   * @param resourceVersionMatch resourceVersionMatch determines how resourceVersion is applied to
   *     list calls. It is highly recommended that resourceVersionMatch be set for list calls where
   *     resourceVersion is set See
   *     https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.
   *     Defaults to unset (optional)
   * @param timeoutSeconds Timeout for the list/watch call. This limits the duration of the call,
   *     regardless of any activity or inactivity. (optional)
   * @param body (optional)
   * @param _callback Callback for upload/download progress
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call deleteCollectionFlowSchemaCall(
      String pretty,
      String _continue,
      String dryRun,
      String fieldSelector,
      Integer gracePeriodSeconds,
      String labelSelector,
      Integer limit,
      Boolean orphanDependents,
      String propagationPolicy,
      String resourceVersion,
      String resourceVersionMatch,
      Integer timeoutSeconds,
      V1DeleteOptions body,
      final ApiCallback _callback)
      throws ApiException {
    Object localVarPostBody = body;

    // create path and map variables
    String localVarPath = "/apis/flowcontrol.apiserver.k8s.io/v1beta2/flowschemas";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    if (pretty != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("pretty", pretty));
    }

    if (_continue != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("continue", _continue));
    }

    if (dryRun != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("dryRun", dryRun));
    }

    if (fieldSelector != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("fieldSelector", fieldSelector));
    }

    if (gracePeriodSeconds != null) {
      localVarQueryParams.addAll(
          localVarApiClient.parameterToPair("gracePeriodSeconds", gracePeriodSeconds));
    }

    if (labelSelector != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("labelSelector", labelSelector));
    }

    if (limit != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
    }

    if (orphanDependents != null) {
      localVarQueryParams.addAll(
          localVarApiClient.parameterToPair("orphanDependents", orphanDependents));
    }

    if (propagationPolicy != null) {
      localVarQueryParams.addAll(
          localVarApiClient.parameterToPair("propagationPolicy", propagationPolicy));
    }

    if (resourceVersion != null) {
      localVarQueryParams.addAll(
          localVarApiClient.parameterToPair("resourceVersion", resourceVersion));
    }

    if (resourceVersionMatch != null) {
      localVarQueryParams.addAll(
          localVarApiClient.parameterToPair("resourceVersionMatch", resourceVersionMatch));
    }

    if (timeoutSeconds != null) {
      localVarQueryParams.addAll(
          localVarApiClient.parameterToPair("timeoutSeconds", timeoutSeconds));
    }

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();
    final String[] localVarAccepts = {
      "application/json", "application/yaml", "application/vnd.kubernetes.protobuf"
    };
    final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
    if (localVarAccept != null) {
      localVarHeaderParams.put("Accept", localVarAccept);
    }

    final String[] localVarContentTypes = {};

    final String localVarContentType =
        localVarApiClient.selectHeaderContentType(localVarContentTypes);
    localVarHeaderParams.put("Content-Type", localVarContentType);

    String[] localVarAuthNames = new String[] {"BearerToken"};
    return localVarApiClient.buildCall(
        localVarPath,
        "DELETE",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAuthNames,
        _callback);
  }

  @SuppressWarnings("rawtypes")
  private okhttp3.Call deleteCollectionFlowSchemaValidateBeforeCall(
      String pretty,
      String _continue,
      String dryRun,
      String fieldSelector,
      Integer gracePeriodSeconds,
      String labelSelector,
      Integer limit,
      Boolean orphanDependents,
      String propagationPolicy,
      String resourceVersion,
      String resourceVersionMatch,
      Integer timeoutSeconds,
      V1DeleteOptions body,
      final ApiCallback _callback)
      throws ApiException {

    okhttp3.Call localVarCall =
        deleteCollectionFlowSchemaCall(
            pretty,
            _continue,
            dryRun,
            fieldSelector,
            gracePeriodSeconds,
            labelSelector,
            limit,
            orphanDependents,
            propagationPolicy,
            resourceVersion,
            resourceVersionMatch,
            timeoutSeconds,
            body,
            _callback);
    return localVarCall;
  }

  /**
   * delete collection of FlowSchema
   *
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param _continue The continue option should be set when retrieving more results from the
   *     server. Since this value is server defined, clients may only use the continue value from a
   *     previous query result with identical query parameters (except for the value of continue)
   *     and the server may reject a continue value it does not recognize. If the specified continue
   *     value is no longer valid whether due to expiration (generally five to fifteen minutes) or a
   *     configuration change on the server, the server will respond with a 410 ResourceExpired
   *     error together with a continue token. If the client needs a consistent list, it must
   *     restart their list without the continue field. Otherwise, the client may send another list
   *     request with the token received with the 410 error, the server will respond with a list
   *     starting from the next key, but from the latest snapshot, which is inconsistent from the
   *     previous list results - objects that are created, modified, or deleted after the first list
   *     request will be included in the response, as long as their keys are after the \&quot;next
   *     key\&quot;. This field is not supported when watch is true. Clients may start a watch from
   *     the last resourceVersion value returned by the server and not miss any modifications.
   *     (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldSelector A selector to restrict the list of returned objects by their fields.
   *     Defaults to everything. (optional)
   * @param gracePeriodSeconds The duration in seconds before the object should be deleted. Value
   *     must be non-negative integer. The value zero indicates delete immediately. If this value is
   *     nil, the default grace period for the specified type will be used. Defaults to a per object
   *     value if not specified. zero means delete immediately. (optional)
   * @param labelSelector A selector to restrict the list of returned objects by their labels.
   *     Defaults to everything. (optional)
   * @param limit limit is a maximum number of responses to return for a list call. If more items
   *     exist, the server will set the &#x60;continue&#x60; field on the list metadata to a value
   *     that can be used with the same initial query to retrieve the next set of results. Setting a
   *     limit may return fewer than the requested amount of items (up to zero items) in the event
   *     all requested objects are filtered out and clients should only use the presence of the
   *     continue field to determine whether more results are available. Servers may choose not to
   *     support the limit argument and will return all of the available results. If limit is
   *     specified and the continue field is empty, clients may assume that no more results are
   *     available. This field is not supported if watch is true. The server guarantees that the
   *     objects returned when using continue will be identical to issuing a single list call
   *     without a limit - that is, no objects created, modified, or deleted after the first request
   *     is issued will be included in any subsequent continued requests. This is sometimes referred
   *     to as a consistent snapshot, and ensures that a client that is using limit to receive
   *     smaller chunks of a very large result can ensure they see all possible objects. If objects
   *     are updated during a chunked list the version of the object that was present at the time
   *     the first list result was calculated is returned. (optional)
   * @param orphanDependents Deprecated: please use the PropagationPolicy, this field will be
   *     deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the
   *     \&quot;orphan\&quot; finalizer will be added to/removed from the object&#39;s finalizers
   *     list. Either this field or PropagationPolicy may be set, but not both. (optional)
   * @param propagationPolicy Whether and how garbage collection will be performed. Either this
   *     field or OrphanDependents may be set, but not both. The default policy is decided by the
   *     existing finalizer set in the metadata.finalizers and the resource-specific default policy.
   *     Acceptable values are: &#39;Orphan&#39; - orphan the dependents; &#39;Background&#39; -
   *     allow the garbage collector to delete the dependents in the background;
   *     &#39;Foreground&#39; - a cascading policy that deletes all dependents in the foreground.
   *     (optional)
   * @param resourceVersion resourceVersion sets a constraint on what resource versions a request
   *     may be served from. See
   *     https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.
   *     Defaults to unset (optional)
   * @param resourceVersionMatch resourceVersionMatch determines how resourceVersion is applied to
   *     list calls. It is highly recommended that resourceVersionMatch be set for list calls where
   *     resourceVersion is set See
   *     https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.
   *     Defaults to unset (optional)
   * @param timeoutSeconds Timeout for the list/watch call. This limits the duration of the call,
   *     regardless of any activity or inactivity. (optional)
   * @param body (optional)
   * @return V1Status
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public V1Status deleteCollectionFlowSchema(
      String pretty,
      String _continue,
      String dryRun,
      String fieldSelector,
      Integer gracePeriodSeconds,
      String labelSelector,
      Integer limit,
      Boolean orphanDependents,
      String propagationPolicy,
      String resourceVersion,
      String resourceVersionMatch,
      Integer timeoutSeconds,
      V1DeleteOptions body)
      throws ApiException {
    ApiResponse<V1Status> localVarResp =
        deleteCollectionFlowSchemaWithHttpInfo(
            pretty,
            _continue,
            dryRun,
            fieldSelector,
            gracePeriodSeconds,
            labelSelector,
            limit,
            orphanDependents,
            propagationPolicy,
            resourceVersion,
            resourceVersionMatch,
            timeoutSeconds,
            body);
    return localVarResp.getData();
  }

  /**
   * delete collection of FlowSchema
   *
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param _continue The continue option should be set when retrieving more results from the
   *     server. Since this value is server defined, clients may only use the continue value from a
   *     previous query result with identical query parameters (except for the value of continue)
   *     and the server may reject a continue value it does not recognize. If the specified continue
   *     value is no longer valid whether due to expiration (generally five to fifteen minutes) or a
   *     configuration change on the server, the server will respond with a 410 ResourceExpired
   *     error together with a continue token. If the client needs a consistent list, it must
   *     restart their list without the continue field. Otherwise, the client may send another list
   *     request with the token received with the 410 error, the server will respond with a list
   *     starting from the next key, but from the latest snapshot, which is inconsistent from the
   *     previous list results - objects that are created, modified, or deleted after the first list
   *     request will be included in the response, as long as their keys are after the \&quot;next
   *     key\&quot;. This field is not supported when watch is true. Clients may start a watch from
   *     the last resourceVersion value returned by the server and not miss any modifications.
   *     (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldSelector A selector to restrict the list of returned objects by their fields.
   *     Defaults to everything. (optional)
   * @param gracePeriodSeconds The duration in seconds before the object should be deleted. Value
   *     must be non-negative integer. The value zero indicates delete immediately. If this value is
   *     nil, the default grace period for the specified type will be used. Defaults to a per object
   *     value if not specified. zero means delete immediately. (optional)
   * @param labelSelector A selector to restrict the list of returned objects by their labels.
   *     Defaults to everything. (optional)
   * @param limit limit is a maximum number of responses to return for a list call. If more items
   *     exist, the server will set the &#x60;continue&#x60; field on the list metadata to a value
   *     that can be used with the same initial query to retrieve the next set of results. Setting a
   *     limit may return fewer than the requested amount of items (up to zero items) in the event
   *     all requested objects are filtered out and clients should only use the presence of the
   *     continue field to determine whether more results are available. Servers may choose not to
   *     support the limit argument and will return all of the available results. If limit is
   *     specified and the continue field is empty, clients may assume that no more results are
   *     available. This field is not supported if watch is true. The server guarantees that the
   *     objects returned when using continue will be identical to issuing a single list call
   *     without a limit - that is, no objects created, modified, or deleted after the first request
   *     is issued will be included in any subsequent continued requests. This is sometimes referred
   *     to as a consistent snapshot, and ensures that a client that is using limit to receive
   *     smaller chunks of a very large result can ensure they see all possible objects. If objects
   *     are updated during a chunked list the version of the object that was present at the time
   *     the first list result was calculated is returned. (optional)
   * @param orphanDependents Deprecated: please use the PropagationPolicy, this field will be
   *     deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the
   *     \&quot;orphan\&quot; finalizer will be added to/removed from the object&#39;s finalizers
   *     list. Either this field or PropagationPolicy may be set, but not both. (optional)
   * @param propagationPolicy Whether and how garbage collection will be performed. Either this
   *     field or OrphanDependents may be set, but not both. The default policy is decided by the
   *     existing finalizer set in the metadata.finalizers and the resource-specific default policy.
   *     Acceptable values are: &#39;Orphan&#39; - orphan the dependents; &#39;Background&#39; -
   *     allow the garbage collector to delete the dependents in the background;
   *     &#39;Foreground&#39; - a cascading policy that deletes all dependents in the foreground.
   *     (optional)
   * @param resourceVersion resourceVersion sets a constraint on what resource versions a request
   *     may be served from. See
   *     https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.
   *     Defaults to unset (optional)
   * @param resourceVersionMatch resourceVersionMatch determines how resourceVersion is applied to
   *     list calls. It is highly recommended that resourceVersionMatch be set for list calls where
   *     resourceVersion is set See
   *     https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.
   *     Defaults to unset (optional)
   * @param timeoutSeconds Timeout for the list/watch call. This limits the duration of the call,
   *     regardless of any activity or inactivity. (optional)
   * @param body (optional)
   * @return ApiResponse&lt;V1Status&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public ApiResponse<V1Status> deleteCollectionFlowSchemaWithHttpInfo(
      String pretty,
      String _continue,
      String dryRun,
      String fieldSelector,
      Integer gracePeriodSeconds,
      String labelSelector,
      Integer limit,
      Boolean orphanDependents,
      String propagationPolicy,
      String resourceVersion,
      String resourceVersionMatch,
      Integer timeoutSeconds,
      V1DeleteOptions body)
      throws ApiException {
    okhttp3.Call localVarCall =
        deleteCollectionFlowSchemaValidateBeforeCall(
            pretty,
            _continue,
            dryRun,
            fieldSelector,
            gracePeriodSeconds,
            labelSelector,
            limit,
            orphanDependents,
            propagationPolicy,
            resourceVersion,
            resourceVersionMatch,
            timeoutSeconds,
            body,
            null);
    Type localVarReturnType = new TypeToken<V1Status>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * (asynchronously) delete collection of FlowSchema
   *
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param _continue The continue option should be set when retrieving more results from the
   *     server. Since this value is server defined, clients may only use the continue value from a
   *     previous query result with identical query parameters (except for the value of continue)
   *     and the server may reject a continue value it does not recognize. If the specified continue
   *     value is no longer valid whether due to expiration (generally five to fifteen minutes) or a
   *     configuration change on the server, the server will respond with a 410 ResourceExpired
   *     error together with a continue token. If the client needs a consistent list, it must
   *     restart their list without the continue field. Otherwise, the client may send another list
   *     request with the token received with the 410 error, the server will respond with a list
   *     starting from the next key, but from the latest snapshot, which is inconsistent from the
   *     previous list results - objects that are created, modified, or deleted after the first list
   *     request will be included in the response, as long as their keys are after the \&quot;next
   *     key\&quot;. This field is not supported when watch is true. Clients may start a watch from
   *     the last resourceVersion value returned by the server and not miss any modifications.
   *     (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldSelector A selector to restrict the list of returned objects by their fields.
   *     Defaults to everything. (optional)
   * @param gracePeriodSeconds The duration in seconds before the object should be deleted. Value
   *     must be non-negative integer. The value zero indicates delete immediately. If this value is
   *     nil, the default grace period for the specified type will be used. Defaults to a per object
   *     value if not specified. zero means delete immediately. (optional)
   * @param labelSelector A selector to restrict the list of returned objects by their labels.
   *     Defaults to everything. (optional)
   * @param limit limit is a maximum number of responses to return for a list call. If more items
   *     exist, the server will set the &#x60;continue&#x60; field on the list metadata to a value
   *     that can be used with the same initial query to retrieve the next set of results. Setting a
   *     limit may return fewer than the requested amount of items (up to zero items) in the event
   *     all requested objects are filtered out and clients should only use the presence of the
   *     continue field to determine whether more results are available. Servers may choose not to
   *     support the limit argument and will return all of the available results. If limit is
   *     specified and the continue field is empty, clients may assume that no more results are
   *     available. This field is not supported if watch is true. The server guarantees that the
   *     objects returned when using continue will be identical to issuing a single list call
   *     without a limit - that is, no objects created, modified, or deleted after the first request
   *     is issued will be included in any subsequent continued requests. This is sometimes referred
   *     to as a consistent snapshot, and ensures that a client that is using limit to receive
   *     smaller chunks of a very large result can ensure they see all possible objects. If objects
   *     are updated during a chunked list the version of the object that was present at the time
   *     the first list result was calculated is returned. (optional)
   * @param orphanDependents Deprecated: please use the PropagationPolicy, this field will be
   *     deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the
   *     \&quot;orphan\&quot; finalizer will be added to/removed from the object&#39;s finalizers
   *     list. Either this field or PropagationPolicy may be set, but not both. (optional)
   * @param propagationPolicy Whether and how garbage collection will be performed. Either this
   *     field or OrphanDependents may be set, but not both. The default policy is decided by the
   *     existing finalizer set in the metadata.finalizers and the resource-specific default policy.
   *     Acceptable values are: &#39;Orphan&#39; - orphan the dependents; &#39;Background&#39; -
   *     allow the garbage collector to delete the dependents in the background;
   *     &#39;Foreground&#39; - a cascading policy that deletes all dependents in the foreground.
   *     (optional)
   * @param resourceVersion resourceVersion sets a constraint on what resource versions a request
   *     may be served from. See
   *     https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.
   *     Defaults to unset (optional)
   * @param resourceVersionMatch resourceVersionMatch determines how resourceVersion is applied to
   *     list calls. It is highly recommended that resourceVersionMatch be set for list calls where
   *     resourceVersion is set See
   *     https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.
   *     Defaults to unset (optional)
   * @param timeoutSeconds Timeout for the list/watch call. This limits the duration of the call,
   *     regardless of any activity or inactivity. (optional)
   * @param body (optional)
   * @param _callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call deleteCollectionFlowSchemaAsync(
      String pretty,
      String _continue,
      String dryRun,
      String fieldSelector,
      Integer gracePeriodSeconds,
      String labelSelector,
      Integer limit,
      Boolean orphanDependents,
      String propagationPolicy,
      String resourceVersion,
      String resourceVersionMatch,
      Integer timeoutSeconds,
      V1DeleteOptions body,
      final ApiCallback<V1Status> _callback)
      throws ApiException {

    okhttp3.Call localVarCall =
        deleteCollectionFlowSchemaValidateBeforeCall(
            pretty,
            _continue,
            dryRun,
            fieldSelector,
            gracePeriodSeconds,
            labelSelector,
            limit,
            orphanDependents,
            propagationPolicy,
            resourceVersion,
            resourceVersionMatch,
            timeoutSeconds,
            body,
            _callback);
    Type localVarReturnType = new TypeToken<V1Status>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }
  /**
   * Build call for deleteCollectionPriorityLevelConfiguration
   *
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param _continue The continue option should be set when retrieving more results from the
   *     server. Since this value is server defined, clients may only use the continue value from a
   *     previous query result with identical query parameters (except for the value of continue)
   *     and the server may reject a continue value it does not recognize. If the specified continue
   *     value is no longer valid whether due to expiration (generally five to fifteen minutes) or a
   *     configuration change on the server, the server will respond with a 410 ResourceExpired
   *     error together with a continue token. If the client needs a consistent list, it must
   *     restart their list without the continue field. Otherwise, the client may send another list
   *     request with the token received with the 410 error, the server will respond with a list
   *     starting from the next key, but from the latest snapshot, which is inconsistent from the
   *     previous list results - objects that are created, modified, or deleted after the first list
   *     request will be included in the response, as long as their keys are after the \&quot;next
   *     key\&quot;. This field is not supported when watch is true. Clients may start a watch from
   *     the last resourceVersion value returned by the server and not miss any modifications.
   *     (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldSelector A selector to restrict the list of returned objects by their fields.
   *     Defaults to everything. (optional)
   * @param gracePeriodSeconds The duration in seconds before the object should be deleted. Value
   *     must be non-negative integer. The value zero indicates delete immediately. If this value is
   *     nil, the default grace period for the specified type will be used. Defaults to a per object
   *     value if not specified. zero means delete immediately. (optional)
   * @param labelSelector A selector to restrict the list of returned objects by their labels.
   *     Defaults to everything. (optional)
   * @param limit limit is a maximum number of responses to return for a list call. If more items
   *     exist, the server will set the &#x60;continue&#x60; field on the list metadata to a value
   *     that can be used with the same initial query to retrieve the next set of results. Setting a
   *     limit may return fewer than the requested amount of items (up to zero items) in the event
   *     all requested objects are filtered out and clients should only use the presence of the
   *     continue field to determine whether more results are available. Servers may choose not to
   *     support the limit argument and will return all of the available results. If limit is
   *     specified and the continue field is empty, clients may assume that no more results are
   *     available. This field is not supported if watch is true. The server guarantees that the
   *     objects returned when using continue will be identical to issuing a single list call
   *     without a limit - that is, no objects created, modified, or deleted after the first request
   *     is issued will be included in any subsequent continued requests. This is sometimes referred
   *     to as a consistent snapshot, and ensures that a client that is using limit to receive
   *     smaller chunks of a very large result can ensure they see all possible objects. If objects
   *     are updated during a chunked list the version of the object that was present at the time
   *     the first list result was calculated is returned. (optional)
   * @param orphanDependents Deprecated: please use the PropagationPolicy, this field will be
   *     deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the
   *     \&quot;orphan\&quot; finalizer will be added to/removed from the object&#39;s finalizers
   *     list. Either this field or PropagationPolicy may be set, but not both. (optional)
   * @param propagationPolicy Whether and how garbage collection will be performed. Either this
   *     field or OrphanDependents may be set, but not both. The default policy is decided by the
   *     existing finalizer set in the metadata.finalizers and the resource-specific default policy.
   *     Acceptable values are: &#39;Orphan&#39; - orphan the dependents; &#39;Background&#39; -
   *     allow the garbage collector to delete the dependents in the background;
   *     &#39;Foreground&#39; - a cascading policy that deletes all dependents in the foreground.
   *     (optional)
   * @param resourceVersion resourceVersion sets a constraint on what resource versions a request
   *     may be served from. See
   *     https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.
   *     Defaults to unset (optional)
   * @param resourceVersionMatch resourceVersionMatch determines how resourceVersion is applied to
   *     list calls. It is highly recommended that resourceVersionMatch be set for list calls where
   *     resourceVersion is set See
   *     https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.
   *     Defaults to unset (optional)
   * @param timeoutSeconds Timeout for the list/watch call. This limits the duration of the call,
   *     regardless of any activity or inactivity. (optional)
   * @param body (optional)
   * @param _callback Callback for upload/download progress
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call deleteCollectionPriorityLevelConfigurationCall(
      String pretty,
      String _continue,
      String dryRun,
      String fieldSelector,
      Integer gracePeriodSeconds,
      String labelSelector,
      Integer limit,
      Boolean orphanDependents,
      String propagationPolicy,
      String resourceVersion,
      String resourceVersionMatch,
      Integer timeoutSeconds,
      V1DeleteOptions body,
      final ApiCallback _callback)
      throws ApiException {
    Object localVarPostBody = body;

    // create path and map variables
    String localVarPath = "/apis/flowcontrol.apiserver.k8s.io/v1beta2/prioritylevelconfigurations";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    if (pretty != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("pretty", pretty));
    }

    if (_continue != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("continue", _continue));
    }

    if (dryRun != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("dryRun", dryRun));
    }

    if (fieldSelector != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("fieldSelector", fieldSelector));
    }

    if (gracePeriodSeconds != null) {
      localVarQueryParams.addAll(
          localVarApiClient.parameterToPair("gracePeriodSeconds", gracePeriodSeconds));
    }

    if (labelSelector != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("labelSelector", labelSelector));
    }

    if (limit != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
    }

    if (orphanDependents != null) {
      localVarQueryParams.addAll(
          localVarApiClient.parameterToPair("orphanDependents", orphanDependents));
    }

    if (propagationPolicy != null) {
      localVarQueryParams.addAll(
          localVarApiClient.parameterToPair("propagationPolicy", propagationPolicy));
    }

    if (resourceVersion != null) {
      localVarQueryParams.addAll(
          localVarApiClient.parameterToPair("resourceVersion", resourceVersion));
    }

    if (resourceVersionMatch != null) {
      localVarQueryParams.addAll(
          localVarApiClient.parameterToPair("resourceVersionMatch", resourceVersionMatch));
    }

    if (timeoutSeconds != null) {
      localVarQueryParams.addAll(
          localVarApiClient.parameterToPair("timeoutSeconds", timeoutSeconds));
    }

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();
    final String[] localVarAccepts = {
      "application/json", "application/yaml", "application/vnd.kubernetes.protobuf"
    };
    final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
    if (localVarAccept != null) {
      localVarHeaderParams.put("Accept", localVarAccept);
    }

    final String[] localVarContentTypes = {};

    final String localVarContentType =
        localVarApiClient.selectHeaderContentType(localVarContentTypes);
    localVarHeaderParams.put("Content-Type", localVarContentType);

    String[] localVarAuthNames = new String[] {"BearerToken"};
    return localVarApiClient.buildCall(
        localVarPath,
        "DELETE",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAuthNames,
        _callback);
  }

  @SuppressWarnings("rawtypes")
  private okhttp3.Call deleteCollectionPriorityLevelConfigurationValidateBeforeCall(
      String pretty,
      String _continue,
      String dryRun,
      String fieldSelector,
      Integer gracePeriodSeconds,
      String labelSelector,
      Integer limit,
      Boolean orphanDependents,
      String propagationPolicy,
      String resourceVersion,
      String resourceVersionMatch,
      Integer timeoutSeconds,
      V1DeleteOptions body,
      final ApiCallback _callback)
      throws ApiException {

    okhttp3.Call localVarCall =
        deleteCollectionPriorityLevelConfigurationCall(
            pretty,
            _continue,
            dryRun,
            fieldSelector,
            gracePeriodSeconds,
            labelSelector,
            limit,
            orphanDependents,
            propagationPolicy,
            resourceVersion,
            resourceVersionMatch,
            timeoutSeconds,
            body,
            _callback);
    return localVarCall;
  }

  /**
   * delete collection of PriorityLevelConfiguration
   *
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param _continue The continue option should be set when retrieving more results from the
   *     server. Since this value is server defined, clients may only use the continue value from a
   *     previous query result with identical query parameters (except for the value of continue)
   *     and the server may reject a continue value it does not recognize. If the specified continue
   *     value is no longer valid whether due to expiration (generally five to fifteen minutes) or a
   *     configuration change on the server, the server will respond with a 410 ResourceExpired
   *     error together with a continue token. If the client needs a consistent list, it must
   *     restart their list without the continue field. Otherwise, the client may send another list
   *     request with the token received with the 410 error, the server will respond with a list
   *     starting from the next key, but from the latest snapshot, which is inconsistent from the
   *     previous list results - objects that are created, modified, or deleted after the first list
   *     request will be included in the response, as long as their keys are after the \&quot;next
   *     key\&quot;. This field is not supported when watch is true. Clients may start a watch from
   *     the last resourceVersion value returned by the server and not miss any modifications.
   *     (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldSelector A selector to restrict the list of returned objects by their fields.
   *     Defaults to everything. (optional)
   * @param gracePeriodSeconds The duration in seconds before the object should be deleted. Value
   *     must be non-negative integer. The value zero indicates delete immediately. If this value is
   *     nil, the default grace period for the specified type will be used. Defaults to a per object
   *     value if not specified. zero means delete immediately. (optional)
   * @param labelSelector A selector to restrict the list of returned objects by their labels.
   *     Defaults to everything. (optional)
   * @param limit limit is a maximum number of responses to return for a list call. If more items
   *     exist, the server will set the &#x60;continue&#x60; field on the list metadata to a value
   *     that can be used with the same initial query to retrieve the next set of results. Setting a
   *     limit may return fewer than the requested amount of items (up to zero items) in the event
   *     all requested objects are filtered out and clients should only use the presence of the
   *     continue field to determine whether more results are available. Servers may choose not to
   *     support the limit argument and will return all of the available results. If limit is
   *     specified and the continue field is empty, clients may assume that no more results are
   *     available. This field is not supported if watch is true. The server guarantees that the
   *     objects returned when using continue will be identical to issuing a single list call
   *     without a limit - that is, no objects created, modified, or deleted after the first request
   *     is issued will be included in any subsequent continued requests. This is sometimes referred
   *     to as a consistent snapshot, and ensures that a client that is using limit to receive
   *     smaller chunks of a very large result can ensure they see all possible objects. If objects
   *     are updated during a chunked list the version of the object that was present at the time
   *     the first list result was calculated is returned. (optional)
   * @param orphanDependents Deprecated: please use the PropagationPolicy, this field will be
   *     deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the
   *     \&quot;orphan\&quot; finalizer will be added to/removed from the object&#39;s finalizers
   *     list. Either this field or PropagationPolicy may be set, but not both. (optional)
   * @param propagationPolicy Whether and how garbage collection will be performed. Either this
   *     field or OrphanDependents may be set, but not both. The default policy is decided by the
   *     existing finalizer set in the metadata.finalizers and the resource-specific default policy.
   *     Acceptable values are: &#39;Orphan&#39; - orphan the dependents; &#39;Background&#39; -
   *     allow the garbage collector to delete the dependents in the background;
   *     &#39;Foreground&#39; - a cascading policy that deletes all dependents in the foreground.
   *     (optional)
   * @param resourceVersion resourceVersion sets a constraint on what resource versions a request
   *     may be served from. See
   *     https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.
   *     Defaults to unset (optional)
   * @param resourceVersionMatch resourceVersionMatch determines how resourceVersion is applied to
   *     list calls. It is highly recommended that resourceVersionMatch be set for list calls where
   *     resourceVersion is set See
   *     https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.
   *     Defaults to unset (optional)
   * @param timeoutSeconds Timeout for the list/watch call. This limits the duration of the call,
   *     regardless of any activity or inactivity. (optional)
   * @param body (optional)
   * @return V1Status
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public V1Status deleteCollectionPriorityLevelConfiguration(
      String pretty,
      String _continue,
      String dryRun,
      String fieldSelector,
      Integer gracePeriodSeconds,
      String labelSelector,
      Integer limit,
      Boolean orphanDependents,
      String propagationPolicy,
      String resourceVersion,
      String resourceVersionMatch,
      Integer timeoutSeconds,
      V1DeleteOptions body)
      throws ApiException {
    ApiResponse<V1Status> localVarResp =
        deleteCollectionPriorityLevelConfigurationWithHttpInfo(
            pretty,
            _continue,
            dryRun,
            fieldSelector,
            gracePeriodSeconds,
            labelSelector,
            limit,
            orphanDependents,
            propagationPolicy,
            resourceVersion,
            resourceVersionMatch,
            timeoutSeconds,
            body);
    return localVarResp.getData();
  }

  /**
   * delete collection of PriorityLevelConfiguration
   *
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param _continue The continue option should be set when retrieving more results from the
   *     server. Since this value is server defined, clients may only use the continue value from a
   *     previous query result with identical query parameters (except for the value of continue)
   *     and the server may reject a continue value it does not recognize. If the specified continue
   *     value is no longer valid whether due to expiration (generally five to fifteen minutes) or a
   *     configuration change on the server, the server will respond with a 410 ResourceExpired
   *     error together with a continue token. If the client needs a consistent list, it must
   *     restart their list without the continue field. Otherwise, the client may send another list
   *     request with the token received with the 410 error, the server will respond with a list
   *     starting from the next key, but from the latest snapshot, which is inconsistent from the
   *     previous list results - objects that are created, modified, or deleted after the first list
   *     request will be included in the response, as long as their keys are after the \&quot;next
   *     key\&quot;. This field is not supported when watch is true. Clients may start a watch from
   *     the last resourceVersion value returned by the server and not miss any modifications.
   *     (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldSelector A selector to restrict the list of returned objects by their fields.
   *     Defaults to everything. (optional)
   * @param gracePeriodSeconds The duration in seconds before the object should be deleted. Value
   *     must be non-negative integer. The value zero indicates delete immediately. If this value is
   *     nil, the default grace period for the specified type will be used. Defaults to a per object
   *     value if not specified. zero means delete immediately. (optional)
   * @param labelSelector A selector to restrict the list of returned objects by their labels.
   *     Defaults to everything. (optional)
   * @param limit limit is a maximum number of responses to return for a list call. If more items
   *     exist, the server will set the &#x60;continue&#x60; field on the list metadata to a value
   *     that can be used with the same initial query to retrieve the next set of results. Setting a
   *     limit may return fewer than the requested amount of items (up to zero items) in the event
   *     all requested objects are filtered out and clients should only use the presence of the
   *     continue field to determine whether more results are available. Servers may choose not to
   *     support the limit argument and will return all of the available results. If limit is
   *     specified and the continue field is empty, clients may assume that no more results are
   *     available. This field is not supported if watch is true. The server guarantees that the
   *     objects returned when using continue will be identical to issuing a single list call
   *     without a limit - that is, no objects created, modified, or deleted after the first request
   *     is issued will be included in any subsequent continued requests. This is sometimes referred
   *     to as a consistent snapshot, and ensures that a client that is using limit to receive
   *     smaller chunks of a very large result can ensure they see all possible objects. If objects
   *     are updated during a chunked list the version of the object that was present at the time
   *     the first list result was calculated is returned. (optional)
   * @param orphanDependents Deprecated: please use the PropagationPolicy, this field will be
   *     deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the
   *     \&quot;orphan\&quot; finalizer will be added to/removed from the object&#39;s finalizers
   *     list. Either this field or PropagationPolicy may be set, but not both. (optional)
   * @param propagationPolicy Whether and how garbage collection will be performed. Either this
   *     field or OrphanDependents may be set, but not both. The default policy is decided by the
   *     existing finalizer set in the metadata.finalizers and the resource-specific default policy.
   *     Acceptable values are: &#39;Orphan&#39; - orphan the dependents; &#39;Background&#39; -
   *     allow the garbage collector to delete the dependents in the background;
   *     &#39;Foreground&#39; - a cascading policy that deletes all dependents in the foreground.
   *     (optional)
   * @param resourceVersion resourceVersion sets a constraint on what resource versions a request
   *     may be served from. See
   *     https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.
   *     Defaults to unset (optional)
   * @param resourceVersionMatch resourceVersionMatch determines how resourceVersion is applied to
   *     list calls. It is highly recommended that resourceVersionMatch be set for list calls where
   *     resourceVersion is set See
   *     https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.
   *     Defaults to unset (optional)
   * @param timeoutSeconds Timeout for the list/watch call. This limits the duration of the call,
   *     regardless of any activity or inactivity. (optional)
   * @param body (optional)
   * @return ApiResponse&lt;V1Status&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public ApiResponse<V1Status> deleteCollectionPriorityLevelConfigurationWithHttpInfo(
      String pretty,
      String _continue,
      String dryRun,
      String fieldSelector,
      Integer gracePeriodSeconds,
      String labelSelector,
      Integer limit,
      Boolean orphanDependents,
      String propagationPolicy,
      String resourceVersion,
      String resourceVersionMatch,
      Integer timeoutSeconds,
      V1DeleteOptions body)
      throws ApiException {
    okhttp3.Call localVarCall =
        deleteCollectionPriorityLevelConfigurationValidateBeforeCall(
            pretty,
            _continue,
            dryRun,
            fieldSelector,
            gracePeriodSeconds,
            labelSelector,
            limit,
            orphanDependents,
            propagationPolicy,
            resourceVersion,
            resourceVersionMatch,
            timeoutSeconds,
            body,
            null);
    Type localVarReturnType = new TypeToken<V1Status>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * (asynchronously) delete collection of PriorityLevelConfiguration
   *
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param _continue The continue option should be set when retrieving more results from the
   *     server. Since this value is server defined, clients may only use the continue value from a
   *     previous query result with identical query parameters (except for the value of continue)
   *     and the server may reject a continue value it does not recognize. If the specified continue
   *     value is no longer valid whether due to expiration (generally five to fifteen minutes) or a
   *     configuration change on the server, the server will respond with a 410 ResourceExpired
   *     error together with a continue token. If the client needs a consistent list, it must
   *     restart their list without the continue field. Otherwise, the client may send another list
   *     request with the token received with the 410 error, the server will respond with a list
   *     starting from the next key, but from the latest snapshot, which is inconsistent from the
   *     previous list results - objects that are created, modified, or deleted after the first list
   *     request will be included in the response, as long as their keys are after the \&quot;next
   *     key\&quot;. This field is not supported when watch is true. Clients may start a watch from
   *     the last resourceVersion value returned by the server and not miss any modifications.
   *     (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldSelector A selector to restrict the list of returned objects by their fields.
   *     Defaults to everything. (optional)
   * @param gracePeriodSeconds The duration in seconds before the object should be deleted. Value
   *     must be non-negative integer. The value zero indicates delete immediately. If this value is
   *     nil, the default grace period for the specified type will be used. Defaults to a per object
   *     value if not specified. zero means delete immediately. (optional)
   * @param labelSelector A selector to restrict the list of returned objects by their labels.
   *     Defaults to everything. (optional)
   * @param limit limit is a maximum number of responses to return for a list call. If more items
   *     exist, the server will set the &#x60;continue&#x60; field on the list metadata to a value
   *     that can be used with the same initial query to retrieve the next set of results. Setting a
   *     limit may return fewer than the requested amount of items (up to zero items) in the event
   *     all requested objects are filtered out and clients should only use the presence of the
   *     continue field to determine whether more results are available. Servers may choose not to
   *     support the limit argument and will return all of the available results. If limit is
   *     specified and the continue field is empty, clients may assume that no more results are
   *     available. This field is not supported if watch is true. The server guarantees that the
   *     objects returned when using continue will be identical to issuing a single list call
   *     without a limit - that is, no objects created, modified, or deleted after the first request
   *     is issued will be included in any subsequent continued requests. This is sometimes referred
   *     to as a consistent snapshot, and ensures that a client that is using limit to receive
   *     smaller chunks of a very large result can ensure they see all possible objects. If objects
   *     are updated during a chunked list the version of the object that was present at the time
   *     the first list result was calculated is returned. (optional)
   * @param orphanDependents Deprecated: please use the PropagationPolicy, this field will be
   *     deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the
   *     \&quot;orphan\&quot; finalizer will be added to/removed from the object&#39;s finalizers
   *     list. Either this field or PropagationPolicy may be set, but not both. (optional)
   * @param propagationPolicy Whether and how garbage collection will be performed. Either this
   *     field or OrphanDependents may be set, but not both. The default policy is decided by the
   *     existing finalizer set in the metadata.finalizers and the resource-specific default policy.
   *     Acceptable values are: &#39;Orphan&#39; - orphan the dependents; &#39;Background&#39; -
   *     allow the garbage collector to delete the dependents in the background;
   *     &#39;Foreground&#39; - a cascading policy that deletes all dependents in the foreground.
   *     (optional)
   * @param resourceVersion resourceVersion sets a constraint on what resource versions a request
   *     may be served from. See
   *     https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.
   *     Defaults to unset (optional)
   * @param resourceVersionMatch resourceVersionMatch determines how resourceVersion is applied to
   *     list calls. It is highly recommended that resourceVersionMatch be set for list calls where
   *     resourceVersion is set See
   *     https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.
   *     Defaults to unset (optional)
   * @param timeoutSeconds Timeout for the list/watch call. This limits the duration of the call,
   *     regardless of any activity or inactivity. (optional)
   * @param body (optional)
   * @param _callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call deleteCollectionPriorityLevelConfigurationAsync(
      String pretty,
      String _continue,
      String dryRun,
      String fieldSelector,
      Integer gracePeriodSeconds,
      String labelSelector,
      Integer limit,
      Boolean orphanDependents,
      String propagationPolicy,
      String resourceVersion,
      String resourceVersionMatch,
      Integer timeoutSeconds,
      V1DeleteOptions body,
      final ApiCallback<V1Status> _callback)
      throws ApiException {

    okhttp3.Call localVarCall =
        deleteCollectionPriorityLevelConfigurationValidateBeforeCall(
            pretty,
            _continue,
            dryRun,
            fieldSelector,
            gracePeriodSeconds,
            labelSelector,
            limit,
            orphanDependents,
            propagationPolicy,
            resourceVersion,
            resourceVersionMatch,
            timeoutSeconds,
            body,
            _callback);
    Type localVarReturnType = new TypeToken<V1Status>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }
  /**
   * Build call for deleteFlowSchema
   *
   * @param name name of the FlowSchema (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param gracePeriodSeconds The duration in seconds before the object should be deleted. Value
   *     must be non-negative integer. The value zero indicates delete immediately. If this value is
   *     nil, the default grace period for the specified type will be used. Defaults to a per object
   *     value if not specified. zero means delete immediately. (optional)
   * @param orphanDependents Deprecated: please use the PropagationPolicy, this field will be
   *     deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the
   *     \&quot;orphan\&quot; finalizer will be added to/removed from the object&#39;s finalizers
   *     list. Either this field or PropagationPolicy may be set, but not both. (optional)
   * @param propagationPolicy Whether and how garbage collection will be performed. Either this
   *     field or OrphanDependents may be set, but not both. The default policy is decided by the
   *     existing finalizer set in the metadata.finalizers and the resource-specific default policy.
   *     Acceptable values are: &#39;Orphan&#39; - orphan the dependents; &#39;Background&#39; -
   *     allow the garbage collector to delete the dependents in the background;
   *     &#39;Foreground&#39; - a cascading policy that deletes all dependents in the foreground.
   *     (optional)
   * @param body (optional)
   * @param _callback Callback for upload/download progress
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call deleteFlowSchemaCall(
      String name,
      String pretty,
      String dryRun,
      Integer gracePeriodSeconds,
      Boolean orphanDependents,
      String propagationPolicy,
      V1DeleteOptions body,
      final ApiCallback _callback)
      throws ApiException {
    Object localVarPostBody = body;

    // create path and map variables
    String localVarPath =
        "/apis/flowcontrol.apiserver.k8s.io/v1beta2/flowschemas/{name}"
            .replaceAll("\\{" + "name" + "\\}", localVarApiClient.escapeString(name.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    if (pretty != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("pretty", pretty));
    }

    if (dryRun != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("dryRun", dryRun));
    }

    if (gracePeriodSeconds != null) {
      localVarQueryParams.addAll(
          localVarApiClient.parameterToPair("gracePeriodSeconds", gracePeriodSeconds));
    }

    if (orphanDependents != null) {
      localVarQueryParams.addAll(
          localVarApiClient.parameterToPair("orphanDependents", orphanDependents));
    }

    if (propagationPolicy != null) {
      localVarQueryParams.addAll(
          localVarApiClient.parameterToPair("propagationPolicy", propagationPolicy));
    }

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();
    final String[] localVarAccepts = {
      "application/json", "application/yaml", "application/vnd.kubernetes.protobuf"
    };
    final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
    if (localVarAccept != null) {
      localVarHeaderParams.put("Accept", localVarAccept);
    }

    final String[] localVarContentTypes = {};

    final String localVarContentType =
        localVarApiClient.selectHeaderContentType(localVarContentTypes);
    localVarHeaderParams.put("Content-Type", localVarContentType);

    String[] localVarAuthNames = new String[] {"BearerToken"};
    return localVarApiClient.buildCall(
        localVarPath,
        "DELETE",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAuthNames,
        _callback);
  }

  @SuppressWarnings("rawtypes")
  private okhttp3.Call deleteFlowSchemaValidateBeforeCall(
      String name,
      String pretty,
      String dryRun,
      Integer gracePeriodSeconds,
      Boolean orphanDependents,
      String propagationPolicy,
      V1DeleteOptions body,
      final ApiCallback _callback)
      throws ApiException {

    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(
          "Missing the required parameter 'name' when calling deleteFlowSchema(Async)");
    }

    okhttp3.Call localVarCall =
        deleteFlowSchemaCall(
            name,
            pretty,
            dryRun,
            gracePeriodSeconds,
            orphanDependents,
            propagationPolicy,
            body,
            _callback);
    return localVarCall;
  }

  /**
   * delete a FlowSchema
   *
   * @param name name of the FlowSchema (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param gracePeriodSeconds The duration in seconds before the object should be deleted. Value
   *     must be non-negative integer. The value zero indicates delete immediately. If this value is
   *     nil, the default grace period for the specified type will be used. Defaults to a per object
   *     value if not specified. zero means delete immediately. (optional)
   * @param orphanDependents Deprecated: please use the PropagationPolicy, this field will be
   *     deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the
   *     \&quot;orphan\&quot; finalizer will be added to/removed from the object&#39;s finalizers
   *     list. Either this field or PropagationPolicy may be set, but not both. (optional)
   * @param propagationPolicy Whether and how garbage collection will be performed. Either this
   *     field or OrphanDependents may be set, but not both. The default policy is decided by the
   *     existing finalizer set in the metadata.finalizers and the resource-specific default policy.
   *     Acceptable values are: &#39;Orphan&#39; - orphan the dependents; &#39;Background&#39; -
   *     allow the garbage collector to delete the dependents in the background;
   *     &#39;Foreground&#39; - a cascading policy that deletes all dependents in the foreground.
   *     (optional)
   * @param body (optional)
   * @return V1Status
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public V1Status deleteFlowSchema(
      String name,
      String pretty,
      String dryRun,
      Integer gracePeriodSeconds,
      Boolean orphanDependents,
      String propagationPolicy,
      V1DeleteOptions body)
      throws ApiException {
    ApiResponse<V1Status> localVarResp =
        deleteFlowSchemaWithHttpInfo(
            name, pretty, dryRun, gracePeriodSeconds, orphanDependents, propagationPolicy, body);
    return localVarResp.getData();
  }

  /**
   * delete a FlowSchema
   *
   * @param name name of the FlowSchema (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param gracePeriodSeconds The duration in seconds before the object should be deleted. Value
   *     must be non-negative integer. The value zero indicates delete immediately. If this value is
   *     nil, the default grace period for the specified type will be used. Defaults to a per object
   *     value if not specified. zero means delete immediately. (optional)
   * @param orphanDependents Deprecated: please use the PropagationPolicy, this field will be
   *     deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the
   *     \&quot;orphan\&quot; finalizer will be added to/removed from the object&#39;s finalizers
   *     list. Either this field or PropagationPolicy may be set, but not both. (optional)
   * @param propagationPolicy Whether and how garbage collection will be performed. Either this
   *     field or OrphanDependents may be set, but not both. The default policy is decided by the
   *     existing finalizer set in the metadata.finalizers and the resource-specific default policy.
   *     Acceptable values are: &#39;Orphan&#39; - orphan the dependents; &#39;Background&#39; -
   *     allow the garbage collector to delete the dependents in the background;
   *     &#39;Foreground&#39; - a cascading policy that deletes all dependents in the foreground.
   *     (optional)
   * @param body (optional)
   * @return ApiResponse&lt;V1Status&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public ApiResponse<V1Status> deleteFlowSchemaWithHttpInfo(
      String name,
      String pretty,
      String dryRun,
      Integer gracePeriodSeconds,
      Boolean orphanDependents,
      String propagationPolicy,
      V1DeleteOptions body)
      throws ApiException {
    okhttp3.Call localVarCall =
        deleteFlowSchemaValidateBeforeCall(
            name,
            pretty,
            dryRun,
            gracePeriodSeconds,
            orphanDependents,
            propagationPolicy,
            body,
            null);
    Type localVarReturnType = new TypeToken<V1Status>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * (asynchronously) delete a FlowSchema
   *
   * @param name name of the FlowSchema (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param gracePeriodSeconds The duration in seconds before the object should be deleted. Value
   *     must be non-negative integer. The value zero indicates delete immediately. If this value is
   *     nil, the default grace period for the specified type will be used. Defaults to a per object
   *     value if not specified. zero means delete immediately. (optional)
   * @param orphanDependents Deprecated: please use the PropagationPolicy, this field will be
   *     deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the
   *     \&quot;orphan\&quot; finalizer will be added to/removed from the object&#39;s finalizers
   *     list. Either this field or PropagationPolicy may be set, but not both. (optional)
   * @param propagationPolicy Whether and how garbage collection will be performed. Either this
   *     field or OrphanDependents may be set, but not both. The default policy is decided by the
   *     existing finalizer set in the metadata.finalizers and the resource-specific default policy.
   *     Acceptable values are: &#39;Orphan&#39; - orphan the dependents; &#39;Background&#39; -
   *     allow the garbage collector to delete the dependents in the background;
   *     &#39;Foreground&#39; - a cascading policy that deletes all dependents in the foreground.
   *     (optional)
   * @param body (optional)
   * @param _callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call deleteFlowSchemaAsync(
      String name,
      String pretty,
      String dryRun,
      Integer gracePeriodSeconds,
      Boolean orphanDependents,
      String propagationPolicy,
      V1DeleteOptions body,
      final ApiCallback<V1Status> _callback)
      throws ApiException {

    okhttp3.Call localVarCall =
        deleteFlowSchemaValidateBeforeCall(
            name,
            pretty,
            dryRun,
            gracePeriodSeconds,
            orphanDependents,
            propagationPolicy,
            body,
            _callback);
    Type localVarReturnType = new TypeToken<V1Status>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }
  /**
   * Build call for deletePriorityLevelConfiguration
   *
   * @param name name of the PriorityLevelConfiguration (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param gracePeriodSeconds The duration in seconds before the object should be deleted. Value
   *     must be non-negative integer. The value zero indicates delete immediately. If this value is
   *     nil, the default grace period for the specified type will be used. Defaults to a per object
   *     value if not specified. zero means delete immediately. (optional)
   * @param orphanDependents Deprecated: please use the PropagationPolicy, this field will be
   *     deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the
   *     \&quot;orphan\&quot; finalizer will be added to/removed from the object&#39;s finalizers
   *     list. Either this field or PropagationPolicy may be set, but not both. (optional)
   * @param propagationPolicy Whether and how garbage collection will be performed. Either this
   *     field or OrphanDependents may be set, but not both. The default policy is decided by the
   *     existing finalizer set in the metadata.finalizers and the resource-specific default policy.
   *     Acceptable values are: &#39;Orphan&#39; - orphan the dependents; &#39;Background&#39; -
   *     allow the garbage collector to delete the dependents in the background;
   *     &#39;Foreground&#39; - a cascading policy that deletes all dependents in the foreground.
   *     (optional)
   * @param body (optional)
   * @param _callback Callback for upload/download progress
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call deletePriorityLevelConfigurationCall(
      String name,
      String pretty,
      String dryRun,
      Integer gracePeriodSeconds,
      Boolean orphanDependents,
      String propagationPolicy,
      V1DeleteOptions body,
      final ApiCallback _callback)
      throws ApiException {
    Object localVarPostBody = body;

    // create path and map variables
    String localVarPath =
        "/apis/flowcontrol.apiserver.k8s.io/v1beta2/prioritylevelconfigurations/{name}"
            .replaceAll("\\{" + "name" + "\\}", localVarApiClient.escapeString(name.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    if (pretty != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("pretty", pretty));
    }

    if (dryRun != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("dryRun", dryRun));
    }

    if (gracePeriodSeconds != null) {
      localVarQueryParams.addAll(
          localVarApiClient.parameterToPair("gracePeriodSeconds", gracePeriodSeconds));
    }

    if (orphanDependents != null) {
      localVarQueryParams.addAll(
          localVarApiClient.parameterToPair("orphanDependents", orphanDependents));
    }

    if (propagationPolicy != null) {
      localVarQueryParams.addAll(
          localVarApiClient.parameterToPair("propagationPolicy", propagationPolicy));
    }

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();
    final String[] localVarAccepts = {
      "application/json", "application/yaml", "application/vnd.kubernetes.protobuf"
    };
    final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
    if (localVarAccept != null) {
      localVarHeaderParams.put("Accept", localVarAccept);
    }

    final String[] localVarContentTypes = {};

    final String localVarContentType =
        localVarApiClient.selectHeaderContentType(localVarContentTypes);
    localVarHeaderParams.put("Content-Type", localVarContentType);

    String[] localVarAuthNames = new String[] {"BearerToken"};
    return localVarApiClient.buildCall(
        localVarPath,
        "DELETE",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAuthNames,
        _callback);
  }

  @SuppressWarnings("rawtypes")
  private okhttp3.Call deletePriorityLevelConfigurationValidateBeforeCall(
      String name,
      String pretty,
      String dryRun,
      Integer gracePeriodSeconds,
      Boolean orphanDependents,
      String propagationPolicy,
      V1DeleteOptions body,
      final ApiCallback _callback)
      throws ApiException {

    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(
          "Missing the required parameter 'name' when calling deletePriorityLevelConfiguration(Async)");
    }

    okhttp3.Call localVarCall =
        deletePriorityLevelConfigurationCall(
            name,
            pretty,
            dryRun,
            gracePeriodSeconds,
            orphanDependents,
            propagationPolicy,
            body,
            _callback);
    return localVarCall;
  }

  /**
   * delete a PriorityLevelConfiguration
   *
   * @param name name of the PriorityLevelConfiguration (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param gracePeriodSeconds The duration in seconds before the object should be deleted. Value
   *     must be non-negative integer. The value zero indicates delete immediately. If this value is
   *     nil, the default grace period for the specified type will be used. Defaults to a per object
   *     value if not specified. zero means delete immediately. (optional)
   * @param orphanDependents Deprecated: please use the PropagationPolicy, this field will be
   *     deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the
   *     \&quot;orphan\&quot; finalizer will be added to/removed from the object&#39;s finalizers
   *     list. Either this field or PropagationPolicy may be set, but not both. (optional)
   * @param propagationPolicy Whether and how garbage collection will be performed. Either this
   *     field or OrphanDependents may be set, but not both. The default policy is decided by the
   *     existing finalizer set in the metadata.finalizers and the resource-specific default policy.
   *     Acceptable values are: &#39;Orphan&#39; - orphan the dependents; &#39;Background&#39; -
   *     allow the garbage collector to delete the dependents in the background;
   *     &#39;Foreground&#39; - a cascading policy that deletes all dependents in the foreground.
   *     (optional)
   * @param body (optional)
   * @return V1Status
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public V1Status deletePriorityLevelConfiguration(
      String name,
      String pretty,
      String dryRun,
      Integer gracePeriodSeconds,
      Boolean orphanDependents,
      String propagationPolicy,
      V1DeleteOptions body)
      throws ApiException {
    ApiResponse<V1Status> localVarResp =
        deletePriorityLevelConfigurationWithHttpInfo(
            name, pretty, dryRun, gracePeriodSeconds, orphanDependents, propagationPolicy, body);
    return localVarResp.getData();
  }

  /**
   * delete a PriorityLevelConfiguration
   *
   * @param name name of the PriorityLevelConfiguration (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param gracePeriodSeconds The duration in seconds before the object should be deleted. Value
   *     must be non-negative integer. The value zero indicates delete immediately. If this value is
   *     nil, the default grace period for the specified type will be used. Defaults to a per object
   *     value if not specified. zero means delete immediately. (optional)
   * @param orphanDependents Deprecated: please use the PropagationPolicy, this field will be
   *     deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the
   *     \&quot;orphan\&quot; finalizer will be added to/removed from the object&#39;s finalizers
   *     list. Either this field or PropagationPolicy may be set, but not both. (optional)
   * @param propagationPolicy Whether and how garbage collection will be performed. Either this
   *     field or OrphanDependents may be set, but not both. The default policy is decided by the
   *     existing finalizer set in the metadata.finalizers and the resource-specific default policy.
   *     Acceptable values are: &#39;Orphan&#39; - orphan the dependents; &#39;Background&#39; -
   *     allow the garbage collector to delete the dependents in the background;
   *     &#39;Foreground&#39; - a cascading policy that deletes all dependents in the foreground.
   *     (optional)
   * @param body (optional)
   * @return ApiResponse&lt;V1Status&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public ApiResponse<V1Status> deletePriorityLevelConfigurationWithHttpInfo(
      String name,
      String pretty,
      String dryRun,
      Integer gracePeriodSeconds,
      Boolean orphanDependents,
      String propagationPolicy,
      V1DeleteOptions body)
      throws ApiException {
    okhttp3.Call localVarCall =
        deletePriorityLevelConfigurationValidateBeforeCall(
            name,
            pretty,
            dryRun,
            gracePeriodSeconds,
            orphanDependents,
            propagationPolicy,
            body,
            null);
    Type localVarReturnType = new TypeToken<V1Status>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * (asynchronously) delete a PriorityLevelConfiguration
   *
   * @param name name of the PriorityLevelConfiguration (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param gracePeriodSeconds The duration in seconds before the object should be deleted. Value
   *     must be non-negative integer. The value zero indicates delete immediately. If this value is
   *     nil, the default grace period for the specified type will be used. Defaults to a per object
   *     value if not specified. zero means delete immediately. (optional)
   * @param orphanDependents Deprecated: please use the PropagationPolicy, this field will be
   *     deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the
   *     \&quot;orphan\&quot; finalizer will be added to/removed from the object&#39;s finalizers
   *     list. Either this field or PropagationPolicy may be set, but not both. (optional)
   * @param propagationPolicy Whether and how garbage collection will be performed. Either this
   *     field or OrphanDependents may be set, but not both. The default policy is decided by the
   *     existing finalizer set in the metadata.finalizers and the resource-specific default policy.
   *     Acceptable values are: &#39;Orphan&#39; - orphan the dependents; &#39;Background&#39; -
   *     allow the garbage collector to delete the dependents in the background;
   *     &#39;Foreground&#39; - a cascading policy that deletes all dependents in the foreground.
   *     (optional)
   * @param body (optional)
   * @param _callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call deletePriorityLevelConfigurationAsync(
      String name,
      String pretty,
      String dryRun,
      Integer gracePeriodSeconds,
      Boolean orphanDependents,
      String propagationPolicy,
      V1DeleteOptions body,
      final ApiCallback<V1Status> _callback)
      throws ApiException {

    okhttp3.Call localVarCall =
        deletePriorityLevelConfigurationValidateBeforeCall(
            name,
            pretty,
            dryRun,
            gracePeriodSeconds,
            orphanDependents,
            propagationPolicy,
            body,
            _callback);
    Type localVarReturnType = new TypeToken<V1Status>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }
  /**
   * Build call for getAPIResources
   *
   * @param _callback Callback for upload/download progress
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call getAPIResourcesCall(final ApiCallback _callback) throws ApiException {
    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath = "/apis/flowcontrol.apiserver.k8s.io/v1beta2/";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();
    final String[] localVarAccepts = {
      "application/json", "application/yaml", "application/vnd.kubernetes.protobuf"
    };
    final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
    if (localVarAccept != null) {
      localVarHeaderParams.put("Accept", localVarAccept);
    }

    final String[] localVarContentTypes = {};

    final String localVarContentType =
        localVarApiClient.selectHeaderContentType(localVarContentTypes);
    localVarHeaderParams.put("Content-Type", localVarContentType);

    String[] localVarAuthNames = new String[] {"BearerToken"};
    return localVarApiClient.buildCall(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAuthNames,
        _callback);
  }

  @SuppressWarnings("rawtypes")
  private okhttp3.Call getAPIResourcesValidateBeforeCall(final ApiCallback _callback)
      throws ApiException {

    okhttp3.Call localVarCall = getAPIResourcesCall(_callback);
    return localVarCall;
  }

  /**
   * get available resources
   *
   * @return V1APIResourceList
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public V1APIResourceList getAPIResources() throws ApiException {
    ApiResponse<V1APIResourceList> localVarResp = getAPIResourcesWithHttpInfo();
    return localVarResp.getData();
  }

  /**
   * get available resources
   *
   * @return ApiResponse&lt;V1APIResourceList&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public ApiResponse<V1APIResourceList> getAPIResourcesWithHttpInfo() throws ApiException {
    okhttp3.Call localVarCall = getAPIResourcesValidateBeforeCall(null);
    Type localVarReturnType = new TypeToken<V1APIResourceList>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * (asynchronously) get available resources
   *
   * @param _callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call getAPIResourcesAsync(final ApiCallback<V1APIResourceList> _callback)
      throws ApiException {

    okhttp3.Call localVarCall = getAPIResourcesValidateBeforeCall(_callback);
    Type localVarReturnType = new TypeToken<V1APIResourceList>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }
  /**
   * Build call for listFlowSchema
   *
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param allowWatchBookmarks allowWatchBookmarks requests watch events with type
   *     \&quot;BOOKMARK\&quot;. Servers that do not implement bookmarks may ignore this flag and
   *     bookmarks are sent at the server&#39;s discretion. Clients should not assume bookmarks are
   *     returned at any specific interval, nor may they assume the server will send any BOOKMARK
   *     event during a session. If this is not a watch, this field is ignored. (optional)
   * @param _continue The continue option should be set when retrieving more results from the
   *     server. Since this value is server defined, clients may only use the continue value from a
   *     previous query result with identical query parameters (except for the value of continue)
   *     and the server may reject a continue value it does not recognize. If the specified continue
   *     value is no longer valid whether due to expiration (generally five to fifteen minutes) or a
   *     configuration change on the server, the server will respond with a 410 ResourceExpired
   *     error together with a continue token. If the client needs a consistent list, it must
   *     restart their list without the continue field. Otherwise, the client may send another list
   *     request with the token received with the 410 error, the server will respond with a list
   *     starting from the next key, but from the latest snapshot, which is inconsistent from the
   *     previous list results - objects that are created, modified, or deleted after the first list
   *     request will be included in the response, as long as their keys are after the \&quot;next
   *     key\&quot;. This field is not supported when watch is true. Clients may start a watch from
   *     the last resourceVersion value returned by the server and not miss any modifications.
   *     (optional)
   * @param fieldSelector A selector to restrict the list of returned objects by their fields.
   *     Defaults to everything. (optional)
   * @param labelSelector A selector to restrict the list of returned objects by their labels.
   *     Defaults to everything. (optional)
   * @param limit limit is a maximum number of responses to return for a list call. If more items
   *     exist, the server will set the &#x60;continue&#x60; field on the list metadata to a value
   *     that can be used with the same initial query to retrieve the next set of results. Setting a
   *     limit may return fewer than the requested amount of items (up to zero items) in the event
   *     all requested objects are filtered out and clients should only use the presence of the
   *     continue field to determine whether more results are available. Servers may choose not to
   *     support the limit argument and will return all of the available results. If limit is
   *     specified and the continue field is empty, clients may assume that no more results are
   *     available. This field is not supported if watch is true. The server guarantees that the
   *     objects returned when using continue will be identical to issuing a single list call
   *     without a limit - that is, no objects created, modified, or deleted after the first request
   *     is issued will be included in any subsequent continued requests. This is sometimes referred
   *     to as a consistent snapshot, and ensures that a client that is using limit to receive
   *     smaller chunks of a very large result can ensure they see all possible objects. If objects
   *     are updated during a chunked list the version of the object that was present at the time
   *     the first list result was calculated is returned. (optional)
   * @param resourceVersion resourceVersion sets a constraint on what resource versions a request
   *     may be served from. See
   *     https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.
   *     Defaults to unset (optional)
   * @param resourceVersionMatch resourceVersionMatch determines how resourceVersion is applied to
   *     list calls. It is highly recommended that resourceVersionMatch be set for list calls where
   *     resourceVersion is set See
   *     https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.
   *     Defaults to unset (optional)
   * @param timeoutSeconds Timeout for the list/watch call. This limits the duration of the call,
   *     regardless of any activity or inactivity. (optional)
   * @param watch Watch for changes to the described resources and return them as a stream of add,
   *     update, and remove notifications. Specify resourceVersion. (optional)
   * @param _callback Callback for upload/download progress
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call listFlowSchemaCall(
      String pretty,
      Boolean allowWatchBookmarks,
      String _continue,
      String fieldSelector,
      String labelSelector,
      Integer limit,
      String resourceVersion,
      String resourceVersionMatch,
      Integer timeoutSeconds,
      Boolean watch,
      final ApiCallback _callback)
      throws ApiException {
    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath = "/apis/flowcontrol.apiserver.k8s.io/v1beta2/flowschemas";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    if (pretty != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("pretty", pretty));
    }

    if (allowWatchBookmarks != null) {
      localVarQueryParams.addAll(
          localVarApiClient.parameterToPair("allowWatchBookmarks", allowWatchBookmarks));
    }

    if (_continue != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("continue", _continue));
    }

    if (fieldSelector != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("fieldSelector", fieldSelector));
    }

    if (labelSelector != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("labelSelector", labelSelector));
    }

    if (limit != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
    }

    if (resourceVersion != null) {
      localVarQueryParams.addAll(
          localVarApiClient.parameterToPair("resourceVersion", resourceVersion));
    }

    if (resourceVersionMatch != null) {
      localVarQueryParams.addAll(
          localVarApiClient.parameterToPair("resourceVersionMatch", resourceVersionMatch));
    }

    if (timeoutSeconds != null) {
      localVarQueryParams.addAll(
          localVarApiClient.parameterToPair("timeoutSeconds", timeoutSeconds));
    }

    if (watch != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("watch", watch));
    }

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();
    final String[] localVarAccepts = {
      "application/json",
      "application/yaml",
      "application/vnd.kubernetes.protobuf",
      "application/json;stream=watch",
      "application/vnd.kubernetes.protobuf;stream=watch"
    };
    final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
    if (localVarAccept != null) {
      localVarHeaderParams.put("Accept", localVarAccept);
    }

    final String[] localVarContentTypes = {};

    final String localVarContentType =
        localVarApiClient.selectHeaderContentType(localVarContentTypes);
    localVarHeaderParams.put("Content-Type", localVarContentType);

    String[] localVarAuthNames = new String[] {"BearerToken"};
    return localVarApiClient.buildCall(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAuthNames,
        _callback);
  }

  @SuppressWarnings("rawtypes")
  private okhttp3.Call listFlowSchemaValidateBeforeCall(
      String pretty,
      Boolean allowWatchBookmarks,
      String _continue,
      String fieldSelector,
      String labelSelector,
      Integer limit,
      String resourceVersion,
      String resourceVersionMatch,
      Integer timeoutSeconds,
      Boolean watch,
      final ApiCallback _callback)
      throws ApiException {

    okhttp3.Call localVarCall =
        listFlowSchemaCall(
            pretty,
            allowWatchBookmarks,
            _continue,
            fieldSelector,
            labelSelector,
            limit,
            resourceVersion,
            resourceVersionMatch,
            timeoutSeconds,
            watch,
            _callback);
    return localVarCall;
  }

  /**
   * list or watch objects of kind FlowSchema
   *
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param allowWatchBookmarks allowWatchBookmarks requests watch events with type
   *     \&quot;BOOKMARK\&quot;. Servers that do not implement bookmarks may ignore this flag and
   *     bookmarks are sent at the server&#39;s discretion. Clients should not assume bookmarks are
   *     returned at any specific interval, nor may they assume the server will send any BOOKMARK
   *     event during a session. If this is not a watch, this field is ignored. (optional)
   * @param _continue The continue option should be set when retrieving more results from the
   *     server. Since this value is server defined, clients may only use the continue value from a
   *     previous query result with identical query parameters (except for the value of continue)
   *     and the server may reject a continue value it does not recognize. If the specified continue
   *     value is no longer valid whether due to expiration (generally five to fifteen minutes) or a
   *     configuration change on the server, the server will respond with a 410 ResourceExpired
   *     error together with a continue token. If the client needs a consistent list, it must
   *     restart their list without the continue field. Otherwise, the client may send another list
   *     request with the token received with the 410 error, the server will respond with a list
   *     starting from the next key, but from the latest snapshot, which is inconsistent from the
   *     previous list results - objects that are created, modified, or deleted after the first list
   *     request will be included in the response, as long as their keys are after the \&quot;next
   *     key\&quot;. This field is not supported when watch is true. Clients may start a watch from
   *     the last resourceVersion value returned by the server and not miss any modifications.
   *     (optional)
   * @param fieldSelector A selector to restrict the list of returned objects by their fields.
   *     Defaults to everything. (optional)
   * @param labelSelector A selector to restrict the list of returned objects by their labels.
   *     Defaults to everything. (optional)
   * @param limit limit is a maximum number of responses to return for a list call. If more items
   *     exist, the server will set the &#x60;continue&#x60; field on the list metadata to a value
   *     that can be used with the same initial query to retrieve the next set of results. Setting a
   *     limit may return fewer than the requested amount of items (up to zero items) in the event
   *     all requested objects are filtered out and clients should only use the presence of the
   *     continue field to determine whether more results are available. Servers may choose not to
   *     support the limit argument and will return all of the available results. If limit is
   *     specified and the continue field is empty, clients may assume that no more results are
   *     available. This field is not supported if watch is true. The server guarantees that the
   *     objects returned when using continue will be identical to issuing a single list call
   *     without a limit - that is, no objects created, modified, or deleted after the first request
   *     is issued will be included in any subsequent continued requests. This is sometimes referred
   *     to as a consistent snapshot, and ensures that a client that is using limit to receive
   *     smaller chunks of a very large result can ensure they see all possible objects. If objects
   *     are updated during a chunked list the version of the object that was present at the time
   *     the first list result was calculated is returned. (optional)
   * @param resourceVersion resourceVersion sets a constraint on what resource versions a request
   *     may be served from. See
   *     https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.
   *     Defaults to unset (optional)
   * @param resourceVersionMatch resourceVersionMatch determines how resourceVersion is applied to
   *     list calls. It is highly recommended that resourceVersionMatch be set for list calls where
   *     resourceVersion is set See
   *     https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.
   *     Defaults to unset (optional)
   * @param timeoutSeconds Timeout for the list/watch call. This limits the duration of the call,
   *     regardless of any activity or inactivity. (optional)
   * @param watch Watch for changes to the described resources and return them as a stream of add,
   *     update, and remove notifications. Specify resourceVersion. (optional)
   * @return V1beta2FlowSchemaList
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public V1beta2FlowSchemaList listFlowSchema(
      String pretty,
      Boolean allowWatchBookmarks,
      String _continue,
      String fieldSelector,
      String labelSelector,
      Integer limit,
      String resourceVersion,
      String resourceVersionMatch,
      Integer timeoutSeconds,
      Boolean watch)
      throws ApiException {
    ApiResponse<V1beta2FlowSchemaList> localVarResp =
        listFlowSchemaWithHttpInfo(
            pretty,
            allowWatchBookmarks,
            _continue,
            fieldSelector,
            labelSelector,
            limit,
            resourceVersion,
            resourceVersionMatch,
            timeoutSeconds,
            watch);
    return localVarResp.getData();
  }

  /**
   * list or watch objects of kind FlowSchema
   *
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param allowWatchBookmarks allowWatchBookmarks requests watch events with type
   *     \&quot;BOOKMARK\&quot;. Servers that do not implement bookmarks may ignore this flag and
   *     bookmarks are sent at the server&#39;s discretion. Clients should not assume bookmarks are
   *     returned at any specific interval, nor may they assume the server will send any BOOKMARK
   *     event during a session. If this is not a watch, this field is ignored. (optional)
   * @param _continue The continue option should be set when retrieving more results from the
   *     server. Since this value is server defined, clients may only use the continue value from a
   *     previous query result with identical query parameters (except for the value of continue)
   *     and the server may reject a continue value it does not recognize. If the specified continue
   *     value is no longer valid whether due to expiration (generally five to fifteen minutes) or a
   *     configuration change on the server, the server will respond with a 410 ResourceExpired
   *     error together with a continue token. If the client needs a consistent list, it must
   *     restart their list without the continue field. Otherwise, the client may send another list
   *     request with the token received with the 410 error, the server will respond with a list
   *     starting from the next key, but from the latest snapshot, which is inconsistent from the
   *     previous list results - objects that are created, modified, or deleted after the first list
   *     request will be included in the response, as long as their keys are after the \&quot;next
   *     key\&quot;. This field is not supported when watch is true. Clients may start a watch from
   *     the last resourceVersion value returned by the server and not miss any modifications.
   *     (optional)
   * @param fieldSelector A selector to restrict the list of returned objects by their fields.
   *     Defaults to everything. (optional)
   * @param labelSelector A selector to restrict the list of returned objects by their labels.
   *     Defaults to everything. (optional)
   * @param limit limit is a maximum number of responses to return for a list call. If more items
   *     exist, the server will set the &#x60;continue&#x60; field on the list metadata to a value
   *     that can be used with the same initial query to retrieve the next set of results. Setting a
   *     limit may return fewer than the requested amount of items (up to zero items) in the event
   *     all requested objects are filtered out and clients should only use the presence of the
   *     continue field to determine whether more results are available. Servers may choose not to
   *     support the limit argument and will return all of the available results. If limit is
   *     specified and the continue field is empty, clients may assume that no more results are
   *     available. This field is not supported if watch is true. The server guarantees that the
   *     objects returned when using continue will be identical to issuing a single list call
   *     without a limit - that is, no objects created, modified, or deleted after the first request
   *     is issued will be included in any subsequent continued requests. This is sometimes referred
   *     to as a consistent snapshot, and ensures that a client that is using limit to receive
   *     smaller chunks of a very large result can ensure they see all possible objects. If objects
   *     are updated during a chunked list the version of the object that was present at the time
   *     the first list result was calculated is returned. (optional)
   * @param resourceVersion resourceVersion sets a constraint on what resource versions a request
   *     may be served from. See
   *     https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.
   *     Defaults to unset (optional)
   * @param resourceVersionMatch resourceVersionMatch determines how resourceVersion is applied to
   *     list calls. It is highly recommended that resourceVersionMatch be set for list calls where
   *     resourceVersion is set See
   *     https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.
   *     Defaults to unset (optional)
   * @param timeoutSeconds Timeout for the list/watch call. This limits the duration of the call,
   *     regardless of any activity or inactivity. (optional)
   * @param watch Watch for changes to the described resources and return them as a stream of add,
   *     update, and remove notifications. Specify resourceVersion. (optional)
   * @return ApiResponse&lt;V1beta2FlowSchemaList&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public ApiResponse<V1beta2FlowSchemaList> listFlowSchemaWithHttpInfo(
      String pretty,
      Boolean allowWatchBookmarks,
      String _continue,
      String fieldSelector,
      String labelSelector,
      Integer limit,
      String resourceVersion,
      String resourceVersionMatch,
      Integer timeoutSeconds,
      Boolean watch)
      throws ApiException {
    okhttp3.Call localVarCall =
        listFlowSchemaValidateBeforeCall(
            pretty,
            allowWatchBookmarks,
            _continue,
            fieldSelector,
            labelSelector,
            limit,
            resourceVersion,
            resourceVersionMatch,
            timeoutSeconds,
            watch,
            null);
    Type localVarReturnType = new TypeToken<V1beta2FlowSchemaList>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * (asynchronously) list or watch objects of kind FlowSchema
   *
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param allowWatchBookmarks allowWatchBookmarks requests watch events with type
   *     \&quot;BOOKMARK\&quot;. Servers that do not implement bookmarks may ignore this flag and
   *     bookmarks are sent at the server&#39;s discretion. Clients should not assume bookmarks are
   *     returned at any specific interval, nor may they assume the server will send any BOOKMARK
   *     event during a session. If this is not a watch, this field is ignored. (optional)
   * @param _continue The continue option should be set when retrieving more results from the
   *     server. Since this value is server defined, clients may only use the continue value from a
   *     previous query result with identical query parameters (except for the value of continue)
   *     and the server may reject a continue value it does not recognize. If the specified continue
   *     value is no longer valid whether due to expiration (generally five to fifteen minutes) or a
   *     configuration change on the server, the server will respond with a 410 ResourceExpired
   *     error together with a continue token. If the client needs a consistent list, it must
   *     restart their list without the continue field. Otherwise, the client may send another list
   *     request with the token received with the 410 error, the server will respond with a list
   *     starting from the next key, but from the latest snapshot, which is inconsistent from the
   *     previous list results - objects that are created, modified, or deleted after the first list
   *     request will be included in the response, as long as their keys are after the \&quot;next
   *     key\&quot;. This field is not supported when watch is true. Clients may start a watch from
   *     the last resourceVersion value returned by the server and not miss any modifications.
   *     (optional)
   * @param fieldSelector A selector to restrict the list of returned objects by their fields.
   *     Defaults to everything. (optional)
   * @param labelSelector A selector to restrict the list of returned objects by their labels.
   *     Defaults to everything. (optional)
   * @param limit limit is a maximum number of responses to return for a list call. If more items
   *     exist, the server will set the &#x60;continue&#x60; field on the list metadata to a value
   *     that can be used with the same initial query to retrieve the next set of results. Setting a
   *     limit may return fewer than the requested amount of items (up to zero items) in the event
   *     all requested objects are filtered out and clients should only use the presence of the
   *     continue field to determine whether more results are available. Servers may choose not to
   *     support the limit argument and will return all of the available results. If limit is
   *     specified and the continue field is empty, clients may assume that no more results are
   *     available. This field is not supported if watch is true. The server guarantees that the
   *     objects returned when using continue will be identical to issuing a single list call
   *     without a limit - that is, no objects created, modified, or deleted after the first request
   *     is issued will be included in any subsequent continued requests. This is sometimes referred
   *     to as a consistent snapshot, and ensures that a client that is using limit to receive
   *     smaller chunks of a very large result can ensure they see all possible objects. If objects
   *     are updated during a chunked list the version of the object that was present at the time
   *     the first list result was calculated is returned. (optional)
   * @param resourceVersion resourceVersion sets a constraint on what resource versions a request
   *     may be served from. See
   *     https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.
   *     Defaults to unset (optional)
   * @param resourceVersionMatch resourceVersionMatch determines how resourceVersion is applied to
   *     list calls. It is highly recommended that resourceVersionMatch be set for list calls where
   *     resourceVersion is set See
   *     https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.
   *     Defaults to unset (optional)
   * @param timeoutSeconds Timeout for the list/watch call. This limits the duration of the call,
   *     regardless of any activity or inactivity. (optional)
   * @param watch Watch for changes to the described resources and return them as a stream of add,
   *     update, and remove notifications. Specify resourceVersion. (optional)
   * @param _callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call listFlowSchemaAsync(
      String pretty,
      Boolean allowWatchBookmarks,
      String _continue,
      String fieldSelector,
      String labelSelector,
      Integer limit,
      String resourceVersion,
      String resourceVersionMatch,
      Integer timeoutSeconds,
      Boolean watch,
      final ApiCallback<V1beta2FlowSchemaList> _callback)
      throws ApiException {

    okhttp3.Call localVarCall =
        listFlowSchemaValidateBeforeCall(
            pretty,
            allowWatchBookmarks,
            _continue,
            fieldSelector,
            labelSelector,
            limit,
            resourceVersion,
            resourceVersionMatch,
            timeoutSeconds,
            watch,
            _callback);
    Type localVarReturnType = new TypeToken<V1beta2FlowSchemaList>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }
  /**
   * Build call for listPriorityLevelConfiguration
   *
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param allowWatchBookmarks allowWatchBookmarks requests watch events with type
   *     \&quot;BOOKMARK\&quot;. Servers that do not implement bookmarks may ignore this flag and
   *     bookmarks are sent at the server&#39;s discretion. Clients should not assume bookmarks are
   *     returned at any specific interval, nor may they assume the server will send any BOOKMARK
   *     event during a session. If this is not a watch, this field is ignored. (optional)
   * @param _continue The continue option should be set when retrieving more results from the
   *     server. Since this value is server defined, clients may only use the continue value from a
   *     previous query result with identical query parameters (except for the value of continue)
   *     and the server may reject a continue value it does not recognize. If the specified continue
   *     value is no longer valid whether due to expiration (generally five to fifteen minutes) or a
   *     configuration change on the server, the server will respond with a 410 ResourceExpired
   *     error together with a continue token. If the client needs a consistent list, it must
   *     restart their list without the continue field. Otherwise, the client may send another list
   *     request with the token received with the 410 error, the server will respond with a list
   *     starting from the next key, but from the latest snapshot, which is inconsistent from the
   *     previous list results - objects that are created, modified, or deleted after the first list
   *     request will be included in the response, as long as their keys are after the \&quot;next
   *     key\&quot;. This field is not supported when watch is true. Clients may start a watch from
   *     the last resourceVersion value returned by the server and not miss any modifications.
   *     (optional)
   * @param fieldSelector A selector to restrict the list of returned objects by their fields.
   *     Defaults to everything. (optional)
   * @param labelSelector A selector to restrict the list of returned objects by their labels.
   *     Defaults to everything. (optional)
   * @param limit limit is a maximum number of responses to return for a list call. If more items
   *     exist, the server will set the &#x60;continue&#x60; field on the list metadata to a value
   *     that can be used with the same initial query to retrieve the next set of results. Setting a
   *     limit may return fewer than the requested amount of items (up to zero items) in the event
   *     all requested objects are filtered out and clients should only use the presence of the
   *     continue field to determine whether more results are available. Servers may choose not to
   *     support the limit argument and will return all of the available results. If limit is
   *     specified and the continue field is empty, clients may assume that no more results are
   *     available. This field is not supported if watch is true. The server guarantees that the
   *     objects returned when using continue will be identical to issuing a single list call
   *     without a limit - that is, no objects created, modified, or deleted after the first request
   *     is issued will be included in any subsequent continued requests. This is sometimes referred
   *     to as a consistent snapshot, and ensures that a client that is using limit to receive
   *     smaller chunks of a very large result can ensure they see all possible objects. If objects
   *     are updated during a chunked list the version of the object that was present at the time
   *     the first list result was calculated is returned. (optional)
   * @param resourceVersion resourceVersion sets a constraint on what resource versions a request
   *     may be served from. See
   *     https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.
   *     Defaults to unset (optional)
   * @param resourceVersionMatch resourceVersionMatch determines how resourceVersion is applied to
   *     list calls. It is highly recommended that resourceVersionMatch be set for list calls where
   *     resourceVersion is set See
   *     https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.
   *     Defaults to unset (optional)
   * @param timeoutSeconds Timeout for the list/watch call. This limits the duration of the call,
   *     regardless of any activity or inactivity. (optional)
   * @param watch Watch for changes to the described resources and return them as a stream of add,
   *     update, and remove notifications. Specify resourceVersion. (optional)
   * @param _callback Callback for upload/download progress
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call listPriorityLevelConfigurationCall(
      String pretty,
      Boolean allowWatchBookmarks,
      String _continue,
      String fieldSelector,
      String labelSelector,
      Integer limit,
      String resourceVersion,
      String resourceVersionMatch,
      Integer timeoutSeconds,
      Boolean watch,
      final ApiCallback _callback)
      throws ApiException {
    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath = "/apis/flowcontrol.apiserver.k8s.io/v1beta2/prioritylevelconfigurations";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    if (pretty != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("pretty", pretty));
    }

    if (allowWatchBookmarks != null) {
      localVarQueryParams.addAll(
          localVarApiClient.parameterToPair("allowWatchBookmarks", allowWatchBookmarks));
    }

    if (_continue != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("continue", _continue));
    }

    if (fieldSelector != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("fieldSelector", fieldSelector));
    }

    if (labelSelector != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("labelSelector", labelSelector));
    }

    if (limit != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
    }

    if (resourceVersion != null) {
      localVarQueryParams.addAll(
          localVarApiClient.parameterToPair("resourceVersion", resourceVersion));
    }

    if (resourceVersionMatch != null) {
      localVarQueryParams.addAll(
          localVarApiClient.parameterToPair("resourceVersionMatch", resourceVersionMatch));
    }

    if (timeoutSeconds != null) {
      localVarQueryParams.addAll(
          localVarApiClient.parameterToPair("timeoutSeconds", timeoutSeconds));
    }

    if (watch != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("watch", watch));
    }

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();
    final String[] localVarAccepts = {
      "application/json",
      "application/yaml",
      "application/vnd.kubernetes.protobuf",
      "application/json;stream=watch",
      "application/vnd.kubernetes.protobuf;stream=watch"
    };
    final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
    if (localVarAccept != null) {
      localVarHeaderParams.put("Accept", localVarAccept);
    }

    final String[] localVarContentTypes = {};

    final String localVarContentType =
        localVarApiClient.selectHeaderContentType(localVarContentTypes);
    localVarHeaderParams.put("Content-Type", localVarContentType);

    String[] localVarAuthNames = new String[] {"BearerToken"};
    return localVarApiClient.buildCall(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAuthNames,
        _callback);
  }

  @SuppressWarnings("rawtypes")
  private okhttp3.Call listPriorityLevelConfigurationValidateBeforeCall(
      String pretty,
      Boolean allowWatchBookmarks,
      String _continue,
      String fieldSelector,
      String labelSelector,
      Integer limit,
      String resourceVersion,
      String resourceVersionMatch,
      Integer timeoutSeconds,
      Boolean watch,
      final ApiCallback _callback)
      throws ApiException {

    okhttp3.Call localVarCall =
        listPriorityLevelConfigurationCall(
            pretty,
            allowWatchBookmarks,
            _continue,
            fieldSelector,
            labelSelector,
            limit,
            resourceVersion,
            resourceVersionMatch,
            timeoutSeconds,
            watch,
            _callback);
    return localVarCall;
  }

  /**
   * list or watch objects of kind PriorityLevelConfiguration
   *
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param allowWatchBookmarks allowWatchBookmarks requests watch events with type
   *     \&quot;BOOKMARK\&quot;. Servers that do not implement bookmarks may ignore this flag and
   *     bookmarks are sent at the server&#39;s discretion. Clients should not assume bookmarks are
   *     returned at any specific interval, nor may they assume the server will send any BOOKMARK
   *     event during a session. If this is not a watch, this field is ignored. (optional)
   * @param _continue The continue option should be set when retrieving more results from the
   *     server. Since this value is server defined, clients may only use the continue value from a
   *     previous query result with identical query parameters (except for the value of continue)
   *     and the server may reject a continue value it does not recognize. If the specified continue
   *     value is no longer valid whether due to expiration (generally five to fifteen minutes) or a
   *     configuration change on the server, the server will respond with a 410 ResourceExpired
   *     error together with a continue token. If the client needs a consistent list, it must
   *     restart their list without the continue field. Otherwise, the client may send another list
   *     request with the token received with the 410 error, the server will respond with a list
   *     starting from the next key, but from the latest snapshot, which is inconsistent from the
   *     previous list results - objects that are created, modified, or deleted after the first list
   *     request will be included in the response, as long as their keys are after the \&quot;next
   *     key\&quot;. This field is not supported when watch is true. Clients may start a watch from
   *     the last resourceVersion value returned by the server and not miss any modifications.
   *     (optional)
   * @param fieldSelector A selector to restrict the list of returned objects by their fields.
   *     Defaults to everything. (optional)
   * @param labelSelector A selector to restrict the list of returned objects by their labels.
   *     Defaults to everything. (optional)
   * @param limit limit is a maximum number of responses to return for a list call. If more items
   *     exist, the server will set the &#x60;continue&#x60; field on the list metadata to a value
   *     that can be used with the same initial query to retrieve the next set of results. Setting a
   *     limit may return fewer than the requested amount of items (up to zero items) in the event
   *     all requested objects are filtered out and clients should only use the presence of the
   *     continue field to determine whether more results are available. Servers may choose not to
   *     support the limit argument and will return all of the available results. If limit is
   *     specified and the continue field is empty, clients may assume that no more results are
   *     available. This field is not supported if watch is true. The server guarantees that the
   *     objects returned when using continue will be identical to issuing a single list call
   *     without a limit - that is, no objects created, modified, or deleted after the first request
   *     is issued will be included in any subsequent continued requests. This is sometimes referred
   *     to as a consistent snapshot, and ensures that a client that is using limit to receive
   *     smaller chunks of a very large result can ensure they see all possible objects. If objects
   *     are updated during a chunked list the version of the object that was present at the time
   *     the first list result was calculated is returned. (optional)
   * @param resourceVersion resourceVersion sets a constraint on what resource versions a request
   *     may be served from. See
   *     https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.
   *     Defaults to unset (optional)
   * @param resourceVersionMatch resourceVersionMatch determines how resourceVersion is applied to
   *     list calls. It is highly recommended that resourceVersionMatch be set for list calls where
   *     resourceVersion is set See
   *     https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.
   *     Defaults to unset (optional)
   * @param timeoutSeconds Timeout for the list/watch call. This limits the duration of the call,
   *     regardless of any activity or inactivity. (optional)
   * @param watch Watch for changes to the described resources and return them as a stream of add,
   *     update, and remove notifications. Specify resourceVersion. (optional)
   * @return V1beta2PriorityLevelConfigurationList
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public V1beta2PriorityLevelConfigurationList listPriorityLevelConfiguration(
      String pretty,
      Boolean allowWatchBookmarks,
      String _continue,
      String fieldSelector,
      String labelSelector,
      Integer limit,
      String resourceVersion,
      String resourceVersionMatch,
      Integer timeoutSeconds,
      Boolean watch)
      throws ApiException {
    ApiResponse<V1beta2PriorityLevelConfigurationList> localVarResp =
        listPriorityLevelConfigurationWithHttpInfo(
            pretty,
            allowWatchBookmarks,
            _continue,
            fieldSelector,
            labelSelector,
            limit,
            resourceVersion,
            resourceVersionMatch,
            timeoutSeconds,
            watch);
    return localVarResp.getData();
  }

  /**
   * list or watch objects of kind PriorityLevelConfiguration
   *
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param allowWatchBookmarks allowWatchBookmarks requests watch events with type
   *     \&quot;BOOKMARK\&quot;. Servers that do not implement bookmarks may ignore this flag and
   *     bookmarks are sent at the server&#39;s discretion. Clients should not assume bookmarks are
   *     returned at any specific interval, nor may they assume the server will send any BOOKMARK
   *     event during a session. If this is not a watch, this field is ignored. (optional)
   * @param _continue The continue option should be set when retrieving more results from the
   *     server. Since this value is server defined, clients may only use the continue value from a
   *     previous query result with identical query parameters (except for the value of continue)
   *     and the server may reject a continue value it does not recognize. If the specified continue
   *     value is no longer valid whether due to expiration (generally five to fifteen minutes) or a
   *     configuration change on the server, the server will respond with a 410 ResourceExpired
   *     error together with a continue token. If the client needs a consistent list, it must
   *     restart their list without the continue field. Otherwise, the client may send another list
   *     request with the token received with the 410 error, the server will respond with a list
   *     starting from the next key, but from the latest snapshot, which is inconsistent from the
   *     previous list results - objects that are created, modified, or deleted after the first list
   *     request will be included in the response, as long as their keys are after the \&quot;next
   *     key\&quot;. This field is not supported when watch is true. Clients may start a watch from
   *     the last resourceVersion value returned by the server and not miss any modifications.
   *     (optional)
   * @param fieldSelector A selector to restrict the list of returned objects by their fields.
   *     Defaults to everything. (optional)
   * @param labelSelector A selector to restrict the list of returned objects by their labels.
   *     Defaults to everything. (optional)
   * @param limit limit is a maximum number of responses to return for a list call. If more items
   *     exist, the server will set the &#x60;continue&#x60; field on the list metadata to a value
   *     that can be used with the same initial query to retrieve the next set of results. Setting a
   *     limit may return fewer than the requested amount of items (up to zero items) in the event
   *     all requested objects are filtered out and clients should only use the presence of the
   *     continue field to determine whether more results are available. Servers may choose not to
   *     support the limit argument and will return all of the available results. If limit is
   *     specified and the continue field is empty, clients may assume that no more results are
   *     available. This field is not supported if watch is true. The server guarantees that the
   *     objects returned when using continue will be identical to issuing a single list call
   *     without a limit - that is, no objects created, modified, or deleted after the first request
   *     is issued will be included in any subsequent continued requests. This is sometimes referred
   *     to as a consistent snapshot, and ensures that a client that is using limit to receive
   *     smaller chunks of a very large result can ensure they see all possible objects. If objects
   *     are updated during a chunked list the version of the object that was present at the time
   *     the first list result was calculated is returned. (optional)
   * @param resourceVersion resourceVersion sets a constraint on what resource versions a request
   *     may be served from. See
   *     https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.
   *     Defaults to unset (optional)
   * @param resourceVersionMatch resourceVersionMatch determines how resourceVersion is applied to
   *     list calls. It is highly recommended that resourceVersionMatch be set for list calls where
   *     resourceVersion is set See
   *     https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.
   *     Defaults to unset (optional)
   * @param timeoutSeconds Timeout for the list/watch call. This limits the duration of the call,
   *     regardless of any activity or inactivity. (optional)
   * @param watch Watch for changes to the described resources and return them as a stream of add,
   *     update, and remove notifications. Specify resourceVersion. (optional)
   * @return ApiResponse&lt;V1beta2PriorityLevelConfigurationList&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public ApiResponse<V1beta2PriorityLevelConfigurationList>
      listPriorityLevelConfigurationWithHttpInfo(
          String pretty,
          Boolean allowWatchBookmarks,
          String _continue,
          String fieldSelector,
          String labelSelector,
          Integer limit,
          String resourceVersion,
          String resourceVersionMatch,
          Integer timeoutSeconds,
          Boolean watch)
          throws ApiException {
    okhttp3.Call localVarCall =
        listPriorityLevelConfigurationValidateBeforeCall(
            pretty,
            allowWatchBookmarks,
            _continue,
            fieldSelector,
            labelSelector,
            limit,
            resourceVersion,
            resourceVersionMatch,
            timeoutSeconds,
            watch,
            null);
    Type localVarReturnType = new TypeToken<V1beta2PriorityLevelConfigurationList>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * (asynchronously) list or watch objects of kind PriorityLevelConfiguration
   *
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param allowWatchBookmarks allowWatchBookmarks requests watch events with type
   *     \&quot;BOOKMARK\&quot;. Servers that do not implement bookmarks may ignore this flag and
   *     bookmarks are sent at the server&#39;s discretion. Clients should not assume bookmarks are
   *     returned at any specific interval, nor may they assume the server will send any BOOKMARK
   *     event during a session. If this is not a watch, this field is ignored. (optional)
   * @param _continue The continue option should be set when retrieving more results from the
   *     server. Since this value is server defined, clients may only use the continue value from a
   *     previous query result with identical query parameters (except for the value of continue)
   *     and the server may reject a continue value it does not recognize. If the specified continue
   *     value is no longer valid whether due to expiration (generally five to fifteen minutes) or a
   *     configuration change on the server, the server will respond with a 410 ResourceExpired
   *     error together with a continue token. If the client needs a consistent list, it must
   *     restart their list without the continue field. Otherwise, the client may send another list
   *     request with the token received with the 410 error, the server will respond with a list
   *     starting from the next key, but from the latest snapshot, which is inconsistent from the
   *     previous list results - objects that are created, modified, or deleted after the first list
   *     request will be included in the response, as long as their keys are after the \&quot;next
   *     key\&quot;. This field is not supported when watch is true. Clients may start a watch from
   *     the last resourceVersion value returned by the server and not miss any modifications.
   *     (optional)
   * @param fieldSelector A selector to restrict the list of returned objects by their fields.
   *     Defaults to everything. (optional)
   * @param labelSelector A selector to restrict the list of returned objects by their labels.
   *     Defaults to everything. (optional)
   * @param limit limit is a maximum number of responses to return for a list call. If more items
   *     exist, the server will set the &#x60;continue&#x60; field on the list metadata to a value
   *     that can be used with the same initial query to retrieve the next set of results. Setting a
   *     limit may return fewer than the requested amount of items (up to zero items) in the event
   *     all requested objects are filtered out and clients should only use the presence of the
   *     continue field to determine whether more results are available. Servers may choose not to
   *     support the limit argument and will return all of the available results. If limit is
   *     specified and the continue field is empty, clients may assume that no more results are
   *     available. This field is not supported if watch is true. The server guarantees that the
   *     objects returned when using continue will be identical to issuing a single list call
   *     without a limit - that is, no objects created, modified, or deleted after the first request
   *     is issued will be included in any subsequent continued requests. This is sometimes referred
   *     to as a consistent snapshot, and ensures that a client that is using limit to receive
   *     smaller chunks of a very large result can ensure they see all possible objects. If objects
   *     are updated during a chunked list the version of the object that was present at the time
   *     the first list result was calculated is returned. (optional)
   * @param resourceVersion resourceVersion sets a constraint on what resource versions a request
   *     may be served from. See
   *     https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.
   *     Defaults to unset (optional)
   * @param resourceVersionMatch resourceVersionMatch determines how resourceVersion is applied to
   *     list calls. It is highly recommended that resourceVersionMatch be set for list calls where
   *     resourceVersion is set See
   *     https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.
   *     Defaults to unset (optional)
   * @param timeoutSeconds Timeout for the list/watch call. This limits the duration of the call,
   *     regardless of any activity or inactivity. (optional)
   * @param watch Watch for changes to the described resources and return them as a stream of add,
   *     update, and remove notifications. Specify resourceVersion. (optional)
   * @param _callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call listPriorityLevelConfigurationAsync(
      String pretty,
      Boolean allowWatchBookmarks,
      String _continue,
      String fieldSelector,
      String labelSelector,
      Integer limit,
      String resourceVersion,
      String resourceVersionMatch,
      Integer timeoutSeconds,
      Boolean watch,
      final ApiCallback<V1beta2PriorityLevelConfigurationList> _callback)
      throws ApiException {

    okhttp3.Call localVarCall =
        listPriorityLevelConfigurationValidateBeforeCall(
            pretty,
            allowWatchBookmarks,
            _continue,
            fieldSelector,
            labelSelector,
            limit,
            resourceVersion,
            resourceVersionMatch,
            timeoutSeconds,
            watch,
            _callback);
    Type localVarReturnType = new TypeToken<V1beta2PriorityLevelConfigurationList>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }
  /**
   * Build call for patchFlowSchema
   *
   * @param name name of the FlowSchema (required)
   * @param body (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. This field is
   *     required for apply requests (application/apply-patch) but optional for non-apply patch
   *     types (JsonPatch, MergePatch, StrategicMergePatch). (optional)
   * @param fieldValidation fieldValidation determines how the server should respond to
   *     unknown/duplicate fields in the object in the request. Introduced as alpha in 1.23, older
   *     servers or servers with the &#x60;ServerSideFieldValidation&#x60; feature disabled will
   *     discard valid values specified in this param and not perform any server side field
   *     validation. Valid values are: - Ignore: ignores unknown/duplicate fields. - Warn: responds
   *     with a warning for each unknown/duplicate field, but successfully serves the request. -
   *     Strict: fails the request on unknown/duplicate fields. (optional)
   * @param force Force is going to \&quot;force\&quot; Apply requests. It means user will
   *     re-acquire conflicting fields owned by other people. Force flag must be unset for non-apply
   *     patch requests. (optional)
   * @param _callback Callback for upload/download progress
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call patchFlowSchemaCall(
      String name,
      V1Patch body,
      String pretty,
      String dryRun,
      String fieldManager,
      String fieldValidation,
      Boolean force,
      final ApiCallback _callback)
      throws ApiException {
    Object localVarPostBody = body;

    // create path and map variables
    String localVarPath =
        "/apis/flowcontrol.apiserver.k8s.io/v1beta2/flowschemas/{name}"
            .replaceAll("\\{" + "name" + "\\}", localVarApiClient.escapeString(name.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    if (pretty != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("pretty", pretty));
    }

    if (dryRun != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("dryRun", dryRun));
    }

    if (fieldManager != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("fieldManager", fieldManager));
    }

    if (fieldValidation != null) {
      localVarQueryParams.addAll(
          localVarApiClient.parameterToPair("fieldValidation", fieldValidation));
    }

    if (force != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("force", force));
    }

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();
    final String[] localVarAccepts = {
      "application/json", "application/yaml", "application/vnd.kubernetes.protobuf"
    };
    final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
    if (localVarAccept != null) {
      localVarHeaderParams.put("Accept", localVarAccept);
    }

    final String[] localVarContentTypes = {
      "application/json-patch+json",
      "application/merge-patch+json",
      "application/strategic-merge-patch+json",
      "application/apply-patch+yaml"
    };
    final String localVarContentType =
        localVarApiClient.selectHeaderContentType(localVarContentTypes);
    localVarHeaderParams.put("Content-Type", localVarContentType);

    String[] localVarAuthNames = new String[] {"BearerToken"};
    return localVarApiClient.buildCall(
        localVarPath,
        "PATCH",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAuthNames,
        _callback);
  }

  @SuppressWarnings("rawtypes")
  private okhttp3.Call patchFlowSchemaValidateBeforeCall(
      String name,
      V1Patch body,
      String pretty,
      String dryRun,
      String fieldManager,
      String fieldValidation,
      Boolean force,
      final ApiCallback _callback)
      throws ApiException {

    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(
          "Missing the required parameter 'name' when calling patchFlowSchema(Async)");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          "Missing the required parameter 'body' when calling patchFlowSchema(Async)");
    }

    okhttp3.Call localVarCall =
        patchFlowSchemaCall(
            name, body, pretty, dryRun, fieldManager, fieldValidation, force, _callback);
    return localVarCall;
  }

  /**
   * partially update the specified FlowSchema
   *
   * @param name name of the FlowSchema (required)
   * @param body (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. This field is
   *     required for apply requests (application/apply-patch) but optional for non-apply patch
   *     types (JsonPatch, MergePatch, StrategicMergePatch). (optional)
   * @param fieldValidation fieldValidation determines how the server should respond to
   *     unknown/duplicate fields in the object in the request. Introduced as alpha in 1.23, older
   *     servers or servers with the &#x60;ServerSideFieldValidation&#x60; feature disabled will
   *     discard valid values specified in this param and not perform any server side field
   *     validation. Valid values are: - Ignore: ignores unknown/duplicate fields. - Warn: responds
   *     with a warning for each unknown/duplicate field, but successfully serves the request. -
   *     Strict: fails the request on unknown/duplicate fields. (optional)
   * @param force Force is going to \&quot;force\&quot; Apply requests. It means user will
   *     re-acquire conflicting fields owned by other people. Force flag must be unset for non-apply
   *     patch requests. (optional)
   * @return V1beta2FlowSchema
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public V1beta2FlowSchema patchFlowSchema(
      String name,
      V1Patch body,
      String pretty,
      String dryRun,
      String fieldManager,
      String fieldValidation,
      Boolean force)
      throws ApiException {
    ApiResponse<V1beta2FlowSchema> localVarResp =
        patchFlowSchemaWithHttpInfo(
            name, body, pretty, dryRun, fieldManager, fieldValidation, force);
    return localVarResp.getData();
  }

  /**
   * partially update the specified FlowSchema
   *
   * @param name name of the FlowSchema (required)
   * @param body (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. This field is
   *     required for apply requests (application/apply-patch) but optional for non-apply patch
   *     types (JsonPatch, MergePatch, StrategicMergePatch). (optional)
   * @param fieldValidation fieldValidation determines how the server should respond to
   *     unknown/duplicate fields in the object in the request. Introduced as alpha in 1.23, older
   *     servers or servers with the &#x60;ServerSideFieldValidation&#x60; feature disabled will
   *     discard valid values specified in this param and not perform any server side field
   *     validation. Valid values are: - Ignore: ignores unknown/duplicate fields. - Warn: responds
   *     with a warning for each unknown/duplicate field, but successfully serves the request. -
   *     Strict: fails the request on unknown/duplicate fields. (optional)
   * @param force Force is going to \&quot;force\&quot; Apply requests. It means user will
   *     re-acquire conflicting fields owned by other people. Force flag must be unset for non-apply
   *     patch requests. (optional)
   * @return ApiResponse&lt;V1beta2FlowSchema&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public ApiResponse<V1beta2FlowSchema> patchFlowSchemaWithHttpInfo(
      String name,
      V1Patch body,
      String pretty,
      String dryRun,
      String fieldManager,
      String fieldValidation,
      Boolean force)
      throws ApiException {
    okhttp3.Call localVarCall =
        patchFlowSchemaValidateBeforeCall(
            name, body, pretty, dryRun, fieldManager, fieldValidation, force, null);
    Type localVarReturnType = new TypeToken<V1beta2FlowSchema>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * (asynchronously) partially update the specified FlowSchema
   *
   * @param name name of the FlowSchema (required)
   * @param body (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. This field is
   *     required for apply requests (application/apply-patch) but optional for non-apply patch
   *     types (JsonPatch, MergePatch, StrategicMergePatch). (optional)
   * @param fieldValidation fieldValidation determines how the server should respond to
   *     unknown/duplicate fields in the object in the request. Introduced as alpha in 1.23, older
   *     servers or servers with the &#x60;ServerSideFieldValidation&#x60; feature disabled will
   *     discard valid values specified in this param and not perform any server side field
   *     validation. Valid values are: - Ignore: ignores unknown/duplicate fields. - Warn: responds
   *     with a warning for each unknown/duplicate field, but successfully serves the request. -
   *     Strict: fails the request on unknown/duplicate fields. (optional)
   * @param force Force is going to \&quot;force\&quot; Apply requests. It means user will
   *     re-acquire conflicting fields owned by other people. Force flag must be unset for non-apply
   *     patch requests. (optional)
   * @param _callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call patchFlowSchemaAsync(
      String name,
      V1Patch body,
      String pretty,
      String dryRun,
      String fieldManager,
      String fieldValidation,
      Boolean force,
      final ApiCallback<V1beta2FlowSchema> _callback)
      throws ApiException {

    okhttp3.Call localVarCall =
        patchFlowSchemaValidateBeforeCall(
            name, body, pretty, dryRun, fieldManager, fieldValidation, force, _callback);
    Type localVarReturnType = new TypeToken<V1beta2FlowSchema>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }
  /**
   * Build call for patchFlowSchemaStatus
   *
   * @param name name of the FlowSchema (required)
   * @param body (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. This field is
   *     required for apply requests (application/apply-patch) but optional for non-apply patch
   *     types (JsonPatch, MergePatch, StrategicMergePatch). (optional)
   * @param fieldValidation fieldValidation determines how the server should respond to
   *     unknown/duplicate fields in the object in the request. Introduced as alpha in 1.23, older
   *     servers or servers with the &#x60;ServerSideFieldValidation&#x60; feature disabled will
   *     discard valid values specified in this param and not perform any server side field
   *     validation. Valid values are: - Ignore: ignores unknown/duplicate fields. - Warn: responds
   *     with a warning for each unknown/duplicate field, but successfully serves the request. -
   *     Strict: fails the request on unknown/duplicate fields. (optional)
   * @param force Force is going to \&quot;force\&quot; Apply requests. It means user will
   *     re-acquire conflicting fields owned by other people. Force flag must be unset for non-apply
   *     patch requests. (optional)
   * @param _callback Callback for upload/download progress
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call patchFlowSchemaStatusCall(
      String name,
      V1Patch body,
      String pretty,
      String dryRun,
      String fieldManager,
      String fieldValidation,
      Boolean force,
      final ApiCallback _callback)
      throws ApiException {
    Object localVarPostBody = body;

    // create path and map variables
    String localVarPath =
        "/apis/flowcontrol.apiserver.k8s.io/v1beta2/flowschemas/{name}/status"
            .replaceAll("\\{" + "name" + "\\}", localVarApiClient.escapeString(name.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    if (pretty != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("pretty", pretty));
    }

    if (dryRun != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("dryRun", dryRun));
    }

    if (fieldManager != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("fieldManager", fieldManager));
    }

    if (fieldValidation != null) {
      localVarQueryParams.addAll(
          localVarApiClient.parameterToPair("fieldValidation", fieldValidation));
    }

    if (force != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("force", force));
    }

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();
    final String[] localVarAccepts = {
      "application/json", "application/yaml", "application/vnd.kubernetes.protobuf"
    };
    final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
    if (localVarAccept != null) {
      localVarHeaderParams.put("Accept", localVarAccept);
    }

    final String[] localVarContentTypes = {
      "application/json-patch+json",
      "application/merge-patch+json",
      "application/strategic-merge-patch+json",
      "application/apply-patch+yaml"
    };
    final String localVarContentType =
        localVarApiClient.selectHeaderContentType(localVarContentTypes);
    localVarHeaderParams.put("Content-Type", localVarContentType);

    String[] localVarAuthNames = new String[] {"BearerToken"};
    return localVarApiClient.buildCall(
        localVarPath,
        "PATCH",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAuthNames,
        _callback);
  }

  @SuppressWarnings("rawtypes")
  private okhttp3.Call patchFlowSchemaStatusValidateBeforeCall(
      String name,
      V1Patch body,
      String pretty,
      String dryRun,
      String fieldManager,
      String fieldValidation,
      Boolean force,
      final ApiCallback _callback)
      throws ApiException {

    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(
          "Missing the required parameter 'name' when calling patchFlowSchemaStatus(Async)");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          "Missing the required parameter 'body' when calling patchFlowSchemaStatus(Async)");
    }

    okhttp3.Call localVarCall =
        patchFlowSchemaStatusCall(
            name, body, pretty, dryRun, fieldManager, fieldValidation, force, _callback);
    return localVarCall;
  }

  /**
   * partially update status of the specified FlowSchema
   *
   * @param name name of the FlowSchema (required)
   * @param body (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. This field is
   *     required for apply requests (application/apply-patch) but optional for non-apply patch
   *     types (JsonPatch, MergePatch, StrategicMergePatch). (optional)
   * @param fieldValidation fieldValidation determines how the server should respond to
   *     unknown/duplicate fields in the object in the request. Introduced as alpha in 1.23, older
   *     servers or servers with the &#x60;ServerSideFieldValidation&#x60; feature disabled will
   *     discard valid values specified in this param and not perform any server side field
   *     validation. Valid values are: - Ignore: ignores unknown/duplicate fields. - Warn: responds
   *     with a warning for each unknown/duplicate field, but successfully serves the request. -
   *     Strict: fails the request on unknown/duplicate fields. (optional)
   * @param force Force is going to \&quot;force\&quot; Apply requests. It means user will
   *     re-acquire conflicting fields owned by other people. Force flag must be unset for non-apply
   *     patch requests. (optional)
   * @return V1beta2FlowSchema
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public V1beta2FlowSchema patchFlowSchemaStatus(
      String name,
      V1Patch body,
      String pretty,
      String dryRun,
      String fieldManager,
      String fieldValidation,
      Boolean force)
      throws ApiException {
    ApiResponse<V1beta2FlowSchema> localVarResp =
        patchFlowSchemaStatusWithHttpInfo(
            name, body, pretty, dryRun, fieldManager, fieldValidation, force);
    return localVarResp.getData();
  }

  /**
   * partially update status of the specified FlowSchema
   *
   * @param name name of the FlowSchema (required)
   * @param body (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. This field is
   *     required for apply requests (application/apply-patch) but optional for non-apply patch
   *     types (JsonPatch, MergePatch, StrategicMergePatch). (optional)
   * @param fieldValidation fieldValidation determines how the server should respond to
   *     unknown/duplicate fields in the object in the request. Introduced as alpha in 1.23, older
   *     servers or servers with the &#x60;ServerSideFieldValidation&#x60; feature disabled will
   *     discard valid values specified in this param and not perform any server side field
   *     validation. Valid values are: - Ignore: ignores unknown/duplicate fields. - Warn: responds
   *     with a warning for each unknown/duplicate field, but successfully serves the request. -
   *     Strict: fails the request on unknown/duplicate fields. (optional)
   * @param force Force is going to \&quot;force\&quot; Apply requests. It means user will
   *     re-acquire conflicting fields owned by other people. Force flag must be unset for non-apply
   *     patch requests. (optional)
   * @return ApiResponse&lt;V1beta2FlowSchema&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public ApiResponse<V1beta2FlowSchema> patchFlowSchemaStatusWithHttpInfo(
      String name,
      V1Patch body,
      String pretty,
      String dryRun,
      String fieldManager,
      String fieldValidation,
      Boolean force)
      throws ApiException {
    okhttp3.Call localVarCall =
        patchFlowSchemaStatusValidateBeforeCall(
            name, body, pretty, dryRun, fieldManager, fieldValidation, force, null);
    Type localVarReturnType = new TypeToken<V1beta2FlowSchema>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * (asynchronously) partially update status of the specified FlowSchema
   *
   * @param name name of the FlowSchema (required)
   * @param body (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. This field is
   *     required for apply requests (application/apply-patch) but optional for non-apply patch
   *     types (JsonPatch, MergePatch, StrategicMergePatch). (optional)
   * @param fieldValidation fieldValidation determines how the server should respond to
   *     unknown/duplicate fields in the object in the request. Introduced as alpha in 1.23, older
   *     servers or servers with the &#x60;ServerSideFieldValidation&#x60; feature disabled will
   *     discard valid values specified in this param and not perform any server side field
   *     validation. Valid values are: - Ignore: ignores unknown/duplicate fields. - Warn: responds
   *     with a warning for each unknown/duplicate field, but successfully serves the request. -
   *     Strict: fails the request on unknown/duplicate fields. (optional)
   * @param force Force is going to \&quot;force\&quot; Apply requests. It means user will
   *     re-acquire conflicting fields owned by other people. Force flag must be unset for non-apply
   *     patch requests. (optional)
   * @param _callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call patchFlowSchemaStatusAsync(
      String name,
      V1Patch body,
      String pretty,
      String dryRun,
      String fieldManager,
      String fieldValidation,
      Boolean force,
      final ApiCallback<V1beta2FlowSchema> _callback)
      throws ApiException {

    okhttp3.Call localVarCall =
        patchFlowSchemaStatusValidateBeforeCall(
            name, body, pretty, dryRun, fieldManager, fieldValidation, force, _callback);
    Type localVarReturnType = new TypeToken<V1beta2FlowSchema>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }
  /**
   * Build call for patchPriorityLevelConfiguration
   *
   * @param name name of the PriorityLevelConfiguration (required)
   * @param body (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. This field is
   *     required for apply requests (application/apply-patch) but optional for non-apply patch
   *     types (JsonPatch, MergePatch, StrategicMergePatch). (optional)
   * @param fieldValidation fieldValidation determines how the server should respond to
   *     unknown/duplicate fields in the object in the request. Introduced as alpha in 1.23, older
   *     servers or servers with the &#x60;ServerSideFieldValidation&#x60; feature disabled will
   *     discard valid values specified in this param and not perform any server side field
   *     validation. Valid values are: - Ignore: ignores unknown/duplicate fields. - Warn: responds
   *     with a warning for each unknown/duplicate field, but successfully serves the request. -
   *     Strict: fails the request on unknown/duplicate fields. (optional)
   * @param force Force is going to \&quot;force\&quot; Apply requests. It means user will
   *     re-acquire conflicting fields owned by other people. Force flag must be unset for non-apply
   *     patch requests. (optional)
   * @param _callback Callback for upload/download progress
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call patchPriorityLevelConfigurationCall(
      String name,
      V1Patch body,
      String pretty,
      String dryRun,
      String fieldManager,
      String fieldValidation,
      Boolean force,
      final ApiCallback _callback)
      throws ApiException {
    Object localVarPostBody = body;

    // create path and map variables
    String localVarPath =
        "/apis/flowcontrol.apiserver.k8s.io/v1beta2/prioritylevelconfigurations/{name}"
            .replaceAll("\\{" + "name" + "\\}", localVarApiClient.escapeString(name.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    if (pretty != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("pretty", pretty));
    }

    if (dryRun != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("dryRun", dryRun));
    }

    if (fieldManager != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("fieldManager", fieldManager));
    }

    if (fieldValidation != null) {
      localVarQueryParams.addAll(
          localVarApiClient.parameterToPair("fieldValidation", fieldValidation));
    }

    if (force != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("force", force));
    }

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();
    final String[] localVarAccepts = {
      "application/json", "application/yaml", "application/vnd.kubernetes.protobuf"
    };
    final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
    if (localVarAccept != null) {
      localVarHeaderParams.put("Accept", localVarAccept);
    }

    final String[] localVarContentTypes = {
      "application/json-patch+json",
      "application/merge-patch+json",
      "application/strategic-merge-patch+json",
      "application/apply-patch+yaml"
    };
    final String localVarContentType =
        localVarApiClient.selectHeaderContentType(localVarContentTypes);
    localVarHeaderParams.put("Content-Type", localVarContentType);

    String[] localVarAuthNames = new String[] {"BearerToken"};
    return localVarApiClient.buildCall(
        localVarPath,
        "PATCH",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAuthNames,
        _callback);
  }

  @SuppressWarnings("rawtypes")
  private okhttp3.Call patchPriorityLevelConfigurationValidateBeforeCall(
      String name,
      V1Patch body,
      String pretty,
      String dryRun,
      String fieldManager,
      String fieldValidation,
      Boolean force,
      final ApiCallback _callback)
      throws ApiException {

    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(
          "Missing the required parameter 'name' when calling patchPriorityLevelConfiguration(Async)");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          "Missing the required parameter 'body' when calling patchPriorityLevelConfiguration(Async)");
    }

    okhttp3.Call localVarCall =
        patchPriorityLevelConfigurationCall(
            name, body, pretty, dryRun, fieldManager, fieldValidation, force, _callback);
    return localVarCall;
  }

  /**
   * partially update the specified PriorityLevelConfiguration
   *
   * @param name name of the PriorityLevelConfiguration (required)
   * @param body (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. This field is
   *     required for apply requests (application/apply-patch) but optional for non-apply patch
   *     types (JsonPatch, MergePatch, StrategicMergePatch). (optional)
   * @param fieldValidation fieldValidation determines how the server should respond to
   *     unknown/duplicate fields in the object in the request. Introduced as alpha in 1.23, older
   *     servers or servers with the &#x60;ServerSideFieldValidation&#x60; feature disabled will
   *     discard valid values specified in this param and not perform any server side field
   *     validation. Valid values are: - Ignore: ignores unknown/duplicate fields. - Warn: responds
   *     with a warning for each unknown/duplicate field, but successfully serves the request. -
   *     Strict: fails the request on unknown/duplicate fields. (optional)
   * @param force Force is going to \&quot;force\&quot; Apply requests. It means user will
   *     re-acquire conflicting fields owned by other people. Force flag must be unset for non-apply
   *     patch requests. (optional)
   * @return V1beta2PriorityLevelConfiguration
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public V1beta2PriorityLevelConfiguration patchPriorityLevelConfiguration(
      String name,
      V1Patch body,
      String pretty,
      String dryRun,
      String fieldManager,
      String fieldValidation,
      Boolean force)
      throws ApiException {
    ApiResponse<V1beta2PriorityLevelConfiguration> localVarResp =
        patchPriorityLevelConfigurationWithHttpInfo(
            name, body, pretty, dryRun, fieldManager, fieldValidation, force);
    return localVarResp.getData();
  }

  /**
   * partially update the specified PriorityLevelConfiguration
   *
   * @param name name of the PriorityLevelConfiguration (required)
   * @param body (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. This field is
   *     required for apply requests (application/apply-patch) but optional for non-apply patch
   *     types (JsonPatch, MergePatch, StrategicMergePatch). (optional)
   * @param fieldValidation fieldValidation determines how the server should respond to
   *     unknown/duplicate fields in the object in the request. Introduced as alpha in 1.23, older
   *     servers or servers with the &#x60;ServerSideFieldValidation&#x60; feature disabled will
   *     discard valid values specified in this param and not perform any server side field
   *     validation. Valid values are: - Ignore: ignores unknown/duplicate fields. - Warn: responds
   *     with a warning for each unknown/duplicate field, but successfully serves the request. -
   *     Strict: fails the request on unknown/duplicate fields. (optional)
   * @param force Force is going to \&quot;force\&quot; Apply requests. It means user will
   *     re-acquire conflicting fields owned by other people. Force flag must be unset for non-apply
   *     patch requests. (optional)
   * @return ApiResponse&lt;V1beta2PriorityLevelConfiguration&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public ApiResponse<V1beta2PriorityLevelConfiguration> patchPriorityLevelConfigurationWithHttpInfo(
      String name,
      V1Patch body,
      String pretty,
      String dryRun,
      String fieldManager,
      String fieldValidation,
      Boolean force)
      throws ApiException {
    okhttp3.Call localVarCall =
        patchPriorityLevelConfigurationValidateBeforeCall(
            name, body, pretty, dryRun, fieldManager, fieldValidation, force, null);
    Type localVarReturnType = new TypeToken<V1beta2PriorityLevelConfiguration>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * (asynchronously) partially update the specified PriorityLevelConfiguration
   *
   * @param name name of the PriorityLevelConfiguration (required)
   * @param body (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. This field is
   *     required for apply requests (application/apply-patch) but optional for non-apply patch
   *     types (JsonPatch, MergePatch, StrategicMergePatch). (optional)
   * @param fieldValidation fieldValidation determines how the server should respond to
   *     unknown/duplicate fields in the object in the request. Introduced as alpha in 1.23, older
   *     servers or servers with the &#x60;ServerSideFieldValidation&#x60; feature disabled will
   *     discard valid values specified in this param and not perform any server side field
   *     validation. Valid values are: - Ignore: ignores unknown/duplicate fields. - Warn: responds
   *     with a warning for each unknown/duplicate field, but successfully serves the request. -
   *     Strict: fails the request on unknown/duplicate fields. (optional)
   * @param force Force is going to \&quot;force\&quot; Apply requests. It means user will
   *     re-acquire conflicting fields owned by other people. Force flag must be unset for non-apply
   *     patch requests. (optional)
   * @param _callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call patchPriorityLevelConfigurationAsync(
      String name,
      V1Patch body,
      String pretty,
      String dryRun,
      String fieldManager,
      String fieldValidation,
      Boolean force,
      final ApiCallback<V1beta2PriorityLevelConfiguration> _callback)
      throws ApiException {

    okhttp3.Call localVarCall =
        patchPriorityLevelConfigurationValidateBeforeCall(
            name, body, pretty, dryRun, fieldManager, fieldValidation, force, _callback);
    Type localVarReturnType = new TypeToken<V1beta2PriorityLevelConfiguration>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }
  /**
   * Build call for patchPriorityLevelConfigurationStatus
   *
   * @param name name of the PriorityLevelConfiguration (required)
   * @param body (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. This field is
   *     required for apply requests (application/apply-patch) but optional for non-apply patch
   *     types (JsonPatch, MergePatch, StrategicMergePatch). (optional)
   * @param fieldValidation fieldValidation determines how the server should respond to
   *     unknown/duplicate fields in the object in the request. Introduced as alpha in 1.23, older
   *     servers or servers with the &#x60;ServerSideFieldValidation&#x60; feature disabled will
   *     discard valid values specified in this param and not perform any server side field
   *     validation. Valid values are: - Ignore: ignores unknown/duplicate fields. - Warn: responds
   *     with a warning for each unknown/duplicate field, but successfully serves the request. -
   *     Strict: fails the request on unknown/duplicate fields. (optional)
   * @param force Force is going to \&quot;force\&quot; Apply requests. It means user will
   *     re-acquire conflicting fields owned by other people. Force flag must be unset for non-apply
   *     patch requests. (optional)
   * @param _callback Callback for upload/download progress
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call patchPriorityLevelConfigurationStatusCall(
      String name,
      V1Patch body,
      String pretty,
      String dryRun,
      String fieldManager,
      String fieldValidation,
      Boolean force,
      final ApiCallback _callback)
      throws ApiException {
    Object localVarPostBody = body;

    // create path and map variables
    String localVarPath =
        "/apis/flowcontrol.apiserver.k8s.io/v1beta2/prioritylevelconfigurations/{name}/status"
            .replaceAll("\\{" + "name" + "\\}", localVarApiClient.escapeString(name.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    if (pretty != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("pretty", pretty));
    }

    if (dryRun != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("dryRun", dryRun));
    }

    if (fieldManager != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("fieldManager", fieldManager));
    }

    if (fieldValidation != null) {
      localVarQueryParams.addAll(
          localVarApiClient.parameterToPair("fieldValidation", fieldValidation));
    }

    if (force != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("force", force));
    }

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();
    final String[] localVarAccepts = {
      "application/json", "application/yaml", "application/vnd.kubernetes.protobuf"
    };
    final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
    if (localVarAccept != null) {
      localVarHeaderParams.put("Accept", localVarAccept);
    }

    final String[] localVarContentTypes = {
      "application/json-patch+json",
      "application/merge-patch+json",
      "application/strategic-merge-patch+json",
      "application/apply-patch+yaml"
    };
    final String localVarContentType =
        localVarApiClient.selectHeaderContentType(localVarContentTypes);
    localVarHeaderParams.put("Content-Type", localVarContentType);

    String[] localVarAuthNames = new String[] {"BearerToken"};
    return localVarApiClient.buildCall(
        localVarPath,
        "PATCH",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAuthNames,
        _callback);
  }

  @SuppressWarnings("rawtypes")
  private okhttp3.Call patchPriorityLevelConfigurationStatusValidateBeforeCall(
      String name,
      V1Patch body,
      String pretty,
      String dryRun,
      String fieldManager,
      String fieldValidation,
      Boolean force,
      final ApiCallback _callback)
      throws ApiException {

    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(
          "Missing the required parameter 'name' when calling patchPriorityLevelConfigurationStatus(Async)");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          "Missing the required parameter 'body' when calling patchPriorityLevelConfigurationStatus(Async)");
    }

    okhttp3.Call localVarCall =
        patchPriorityLevelConfigurationStatusCall(
            name, body, pretty, dryRun, fieldManager, fieldValidation, force, _callback);
    return localVarCall;
  }

  /**
   * partially update status of the specified PriorityLevelConfiguration
   *
   * @param name name of the PriorityLevelConfiguration (required)
   * @param body (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. This field is
   *     required for apply requests (application/apply-patch) but optional for non-apply patch
   *     types (JsonPatch, MergePatch, StrategicMergePatch). (optional)
   * @param fieldValidation fieldValidation determines how the server should respond to
   *     unknown/duplicate fields in the object in the request. Introduced as alpha in 1.23, older
   *     servers or servers with the &#x60;ServerSideFieldValidation&#x60; feature disabled will
   *     discard valid values specified in this param and not perform any server side field
   *     validation. Valid values are: - Ignore: ignores unknown/duplicate fields. - Warn: responds
   *     with a warning for each unknown/duplicate field, but successfully serves the request. -
   *     Strict: fails the request on unknown/duplicate fields. (optional)
   * @param force Force is going to \&quot;force\&quot; Apply requests. It means user will
   *     re-acquire conflicting fields owned by other people. Force flag must be unset for non-apply
   *     patch requests. (optional)
   * @return V1beta2PriorityLevelConfiguration
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public V1beta2PriorityLevelConfiguration patchPriorityLevelConfigurationStatus(
      String name,
      V1Patch body,
      String pretty,
      String dryRun,
      String fieldManager,
      String fieldValidation,
      Boolean force)
      throws ApiException {
    ApiResponse<V1beta2PriorityLevelConfiguration> localVarResp =
        patchPriorityLevelConfigurationStatusWithHttpInfo(
            name, body, pretty, dryRun, fieldManager, fieldValidation, force);
    return localVarResp.getData();
  }

  /**
   * partially update status of the specified PriorityLevelConfiguration
   *
   * @param name name of the PriorityLevelConfiguration (required)
   * @param body (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. This field is
   *     required for apply requests (application/apply-patch) but optional for non-apply patch
   *     types (JsonPatch, MergePatch, StrategicMergePatch). (optional)
   * @param fieldValidation fieldValidation determines how the server should respond to
   *     unknown/duplicate fields in the object in the request. Introduced as alpha in 1.23, older
   *     servers or servers with the &#x60;ServerSideFieldValidation&#x60; feature disabled will
   *     discard valid values specified in this param and not perform any server side field
   *     validation. Valid values are: - Ignore: ignores unknown/duplicate fields. - Warn: responds
   *     with a warning for each unknown/duplicate field, but successfully serves the request. -
   *     Strict: fails the request on unknown/duplicate fields. (optional)
   * @param force Force is going to \&quot;force\&quot; Apply requests. It means user will
   *     re-acquire conflicting fields owned by other people. Force flag must be unset for non-apply
   *     patch requests. (optional)
   * @return ApiResponse&lt;V1beta2PriorityLevelConfiguration&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public ApiResponse<V1beta2PriorityLevelConfiguration>
      patchPriorityLevelConfigurationStatusWithHttpInfo(
          String name,
          V1Patch body,
          String pretty,
          String dryRun,
          String fieldManager,
          String fieldValidation,
          Boolean force)
          throws ApiException {
    okhttp3.Call localVarCall =
        patchPriorityLevelConfigurationStatusValidateBeforeCall(
            name, body, pretty, dryRun, fieldManager, fieldValidation, force, null);
    Type localVarReturnType = new TypeToken<V1beta2PriorityLevelConfiguration>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * (asynchronously) partially update status of the specified PriorityLevelConfiguration
   *
   * @param name name of the PriorityLevelConfiguration (required)
   * @param body (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. This field is
   *     required for apply requests (application/apply-patch) but optional for non-apply patch
   *     types (JsonPatch, MergePatch, StrategicMergePatch). (optional)
   * @param fieldValidation fieldValidation determines how the server should respond to
   *     unknown/duplicate fields in the object in the request. Introduced as alpha in 1.23, older
   *     servers or servers with the &#x60;ServerSideFieldValidation&#x60; feature disabled will
   *     discard valid values specified in this param and not perform any server side field
   *     validation. Valid values are: - Ignore: ignores unknown/duplicate fields. - Warn: responds
   *     with a warning for each unknown/duplicate field, but successfully serves the request. -
   *     Strict: fails the request on unknown/duplicate fields. (optional)
   * @param force Force is going to \&quot;force\&quot; Apply requests. It means user will
   *     re-acquire conflicting fields owned by other people. Force flag must be unset for non-apply
   *     patch requests. (optional)
   * @param _callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call patchPriorityLevelConfigurationStatusAsync(
      String name,
      V1Patch body,
      String pretty,
      String dryRun,
      String fieldManager,
      String fieldValidation,
      Boolean force,
      final ApiCallback<V1beta2PriorityLevelConfiguration> _callback)
      throws ApiException {

    okhttp3.Call localVarCall =
        patchPriorityLevelConfigurationStatusValidateBeforeCall(
            name, body, pretty, dryRun, fieldManager, fieldValidation, force, _callback);
    Type localVarReturnType = new TypeToken<V1beta2PriorityLevelConfiguration>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }
  /**
   * Build call for readFlowSchema
   *
   * @param name name of the FlowSchema (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param _callback Callback for upload/download progress
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call readFlowSchemaCall(String name, String pretty, final ApiCallback _callback)
      throws ApiException {
    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath =
        "/apis/flowcontrol.apiserver.k8s.io/v1beta2/flowschemas/{name}"
            .replaceAll("\\{" + "name" + "\\}", localVarApiClient.escapeString(name.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    if (pretty != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("pretty", pretty));
    }

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();
    final String[] localVarAccepts = {
      "application/json", "application/yaml", "application/vnd.kubernetes.protobuf"
    };
    final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
    if (localVarAccept != null) {
      localVarHeaderParams.put("Accept", localVarAccept);
    }

    final String[] localVarContentTypes = {};

    final String localVarContentType =
        localVarApiClient.selectHeaderContentType(localVarContentTypes);
    localVarHeaderParams.put("Content-Type", localVarContentType);

    String[] localVarAuthNames = new String[] {"BearerToken"};
    return localVarApiClient.buildCall(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAuthNames,
        _callback);
  }

  @SuppressWarnings("rawtypes")
  private okhttp3.Call readFlowSchemaValidateBeforeCall(
      String name, String pretty, final ApiCallback _callback) throws ApiException {

    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(
          "Missing the required parameter 'name' when calling readFlowSchema(Async)");
    }

    okhttp3.Call localVarCall = readFlowSchemaCall(name, pretty, _callback);
    return localVarCall;
  }

  /**
   * read the specified FlowSchema
   *
   * @param name name of the FlowSchema (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @return V1beta2FlowSchema
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public V1beta2FlowSchema readFlowSchema(String name, String pretty) throws ApiException {
    ApiResponse<V1beta2FlowSchema> localVarResp = readFlowSchemaWithHttpInfo(name, pretty);
    return localVarResp.getData();
  }

  /**
   * read the specified FlowSchema
   *
   * @param name name of the FlowSchema (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @return ApiResponse&lt;V1beta2FlowSchema&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public ApiResponse<V1beta2FlowSchema> readFlowSchemaWithHttpInfo(String name, String pretty)
      throws ApiException {
    okhttp3.Call localVarCall = readFlowSchemaValidateBeforeCall(name, pretty, null);
    Type localVarReturnType = new TypeToken<V1beta2FlowSchema>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * (asynchronously) read the specified FlowSchema
   *
   * @param name name of the FlowSchema (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param _callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call readFlowSchemaAsync(
      String name, String pretty, final ApiCallback<V1beta2FlowSchema> _callback)
      throws ApiException {

    okhttp3.Call localVarCall = readFlowSchemaValidateBeforeCall(name, pretty, _callback);
    Type localVarReturnType = new TypeToken<V1beta2FlowSchema>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }
  /**
   * Build call for readFlowSchemaStatus
   *
   * @param name name of the FlowSchema (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param _callback Callback for upload/download progress
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call readFlowSchemaStatusCall(
      String name, String pretty, final ApiCallback _callback) throws ApiException {
    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath =
        "/apis/flowcontrol.apiserver.k8s.io/v1beta2/flowschemas/{name}/status"
            .replaceAll("\\{" + "name" + "\\}", localVarApiClient.escapeString(name.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    if (pretty != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("pretty", pretty));
    }

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();
    final String[] localVarAccepts = {
      "application/json", "application/yaml", "application/vnd.kubernetes.protobuf"
    };
    final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
    if (localVarAccept != null) {
      localVarHeaderParams.put("Accept", localVarAccept);
    }

    final String[] localVarContentTypes = {};

    final String localVarContentType =
        localVarApiClient.selectHeaderContentType(localVarContentTypes);
    localVarHeaderParams.put("Content-Type", localVarContentType);

    String[] localVarAuthNames = new String[] {"BearerToken"};
    return localVarApiClient.buildCall(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAuthNames,
        _callback);
  }

  @SuppressWarnings("rawtypes")
  private okhttp3.Call readFlowSchemaStatusValidateBeforeCall(
      String name, String pretty, final ApiCallback _callback) throws ApiException {

    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(
          "Missing the required parameter 'name' when calling readFlowSchemaStatus(Async)");
    }

    okhttp3.Call localVarCall = readFlowSchemaStatusCall(name, pretty, _callback);
    return localVarCall;
  }

  /**
   * read status of the specified FlowSchema
   *
   * @param name name of the FlowSchema (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @return V1beta2FlowSchema
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public V1beta2FlowSchema readFlowSchemaStatus(String name, String pretty) throws ApiException {
    ApiResponse<V1beta2FlowSchema> localVarResp = readFlowSchemaStatusWithHttpInfo(name, pretty);
    return localVarResp.getData();
  }

  /**
   * read status of the specified FlowSchema
   *
   * @param name name of the FlowSchema (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @return ApiResponse&lt;V1beta2FlowSchema&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public ApiResponse<V1beta2FlowSchema> readFlowSchemaStatusWithHttpInfo(String name, String pretty)
      throws ApiException {
    okhttp3.Call localVarCall = readFlowSchemaStatusValidateBeforeCall(name, pretty, null);
    Type localVarReturnType = new TypeToken<V1beta2FlowSchema>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * (asynchronously) read status of the specified FlowSchema
   *
   * @param name name of the FlowSchema (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param _callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call readFlowSchemaStatusAsync(
      String name, String pretty, final ApiCallback<V1beta2FlowSchema> _callback)
      throws ApiException {

    okhttp3.Call localVarCall = readFlowSchemaStatusValidateBeforeCall(name, pretty, _callback);
    Type localVarReturnType = new TypeToken<V1beta2FlowSchema>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }
  /**
   * Build call for readPriorityLevelConfiguration
   *
   * @param name name of the PriorityLevelConfiguration (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param _callback Callback for upload/download progress
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call readPriorityLevelConfigurationCall(
      String name, String pretty, final ApiCallback _callback) throws ApiException {
    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath =
        "/apis/flowcontrol.apiserver.k8s.io/v1beta2/prioritylevelconfigurations/{name}"
            .replaceAll("\\{" + "name" + "\\}", localVarApiClient.escapeString(name.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    if (pretty != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("pretty", pretty));
    }

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();
    final String[] localVarAccepts = {
      "application/json", "application/yaml", "application/vnd.kubernetes.protobuf"
    };
    final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
    if (localVarAccept != null) {
      localVarHeaderParams.put("Accept", localVarAccept);
    }

    final String[] localVarContentTypes = {};

    final String localVarContentType =
        localVarApiClient.selectHeaderContentType(localVarContentTypes);
    localVarHeaderParams.put("Content-Type", localVarContentType);

    String[] localVarAuthNames = new String[] {"BearerToken"};
    return localVarApiClient.buildCall(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAuthNames,
        _callback);
  }

  @SuppressWarnings("rawtypes")
  private okhttp3.Call readPriorityLevelConfigurationValidateBeforeCall(
      String name, String pretty, final ApiCallback _callback) throws ApiException {

    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(
          "Missing the required parameter 'name' when calling readPriorityLevelConfiguration(Async)");
    }

    okhttp3.Call localVarCall = readPriorityLevelConfigurationCall(name, pretty, _callback);
    return localVarCall;
  }

  /**
   * read the specified PriorityLevelConfiguration
   *
   * @param name name of the PriorityLevelConfiguration (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @return V1beta2PriorityLevelConfiguration
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public V1beta2PriorityLevelConfiguration readPriorityLevelConfiguration(
      String name, String pretty) throws ApiException {
    ApiResponse<V1beta2PriorityLevelConfiguration> localVarResp =
        readPriorityLevelConfigurationWithHttpInfo(name, pretty);
    return localVarResp.getData();
  }

  /**
   * read the specified PriorityLevelConfiguration
   *
   * @param name name of the PriorityLevelConfiguration (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @return ApiResponse&lt;V1beta2PriorityLevelConfiguration&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public ApiResponse<V1beta2PriorityLevelConfiguration> readPriorityLevelConfigurationWithHttpInfo(
      String name, String pretty) throws ApiException {
    okhttp3.Call localVarCall =
        readPriorityLevelConfigurationValidateBeforeCall(name, pretty, null);
    Type localVarReturnType = new TypeToken<V1beta2PriorityLevelConfiguration>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * (asynchronously) read the specified PriorityLevelConfiguration
   *
   * @param name name of the PriorityLevelConfiguration (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param _callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call readPriorityLevelConfigurationAsync(
      String name, String pretty, final ApiCallback<V1beta2PriorityLevelConfiguration> _callback)
      throws ApiException {

    okhttp3.Call localVarCall =
        readPriorityLevelConfigurationValidateBeforeCall(name, pretty, _callback);
    Type localVarReturnType = new TypeToken<V1beta2PriorityLevelConfiguration>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }
  /**
   * Build call for readPriorityLevelConfigurationStatus
   *
   * @param name name of the PriorityLevelConfiguration (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param _callback Callback for upload/download progress
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call readPriorityLevelConfigurationStatusCall(
      String name, String pretty, final ApiCallback _callback) throws ApiException {
    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath =
        "/apis/flowcontrol.apiserver.k8s.io/v1beta2/prioritylevelconfigurations/{name}/status"
            .replaceAll("\\{" + "name" + "\\}", localVarApiClient.escapeString(name.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    if (pretty != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("pretty", pretty));
    }

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();
    final String[] localVarAccepts = {
      "application/json", "application/yaml", "application/vnd.kubernetes.protobuf"
    };
    final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
    if (localVarAccept != null) {
      localVarHeaderParams.put("Accept", localVarAccept);
    }

    final String[] localVarContentTypes = {};

    final String localVarContentType =
        localVarApiClient.selectHeaderContentType(localVarContentTypes);
    localVarHeaderParams.put("Content-Type", localVarContentType);

    String[] localVarAuthNames = new String[] {"BearerToken"};
    return localVarApiClient.buildCall(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAuthNames,
        _callback);
  }

  @SuppressWarnings("rawtypes")
  private okhttp3.Call readPriorityLevelConfigurationStatusValidateBeforeCall(
      String name, String pretty, final ApiCallback _callback) throws ApiException {

    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(
          "Missing the required parameter 'name' when calling readPriorityLevelConfigurationStatus(Async)");
    }

    okhttp3.Call localVarCall = readPriorityLevelConfigurationStatusCall(name, pretty, _callback);
    return localVarCall;
  }

  /**
   * read status of the specified PriorityLevelConfiguration
   *
   * @param name name of the PriorityLevelConfiguration (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @return V1beta2PriorityLevelConfiguration
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public V1beta2PriorityLevelConfiguration readPriorityLevelConfigurationStatus(
      String name, String pretty) throws ApiException {
    ApiResponse<V1beta2PriorityLevelConfiguration> localVarResp =
        readPriorityLevelConfigurationStatusWithHttpInfo(name, pretty);
    return localVarResp.getData();
  }

  /**
   * read status of the specified PriorityLevelConfiguration
   *
   * @param name name of the PriorityLevelConfiguration (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @return ApiResponse&lt;V1beta2PriorityLevelConfiguration&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public ApiResponse<V1beta2PriorityLevelConfiguration>
      readPriorityLevelConfigurationStatusWithHttpInfo(String name, String pretty)
          throws ApiException {
    okhttp3.Call localVarCall =
        readPriorityLevelConfigurationStatusValidateBeforeCall(name, pretty, null);
    Type localVarReturnType = new TypeToken<V1beta2PriorityLevelConfiguration>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * (asynchronously) read status of the specified PriorityLevelConfiguration
   *
   * @param name name of the PriorityLevelConfiguration (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param _callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call readPriorityLevelConfigurationStatusAsync(
      String name, String pretty, final ApiCallback<V1beta2PriorityLevelConfiguration> _callback)
      throws ApiException {

    okhttp3.Call localVarCall =
        readPriorityLevelConfigurationStatusValidateBeforeCall(name, pretty, _callback);
    Type localVarReturnType = new TypeToken<V1beta2PriorityLevelConfiguration>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }
  /**
   * Build call for replaceFlowSchema
   *
   * @param name name of the FlowSchema (required)
   * @param body (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
   * @param fieldValidation fieldValidation determines how the server should respond to
   *     unknown/duplicate fields in the object in the request. Introduced as alpha in 1.23, older
   *     servers or servers with the &#x60;ServerSideFieldValidation&#x60; feature disabled will
   *     discard valid values specified in this param and not perform any server side field
   *     validation. Valid values are: - Ignore: ignores unknown/duplicate fields. - Warn: responds
   *     with a warning for each unknown/duplicate field, but successfully serves the request. -
   *     Strict: fails the request on unknown/duplicate fields. (optional)
   * @param _callback Callback for upload/download progress
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call replaceFlowSchemaCall(
      String name,
      V1beta2FlowSchema body,
      String pretty,
      String dryRun,
      String fieldManager,
      String fieldValidation,
      final ApiCallback _callback)
      throws ApiException {
    Object localVarPostBody = body;

    // create path and map variables
    String localVarPath =
        "/apis/flowcontrol.apiserver.k8s.io/v1beta2/flowschemas/{name}"
            .replaceAll("\\{" + "name" + "\\}", localVarApiClient.escapeString(name.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    if (pretty != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("pretty", pretty));
    }

    if (dryRun != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("dryRun", dryRun));
    }

    if (fieldManager != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("fieldManager", fieldManager));
    }

    if (fieldValidation != null) {
      localVarQueryParams.addAll(
          localVarApiClient.parameterToPair("fieldValidation", fieldValidation));
    }

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();
    final String[] localVarAccepts = {
      "application/json", "application/yaml", "application/vnd.kubernetes.protobuf"
    };
    final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
    if (localVarAccept != null) {
      localVarHeaderParams.put("Accept", localVarAccept);
    }

    final String[] localVarContentTypes = {};

    final String localVarContentType =
        localVarApiClient.selectHeaderContentType(localVarContentTypes);
    localVarHeaderParams.put("Content-Type", localVarContentType);

    String[] localVarAuthNames = new String[] {"BearerToken"};
    return localVarApiClient.buildCall(
        localVarPath,
        "PUT",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAuthNames,
        _callback);
  }

  @SuppressWarnings("rawtypes")
  private okhttp3.Call replaceFlowSchemaValidateBeforeCall(
      String name,
      V1beta2FlowSchema body,
      String pretty,
      String dryRun,
      String fieldManager,
      String fieldValidation,
      final ApiCallback _callback)
      throws ApiException {

    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(
          "Missing the required parameter 'name' when calling replaceFlowSchema(Async)");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          "Missing the required parameter 'body' when calling replaceFlowSchema(Async)");
    }

    okhttp3.Call localVarCall =
        replaceFlowSchemaCall(name, body, pretty, dryRun, fieldManager, fieldValidation, _callback);
    return localVarCall;
  }

  /**
   * replace the specified FlowSchema
   *
   * @param name name of the FlowSchema (required)
   * @param body (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
   * @param fieldValidation fieldValidation determines how the server should respond to
   *     unknown/duplicate fields in the object in the request. Introduced as alpha in 1.23, older
   *     servers or servers with the &#x60;ServerSideFieldValidation&#x60; feature disabled will
   *     discard valid values specified in this param and not perform any server side field
   *     validation. Valid values are: - Ignore: ignores unknown/duplicate fields. - Warn: responds
   *     with a warning for each unknown/duplicate field, but successfully serves the request. -
   *     Strict: fails the request on unknown/duplicate fields. (optional)
   * @return V1beta2FlowSchema
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public V1beta2FlowSchema replaceFlowSchema(
      String name,
      V1beta2FlowSchema body,
      String pretty,
      String dryRun,
      String fieldManager,
      String fieldValidation)
      throws ApiException {
    ApiResponse<V1beta2FlowSchema> localVarResp =
        replaceFlowSchemaWithHttpInfo(name, body, pretty, dryRun, fieldManager, fieldValidation);
    return localVarResp.getData();
  }

  /**
   * replace the specified FlowSchema
   *
   * @param name name of the FlowSchema (required)
   * @param body (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
   * @param fieldValidation fieldValidation determines how the server should respond to
   *     unknown/duplicate fields in the object in the request. Introduced as alpha in 1.23, older
   *     servers or servers with the &#x60;ServerSideFieldValidation&#x60; feature disabled will
   *     discard valid values specified in this param and not perform any server side field
   *     validation. Valid values are: - Ignore: ignores unknown/duplicate fields. - Warn: responds
   *     with a warning for each unknown/duplicate field, but successfully serves the request. -
   *     Strict: fails the request on unknown/duplicate fields. (optional)
   * @return ApiResponse&lt;V1beta2FlowSchema&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public ApiResponse<V1beta2FlowSchema> replaceFlowSchemaWithHttpInfo(
      String name,
      V1beta2FlowSchema body,
      String pretty,
      String dryRun,
      String fieldManager,
      String fieldValidation)
      throws ApiException {
    okhttp3.Call localVarCall =
        replaceFlowSchemaValidateBeforeCall(
            name, body, pretty, dryRun, fieldManager, fieldValidation, null);
    Type localVarReturnType = new TypeToken<V1beta2FlowSchema>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * (asynchronously) replace the specified FlowSchema
   *
   * @param name name of the FlowSchema (required)
   * @param body (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
   * @param fieldValidation fieldValidation determines how the server should respond to
   *     unknown/duplicate fields in the object in the request. Introduced as alpha in 1.23, older
   *     servers or servers with the &#x60;ServerSideFieldValidation&#x60; feature disabled will
   *     discard valid values specified in this param and not perform any server side field
   *     validation. Valid values are: - Ignore: ignores unknown/duplicate fields. - Warn: responds
   *     with a warning for each unknown/duplicate field, but successfully serves the request. -
   *     Strict: fails the request on unknown/duplicate fields. (optional)
   * @param _callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call replaceFlowSchemaAsync(
      String name,
      V1beta2FlowSchema body,
      String pretty,
      String dryRun,
      String fieldManager,
      String fieldValidation,
      final ApiCallback<V1beta2FlowSchema> _callback)
      throws ApiException {

    okhttp3.Call localVarCall =
        replaceFlowSchemaValidateBeforeCall(
            name, body, pretty, dryRun, fieldManager, fieldValidation, _callback);
    Type localVarReturnType = new TypeToken<V1beta2FlowSchema>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }
  /**
   * Build call for replaceFlowSchemaStatus
   *
   * @param name name of the FlowSchema (required)
   * @param body (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
   * @param fieldValidation fieldValidation determines how the server should respond to
   *     unknown/duplicate fields in the object in the request. Introduced as alpha in 1.23, older
   *     servers or servers with the &#x60;ServerSideFieldValidation&#x60; feature disabled will
   *     discard valid values specified in this param and not perform any server side field
   *     validation. Valid values are: - Ignore: ignores unknown/duplicate fields. - Warn: responds
   *     with a warning for each unknown/duplicate field, but successfully serves the request. -
   *     Strict: fails the request on unknown/duplicate fields. (optional)
   * @param _callback Callback for upload/download progress
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call replaceFlowSchemaStatusCall(
      String name,
      V1beta2FlowSchema body,
      String pretty,
      String dryRun,
      String fieldManager,
      String fieldValidation,
      final ApiCallback _callback)
      throws ApiException {
    Object localVarPostBody = body;

    // create path and map variables
    String localVarPath =
        "/apis/flowcontrol.apiserver.k8s.io/v1beta2/flowschemas/{name}/status"
            .replaceAll("\\{" + "name" + "\\}", localVarApiClient.escapeString(name.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    if (pretty != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("pretty", pretty));
    }

    if (dryRun != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("dryRun", dryRun));
    }

    if (fieldManager != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("fieldManager", fieldManager));
    }

    if (fieldValidation != null) {
      localVarQueryParams.addAll(
          localVarApiClient.parameterToPair("fieldValidation", fieldValidation));
    }

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();
    final String[] localVarAccepts = {
      "application/json", "application/yaml", "application/vnd.kubernetes.protobuf"
    };
    final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
    if (localVarAccept != null) {
      localVarHeaderParams.put("Accept", localVarAccept);
    }

    final String[] localVarContentTypes = {};

    final String localVarContentType =
        localVarApiClient.selectHeaderContentType(localVarContentTypes);
    localVarHeaderParams.put("Content-Type", localVarContentType);

    String[] localVarAuthNames = new String[] {"BearerToken"};
    return localVarApiClient.buildCall(
        localVarPath,
        "PUT",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAuthNames,
        _callback);
  }

  @SuppressWarnings("rawtypes")
  private okhttp3.Call replaceFlowSchemaStatusValidateBeforeCall(
      String name,
      V1beta2FlowSchema body,
      String pretty,
      String dryRun,
      String fieldManager,
      String fieldValidation,
      final ApiCallback _callback)
      throws ApiException {

    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(
          "Missing the required parameter 'name' when calling replaceFlowSchemaStatus(Async)");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          "Missing the required parameter 'body' when calling replaceFlowSchemaStatus(Async)");
    }

    okhttp3.Call localVarCall =
        replaceFlowSchemaStatusCall(
            name, body, pretty, dryRun, fieldManager, fieldValidation, _callback);
    return localVarCall;
  }

  /**
   * replace status of the specified FlowSchema
   *
   * @param name name of the FlowSchema (required)
   * @param body (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
   * @param fieldValidation fieldValidation determines how the server should respond to
   *     unknown/duplicate fields in the object in the request. Introduced as alpha in 1.23, older
   *     servers or servers with the &#x60;ServerSideFieldValidation&#x60; feature disabled will
   *     discard valid values specified in this param and not perform any server side field
   *     validation. Valid values are: - Ignore: ignores unknown/duplicate fields. - Warn: responds
   *     with a warning for each unknown/duplicate field, but successfully serves the request. -
   *     Strict: fails the request on unknown/duplicate fields. (optional)
   * @return V1beta2FlowSchema
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public V1beta2FlowSchema replaceFlowSchemaStatus(
      String name,
      V1beta2FlowSchema body,
      String pretty,
      String dryRun,
      String fieldManager,
      String fieldValidation)
      throws ApiException {
    ApiResponse<V1beta2FlowSchema> localVarResp =
        replaceFlowSchemaStatusWithHttpInfo(
            name, body, pretty, dryRun, fieldManager, fieldValidation);
    return localVarResp.getData();
  }

  /**
   * replace status of the specified FlowSchema
   *
   * @param name name of the FlowSchema (required)
   * @param body (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
   * @param fieldValidation fieldValidation determines how the server should respond to
   *     unknown/duplicate fields in the object in the request. Introduced as alpha in 1.23, older
   *     servers or servers with the &#x60;ServerSideFieldValidation&#x60; feature disabled will
   *     discard valid values specified in this param and not perform any server side field
   *     validation. Valid values are: - Ignore: ignores unknown/duplicate fields. - Warn: responds
   *     with a warning for each unknown/duplicate field, but successfully serves the request. -
   *     Strict: fails the request on unknown/duplicate fields. (optional)
   * @return ApiResponse&lt;V1beta2FlowSchema&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public ApiResponse<V1beta2FlowSchema> replaceFlowSchemaStatusWithHttpInfo(
      String name,
      V1beta2FlowSchema body,
      String pretty,
      String dryRun,
      String fieldManager,
      String fieldValidation)
      throws ApiException {
    okhttp3.Call localVarCall =
        replaceFlowSchemaStatusValidateBeforeCall(
            name, body, pretty, dryRun, fieldManager, fieldValidation, null);
    Type localVarReturnType = new TypeToken<V1beta2FlowSchema>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * (asynchronously) replace status of the specified FlowSchema
   *
   * @param name name of the FlowSchema (required)
   * @param body (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
   * @param fieldValidation fieldValidation determines how the server should respond to
   *     unknown/duplicate fields in the object in the request. Introduced as alpha in 1.23, older
   *     servers or servers with the &#x60;ServerSideFieldValidation&#x60; feature disabled will
   *     discard valid values specified in this param and not perform any server side field
   *     validation. Valid values are: - Ignore: ignores unknown/duplicate fields. - Warn: responds
   *     with a warning for each unknown/duplicate field, but successfully serves the request. -
   *     Strict: fails the request on unknown/duplicate fields. (optional)
   * @param _callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call replaceFlowSchemaStatusAsync(
      String name,
      V1beta2FlowSchema body,
      String pretty,
      String dryRun,
      String fieldManager,
      String fieldValidation,
      final ApiCallback<V1beta2FlowSchema> _callback)
      throws ApiException {

    okhttp3.Call localVarCall =
        replaceFlowSchemaStatusValidateBeforeCall(
            name, body, pretty, dryRun, fieldManager, fieldValidation, _callback);
    Type localVarReturnType = new TypeToken<V1beta2FlowSchema>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }
  /**
   * Build call for replacePriorityLevelConfiguration
   *
   * @param name name of the PriorityLevelConfiguration (required)
   * @param body (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
   * @param fieldValidation fieldValidation determines how the server should respond to
   *     unknown/duplicate fields in the object in the request. Introduced as alpha in 1.23, older
   *     servers or servers with the &#x60;ServerSideFieldValidation&#x60; feature disabled will
   *     discard valid values specified in this param and not perform any server side field
   *     validation. Valid values are: - Ignore: ignores unknown/duplicate fields. - Warn: responds
   *     with a warning for each unknown/duplicate field, but successfully serves the request. -
   *     Strict: fails the request on unknown/duplicate fields. (optional)
   * @param _callback Callback for upload/download progress
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call replacePriorityLevelConfigurationCall(
      String name,
      V1beta2PriorityLevelConfiguration body,
      String pretty,
      String dryRun,
      String fieldManager,
      String fieldValidation,
      final ApiCallback _callback)
      throws ApiException {
    Object localVarPostBody = body;

    // create path and map variables
    String localVarPath =
        "/apis/flowcontrol.apiserver.k8s.io/v1beta2/prioritylevelconfigurations/{name}"
            .replaceAll("\\{" + "name" + "\\}", localVarApiClient.escapeString(name.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    if (pretty != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("pretty", pretty));
    }

    if (dryRun != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("dryRun", dryRun));
    }

    if (fieldManager != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("fieldManager", fieldManager));
    }

    if (fieldValidation != null) {
      localVarQueryParams.addAll(
          localVarApiClient.parameterToPair("fieldValidation", fieldValidation));
    }

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();
    final String[] localVarAccepts = {
      "application/json", "application/yaml", "application/vnd.kubernetes.protobuf"
    };
    final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
    if (localVarAccept != null) {
      localVarHeaderParams.put("Accept", localVarAccept);
    }

    final String[] localVarContentTypes = {};

    final String localVarContentType =
        localVarApiClient.selectHeaderContentType(localVarContentTypes);
    localVarHeaderParams.put("Content-Type", localVarContentType);

    String[] localVarAuthNames = new String[] {"BearerToken"};
    return localVarApiClient.buildCall(
        localVarPath,
        "PUT",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAuthNames,
        _callback);
  }

  @SuppressWarnings("rawtypes")
  private okhttp3.Call replacePriorityLevelConfigurationValidateBeforeCall(
      String name,
      V1beta2PriorityLevelConfiguration body,
      String pretty,
      String dryRun,
      String fieldManager,
      String fieldValidation,
      final ApiCallback _callback)
      throws ApiException {

    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(
          "Missing the required parameter 'name' when calling replacePriorityLevelConfiguration(Async)");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          "Missing the required parameter 'body' when calling replacePriorityLevelConfiguration(Async)");
    }

    okhttp3.Call localVarCall =
        replacePriorityLevelConfigurationCall(
            name, body, pretty, dryRun, fieldManager, fieldValidation, _callback);
    return localVarCall;
  }

  /**
   * replace the specified PriorityLevelConfiguration
   *
   * @param name name of the PriorityLevelConfiguration (required)
   * @param body (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
   * @param fieldValidation fieldValidation determines how the server should respond to
   *     unknown/duplicate fields in the object in the request. Introduced as alpha in 1.23, older
   *     servers or servers with the &#x60;ServerSideFieldValidation&#x60; feature disabled will
   *     discard valid values specified in this param and not perform any server side field
   *     validation. Valid values are: - Ignore: ignores unknown/duplicate fields. - Warn: responds
   *     with a warning for each unknown/duplicate field, but successfully serves the request. -
   *     Strict: fails the request on unknown/duplicate fields. (optional)
   * @return V1beta2PriorityLevelConfiguration
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public V1beta2PriorityLevelConfiguration replacePriorityLevelConfiguration(
      String name,
      V1beta2PriorityLevelConfiguration body,
      String pretty,
      String dryRun,
      String fieldManager,
      String fieldValidation)
      throws ApiException {
    ApiResponse<V1beta2PriorityLevelConfiguration> localVarResp =
        replacePriorityLevelConfigurationWithHttpInfo(
            name, body, pretty, dryRun, fieldManager, fieldValidation);
    return localVarResp.getData();
  }

  /**
   * replace the specified PriorityLevelConfiguration
   *
   * @param name name of the PriorityLevelConfiguration (required)
   * @param body (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
   * @param fieldValidation fieldValidation determines how the server should respond to
   *     unknown/duplicate fields in the object in the request. Introduced as alpha in 1.23, older
   *     servers or servers with the &#x60;ServerSideFieldValidation&#x60; feature disabled will
   *     discard valid values specified in this param and not perform any server side field
   *     validation. Valid values are: - Ignore: ignores unknown/duplicate fields. - Warn: responds
   *     with a warning for each unknown/duplicate field, but successfully serves the request. -
   *     Strict: fails the request on unknown/duplicate fields. (optional)
   * @return ApiResponse&lt;V1beta2PriorityLevelConfiguration&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public ApiResponse<V1beta2PriorityLevelConfiguration>
      replacePriorityLevelConfigurationWithHttpInfo(
          String name,
          V1beta2PriorityLevelConfiguration body,
          String pretty,
          String dryRun,
          String fieldManager,
          String fieldValidation)
          throws ApiException {
    okhttp3.Call localVarCall =
        replacePriorityLevelConfigurationValidateBeforeCall(
            name, body, pretty, dryRun, fieldManager, fieldValidation, null);
    Type localVarReturnType = new TypeToken<V1beta2PriorityLevelConfiguration>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * (asynchronously) replace the specified PriorityLevelConfiguration
   *
   * @param name name of the PriorityLevelConfiguration (required)
   * @param body (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
   * @param fieldValidation fieldValidation determines how the server should respond to
   *     unknown/duplicate fields in the object in the request. Introduced as alpha in 1.23, older
   *     servers or servers with the &#x60;ServerSideFieldValidation&#x60; feature disabled will
   *     discard valid values specified in this param and not perform any server side field
   *     validation. Valid values are: - Ignore: ignores unknown/duplicate fields. - Warn: responds
   *     with a warning for each unknown/duplicate field, but successfully serves the request. -
   *     Strict: fails the request on unknown/duplicate fields. (optional)
   * @param _callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call replacePriorityLevelConfigurationAsync(
      String name,
      V1beta2PriorityLevelConfiguration body,
      String pretty,
      String dryRun,
      String fieldManager,
      String fieldValidation,
      final ApiCallback<V1beta2PriorityLevelConfiguration> _callback)
      throws ApiException {

    okhttp3.Call localVarCall =
        replacePriorityLevelConfigurationValidateBeforeCall(
            name, body, pretty, dryRun, fieldManager, fieldValidation, _callback);
    Type localVarReturnType = new TypeToken<V1beta2PriorityLevelConfiguration>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }
  /**
   * Build call for replacePriorityLevelConfigurationStatus
   *
   * @param name name of the PriorityLevelConfiguration (required)
   * @param body (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
   * @param fieldValidation fieldValidation determines how the server should respond to
   *     unknown/duplicate fields in the object in the request. Introduced as alpha in 1.23, older
   *     servers or servers with the &#x60;ServerSideFieldValidation&#x60; feature disabled will
   *     discard valid values specified in this param and not perform any server side field
   *     validation. Valid values are: - Ignore: ignores unknown/duplicate fields. - Warn: responds
   *     with a warning for each unknown/duplicate field, but successfully serves the request. -
   *     Strict: fails the request on unknown/duplicate fields. (optional)
   * @param _callback Callback for upload/download progress
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call replacePriorityLevelConfigurationStatusCall(
      String name,
      V1beta2PriorityLevelConfiguration body,
      String pretty,
      String dryRun,
      String fieldManager,
      String fieldValidation,
      final ApiCallback _callback)
      throws ApiException {
    Object localVarPostBody = body;

    // create path and map variables
    String localVarPath =
        "/apis/flowcontrol.apiserver.k8s.io/v1beta2/prioritylevelconfigurations/{name}/status"
            .replaceAll("\\{" + "name" + "\\}", localVarApiClient.escapeString(name.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    if (pretty != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("pretty", pretty));
    }

    if (dryRun != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("dryRun", dryRun));
    }

    if (fieldManager != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("fieldManager", fieldManager));
    }

    if (fieldValidation != null) {
      localVarQueryParams.addAll(
          localVarApiClient.parameterToPair("fieldValidation", fieldValidation));
    }

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();
    final String[] localVarAccepts = {
      "application/json", "application/yaml", "application/vnd.kubernetes.protobuf"
    };
    final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
    if (localVarAccept != null) {
      localVarHeaderParams.put("Accept", localVarAccept);
    }

    final String[] localVarContentTypes = {};

    final String localVarContentType =
        localVarApiClient.selectHeaderContentType(localVarContentTypes);
    localVarHeaderParams.put("Content-Type", localVarContentType);

    String[] localVarAuthNames = new String[] {"BearerToken"};
    return localVarApiClient.buildCall(
        localVarPath,
        "PUT",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAuthNames,
        _callback);
  }

  @SuppressWarnings("rawtypes")
  private okhttp3.Call replacePriorityLevelConfigurationStatusValidateBeforeCall(
      String name,
      V1beta2PriorityLevelConfiguration body,
      String pretty,
      String dryRun,
      String fieldManager,
      String fieldValidation,
      final ApiCallback _callback)
      throws ApiException {

    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(
          "Missing the required parameter 'name' when calling replacePriorityLevelConfigurationStatus(Async)");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          "Missing the required parameter 'body' when calling replacePriorityLevelConfigurationStatus(Async)");
    }

    okhttp3.Call localVarCall =
        replacePriorityLevelConfigurationStatusCall(
            name, body, pretty, dryRun, fieldManager, fieldValidation, _callback);
    return localVarCall;
  }

  /**
   * replace status of the specified PriorityLevelConfiguration
   *
   * @param name name of the PriorityLevelConfiguration (required)
   * @param body (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
   * @param fieldValidation fieldValidation determines how the server should respond to
   *     unknown/duplicate fields in the object in the request. Introduced as alpha in 1.23, older
   *     servers or servers with the &#x60;ServerSideFieldValidation&#x60; feature disabled will
   *     discard valid values specified in this param and not perform any server side field
   *     validation. Valid values are: - Ignore: ignores unknown/duplicate fields. - Warn: responds
   *     with a warning for each unknown/duplicate field, but successfully serves the request. -
   *     Strict: fails the request on unknown/duplicate fields. (optional)
   * @return V1beta2PriorityLevelConfiguration
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public V1beta2PriorityLevelConfiguration replacePriorityLevelConfigurationStatus(
      String name,
      V1beta2PriorityLevelConfiguration body,
      String pretty,
      String dryRun,
      String fieldManager,
      String fieldValidation)
      throws ApiException {
    ApiResponse<V1beta2PriorityLevelConfiguration> localVarResp =
        replacePriorityLevelConfigurationStatusWithHttpInfo(
            name, body, pretty, dryRun, fieldManager, fieldValidation);
    return localVarResp.getData();
  }

  /**
   * replace status of the specified PriorityLevelConfiguration
   *
   * @param name name of the PriorityLevelConfiguration (required)
   * @param body (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
   * @param fieldValidation fieldValidation determines how the server should respond to
   *     unknown/duplicate fields in the object in the request. Introduced as alpha in 1.23, older
   *     servers or servers with the &#x60;ServerSideFieldValidation&#x60; feature disabled will
   *     discard valid values specified in this param and not perform any server side field
   *     validation. Valid values are: - Ignore: ignores unknown/duplicate fields. - Warn: responds
   *     with a warning for each unknown/duplicate field, but successfully serves the request. -
   *     Strict: fails the request on unknown/duplicate fields. (optional)
   * @return ApiResponse&lt;V1beta2PriorityLevelConfiguration&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public ApiResponse<V1beta2PriorityLevelConfiguration>
      replacePriorityLevelConfigurationStatusWithHttpInfo(
          String name,
          V1beta2PriorityLevelConfiguration body,
          String pretty,
          String dryRun,
          String fieldManager,
          String fieldValidation)
          throws ApiException {
    okhttp3.Call localVarCall =
        replacePriorityLevelConfigurationStatusValidateBeforeCall(
            name, body, pretty, dryRun, fieldManager, fieldValidation, null);
    Type localVarReturnType = new TypeToken<V1beta2PriorityLevelConfiguration>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * (asynchronously) replace status of the specified PriorityLevelConfiguration
   *
   * @param name name of the PriorityLevelConfiguration (required)
   * @param body (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
   * @param fieldValidation fieldValidation determines how the server should respond to
   *     unknown/duplicate fields in the object in the request. Introduced as alpha in 1.23, older
   *     servers or servers with the &#x60;ServerSideFieldValidation&#x60; feature disabled will
   *     discard valid values specified in this param and not perform any server side field
   *     validation. Valid values are: - Ignore: ignores unknown/duplicate fields. - Warn: responds
   *     with a warning for each unknown/duplicate field, but successfully serves the request. -
   *     Strict: fails the request on unknown/duplicate fields. (optional)
   * @param _callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call replacePriorityLevelConfigurationStatusAsync(
      String name,
      V1beta2PriorityLevelConfiguration body,
      String pretty,
      String dryRun,
      String fieldManager,
      String fieldValidation,
      final ApiCallback<V1beta2PriorityLevelConfiguration> _callback)
      throws ApiException {

    okhttp3.Call localVarCall =
        replacePriorityLevelConfigurationStatusValidateBeforeCall(
            name, body, pretty, dryRun, fieldManager, fieldValidation, _callback);
    Type localVarReturnType = new TypeToken<V1beta2PriorityLevelConfiguration>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }
}
