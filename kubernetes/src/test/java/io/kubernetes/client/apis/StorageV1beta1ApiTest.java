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
import io.kubernetes.client.models.V1beta1StorageClass;
import io.kubernetes.client.models.V1beta1StorageClassList;
import io.kubernetes.client.models.V1beta1VolumeAttachment;
import io.kubernetes.client.models.V1beta1VolumeAttachmentList;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for StorageV1beta1Api
 */
@Ignore
public class StorageV1beta1ApiTest {

    private final StorageV1beta1Api api = new StorageV1beta1Api();

    
    /**
     * 
     *
     * create a StorageClass
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createStorageClassTest() throws ApiException {
        V1beta1StorageClass body = null;
        Boolean includeUninitialized = null;
        String pretty = null;
        String dryRun = null;
        V1beta1StorageClass response = api.createStorageClass(body, includeUninitialized, pretty, dryRun);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * create a VolumeAttachment
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createVolumeAttachmentTest() throws ApiException {
        V1beta1VolumeAttachment body = null;
        Boolean includeUninitialized = null;
        String pretty = null;
        String dryRun = null;
        V1beta1VolumeAttachment response = api.createVolumeAttachment(body, includeUninitialized, pretty, dryRun);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * delete collection of StorageClass
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCollectionStorageClassTest() throws ApiException {
        Boolean includeUninitialized = null;
        String pretty = null;
        String _continue = null;
        String fieldSelector = null;
        String labelSelector = null;
        Integer limit = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        V1Status response = api.deleteCollectionStorageClass(includeUninitialized, pretty, _continue, fieldSelector, labelSelector, limit, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * delete collection of VolumeAttachment
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCollectionVolumeAttachmentTest() throws ApiException {
        Boolean includeUninitialized = null;
        String pretty = null;
        String _continue = null;
        String fieldSelector = null;
        String labelSelector = null;
        Integer limit = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        V1Status response = api.deleteCollectionVolumeAttachment(includeUninitialized, pretty, _continue, fieldSelector, labelSelector, limit, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * delete a StorageClass
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteStorageClassTest() throws ApiException {
        String name = null;
        String pretty = null;
        V1DeleteOptions body = null;
        String dryRun = null;
        Integer gracePeriodSeconds = null;
        Boolean orphanDependents = null;
        String propagationPolicy = null;
        V1Status response = api.deleteStorageClass(name, pretty, body, dryRun, gracePeriodSeconds, orphanDependents, propagationPolicy);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * delete a VolumeAttachment
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteVolumeAttachmentTest() throws ApiException {
        String name = null;
        String pretty = null;
        V1DeleteOptions body = null;
        String dryRun = null;
        Integer gracePeriodSeconds = null;
        Boolean orphanDependents = null;
        String propagationPolicy = null;
        V1Status response = api.deleteVolumeAttachment(name, pretty, body, dryRun, gracePeriodSeconds, orphanDependents, propagationPolicy);

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
     * list or watch objects of kind StorageClass
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listStorageClassTest() throws ApiException {
        Boolean includeUninitialized = null;
        String pretty = null;
        String _continue = null;
        String fieldSelector = null;
        String labelSelector = null;
        Integer limit = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        V1beta1StorageClassList response = api.listStorageClass(includeUninitialized, pretty, _continue, fieldSelector, labelSelector, limit, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * list or watch objects of kind VolumeAttachment
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listVolumeAttachmentTest() throws ApiException {
        Boolean includeUninitialized = null;
        String pretty = null;
        String _continue = null;
        String fieldSelector = null;
        String labelSelector = null;
        Integer limit = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        V1beta1VolumeAttachmentList response = api.listVolumeAttachment(includeUninitialized, pretty, _continue, fieldSelector, labelSelector, limit, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * partially update the specified StorageClass
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchStorageClassTest() throws ApiException {
        String name = null;
        Object body = null;
        String pretty = null;
        String dryRun = null;
        V1beta1StorageClass response = api.patchStorageClass(name, body, pretty, dryRun);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * partially update the specified VolumeAttachment
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchVolumeAttachmentTest() throws ApiException {
        String name = null;
        Object body = null;
        String pretty = null;
        String dryRun = null;
        V1beta1VolumeAttachment response = api.patchVolumeAttachment(name, body, pretty, dryRun);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * read the specified StorageClass
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readStorageClassTest() throws ApiException {
        String name = null;
        String pretty = null;
        Boolean exact = null;
        Boolean export = null;
        V1beta1StorageClass response = api.readStorageClass(name, pretty, exact, export);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * read the specified VolumeAttachment
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readVolumeAttachmentTest() throws ApiException {
        String name = null;
        String pretty = null;
        Boolean exact = null;
        Boolean export = null;
        V1beta1VolumeAttachment response = api.readVolumeAttachment(name, pretty, exact, export);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * replace the specified StorageClass
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void replaceStorageClassTest() throws ApiException {
        String name = null;
        V1beta1StorageClass body = null;
        String pretty = null;
        String dryRun = null;
        V1beta1StorageClass response = api.replaceStorageClass(name, body, pretty, dryRun);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * replace the specified VolumeAttachment
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void replaceVolumeAttachmentTest() throws ApiException {
        String name = null;
        V1beta1VolumeAttachment body = null;
        String pretty = null;
        String dryRun = null;
        V1beta1VolumeAttachment response = api.replaceVolumeAttachment(name, body, pretty, dryRun);

        // TODO: test validations
    }
    
}
