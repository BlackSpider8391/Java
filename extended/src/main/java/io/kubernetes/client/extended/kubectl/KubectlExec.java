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

import com.google.common.io.ByteStreams;
import io.kubernetes.client.Exec;
import io.kubernetes.client.extended.kubectl.exception.KubectlException;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import io.kubernetes.client.openapi.models.V1Pod;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class KubectlExec extends Kubectl.ResourceAndContainerBuilder<V1Pod, KubectlExec>
    implements Kubectl.Executable<V1Pod> {
  private String[] command;
  private boolean stdin;
  private boolean tty;
  private int result;

  KubectlExec(ApiClient client) {
    super(client, V1Pod.class);
  }

  public KubectlExec command(String[] command) {
    this.command = command;
    return this;
  }

  public KubectlExec stdin(boolean stdin) {
    this.stdin = stdin;
    return this;
  }

  public KubectlExec tty(boolean tty) {
    this.tty = tty;
    return this;
  }

  public int exitCode() {
    return result;
  }

  @Override
  public V1Pod execute() throws KubectlException {
    V1Pod pod = new V1Pod().metadata(new V1ObjectMeta().name(name).namespace(namespace));

    Exec exec = new Exec(apiClient);
    try {
      Process proc = exec.exec(pod, command, container, stdin, tty);
      copyAsync(proc.getInputStream(), System.out);
      copyAsync(proc.getErrorStream(), System.err);
      if (stdin) {
        copyAsync(System.in, proc.getOutputStream());
      }
      this.result = proc.waitFor();
    } catch (InterruptedException | ApiException | IOException ex) {
      throw new KubectlException(ex);
    }
    return pod;
  }

  private static void copyAsync(InputStream in, OutputStream out) {
    new Thread(
            new Runnable() {
              public void run() {
                try {
                  ByteStreams.copy(in, out);
                } catch (IOException ex) {
                  ex.printStackTrace();
                }
              }
            })
        .start();
  }
}
