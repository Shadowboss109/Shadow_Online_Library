/** 
package com.example.library;
 
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
 

public class BookTest {
    @Bean
 
    public static void main(String[] args) {
        AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();
        appContext.scan("net.codejava.spring");
        appContext.refresh();
 
        BookService bookService = (BookService) appContext.getBean("bookService");
        bookService.addNewBook();;
 
        appContext.close();
    }
}
 */