package com.example.employeejpa.controller;

import com.example.employeejpa.model.entity.Employee;
import com.example.employeejpa.model.request.EmployeeRequest;
import com.example.employeejpa.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("employee")
public class EmployeeController {

    @Autowired
    private IEmployeeService service;

    @GetMapping("/{id}")
    ResponseEntity<Employee> get(@PathVariable(name = "id") Integer id) {
        return ResponseEntity.ok(service.getById(id));
    }

    @GetMapping
    ResponseEntity<List<Employee>> getAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @PostMapping
    ResponseEntity<Employee> create(@RequestBody EmployeeRequest request) {
        return ResponseEntity.ok(service.create(request));
    }

    @GetMapping("/time")
    ResponseEntity<List<Employee>> getByTimeIn() {
        return ResponseEntity.ok(service.getEmployeeByTime());
    }
}
