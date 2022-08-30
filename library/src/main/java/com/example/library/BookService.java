
package com.example.library;

import org.springframework.beans.factory.annotation.Autowired;

public class BookService {
        private final BookRepository bookRepository;
        
        @Autowired
        public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

        public void addNewStudent(Book book) {
            bookRepository.save(book);
        }


    

}
