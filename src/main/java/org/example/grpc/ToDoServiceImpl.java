package org.example.grpc;

import io.grpc.stub.StreamObserver;

import java.util.ArrayList;
import java.util.List;

public class ToDoServiceImpl extends ToDoServiceGrpc.ToDoServiceImplBase{

    private final List<Todo.Task> tasks = new ArrayList<>();


    @Override
    public void createTask(Todo.Task request, StreamObserver<Todo.TaskResponse> responseObserver) {
        tasks.add(request);
        Todo.TaskResponse.Builder response = Todo.TaskResponse.newBuilder();
        response.setResponseMessage("Task added successfully!");
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }

    @Override
    public void readTask(Todo.Task request, StreamObserver<Todo.TaskResponse> responseObserver) {
        Todo.TaskResponse.Builder response = Todo.TaskResponse.newBuilder();
        boolean isFound = false;

        for(int i = 0; i < tasks.size(); i++){
            Todo.Task task = tasks.get(i);
            if(task.getTaskID().equals(request.getTaskID())){
                response.setResponseMessage("Description for Task " + task.getTaskID() + ": " + task.getDescription());
                isFound = true;
                break;
            }
        }

        if(!isFound){
            response.setResponseMessage("There is no such a task!");
        }
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }

    @Override
    public void updateTask(Todo.Task request, StreamObserver<Todo.TaskResponse> responseObserver) {
        super.updateTask(request, responseObserver);
    }

    @Override
    public void deleteTask(Todo.Task request, StreamObserver<Todo.TaskResponse> responseObserver) {

        Todo.TaskResponse.Builder response = Todo.TaskResponse.newBuilder();
        boolean isRemoved = false;

        for(int i = 0; i < tasks.size(); i++){
            Todo.Task task = tasks.get(i);
            if(task.getTaskID().equals(request.getTaskID())){
                tasks.remove(i);
                response.setResponseMessage("Task deleted successfully!");
                isRemoved = true;
                break;
            }
        }

        if(!isRemoved){
            response.setResponseMessage("There is no such a task!");
        }
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();


    }

    @Override
    public void listTasks(Todo.Empty request, StreamObserver<Todo.TaskList> responseObserver) {
        Todo.TaskList.Builder taskListBuilder = Todo.TaskList.newBuilder();
        taskListBuilder.addAllTasks(tasks);
        responseObserver.onNext(taskListBuilder.build());
        responseObserver.onCompleted();
    }
}
