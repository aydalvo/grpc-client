package com.grpc.grpc_client.book.service;

import com.proto.generated.employee.BookRequest;
import com.proto.generated.employee.BookResponse;
import com.proto.generated.employee.BookServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.stereotype.Service;


@Service
public class BookService {


    public void getBook() {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8090).usePlaintext().build();
        BookServiceGrpc.BookServiceBlockingStub stub = BookServiceGrpc.newBlockingStub(channel);
        BookResponse bookResponse = stub.getBook(BookRequest.newBuilder().setBookId("1").build());
        System.out.println(bookResponse);
        channel.shutdown();
    }
}
