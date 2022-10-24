package com.example.employeejpa.repository;

import com.example.employeejpa.model.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    Optional<Employee> findById(Integer id);
    List<Employee> findAll();

    @Query(value = "select * from employee " +
            "where time_in between '07:00' and '08:00'", nativeQuery = true)
    List<Employee> findByTimeIn();
}
