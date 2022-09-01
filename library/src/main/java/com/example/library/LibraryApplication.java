package com.example.library;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LibraryApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibraryApplication.class, args);
	}
	/** 
	@Bean
	ApplicationRunner init(BookRepository bookRepository){
		return args -> {
			BookService bookService = new BookService(bookRepository);
			bookService.addNewBook();
		};*/
	}


