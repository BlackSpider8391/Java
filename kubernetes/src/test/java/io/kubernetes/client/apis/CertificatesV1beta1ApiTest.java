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

import io.kubernetes.client.ApiException;
import io.kubernetes.client.models.V1APIResourceList;
import io.kubernetes.client.models.V1DeleteOptions;
import io.kubernetes.client.models.V1Status;
import io.kubernetes.client.models.V1beta1CertificateSigningRequest;
import io.kubernetes.client.models.V1beta1CertificateSigningRequestList;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CertificatesV1beta1Api
 */
@Ignore
public class CertificatesV1beta1ApiTest {

    private final CertificatesV1beta1Api api = new CertificatesV1beta1Api();

    
    /**
     * 
     *
     * create a CertificateSigningRequest
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createCertificateSigningRequestTest() throws ApiException {
        V1beta1CertificateSigningRequest body = null;
        String pretty = null;
        V1beta1CertificateSigningRequest response = api.createCertificateSigningRequest(body, pretty);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * delete a CertificateSigningRequest
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCertificateSigningRequestTest() throws ApiException {
        String name = null;
        V1DeleteOptions body = null;
        String pretty = null;
        Integer gracePeriodSeconds = null;
        Boolean orphanDependents = null;
        String propagationPolicy = null;
        V1Status response = api.deleteCertificateSigningRequest(name, body, pretty, gracePeriodSeconds, orphanDependents, propagationPolicy);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * delete collection of CertificateSigningRequest
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCollectionCertificateSigningRequestTest() throws ApiException {
        String pretty = null;
        String _continue = null;
        String fieldSelector = null;
        Boolean includeUninitialized = null;
        String labelSelector = null;
        Integer limit = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        V1Status response = api.deleteCollectionCertificateSigningRequest(pretty, _continue, fieldSelector, includeUninitialized, labelSelector, limit, resourceVersion, timeoutSeconds, watch);

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
    
    /**
     * 
     *
     * list or watch objects of kind CertificateSigningRequest
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listCertificateSigningRequestTest() throws ApiException {
        String pretty = null;
        String _continue = null;
        String fieldSelector = null;
        Boolean includeUninitialized = null;
        String labelSelector = null;
        Integer limit = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        V1beta1CertificateSigningRequestList response = api.listCertificateSigningRequest(pretty, _continue, fieldSelector, includeUninitialized, labelSelector, limit, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * partially update the specified CertificateSigningRequest
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchCertificateSigningRequestTest() throws ApiException {
        String name = null;
        Object body = null;
        String pretty = null;
        V1beta1CertificateSigningRequest response = api.patchCertificateSigningRequest(name, body, pretty);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * partially update status of the specified CertificateSigningRequest
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchCertificateSigningRequestStatusTest() throws ApiException {
        String name = null;
        Object body = null;
        String pretty = null;
        V1beta1CertificateSigningRequest response = api.patchCertificateSigningRequestStatus(name, body, pretty);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * read the specified CertificateSigningRequest
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readCertificateSigningRequestTest() throws ApiException {
        String name = null;
        String pretty = null;
        Boolean exact = null;
        Boolean export = null;
        V1beta1CertificateSigningRequest response = api.readCertificateSigningRequest(name, pretty, exact, export);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * read status of the specified CertificateSigningRequest
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readCertificateSigningRequestStatusTest() throws ApiException {
        String name = null;
        String pretty = null;
        V1beta1CertificateSigningRequest response = api.readCertificateSigningRequestStatus(name, pretty);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * replace the specified CertificateSigningRequest
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void replaceCertificateSigningRequestTest() throws ApiException {
        String name = null;
        V1beta1CertificateSigningRequest body = null;
        String pretty = null;
        V1beta1CertificateSigningRequest response = api.replaceCertificateSigningRequest(name, body, pretty);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * replace approval of the specified CertificateSigningRequest
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void replaceCertificateSigningRequestApprovalTest() throws ApiException {
        String name = null;
        V1beta1CertificateSigningRequest body = null;
        String pretty = null;
        V1beta1CertificateSigningRequest response = api.replaceCertificateSigningRequestApproval(name, body, pretty);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * replace status of the specified CertificateSigningRequest
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void replaceCertificateSigningRequestStatusTest() throws ApiException {
        String name = null;
        V1beta1CertificateSigningRequest body = null;
        String pretty = null;
        V1beta1CertificateSigningRequest response = api.replaceCertificateSigningRequestStatus(name, body, pretty);

        // TODO: test validations
    }
    
}
