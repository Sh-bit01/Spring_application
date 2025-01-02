package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Marks this class as a controller for handling REST API requests
public class HelloController {

     @Autowired
    private EmployeeService employeeService;

    @GetMapping("/data")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }    
}

