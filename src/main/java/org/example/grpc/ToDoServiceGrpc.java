package org.example.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: todo.proto")
public final class ToDoServiceGrpc {

  private ToDoServiceGrpc() {}

  public static final String SERVICE_NAME = "ToDoService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.example.grpc.Todo.Task,
      org.example.grpc.Todo.TaskResponse> getCreateTaskMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateTask",
      requestType = org.example.grpc.Todo.Task.class,
      responseType = org.example.grpc.Todo.TaskResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.grpc.Todo.Task,
      org.example.grpc.Todo.TaskResponse> getCreateTaskMethod() {
    io.grpc.MethodDescriptor<org.example.grpc.Todo.Task, org.example.grpc.Todo.TaskResponse> getCreateTaskMethod;
    if ((getCreateTaskMethod = ToDoServiceGrpc.getCreateTaskMethod) == null) {
      synchronized (ToDoServiceGrpc.class) {
        if ((getCreateTaskMethod = ToDoServiceGrpc.getCreateTaskMethod) == null) {
          ToDoServiceGrpc.getCreateTaskMethod = getCreateTaskMethod = 
              io.grpc.MethodDescriptor.<org.example.grpc.Todo.Task, org.example.grpc.Todo.TaskResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ToDoService", "CreateTask"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.grpc.Todo.Task.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.grpc.Todo.TaskResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ToDoServiceMethodDescriptorSupplier("CreateTask"))
                  .build();
          }
        }
     }
     return getCreateTaskMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.grpc.Todo.Task,
      org.example.grpc.Todo.TaskResponse> getReadTaskMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReadTask",
      requestType = org.example.grpc.Todo.Task.class,
      responseType = org.example.grpc.Todo.TaskResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.grpc.Todo.Task,
      org.example.grpc.Todo.TaskResponse> getReadTaskMethod() {
    io.grpc.MethodDescriptor<org.example.grpc.Todo.Task, org.example.grpc.Todo.TaskResponse> getReadTaskMethod;
    if ((getReadTaskMethod = ToDoServiceGrpc.getReadTaskMethod) == null) {
      synchronized (ToDoServiceGrpc.class) {
        if ((getReadTaskMethod = ToDoServiceGrpc.getReadTaskMethod) == null) {
          ToDoServiceGrpc.getReadTaskMethod = getReadTaskMethod = 
              io.grpc.MethodDescriptor.<org.example.grpc.Todo.Task, org.example.grpc.Todo.TaskResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ToDoService", "ReadTask"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.grpc.Todo.Task.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.grpc.Todo.TaskResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ToDoServiceMethodDescriptorSupplier("ReadTask"))
                  .build();
          }
        }
     }
     return getReadTaskMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.grpc.Todo.Task,
      org.example.grpc.Todo.TaskResponse> getUpdateTaskMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateTask",
      requestType = org.example.grpc.Todo.Task.class,
      responseType = org.example.grpc.Todo.TaskResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.grpc.Todo.Task,
      org.example.grpc.Todo.TaskResponse> getUpdateTaskMethod() {
    io.grpc.MethodDescriptor<org.example.grpc.Todo.Task, org.example.grpc.Todo.TaskResponse> getUpdateTaskMethod;
    if ((getUpdateTaskMethod = ToDoServiceGrpc.getUpdateTaskMethod) == null) {
      synchronized (ToDoServiceGrpc.class) {
        if ((getUpdateTaskMethod = ToDoServiceGrpc.getUpdateTaskMethod) == null) {
          ToDoServiceGrpc.getUpdateTaskMethod = getUpdateTaskMethod = 
              io.grpc.MethodDescriptor.<org.example.grpc.Todo.Task, org.example.grpc.Todo.TaskResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ToDoService", "UpdateTask"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.grpc.Todo.Task.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.grpc.Todo.TaskResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ToDoServiceMethodDescriptorSupplier("UpdateTask"))
                  .build();
          }
        }
     }
     return getUpdateTaskMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.grpc.Todo.Task,
      org.example.grpc.Todo.TaskResponse> getDeleteTaskMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteTask",
      requestType = org.example.grpc.Todo.Task.class,
      responseType = org.example.grpc.Todo.TaskResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.grpc.Todo.Task,
      org.example.grpc.Todo.TaskResponse> getDeleteTaskMethod() {
    io.grpc.MethodDescriptor<org.example.grpc.Todo.Task, org.example.grpc.Todo.TaskResponse> getDeleteTaskMethod;
    if ((getDeleteTaskMethod = ToDoServiceGrpc.getDeleteTaskMethod) == null) {
      synchronized (ToDoServiceGrpc.class) {
        if ((getDeleteTaskMethod = ToDoServiceGrpc.getDeleteTaskMethod) == null) {
          ToDoServiceGrpc.getDeleteTaskMethod = getDeleteTaskMethod = 
              io.grpc.MethodDescriptor.<org.example.grpc.Todo.Task, org.example.grpc.Todo.TaskResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ToDoService", "DeleteTask"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.grpc.Todo.Task.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.grpc.Todo.TaskResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ToDoServiceMethodDescriptorSupplier("DeleteTask"))
                  .build();
          }
        }
     }
     return getDeleteTaskMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.grpc.Todo.Empty,
      org.example.grpc.Todo.TaskList> getListTasksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListTasks",
      requestType = org.example.grpc.Todo.Empty.class,
      responseType = org.example.grpc.Todo.TaskList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.grpc.Todo.Empty,
      org.example.grpc.Todo.TaskList> getListTasksMethod() {
    io.grpc.MethodDescriptor<org.example.grpc.Todo.Empty, org.example.grpc.Todo.TaskList> getListTasksMethod;
    if ((getListTasksMethod = ToDoServiceGrpc.getListTasksMethod) == null) {
      synchronized (ToDoServiceGrpc.class) {
        if ((getListTasksMethod = ToDoServiceGrpc.getListTasksMethod) == null) {
          ToDoServiceGrpc.getListTasksMethod = getListTasksMethod = 
              io.grpc.MethodDescriptor.<org.example.grpc.Todo.Empty, org.example.grpc.Todo.TaskList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ToDoService", "ListTasks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.grpc.Todo.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.grpc.Todo.TaskList.getDefaultInstance()))
                  .setSchemaDescriptor(new ToDoServiceMethodDescriptorSupplier("ListTasks"))
                  .build();
          }
        }
     }
     return getListTasksMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ToDoServiceStub newStub(io.grpc.Channel channel) {
    return new ToDoServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ToDoServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ToDoServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ToDoServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ToDoServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ToDoServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createTask(org.example.grpc.Todo.Task request,
        io.grpc.stub.StreamObserver<org.example.grpc.Todo.TaskResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateTaskMethod(), responseObserver);
    }

    /**
     */
    public void readTask(org.example.grpc.Todo.Task request,
        io.grpc.stub.StreamObserver<org.example.grpc.Todo.TaskResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getReadTaskMethod(), responseObserver);
    }

    /**
     */
    public void updateTask(org.example.grpc.Todo.Task request,
        io.grpc.stub.StreamObserver<org.example.grpc.Todo.TaskResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateTaskMethod(), responseObserver);
    }

    /**
     */
    public void deleteTask(org.example.grpc.Todo.Task request,
        io.grpc.stub.StreamObserver<org.example.grpc.Todo.TaskResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteTaskMethod(), responseObserver);
    }

    /**
     */
    public void listTasks(org.example.grpc.Todo.Empty request,
        io.grpc.stub.StreamObserver<org.example.grpc.Todo.TaskList> responseObserver) {
      asyncUnimplementedUnaryCall(getListTasksMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateTaskMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.grpc.Todo.Task,
                org.example.grpc.Todo.TaskResponse>(
                  this, METHODID_CREATE_TASK)))
          .addMethod(
            getReadTaskMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.grpc.Todo.Task,
                org.example.grpc.Todo.TaskResponse>(
                  this, METHODID_READ_TASK)))
          .addMethod(
            getUpdateTaskMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.grpc.Todo.Task,
                org.example.grpc.Todo.TaskResponse>(
                  this, METHODID_UPDATE_TASK)))
          .addMethod(
            getDeleteTaskMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.grpc.Todo.Task,
                org.example.grpc.Todo.TaskResponse>(
                  this, METHODID_DELETE_TASK)))
          .addMethod(
            getListTasksMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.grpc.Todo.Empty,
                org.example.grpc.Todo.TaskList>(
                  this, METHODID_LIST_TASKS)))
          .build();
    }
  }

  /**
   */
  public static final class ToDoServiceStub extends io.grpc.stub.AbstractStub<ToDoServiceStub> {
    private ToDoServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ToDoServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ToDoServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ToDoServiceStub(channel, callOptions);
    }

    /**
     */
    public void createTask(org.example.grpc.Todo.Task request,
        io.grpc.stub.StreamObserver<org.example.grpc.Todo.TaskResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateTaskMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void readTask(org.example.grpc.Todo.Task request,
        io.grpc.stub.StreamObserver<org.example.grpc.Todo.TaskResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getReadTaskMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateTask(org.example.grpc.Todo.Task request,
        io.grpc.stub.StreamObserver<org.example.grpc.Todo.TaskResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateTaskMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteTask(org.example.grpc.Todo.Task request,
        io.grpc.stub.StreamObserver<org.example.grpc.Todo.TaskResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteTaskMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listTasks(org.example.grpc.Todo.Empty request,
        io.grpc.stub.StreamObserver<org.example.grpc.Todo.TaskList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListTasksMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ToDoServiceBlockingStub extends io.grpc.stub.AbstractStub<ToDoServiceBlockingStub> {
    private ToDoServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ToDoServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ToDoServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ToDoServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.example.grpc.Todo.TaskResponse createTask(org.example.grpc.Todo.Task request) {
      return blockingUnaryCall(
          getChannel(), getCreateTaskMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.grpc.Todo.TaskResponse readTask(org.example.grpc.Todo.Task request) {
      return blockingUnaryCall(
          getChannel(), getReadTaskMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.grpc.Todo.TaskResponse updateTask(org.example.grpc.Todo.Task request) {
      return blockingUnaryCall(
          getChannel(), getUpdateTaskMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.grpc.Todo.TaskResponse deleteTask(org.example.grpc.Todo.Task request) {
      return blockingUnaryCall(
          getChannel(), getDeleteTaskMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.grpc.Todo.TaskList listTasks(org.example.grpc.Todo.Empty request) {
      return blockingUnaryCall(
          getChannel(), getListTasksMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ToDoServiceFutureStub extends io.grpc.stub.AbstractStub<ToDoServiceFutureStub> {
    private ToDoServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ToDoServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ToDoServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ToDoServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.grpc.Todo.TaskResponse> createTask(
        org.example.grpc.Todo.Task request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateTaskMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.grpc.Todo.TaskResponse> readTask(
        org.example.grpc.Todo.Task request) {
      return futureUnaryCall(
          getChannel().newCall(getReadTaskMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.grpc.Todo.TaskResponse> updateTask(
        org.example.grpc.Todo.Task request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateTaskMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.grpc.Todo.TaskResponse> deleteTask(
        org.example.grpc.Todo.Task request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteTaskMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.grpc.Todo.TaskList> listTasks(
        org.example.grpc.Todo.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getListTasksMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_TASK = 0;
  private static final int METHODID_READ_TASK = 1;
  private static final int METHODID_UPDATE_TASK = 2;
  private static final int METHODID_DELETE_TASK = 3;
  private static final int METHODID_LIST_TASKS = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ToDoServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ToDoServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_TASK:
          serviceImpl.createTask((org.example.grpc.Todo.Task) request,
              (io.grpc.stub.StreamObserver<org.example.grpc.Todo.TaskResponse>) responseObserver);
          break;
        case METHODID_READ_TASK:
          serviceImpl.readTask((org.example.grpc.Todo.Task) request,
              (io.grpc.stub.StreamObserver<org.example.grpc.Todo.TaskResponse>) responseObserver);
          break;
        case METHODID_UPDATE_TASK:
          serviceImpl.updateTask((org.example.grpc.Todo.Task) request,
              (io.grpc.stub.StreamObserver<org.example.grpc.Todo.TaskResponse>) responseObserver);
          break;
        case METHODID_DELETE_TASK:
          serviceImpl.deleteTask((org.example.grpc.Todo.Task) request,
              (io.grpc.stub.StreamObserver<org.example.grpc.Todo.TaskResponse>) responseObserver);
          break;
        case METHODID_LIST_TASKS:
          serviceImpl.listTasks((org.example.grpc.Todo.Empty) request,
              (io.grpc.stub.StreamObserver<org.example.grpc.Todo.TaskList>) responseObserver);
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

  private static abstract class ToDoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ToDoServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.example.grpc.Todo.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ToDoService");
    }
  }

  private static final class ToDoServiceFileDescriptorSupplier
      extends ToDoServiceBaseDescriptorSupplier {
    ToDoServiceFileDescriptorSupplier() {}
  }

  private static final class ToDoServiceMethodDescriptorSupplier
      extends ToDoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ToDoServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ToDoServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ToDoServiceFileDescriptorSupplier())
              .addMethod(getCreateTaskMethod())
              .addMethod(getReadTaskMethod())
              .addMethod(getUpdateTaskMethod())
              .addMethod(getDeleteTaskMethod())
              .addMethod(getListTasksMethod())
              .build();
        }
      }
    }
    return result;
  }
}
