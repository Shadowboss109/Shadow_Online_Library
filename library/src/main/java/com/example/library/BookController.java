package com.example.library;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class BookController {
   

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

    }

    


    

    

