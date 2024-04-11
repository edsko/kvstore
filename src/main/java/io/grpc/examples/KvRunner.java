package io.grpc.examples;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import java.io.IOException;

public final class KvRunner {
  private Server server;

  public static void main(String []args) throws Exception {
    KvRunner store = new KvRunner();
    store.runServer();
  }

  private void runServer() throws IOException, InterruptedException {
    if (server != null) {
      throw new IllegalStateException("Already started");
    }
    server = ServerBuilder.forPort(50051).addService(new KvService()).build();
    server.start();
    server.awaitTermination();
  }
}
