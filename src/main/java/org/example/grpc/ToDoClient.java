package org.example.grpc;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class ToDoClient {
    private final ManagedChannel channel;
    private final ToDoServiceGrpc.ToDoServiceBlockingStub blockingStub;

    public ToDoClient(final String host, final int port){
        channel = ManagedChannelBuilder.forAddress(host, port).usePlaintext( ).build( );
        blockingStub = ToDoServiceGrpc.newBlockingStub(channel);
    }

    public void run(){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Add Task");
            System.out.println("2. Get Task Description by ID");
            System.out.println("3. Rearrange Task");
            System.out.println("4. Delete Task");
            System.out.println("5. List Tasks");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            String choice = scanner.nextLine();

            switch (choice){
                case "1":
                    System.out.print("Enter task ID: ");
                    String taskId = scanner.nextLine();
                    System.out.print("Enter task description: ");
                    String description = scanner.nextLine();
                    Todo.Task newTask = Todo.Task.newBuilder().
                            setTaskID(taskId).setDescription(description).build();
                    Todo.TaskResponse createTaskResponse = blockingStub.createTask(newTask);
                    System.out.println(createTaskResponse.getResponseMessage());
                    break;
                case "2":
                    System.out.print("Enter task ID: ");
                    taskId = scanner.nextLine();
                    Todo.Task getTask = Todo.Task.newBuilder().
                            setTaskID(taskId).build();
                    Todo.TaskResponse getTaskResponse = blockingStub.readTask(getTask);
                    System.out.println(getTaskResponse.getResponseMessage());
                    break;
                case "3":
                    System.out.println("Enter task ID: ");
                    taskId = scanner.nextLine();
                    Todo.Task updateTask = Todo.Task.newBuilder().
                            setTaskID(taskId).build();
                    Todo.TaskResponse updateTaskResponse = blockingStub.updateTask(updateTask);
                    System.out.println(updateTaskResponse.getResponseMessage());
                    break;
                case "4":
                    System.out.print("Enter task ID to remove: ");
                    String removeId = scanner.nextLine();
                    Todo.Task rTask = Todo.Task.newBuilder().
                            setTaskID(removeId).build();
                    Todo.TaskResponse deleteTaskResponse = blockingStub.deleteTask(rTask);
                    System.out.println(deleteTaskResponse.getResponseMessage());
                    break;
                case "5":
                    Todo.TaskList taskList = blockingStub.listTasks(Todo.Empty.newBuilder().build());
                    if(taskList.getTasksList().size() > 0){
                        System.out.println("Tasks:");
                        for(Todo.Task task : taskList.getTasksList()){
                            System.out.println("ID: " + task.getTaskID() + "\nDescription: " + task.getDescription());
                        }
                    }else{
                        System.out.println("There is no task!");
                    }
                    break;
                case "6":
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
    }
}

    public void shutdown( ) throws InterruptedException
    {
        channel.shutdown( ).awaitTermination( 5, TimeUnit.SECONDS );
    }

    public static void main(String[] args) throws InterruptedException {
        final ToDoClient client = new ToDoClient("localhost", 8080);
        try{
            client.run();
        }finally {
            client.shutdown();
        }
    }
}
