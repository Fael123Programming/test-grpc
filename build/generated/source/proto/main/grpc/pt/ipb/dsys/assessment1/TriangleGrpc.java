package pt.ipb.dsys.assessment1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.54.0)",
    comments = "Source: assessment.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TriangleGrpc {

  private TriangleGrpc() {}

  public static final String SERVICE_NAME = "Triangle";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<pt.ipb.dsys.assessment1.TriangleParam,
      pt.ipb.dsys.assessment1.Scalar> getAreaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "area",
      requestType = pt.ipb.dsys.assessment1.TriangleParam.class,
      responseType = pt.ipb.dsys.assessment1.Scalar.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<pt.ipb.dsys.assessment1.TriangleParam,
      pt.ipb.dsys.assessment1.Scalar> getAreaMethod() {
    io.grpc.MethodDescriptor<pt.ipb.dsys.assessment1.TriangleParam, pt.ipb.dsys.assessment1.Scalar> getAreaMethod;
    if ((getAreaMethod = TriangleGrpc.getAreaMethod) == null) {
      synchronized (TriangleGrpc.class) {
        if ((getAreaMethod = TriangleGrpc.getAreaMethod) == null) {
          TriangleGrpc.getAreaMethod = getAreaMethod =
              io.grpc.MethodDescriptor.<pt.ipb.dsys.assessment1.TriangleParam, pt.ipb.dsys.assessment1.Scalar>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "area"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pt.ipb.dsys.assessment1.TriangleParam.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pt.ipb.dsys.assessment1.Scalar.getDefaultInstance()))
              .setSchemaDescriptor(new TriangleMethodDescriptorSupplier("area"))
              .build();
        }
      }
    }
    return getAreaMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TriangleStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TriangleStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TriangleStub>() {
        @java.lang.Override
        public TriangleStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TriangleStub(channel, callOptions);
        }
      };
    return TriangleStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TriangleBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TriangleBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TriangleBlockingStub>() {
        @java.lang.Override
        public TriangleBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TriangleBlockingStub(channel, callOptions);
        }
      };
    return TriangleBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TriangleFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TriangleFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TriangleFutureStub>() {
        @java.lang.Override
        public TriangleFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TriangleFutureStub(channel, callOptions);
        }
      };
    return TriangleFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void area(pt.ipb.dsys.assessment1.TriangleParam request,
        io.grpc.stub.StreamObserver<pt.ipb.dsys.assessment1.Scalar> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAreaMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Triangle.
   */
  public static abstract class TriangleImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return TriangleGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Triangle.
   */
  public static final class TriangleStub
      extends io.grpc.stub.AbstractAsyncStub<TriangleStub> {
    private TriangleStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TriangleStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TriangleStub(channel, callOptions);
    }

    /**
     */
    public void area(pt.ipb.dsys.assessment1.TriangleParam request,
        io.grpc.stub.StreamObserver<pt.ipb.dsys.assessment1.Scalar> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAreaMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Triangle.
   */
  public static final class TriangleBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<TriangleBlockingStub> {
    private TriangleBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TriangleBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TriangleBlockingStub(channel, callOptions);
    }

    /**
     */
    public pt.ipb.dsys.assessment1.Scalar area(pt.ipb.dsys.assessment1.TriangleParam request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAreaMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Triangle.
   */
  public static final class TriangleFutureStub
      extends io.grpc.stub.AbstractFutureStub<TriangleFutureStub> {
    private TriangleFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TriangleFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TriangleFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<pt.ipb.dsys.assessment1.Scalar> area(
        pt.ipb.dsys.assessment1.TriangleParam request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAreaMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_AREA = 0;

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
        case METHODID_AREA:
          serviceImpl.area((pt.ipb.dsys.assessment1.TriangleParam) request,
              (io.grpc.stub.StreamObserver<pt.ipb.dsys.assessment1.Scalar>) responseObserver);
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
          getAreaMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              pt.ipb.dsys.assessment1.TriangleParam,
              pt.ipb.dsys.assessment1.Scalar>(
                service, METHODID_AREA)))
        .build();
  }

  private static abstract class TriangleBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TriangleBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return pt.ipb.dsys.assessment1.Assessment.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Triangle");
    }
  }

  private static final class TriangleFileDescriptorSupplier
      extends TriangleBaseDescriptorSupplier {
    TriangleFileDescriptorSupplier() {}
  }

  private static final class TriangleMethodDescriptorSupplier
      extends TriangleBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TriangleMethodDescriptorSupplier(String methodName) {
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
      synchronized (TriangleGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TriangleFileDescriptorSupplier())
              .addMethod(getAreaMethod())
              .build();
        }
      }
    }
    return result;
  }
}
