package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.*;


@Controller // Marks this class as a controller for handling REST API requests
public class HelloController {

    @GetMapping("/calc")  // Maps to /hello URL
    public String sayHello(Model model) {
         //model.addAttribute("message", "Hello, Spring Boot!");
        return "user";
    }
    
    @GetMapping("/add")
    public String add(@RequestParam double num1, @RequestParam double num2, Model model) {
        double result = num1 + num2;
        
        return "The sum of " + num1 + " and " + num2 + " is " + result;
    }

    // Example: POST /mul
    @PostMapping("/mul")
    public String mul(@RequestBody Data request, Model model) {
        double num1 = Double.parseDouble(request.getNum1());
        double num2 = Double.parseDouble(request.getNum2());
        double res = num1 * num2;
    	model.addAttribute("message", "Mul");    	    	
    	model.addAttribute("res", res);    	
        return "result";
    }
    
    // Example: POST /sub
    @PostMapping(value = "/sub", consumes = "application/x-www-form-urlencoded")
    public String sub(@RequestBody Data request, Model model) {
        double res = Double.parseDouble(request.getNum1()) - Double.parseDouble(request.getNum2());
    model.addAttribute("message", "Subtraction Result");
    model.addAttribute("res", res);
    return "result";
    }
    // Example: POST /div
    @PostMapping("/div")
    public String div(@RequestBody Data request, Model model) {

        double res = Double.parseDouble(request.getNum1()) / Double.parseDouble(request.getNum2());
    	model.addAttribute("message", "div");    	    	
    	model.addAttribute("res", res);    	
        return "result";
    }
}

