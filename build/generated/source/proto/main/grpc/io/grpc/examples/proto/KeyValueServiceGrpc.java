package io.grpc.examples.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: kvstore.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class KeyValueServiceGrpc {

  private KeyValueServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "io.grpc.KeyValueService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.grpc.examples.proto.CreateRequest,
      io.grpc.examples.proto.CreateResponse> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = io.grpc.examples.proto.CreateRequest.class,
      responseType = io.grpc.examples.proto.CreateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.examples.proto.CreateRequest,
      io.grpc.examples.proto.CreateResponse> getCreateMethod() {
    io.grpc.MethodDescriptor<io.grpc.examples.proto.CreateRequest, io.grpc.examples.proto.CreateResponse> getCreateMethod;
    if ((getCreateMethod = KeyValueServiceGrpc.getCreateMethod) == null) {
      synchronized (KeyValueServiceGrpc.class) {
        if ((getCreateMethod = KeyValueServiceGrpc.getCreateMethod) == null) {
          KeyValueServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<io.grpc.examples.proto.CreateRequest, io.grpc.examples.proto.CreateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.proto.CreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.proto.CreateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new KeyValueServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.grpc.examples.proto.RetrieveRequest,
      io.grpc.examples.proto.RetrieveResponse> getRetrieveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Retrieve",
      requestType = io.grpc.examples.proto.RetrieveRequest.class,
      responseType = io.grpc.examples.proto.RetrieveResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.examples.proto.RetrieveRequest,
      io.grpc.examples.proto.RetrieveResponse> getRetrieveMethod() {
    io.grpc.MethodDescriptor<io.grpc.examples.proto.RetrieveRequest, io.grpc.examples.proto.RetrieveResponse> getRetrieveMethod;
    if ((getRetrieveMethod = KeyValueServiceGrpc.getRetrieveMethod) == null) {
      synchronized (KeyValueServiceGrpc.class) {
        if ((getRetrieveMethod = KeyValueServiceGrpc.getRetrieveMethod) == null) {
          KeyValueServiceGrpc.getRetrieveMethod = getRetrieveMethod =
              io.grpc.MethodDescriptor.<io.grpc.examples.proto.RetrieveRequest, io.grpc.examples.proto.RetrieveResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Retrieve"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.proto.RetrieveRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.proto.RetrieveResponse.getDefaultInstance()))
              .setSchemaDescriptor(new KeyValueServiceMethodDescriptorSupplier("Retrieve"))
              .build();
        }
      }
    }
    return getRetrieveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.grpc.examples.proto.UpdateRequest,
      io.grpc.examples.proto.UpdateResponse> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = io.grpc.examples.proto.UpdateRequest.class,
      responseType = io.grpc.examples.proto.UpdateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.examples.proto.UpdateRequest,
      io.grpc.examples.proto.UpdateResponse> getUpdateMethod() {
    io.grpc.MethodDescriptor<io.grpc.examples.proto.UpdateRequest, io.grpc.examples.proto.UpdateResponse> getUpdateMethod;
    if ((getUpdateMethod = KeyValueServiceGrpc.getUpdateMethod) == null) {
      synchronized (KeyValueServiceGrpc.class) {
        if ((getUpdateMethod = KeyValueServiceGrpc.getUpdateMethod) == null) {
          KeyValueServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<io.grpc.examples.proto.UpdateRequest, io.grpc.examples.proto.UpdateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.proto.UpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.proto.UpdateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new KeyValueServiceMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.grpc.examples.proto.DeleteRequest,
      io.grpc.examples.proto.DeleteResponse> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = io.grpc.examples.proto.DeleteRequest.class,
      responseType = io.grpc.examples.proto.DeleteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.examples.proto.DeleteRequest,
      io.grpc.examples.proto.DeleteResponse> getDeleteMethod() {
    io.grpc.MethodDescriptor<io.grpc.examples.proto.DeleteRequest, io.grpc.examples.proto.DeleteResponse> getDeleteMethod;
    if ((getDeleteMethod = KeyValueServiceGrpc.getDeleteMethod) == null) {
      synchronized (KeyValueServiceGrpc.class) {
        if ((getDeleteMethod = KeyValueServiceGrpc.getDeleteMethod) == null) {
          KeyValueServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<io.grpc.examples.proto.DeleteRequest, io.grpc.examples.proto.DeleteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.proto.DeleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.proto.DeleteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new KeyValueServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static KeyValueServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KeyValueServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KeyValueServiceStub>() {
        @java.lang.Override
        public KeyValueServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KeyValueServiceStub(channel, callOptions);
        }
      };
    return KeyValueServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static KeyValueServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KeyValueServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KeyValueServiceBlockingStub>() {
        @java.lang.Override
        public KeyValueServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KeyValueServiceBlockingStub(channel, callOptions);
        }
      };
    return KeyValueServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static KeyValueServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KeyValueServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KeyValueServiceFutureStub>() {
        @java.lang.Override
        public KeyValueServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KeyValueServiceFutureStub(channel, callOptions);
        }
      };
    return KeyValueServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void create(io.grpc.examples.proto.CreateRequest request,
        io.grpc.stub.StreamObserver<io.grpc.examples.proto.CreateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     */
    default void retrieve(io.grpc.examples.proto.RetrieveRequest request,
        io.grpc.stub.StreamObserver<io.grpc.examples.proto.RetrieveResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRetrieveMethod(), responseObserver);
    }

    /**
     */
    default void update(io.grpc.examples.proto.UpdateRequest request,
        io.grpc.stub.StreamObserver<io.grpc.examples.proto.UpdateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     */
    default void delete(io.grpc.examples.proto.DeleteRequest request,
        io.grpc.stub.StreamObserver<io.grpc.examples.proto.DeleteResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service KeyValueService.
   */
  public static abstract class KeyValueServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return KeyValueServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service KeyValueService.
   */
  public static final class KeyValueServiceStub
      extends io.grpc.stub.AbstractAsyncStub<KeyValueServiceStub> {
    private KeyValueServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeyValueServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KeyValueServiceStub(channel, callOptions);
    }

    /**
     */
    public void create(io.grpc.examples.proto.CreateRequest request,
        io.grpc.stub.StreamObserver<io.grpc.examples.proto.CreateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void retrieve(io.grpc.examples.proto.RetrieveRequest request,
        io.grpc.stub.StreamObserver<io.grpc.examples.proto.RetrieveResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRetrieveMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void update(io.grpc.examples.proto.UpdateRequest request,
        io.grpc.stub.StreamObserver<io.grpc.examples.proto.UpdateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void delete(io.grpc.examples.proto.DeleteRequest request,
        io.grpc.stub.StreamObserver<io.grpc.examples.proto.DeleteResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service KeyValueService.
   */
  public static final class KeyValueServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<KeyValueServiceBlockingStub> {
    private KeyValueServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeyValueServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KeyValueServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.examples.proto.CreateResponse create(io.grpc.examples.proto.CreateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.grpc.examples.proto.RetrieveResponse retrieve(io.grpc.examples.proto.RetrieveRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRetrieveMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.grpc.examples.proto.UpdateResponse update(io.grpc.examples.proto.UpdateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.grpc.examples.proto.DeleteResponse delete(io.grpc.examples.proto.DeleteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service KeyValueService.
   */
  public static final class KeyValueServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<KeyValueServiceFutureStub> {
    private KeyValueServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeyValueServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KeyValueServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.examples.proto.CreateResponse> create(
        io.grpc.examples.proto.CreateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.examples.proto.RetrieveResponse> retrieve(
        io.grpc.examples.proto.RetrieveRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRetrieveMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.examples.proto.UpdateResponse> update(
        io.grpc.examples.proto.UpdateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.examples.proto.DeleteResponse> delete(
        io.grpc.examples.proto.DeleteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE = 0;
  private static final int METHODID_RETRIEVE = 1;
  private static final int METHODID_UPDATE = 2;
  private static final int METHODID_DELETE = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE:
          serviceImpl.create((io.grpc.examples.proto.CreateRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.examples.proto.CreateResponse>) responseObserver);
          break;
        case METHODID_RETRIEVE:
          serviceImpl.retrieve((io.grpc.examples.proto.RetrieveRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.examples.proto.RetrieveResponse>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((io.grpc.examples.proto.UpdateRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.examples.proto.UpdateResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((io.grpc.examples.proto.DeleteRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.examples.proto.DeleteResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getCreateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.grpc.examples.proto.CreateRequest,
              io.grpc.examples.proto.CreateResponse>(
                service, METHODID_CREATE)))
        .addMethod(
          getRetrieveMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.grpc.examples.proto.RetrieveRequest,
              io.grpc.examples.proto.RetrieveResponse>(
                service, METHODID_RETRIEVE)))
        .addMethod(
          getUpdateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.grpc.examples.proto.UpdateRequest,
              io.grpc.examples.proto.UpdateResponse>(
                service, METHODID_UPDATE)))
        .addMethod(
          getDeleteMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.grpc.examples.proto.DeleteRequest,
              io.grpc.examples.proto.DeleteResponse>(
                service, METHODID_DELETE)))
        .build();
  }

  private static abstract class KeyValueServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    KeyValueServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.grpc.examples.proto.KeyValues.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("KeyValueService");
    }
  }

  private static final class KeyValueServiceFileDescriptorSupplier
      extends KeyValueServiceBaseDescriptorSupplier {
    KeyValueServiceFileDescriptorSupplier() {}
  }

  private static final class KeyValueServiceMethodDescriptorSupplier
      extends KeyValueServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    KeyValueServiceMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (KeyValueServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new KeyValueServiceFileDescriptorSupplier())
              .addMethod(getCreateMethod())
              .addMethod(getRetrieveMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getDeleteMethod())
              .build();
        }
      }
    }
    return result;
  }
}
