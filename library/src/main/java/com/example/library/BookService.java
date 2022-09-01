
package com.example.library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    private final BookRepository bookRepository;
        
        
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

        public void addNewBook(Book book) {
            /** 
            Book book=new Book();
            book.setAuthor("author");
            book.category("category");
            book.setEdition("1");
            book.setName("name");
            book.setIsbn(12334L);
            book.setYear(1995);
            book.setSummary("summary");*/
            bookRepository.save(book);
        }


    

}
