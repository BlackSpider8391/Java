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

import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.get;
import static com.github.tomakehurst.wiremock.client.WireMock.patch;
import static com.github.tomakehurst.wiremock.client.WireMock.patchRequestedFor;
import static com.github.tomakehurst.wiremock.client.WireMock.urlPathEqualTo;
import static org.junit.Assert.assertNotNull;

import com.github.tomakehurst.wiremock.junit.WireMockRule;
import com.github.tomakehurst.wiremock.matching.EqualToPattern;
import io.kubernetes.client.custom.V1Patch;
import io.kubernetes.client.extended.kubectl.exception.KubectlException;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.models.V1ConfigMap;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import io.kubernetes.client.util.ClientBuilder;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

public class KubectlApplyTest {

  private static final String DISCOVERY_API =
      new java.io.File(
              KubectlApplyTest.class.getClassLoader().getResource("discovery-api.json").getPath())
          .toString();

  private static final String DISCOVERY_APIV1 =
      new java.io.File(
              KubectlApplyTest.class
                  .getClassLoader()
                  .getResource("discovery-api-v1.json")
                  .getPath())
          .toString();

  private static final String DISCOVERY_APIS =
      new java.io.File(
              KubectlApplyTest.class.getClassLoader().getResource("discovery-apis.json").getPath())
          .toString();

  private ApiClient apiClient;

  @Rule public WireMockRule wireMockRule = new WireMockRule(8384);

  @Before
  public void setup() throws IOException {
    apiClient = new ClientBuilder().setBasePath("http://localhost:" + 8384).build();
  }

  @Test
  public void testApplyConfigMap() throws KubectlException, IOException {
    wireMockRule.stubFor(
        patch(urlPathEqualTo("/api/v1/namespaces/foo/configmaps/bar"))
            .withHeader("Content-Type", new EqualToPattern(V1Patch.PATCH_FORMAT_APPLY_YAML))
            .willReturn(
                aResponse()
                    .withStatus(200)
                    .withBody("{\"metadata\":{\"name\":\"bar\",\"namespace\":\"foo\"}}")));
    wireMockRule.stubFor(
        get(urlPathEqualTo("/api"))
            .willReturn(
                aResponse()
                    .withStatus(200)
                    .withBody(new String(Files.readAllBytes(Paths.get(DISCOVERY_API))))));
    wireMockRule.stubFor(
        get(urlPathEqualTo("/apis"))
            .willReturn(
                aResponse()
                    .withStatus(200)
                    .withBody(new String(Files.readAllBytes(Paths.get(DISCOVERY_APIS))))));
    wireMockRule.stubFor(
        get(urlPathEqualTo("/api/v1"))
            .willReturn(
                aResponse()
                    .withStatus(200)
                    .withBody(new String(Files.readAllBytes(Paths.get(DISCOVERY_APIV1))))));

    V1ConfigMap configMap =
        Kubectl.apply(V1ConfigMap.class)
            .apiClient(apiClient)
            .resource(
                new V1ConfigMap()
                    .apiVersion("v1")
                    .metadata(new V1ObjectMeta().namespace("foo").name("bar"))
                    .data(
                        new HashMap<String, String>() {
                          {
                            put("key1", "value1");
                          }
                        }))
            .execute();
    wireMockRule.verify(
        1, patchRequestedFor(urlPathEqualTo("/api/v1/namespaces/foo/configmaps/bar")));
    assertNotNull(configMap);
  }
}
