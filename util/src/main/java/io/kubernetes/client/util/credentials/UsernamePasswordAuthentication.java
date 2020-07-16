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
package io.kubernetes.client.util.credentials;

import io.kubernetes.client.openapi.ApiClient;
import java.nio.charset.Charset;
import okio.ByteString;

/**
 * Uses Username and Password to configure {@link ApiClient} authentication to the Kubernetes API.
 */
public class UsernamePasswordAuthentication implements Authentication {
  private final String username;
  private final String password;

  public UsernamePasswordAuthentication(final String username, final String password) {
    this.username = username;
    this.password = password;
  }

  @Override
  public void provide(ApiClient client) {
    final String usernameAndPassword = username + ":" + password;
    client.setApiKeyPrefix("Basic");
    client.setApiKey(
        ByteString.of(usernameAndPassword.getBytes(Charset.forName("ISO-8859-1"))).base64());
  }
}
