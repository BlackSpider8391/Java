package io.kubernetes.client.informer.cache;

import static org.junit.Assert.*;

import io.kubernetes.client.informer.ResourceEventHandler;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import io.kubernetes.client.openapi.models.V1Pod;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.EnvironmentVariables;

public class ProcessorListenerTest {

  @Rule public final EnvironmentVariables environmentVariables = new EnvironmentVariables();

  private static boolean addNotificationReceived;
  private static boolean updateNotificationReceived;
  private static boolean deleteNotificationReceived;

  @Test
  public void testNotificationHandling() throws InterruptedException {
    V1Pod pod = new V1Pod().metadata(new V1ObjectMeta().name("foo").namespace("default"));

    ProcessorListener<V1Pod> listener =
        new ProcessorListener<>(
            new ResourceEventHandler<V1Pod>() {

              @Override
              public void onAdd(V1Pod obj) {
                assertEquals(pod, obj);
                addNotificationReceived = true;
              }

              @Override
              public void onUpdate(V1Pod oldObj, V1Pod newObj) {
                assertEquals(pod, newObj);
                updateNotificationReceived = true;
              }

              @Override
              public void onDelete(V1Pod obj, boolean deletedFinalStateUnknown) {
                assertEquals(pod, obj);
                deleteNotificationReceived = true;
              }
            },
            0);

    listener.add(new ProcessorListener.AddNotification<>(pod));
    listener.add(new ProcessorListener.UpdateNotification<>(null, pod));
    listener.add(new ProcessorListener.DeleteNotification<>(pod));

    Thread listenerThread = new Thread(listener::run);
    listenerThread.setDaemon(true);
    listenerThread.start();

    // sleep 1s for consuming nofications from queue
    Thread.sleep(1000);

    assertTrue(addNotificationReceived);
    assertTrue(updateNotificationReceived);
    assertTrue(deleteNotificationReceived);
  }

  @Test
  public void testMultipleNotificationsHandling() throws InterruptedException {
    V1Pod pod = new V1Pod().metadata(new V1ObjectMeta().name("foo").namespace("default"));
    final int[] count = {0};

    ProcessorListener<V1Pod> listener =
        new ProcessorListener<>(
            new ResourceEventHandler<V1Pod>() {
              @Override
              public void onAdd(V1Pod obj) {
                assertEquals(pod, obj);
                count[0]++;
              }

              @Override
              public void onUpdate(V1Pod oldObj, V1Pod newObj) {}

              @Override
              public void onDelete(V1Pod obj, boolean deletedFinalStateUnknown) {}
            },
            0);

    for (int i = 0; i < 2000; i++) {
      listener.add(new ProcessorListener.AddNotification<>(pod));
    }

    Thread listenerThread = new Thread(listener);
    listenerThread.setDaemon(true);
    listenerThread.start();

    Thread.sleep(2000);

    assertEquals(count[0], 2000);
  }
}
