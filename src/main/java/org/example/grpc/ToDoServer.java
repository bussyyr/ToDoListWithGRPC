package org.example.grpc;

import io.grpc.Server;
import io.grpc.netty.shaded.io.grpc.netty.NettyServerBuilder;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ToDoServer {
    private final Server server;

    public ToDoServer(final int port){
        this.server = NettyServerBuilder.forPort(port).addService(new ToDoServiceImpl()).build();
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        final ToDoServer server = new ToDoServer(8080);
        server.start();
        System.out.println( "Server running ..." );
        server.stabil();
    }

    public void start() throws IOException {
        server.start();
        Runtime.getRuntime( ).addShutdownHook( new Thread( )
        {

            @Override
            public void start( )
            {
                System.err.println( "Shutting down gRPC server since JVM is shutting down" );
                ToDoServer.this.stop( );
                System.err.println( "Server shut down" );
            }
        } );
    }

    public void stabil() throws InterruptedException {
        if(server != null){
            server.awaitTermination();
        }
    }

    public void stop(){
        if(server != null){
            server.shutdown();
        }
    }
}
