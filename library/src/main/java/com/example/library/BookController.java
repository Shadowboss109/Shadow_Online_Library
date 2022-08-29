package com.example.library;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class BookController {
    @GetMapping(value="/")
    public String welcome(){
        return "index";
    }
    }
    

    

