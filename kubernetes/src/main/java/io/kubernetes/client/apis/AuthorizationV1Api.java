/*
 * Kubernetes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.11.4
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.kubernetes.client.apis;

import io.kubernetes.client.ApiCallback;
import io.kubernetes.client.ApiClient;
import io.kubernetes.client.ApiException;
import io.kubernetes.client.ApiResponse;
import io.kubernetes.client.Configuration;
import io.kubernetes.client.Pair;
import io.kubernetes.client.ProgressRequestBody;
import io.kubernetes.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.kubernetes.client.models.V1APIResourceList;
import io.kubernetes.client.models.V1LocalSubjectAccessReview;
import io.kubernetes.client.models.V1SelfSubjectAccessReview;
import io.kubernetes.client.models.V1SelfSubjectRulesReview;
import io.kubernetes.client.models.V1SubjectAccessReview;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AuthorizationV1Api {
    private ApiClient apiClient;

    public AuthorizationV1Api() {
        this(Configuration.getDefaultApiClient());
    }

    public AuthorizationV1Api(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for createNamespacedLocalSubjectAccessReview
     * @param namespace object name and auth scope, such as for teams and projects (required)
     * @param body  (required)
     * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createNamespacedLocalSubjectAccessReviewCall(String namespace, V1LocalSubjectAccessReview body, String pretty, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/apis/authorization.k8s.io/v1/namespaces/{namespace}/localsubjectaccessreviews"
            .replaceAll("\\{" + "namespace" + "\\}", apiClient.escapeString(namespace.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (pretty != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("pretty", pretty));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/yaml", "application/vnd.kubernetes.protobuf"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "*/*"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "BearerToken" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call createNamespacedLocalSubjectAccessReviewValidateBeforeCall(String namespace, V1LocalSubjectAccessReview body, String pretty, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'namespace' is set
        if (namespace == null) {
            throw new ApiException("Missing the required parameter 'namespace' when calling createNamespacedLocalSubjectAccessReview(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling createNamespacedLocalSubjectAccessReview(Async)");
        }
        
        
        com.squareup.okhttp.Call call = createNamespacedLocalSubjectAccessReviewCall(namespace, body, pretty, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * create a LocalSubjectAccessReview
     * @param namespace object name and auth scope, such as for teams and projects (required)
     * @param body  (required)
     * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
     * @return V1LocalSubjectAccessReview
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public V1LocalSubjectAccessReview createNamespacedLocalSubjectAccessReview(String namespace, V1LocalSubjectAccessReview body, String pretty) throws ApiException {
        ApiResponse<V1LocalSubjectAccessReview> resp = createNamespacedLocalSubjectAccessReviewWithHttpInfo(namespace, body, pretty);
        return resp.getData();
    }

    /**
     * 
     * create a LocalSubjectAccessReview
     * @param namespace object name and auth scope, such as for teams and projects (required)
     * @param body  (required)
     * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
     * @return ApiResponse&lt;V1LocalSubjectAccessReview&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<V1LocalSubjectAccessReview> createNamespacedLocalSubjectAccessReviewWithHttpInfo(String namespace, V1LocalSubjectAccessReview body, String pretty) throws ApiException {
        com.squareup.okhttp.Call call = createNamespacedLocalSubjectAccessReviewValidateBeforeCall(namespace, body, pretty, null, null);
        Type localVarReturnType = new TypeToken<V1LocalSubjectAccessReview>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * create a LocalSubjectAccessReview
     * @param namespace object name and auth scope, such as for teams and projects (required)
     * @param body  (required)
     * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createNamespacedLocalSubjectAccessReviewAsync(String namespace, V1LocalSubjectAccessReview body, String pretty, final ApiCallback<V1LocalSubjectAccessReview> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = createNamespacedLocalSubjectAccessReviewValidateBeforeCall(namespace, body, pretty, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<V1LocalSubjectAccessReview>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for createSelfSubjectAccessReview
     * @param body  (required)
     * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createSelfSubjectAccessReviewCall(V1SelfSubjectAccessReview body, String pretty, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/apis/authorization.k8s.io/v1/selfsubjectaccessreviews";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (pretty != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("pretty", pretty));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/yaml", "application/vnd.kubernetes.protobuf"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "*/*"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "BearerToken" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call createSelfSubjectAccessReviewValidateBeforeCall(V1SelfSubjectAccessReview body, String pretty, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling createSelfSubjectAccessReview(Async)");
        }
        
        
        com.squareup.okhttp.Call call = createSelfSubjectAccessReviewCall(body, pretty, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * create a SelfSubjectAccessReview
     * @param body  (required)
     * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
     * @return V1SelfSubjectAccessReview
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public V1SelfSubjectAccessReview createSelfSubjectAccessReview(V1SelfSubjectAccessReview body, String pretty) throws ApiException {
        ApiResponse<V1SelfSubjectAccessReview> resp = createSelfSubjectAccessReviewWithHttpInfo(body, pretty);
        return resp.getData();
    }

    /**
     * 
     * create a SelfSubjectAccessReview
     * @param body  (required)
     * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
     * @return ApiResponse&lt;V1SelfSubjectAccessReview&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<V1SelfSubjectAccessReview> createSelfSubjectAccessReviewWithHttpInfo(V1SelfSubjectAccessReview body, String pretty) throws ApiException {
        com.squareup.okhttp.Call call = createSelfSubjectAccessReviewValidateBeforeCall(body, pretty, null, null);
        Type localVarReturnType = new TypeToken<V1SelfSubjectAccessReview>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * create a SelfSubjectAccessReview
     * @param body  (required)
     * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createSelfSubjectAccessReviewAsync(V1SelfSubjectAccessReview body, String pretty, final ApiCallback<V1SelfSubjectAccessReview> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = createSelfSubjectAccessReviewValidateBeforeCall(body, pretty, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<V1SelfSubjectAccessReview>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for createSelfSubjectRulesReview
     * @param body  (required)
     * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createSelfSubjectRulesReviewCall(V1SelfSubjectRulesReview body, String pretty, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/apis/authorization.k8s.io/v1/selfsubjectrulesreviews";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (pretty != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("pretty", pretty));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/yaml", "application/vnd.kubernetes.protobuf"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "*/*"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "BearerToken" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call createSelfSubjectRulesReviewValidateBeforeCall(V1SelfSubjectRulesReview body, String pretty, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling createSelfSubjectRulesReview(Async)");
        }
        
        
        com.squareup.okhttp.Call call = createSelfSubjectRulesReviewCall(body, pretty, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * create a SelfSubjectRulesReview
     * @param body  (required)
     * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
     * @return V1SelfSubjectRulesReview
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public V1SelfSubjectRulesReview createSelfSubjectRulesReview(V1SelfSubjectRulesReview body, String pretty) throws ApiException {
        ApiResponse<V1SelfSubjectRulesReview> resp = createSelfSubjectRulesReviewWithHttpInfo(body, pretty);
        return resp.getData();
    }

    /**
     * 
     * create a SelfSubjectRulesReview
     * @param body  (required)
     * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
     * @return ApiResponse&lt;V1SelfSubjectRulesReview&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<V1SelfSubjectRulesReview> createSelfSubjectRulesReviewWithHttpInfo(V1SelfSubjectRulesReview body, String pretty) throws ApiException {
        com.squareup.okhttp.Call call = createSelfSubjectRulesReviewValidateBeforeCall(body, pretty, null, null);
        Type localVarReturnType = new TypeToken<V1SelfSubjectRulesReview>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * create a SelfSubjectRulesReview
     * @param body  (required)
     * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createSelfSubjectRulesReviewAsync(V1SelfSubjectRulesReview body, String pretty, final ApiCallback<V1SelfSubjectRulesReview> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = createSelfSubjectRulesReviewValidateBeforeCall(body, pretty, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<V1SelfSubjectRulesReview>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for createSubjectAccessReview
     * @param body  (required)
     * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createSubjectAccessReviewCall(V1SubjectAccessReview body, String pretty, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/apis/authorization.k8s.io/v1/subjectaccessreviews";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (pretty != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("pretty", pretty));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/yaml", "application/vnd.kubernetes.protobuf"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "*/*"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "BearerToken" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call createSubjectAccessReviewValidateBeforeCall(V1SubjectAccessReview body, String pretty, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling createSubjectAccessReview(Async)");
        }
        
        
        com.squareup.okhttp.Call call = createSubjectAccessReviewCall(body, pretty, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * create a SubjectAccessReview
     * @param body  (required)
     * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
     * @return V1SubjectAccessReview
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public V1SubjectAccessReview createSubjectAccessReview(V1SubjectAccessReview body, String pretty) throws ApiException {
        ApiResponse<V1SubjectAccessReview> resp = createSubjectAccessReviewWithHttpInfo(body, pretty);
        return resp.getData();
    }

    /**
     * 
     * create a SubjectAccessReview
     * @param body  (required)
     * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
     * @return ApiResponse&lt;V1SubjectAccessReview&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<V1SubjectAccessReview> createSubjectAccessReviewWithHttpInfo(V1SubjectAccessReview body, String pretty) throws ApiException {
        com.squareup.okhttp.Call call = createSubjectAccessReviewValidateBeforeCall(body, pretty, null, null);
        Type localVarReturnType = new TypeToken<V1SubjectAccessReview>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * create a SubjectAccessReview
     * @param body  (required)
     * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createSubjectAccessReviewAsync(V1SubjectAccessReview body, String pretty, final ApiCallback<V1SubjectAccessReview> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = createSubjectAccessReviewValidateBeforeCall(body, pretty, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<V1SubjectAccessReview>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getAPIResources
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getAPIResourcesCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/apis/authorization.k8s.io/v1/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/yaml", "application/vnd.kubernetes.protobuf"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/yaml", "application/vnd.kubernetes.protobuf"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "BearerToken" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getAPIResourcesValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        
        com.squareup.okhttp.Call call = getAPIResourcesCall(progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * get available resources
     * @return V1APIResourceList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public V1APIResourceList getAPIResources() throws ApiException {
        ApiResponse<V1APIResourceList> resp = getAPIResourcesWithHttpInfo();
        return resp.getData();
    }

    /**
     * 
     * get available resources
     * @return ApiResponse&lt;V1APIResourceList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<V1APIResourceList> getAPIResourcesWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = getAPIResourcesValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<V1APIResourceList>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * get available resources
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAPIResourcesAsync(final ApiCallback<V1APIResourceList> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getAPIResourcesValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<V1APIResourceList>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
