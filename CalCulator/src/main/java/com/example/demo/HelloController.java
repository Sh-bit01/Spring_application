package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin(origins = "http://localhost:5500")
public class HelloController {

        
    @PostMapping("/add")
    public Response add(@RequestBody Request request) {	
	double result = 0;
	
	switch (request.getCalculation().toLowerCase()) {
            case "add":
                result = request.getNum1() + request.getNum2();
                break;
            case "sub":
                result = request.getNum1() - request.getNum2();
                break;
            case "mul":
                result = request.getNum1() * request.getNum2();
                break;            
            case "div":
                result = request.getNum1() / request.getNum2();
                break;
            default:
                throw new IllegalArgumentException("Unsupported operation: " + request.getCalculation());
        }
	
	
        return new Response(result);

}
}

