package io.grpc.examples;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public final class KvRunner {
  private ManagedChannel channel;

  public static void main(String []args) throws Exception {
    KvRunner store = new KvRunner();
    store.runClient();
  }

  private void runClient() throws InterruptedException {
    if (channel != null) {
      throw new IllegalStateException("Already started");
    }
    channel = ManagedChannelBuilder.forTarget("dns:///localhost:50051").usePlaintext().build();
    try {
      KvClient client = new KvClient(channel);
      client.doClientWork();
    } finally {
      channel.shutdownNow();
    }
  }
}
