package com.example.library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
public class BookController {
    @Autowired
    BookRepository bookRepository;
   

    @GetMapping(value="/")
    public String welcome(){
        return "index";
    }

    @GetMapping(value="/about")
    public String about(){
        return "about";
    }
    @GetMapping(value="/contact")
    public String contact(){
        return "contact";
    }
    @GetMapping(value="/login")
    public String login(){
        return "login";
    }

    @GetMapping(value = "/addBook")
    public String addBook(Model model){
        model.addAttribute("book", new Book());
        return "addBook";

    }
    @PostMapping(value = "/addBook")
    public String sumbitBook(@ModelAttribute Book book, Model model){
        model.addAttribute("book", book);
        System.out.println(book.toString());
        
		bookRepository.save(book);

        
        return "result";

    }

    @GetMapping(value = "/bookList")
    public String bookList(Model model){
        model.addAttribute("books", bookRepository.findAll());
        return "bookList";



    }
}

    


    

    

