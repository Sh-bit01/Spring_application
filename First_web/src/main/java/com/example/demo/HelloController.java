package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // Marks this class as a controller for handling REST API requests
public class HelloController {

    @GetMapping("/hii")  // Maps to /hello URL
    public String sayHello(Model model) {
            model.addAttribute("message", "Hello, Spring Boot!");

        return "user";
    }
}

