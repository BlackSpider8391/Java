/*
 * Kubernetes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.13.5
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
import io.kubernetes.client.models.V1beta1PriorityClass;
import io.kubernetes.client.models.V1beta1PriorityClassList;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SchedulingV1beta1Api
 */
@Ignore
public class SchedulingV1beta1ApiTest {

    private final SchedulingV1beta1Api api = new SchedulingV1beta1Api();

    
    /**
     * 
     *
     * create a PriorityClass
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createPriorityClassTest() throws ApiException {
        V1beta1PriorityClass body = null;
        Boolean includeUninitialized = null;
        String pretty = null;
        String dryRun = null;
        V1beta1PriorityClass response = api.createPriorityClass(body, includeUninitialized, pretty, dryRun);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * delete collection of PriorityClass
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCollectionPriorityClassTest() throws ApiException {
        Boolean includeUninitialized = null;
        String pretty = null;
        String _continue = null;
        String fieldSelector = null;
        String labelSelector = null;
        Integer limit = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        V1Status response = api.deleteCollectionPriorityClass(includeUninitialized, pretty, _continue, fieldSelector, labelSelector, limit, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * delete a PriorityClass
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletePriorityClassTest() throws ApiException {
        String name = null;
        String pretty = null;
        V1DeleteOptions body = null;
        String dryRun = null;
        Integer gracePeriodSeconds = null;
        Boolean orphanDependents = null;
        String propagationPolicy = null;
        V1Status response = api.deletePriorityClass(name, pretty, body, dryRun, gracePeriodSeconds, orphanDependents, propagationPolicy);

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
     * list or watch objects of kind PriorityClass
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listPriorityClassTest() throws ApiException {
        Boolean includeUninitialized = null;
        String pretty = null;
        String _continue = null;
        String fieldSelector = null;
        String labelSelector = null;
        Integer limit = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        V1beta1PriorityClassList response = api.listPriorityClass(includeUninitialized, pretty, _continue, fieldSelector, labelSelector, limit, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * partially update the specified PriorityClass
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchPriorityClassTest() throws ApiException {
        String name = null;
        Object body = null;
        String pretty = null;
        String dryRun = null;
        V1beta1PriorityClass response = api.patchPriorityClass(name, body, pretty, dryRun);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * read the specified PriorityClass
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readPriorityClassTest() throws ApiException {
        String name = null;
        String pretty = null;
        Boolean exact = null;
        Boolean export = null;
        V1beta1PriorityClass response = api.readPriorityClass(name, pretty, exact, export);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * replace the specified PriorityClass
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void replacePriorityClassTest() throws ApiException {
        String name = null;
        V1beta1PriorityClass body = null;
        String pretty = null;
        String dryRun = null;
        V1beta1PriorityClass response = api.replacePriorityClass(name, body, pretty, dryRun);

        // TODO: test validations
    }
    
}
