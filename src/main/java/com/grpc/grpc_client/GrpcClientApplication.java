package com.grpc.grpc_client;


import com.grpc.grpc_client.book.service.BookService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class GrpcClientApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(GrpcClientApplication.class, args);
		BookService service = applicationContext.getBean(BookService.class);
		service.getBook();
	}

}
