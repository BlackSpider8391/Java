package io.kubernetes.client.util;

import static com.github.tomakehurst.wiremock.client.WireMock.*;

import com.github.tomakehurst.wiremock.junit.WireMockRule;
import io.kubernetes.client.custom.V1Patch;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.apis.CoreV1Api;
import io.kubernetes.client.openapi.models.V1Pod;
import java.io.IOException;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

public class PatchUtilsTest {

  private ApiClient client;
  private static final int PORT = 8089;

  @Rule public WireMockRule wireMockRule = new WireMockRule(PORT);

  @Before
  public void setup() throws IOException {
    client = new ClientBuilder().setBasePath("http://localhost:" + PORT).build();
  }

  @Test
  public void testJsonPatchPod() throws ApiException {
    CoreV1Api coreV1Api = new CoreV1Api(client);
    stubFor(
        patch(urlPathEqualTo("/api/v1/namespaces/default/pods/foo"))
            .withHeader("Content-Type", containing(V1Patch.PATCH_FORMAT_JSON_PATCH))
            .willReturn(
                aResponse()
                    .withStatus(200)
                    .withHeader("Content-Type", "application/json")
                    .withBody("{}")));

    PatchUtils.patch(
        V1Pod.class,
        () ->
            coreV1Api.patchNamespacedPodCall(
                "foo", "default", new V1Patch("[]"), null, null, null, null, null),
        V1Patch.PATCH_FORMAT_JSON_PATCH,
        client);

    verify(1, patchRequestedFor(urlPathEqualTo("/api/v1/namespaces/default/pods/foo")));
  }

  @Test
  public void testMergePatchPod() throws ApiException {
    CoreV1Api coreV1Api = new CoreV1Api(client);
    stubFor(
        patch(urlPathEqualTo("/api/v1/namespaces/default/pods/foo"))
            .withHeader("Content-Type", containing(V1Patch.PATCH_FORMAT_JSON_MERGE_PATCH))
            .willReturn(
                aResponse()
                    .withStatus(200)
                    .withHeader("Content-Type", "application/json")
                    .withBody("{}")));

    PatchUtils.patch(
        V1Pod.class,
        () ->
            coreV1Api.patchNamespacedPodCall(
                "foo", "default", new V1Patch("[]"), null, null, null, null, null),
        V1Patch.PATCH_FORMAT_JSON_MERGE_PATCH,
        client);

    verify(1, patchRequestedFor(urlPathEqualTo("/api/v1/namespaces/default/pods/foo")));
  }

  @Test
  public void testStrategicMergePatchPod() throws ApiException {
    CoreV1Api coreV1Api = new CoreV1Api(client);
    stubFor(
        patch(urlPathEqualTo("/api/v1/namespaces/default/pods/foo"))
            .withHeader("Content-Type", containing(V1Patch.PATCH_FORMAT_STRATEGIC_MERGE_PATCH))
            .willReturn(
                aResponse()
                    .withStatus(200)
                    .withHeader("Content-Type", "application/json")
                    .withBody("{}")));

    PatchUtils.patch(
        V1Pod.class,
        () ->
            coreV1Api.patchNamespacedPodCall(
                "foo", "default", new V1Patch("[]"), null, null, null, null, null),
        V1Patch.PATCH_FORMAT_STRATEGIC_MERGE_PATCH,
        client);

    verify(1, patchRequestedFor(urlPathEqualTo("/api/v1/namespaces/default/pods/foo")));
  }
}
