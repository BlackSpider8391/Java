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
package io.kubernetes.client.extended.workqueue;

import static org.junit.Assert.assertTrue;

import io.kubernetes.client.extended.workqueue.ratelimiter.RateLimiter;
import java.time.Duration;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import org.junit.Test;

public class DefaultRateLimitQueueTest {

  private static class MockRateLimiter<T> implements RateLimiter<T> {

    private int count;

    @Override
    public Duration when(Object item) {
      return Duration.ofMillis(500);
    }

    @Override
    public void forget(Object item) {
      count = 0;
    }

    @Override
    public int numRequeues(Object item) {
      int requeue = count;
      count++;
      return requeue;
    }
  }

  @Test
  public void testSimpleRateLimitQueue() throws Exception {
    MockRateLimiter<String> mockRateLimiter = new MockRateLimiter<>();
    DefaultRateLimitingQueue<String> rlq =
        new DefaultRateLimitingQueue<>(Executors.newSingleThreadExecutor(), mockRateLimiter);
    long t1 = System.nanoTime();
    rlq.addRateLimited("foo");
    rlq.get();
    long t2 = System.nanoTime();
    assertTrue(t2 - t1 > TimeUnit.MILLISECONDS.toNanos(500));
  }
}
