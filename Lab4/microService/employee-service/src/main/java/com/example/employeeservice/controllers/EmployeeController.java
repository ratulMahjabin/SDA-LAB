package com.example.employeeservice.controllers;

import com.example.employeeservice.entities.Employee;
import com.example.employeeservice.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @PostMapping("/")
    public Employee saveEmployee(@RequestBody Employee employee){
        return employeeService.saveEmployee(employee);
    }
    @GetMapping("/{id}")
    public Employee findEmployeeById(@PathVariable("id") String employeeId){
        return employeeService.findEmployeeById(employeeId);
    }
}