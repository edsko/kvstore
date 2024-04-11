package io.grpc.examples;

import com.google.protobuf.ByteString;
import io.grpc.Channel;
import io.grpc.examples.proto.CreateRequest;
import io.grpc.examples.proto.CreateResponse;
import io.grpc.examples.proto.KeyValueServiceGrpc;
import io.grpc.examples.proto.KeyValueServiceGrpc.KeyValueServiceBlockingStub;
import io.grpc.examples.proto.RetrieveRequest;
import io.grpc.examples.proto.RetrieveResponse;

final class KvClient {
  private final Channel channel;

  KvClient(Channel channel) {
    this.channel = channel;
  }

  void doClientWork() {
    KeyValueServiceBlockingStub stub = KeyValueServiceGrpc.newBlockingStub(channel);

    createKeyValuePair(stub);
    retrieveValue(stub);
  }

  private void createKeyValuePair(KeyValueServiceBlockingStub stub) {
    CreateResponse res = stub.create(
        CreateRequest.newBuilder()
            .setKey(ByteString.copyFromUtf8("key1"))
            .setValue(ByteString.copyFromUtf8("value1"))
            .build());
    if (!res.equals(CreateResponse.getDefaultInstance())) {
      throw new RuntimeException("Invalid response");
    }
  }

  private void retrieveValue(KeyValueServiceBlockingStub stub) {
    RetrieveResponse res = stub.retrieve(RetrieveRequest.newBuilder()
        .setKey(ByteString.copyFromUtf8("key1"))
        .build());

    System.out.println(res.toString());
  }
}
