package com.heinemann.grpc.apmplanner;

import static io.grpc.stub.ClientCalls.createMethodDescriptor;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.duplexStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.unaryFutureCall;
import static io.grpc.stub.ServerCalls.createMethodDefinition;
import static io.grpc.stub.ServerCalls.asyncUnaryRequestCall;
import static io.grpc.stub.ServerCalls.asyncStreamingRequestCall;

@javax.annotation.Generated("by gRPC proto compiler")
public class UASManagerGrpc {

  private static final io.grpc.stub.Method<com.heinemann.grpc.apmplanner.ApmPlanner.Null,
      com.heinemann.grpc.apmplanner.ApmPlanner.UAS> METHOD_GET_ACTIVE_UAS =
      io.grpc.stub.Method.create(
          io.grpc.MethodType.UNARY, "GetActiveUAS",
          io.grpc.protobuf.ProtoUtils.marshaller(com.heinemann.grpc.apmplanner.ApmPlanner.Null.PARSER),
          io.grpc.protobuf.ProtoUtils.marshaller(com.heinemann.grpc.apmplanner.ApmPlanner.UAS.PARSER));

  public static UASManagerStub newStub(io.grpc.Channel channel) {
    return new UASManagerStub(channel, CONFIG);
  }

  public static UASManagerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new UASManagerBlockingStub(channel, CONFIG);
  }

  public static UASManagerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new UASManagerFutureStub(channel, CONFIG);
  }

  public static final UASManagerServiceDescriptor CONFIG =
      new UASManagerServiceDescriptor();

  @javax.annotation.concurrent.Immutable
  public static class UASManagerServiceDescriptor extends
      io.grpc.stub.AbstractServiceDescriptor<UASManagerServiceDescriptor> {
    public final io.grpc.MethodDescriptor<com.heinemann.grpc.apmplanner.ApmPlanner.Null,
        com.heinemann.grpc.apmplanner.ApmPlanner.UAS> getActiveUAS;

    private UASManagerServiceDescriptor() {
      getActiveUAS = createMethodDescriptor(
          "com.heinemann.grpc.apmplanner.UASManager", METHOD_GET_ACTIVE_UAS);
    }

    @SuppressWarnings("unchecked")
    private UASManagerServiceDescriptor(
        java.util.Map<java.lang.String, io.grpc.MethodDescriptor<?, ?>> methodMap) {
      getActiveUAS = (io.grpc.MethodDescriptor<com.heinemann.grpc.apmplanner.ApmPlanner.Null,
          com.heinemann.grpc.apmplanner.ApmPlanner.UAS>) methodMap.get(
          CONFIG.getActiveUAS.getName());
    }

    @java.lang.Override
    protected UASManagerServiceDescriptor build(
        java.util.Map<java.lang.String, io.grpc.MethodDescriptor<?, ?>> methodMap) {
      return new UASManagerServiceDescriptor(methodMap);
    }

    @java.lang.Override
    public com.google.common.collect.ImmutableList<io.grpc.MethodDescriptor<?, ?>> methods() {
      return com.google.common.collect.ImmutableList.<io.grpc.MethodDescriptor<?, ?>>of(
          getActiveUAS);
    }
  }

  public static interface UASManager {

    public void getActiveUAS(com.heinemann.grpc.apmplanner.ApmPlanner.Null request,
        io.grpc.stub.StreamObserver<com.heinemann.grpc.apmplanner.ApmPlanner.UAS> responseObserver);
  }

  public static interface UASManagerBlockingClient {

    public com.heinemann.grpc.apmplanner.ApmPlanner.UAS getActiveUAS(com.heinemann.grpc.apmplanner.ApmPlanner.Null request);
  }

  public static interface UASManagerFutureClient {

    public com.google.common.util.concurrent.ListenableFuture<com.heinemann.grpc.apmplanner.ApmPlanner.UAS> getActiveUAS(
        com.heinemann.grpc.apmplanner.ApmPlanner.Null request);
  }

  public static class UASManagerStub extends
      io.grpc.stub.AbstractStub<UASManagerStub, UASManagerServiceDescriptor>
      implements UASManager {
    private UASManagerStub(io.grpc.Channel channel,
        UASManagerServiceDescriptor config) {
      super(channel, config);
    }

    @java.lang.Override
    protected UASManagerStub build(io.grpc.Channel channel,
        UASManagerServiceDescriptor config) {
      return new UASManagerStub(channel, config);
    }

    @java.lang.Override
    public void getActiveUAS(com.heinemann.grpc.apmplanner.ApmPlanner.Null request,
        io.grpc.stub.StreamObserver<com.heinemann.grpc.apmplanner.ApmPlanner.UAS> responseObserver) {
      asyncUnaryCall(
          channel.newCall(config.getActiveUAS), request, responseObserver);
    }
  }

  public static class UASManagerBlockingStub extends
      io.grpc.stub.AbstractStub<UASManagerBlockingStub, UASManagerServiceDescriptor>
      implements UASManagerBlockingClient {
    private UASManagerBlockingStub(io.grpc.Channel channel,
        UASManagerServiceDescriptor config) {
      super(channel, config);
    }

    @java.lang.Override
    protected UASManagerBlockingStub build(io.grpc.Channel channel,
        UASManagerServiceDescriptor config) {
      return new UASManagerBlockingStub(channel, config);
    }

    @java.lang.Override
    public com.heinemann.grpc.apmplanner.ApmPlanner.UAS getActiveUAS(com.heinemann.grpc.apmplanner.ApmPlanner.Null request) {
      return blockingUnaryCall(
          channel.newCall(config.getActiveUAS), request);
    }
  }

  public static class UASManagerFutureStub extends
      io.grpc.stub.AbstractStub<UASManagerFutureStub, UASManagerServiceDescriptor>
      implements UASManagerFutureClient {
    private UASManagerFutureStub(io.grpc.Channel channel,
        UASManagerServiceDescriptor config) {
      super(channel, config);
    }

    @java.lang.Override
    protected UASManagerFutureStub build(io.grpc.Channel channel,
        UASManagerServiceDescriptor config) {
      return new UASManagerFutureStub(channel, config);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<com.heinemann.grpc.apmplanner.ApmPlanner.UAS> getActiveUAS(
        com.heinemann.grpc.apmplanner.ApmPlanner.Null request) {
      return unaryFutureCall(
          channel.newCall(config.getActiveUAS), request);
    }
  }

  public static io.grpc.ServerServiceDefinition bindService(
      final UASManager serviceImpl) {
    return io.grpc.ServerServiceDefinition.builder("com.heinemann.grpc.apmplanner.UASManager")
      .addMethod(createMethodDefinition(
          METHOD_GET_ACTIVE_UAS,
          asyncUnaryRequestCall(
            new io.grpc.stub.ServerCalls.UnaryRequestMethod<
                com.heinemann.grpc.apmplanner.ApmPlanner.Null,
                com.heinemann.grpc.apmplanner.ApmPlanner.UAS>() {
              @java.lang.Override
              public void invoke(
                  com.heinemann.grpc.apmplanner.ApmPlanner.Null request,
                  io.grpc.stub.StreamObserver<com.heinemann.grpc.apmplanner.ApmPlanner.UAS> responseObserver) {
                serviceImpl.getActiveUAS(request, responseObserver);
              }
            }))).build();
  }
}
