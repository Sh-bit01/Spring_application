package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Marks this class as a controller for handling REST API requests
public class HelloController {

    @GetMapping("/hello")  // Maps to /hello URL
    public String sayHello() {
        return "Hello, Spring Boot!";
    }
}

