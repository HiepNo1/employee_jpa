package com.example.employeejpa.service;

import com.example.employeejpa.model.entity.Employee;
import com.example.employeejpa.model.request.EmployeeRequest;
import com.example.employeejpa.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

    @Autowired
    private EmployeeRepository repository;
    @Override
    public Employee getById(Integer id) {
        return repository.findById(id).get();
    }

    @Override
    public List<Employee> findAll() {
        return repository.findAll();
    }

    @Override
    public Employee create(EmployeeRequest employeeRequest) {
        Employee employee = new Employee();
        employee.setName(employeeRequest.getName());
        employee.setPosition(employeeRequest.getPosition());
        employee.setTimeIn(employeeRequest.getTimeIn());
        employee.setTimeOut(employeeRequest.getTimeOut());
        repository.save(employee);
        return employee;
    }

    @Override
    public List<Employee> getEmployeeByTime() {
        return repository.findByTimeIn();
    }
}
