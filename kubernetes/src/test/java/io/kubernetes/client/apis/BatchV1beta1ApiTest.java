/*
 * Kubernetes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.12.2
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
import io.kubernetes.client.models.V1beta1CronJob;
import io.kubernetes.client.models.V1beta1CronJobList;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BatchV1beta1Api
 */
@Ignore
public class BatchV1beta1ApiTest {

    private final BatchV1beta1Api api = new BatchV1beta1Api();

    
    /**
     * 
     *
     * create a CronJob
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createNamespacedCronJobTest() throws ApiException {
        String namespace = null;
        V1beta1CronJob body = null;
        Boolean includeUninitialized = null;
        String pretty = null;
        String dryRun = null;
        V1beta1CronJob response = api.createNamespacedCronJob(namespace, body, includeUninitialized, pretty, dryRun);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * delete collection of CronJob
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCollectionNamespacedCronJobTest() throws ApiException {
        String namespace = null;
        Boolean includeUninitialized = null;
        String pretty = null;
        String _continue = null;
        String fieldSelector = null;
        String labelSelector = null;
        Integer limit = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        V1Status response = api.deleteCollectionNamespacedCronJob(namespace, includeUninitialized, pretty, _continue, fieldSelector, labelSelector, limit, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * delete a CronJob
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteNamespacedCronJobTest() throws ApiException {
        String name = null;
        String namespace = null;
        V1DeleteOptions body = null;
        String pretty = null;
        String dryRun = null;
        Integer gracePeriodSeconds = null;
        Boolean orphanDependents = null;
        String propagationPolicy = null;
        V1Status response = api.deleteNamespacedCronJob(name, namespace, body, pretty, dryRun, gracePeriodSeconds, orphanDependents, propagationPolicy);

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
     * list or watch objects of kind CronJob
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listCronJobForAllNamespacesTest() throws ApiException {
        String _continue = null;
        String fieldSelector = null;
        Boolean includeUninitialized = null;
        String labelSelector = null;
        Integer limit = null;
        String pretty = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        V1beta1CronJobList response = api.listCronJobForAllNamespaces(_continue, fieldSelector, includeUninitialized, labelSelector, limit, pretty, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * list or watch objects of kind CronJob
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listNamespacedCronJobTest() throws ApiException {
        String namespace = null;
        Boolean includeUninitialized = null;
        String pretty = null;
        String _continue = null;
        String fieldSelector = null;
        String labelSelector = null;
        Integer limit = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        V1beta1CronJobList response = api.listNamespacedCronJob(namespace, includeUninitialized, pretty, _continue, fieldSelector, labelSelector, limit, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * partially update the specified CronJob
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchNamespacedCronJobTest() throws ApiException {
        String name = null;
        String namespace = null;
        Object body = null;
        String pretty = null;
        String dryRun = null;
        V1beta1CronJob response = api.patchNamespacedCronJob(name, namespace, body, pretty, dryRun);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * partially update status of the specified CronJob
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchNamespacedCronJobStatusTest() throws ApiException {
        String name = null;
        String namespace = null;
        Object body = null;
        String pretty = null;
        String dryRun = null;
        V1beta1CronJob response = api.patchNamespacedCronJobStatus(name, namespace, body, pretty, dryRun);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * read the specified CronJob
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readNamespacedCronJobTest() throws ApiException {
        String name = null;
        String namespace = null;
        String pretty = null;
        Boolean exact = null;
        Boolean export = null;
        V1beta1CronJob response = api.readNamespacedCronJob(name, namespace, pretty, exact, export);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * read status of the specified CronJob
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readNamespacedCronJobStatusTest() throws ApiException {
        String name = null;
        String namespace = null;
        String pretty = null;
        V1beta1CronJob response = api.readNamespacedCronJobStatus(name, namespace, pretty);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * replace the specified CronJob
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void replaceNamespacedCronJobTest() throws ApiException {
        String name = null;
        String namespace = null;
        V1beta1CronJob body = null;
        String pretty = null;
        String dryRun = null;
        V1beta1CronJob response = api.replaceNamespacedCronJob(name, namespace, body, pretty, dryRun);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * replace status of the specified CronJob
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void replaceNamespacedCronJobStatusTest() throws ApiException {
        String name = null;
        String namespace = null;
        V1beta1CronJob body = null;
        String pretty = null;
        String dryRun = null;
        V1beta1CronJob response = api.replaceNamespacedCronJobStatus(name, namespace, body, pretty, dryRun);

        // TODO: test validations
    }
    
}
