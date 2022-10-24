package com.example.employeejpa.service;

import com.example.employeejpa.model.entity.Employee;
import com.example.employeejpa.model.request.EmployeeRequest;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IEmployeeService {
    Employee getById(Integer id);
    List<Employee> findAll();
    Employee create(EmployeeRequest employeeRequest);
    List<Employee> getEmployeeByTime();
}
