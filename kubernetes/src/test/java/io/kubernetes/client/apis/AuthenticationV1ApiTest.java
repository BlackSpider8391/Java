/*
 * Kubernetes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.8.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.kubernetes.client.apis;

import io.kubernetes.client.ApiException;
import io.kubernetes.client.models.V1APIResourceList;
import io.kubernetes.client.models.V1TokenReview;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AuthenticationV1Api
 */
@Ignore
public class AuthenticationV1ApiTest {

    private final AuthenticationV1Api api = new AuthenticationV1Api();

    
    /**
     * 
     *
     * create a TokenReview
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createTokenReviewTest() throws ApiException {
        V1TokenReview body = null;
        String pretty = null;
        V1TokenReview response = api.createTokenReview(body, pretty);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * get available resources
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAPIResourcesTest() throws ApiException {
        V1APIResourceList response = api.getAPIResources();

        // TODO: test validations
    }
    
}
