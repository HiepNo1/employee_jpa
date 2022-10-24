package com.example.employeejpa.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Table
@Entity
@Data
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String position;
    private LocalTime timeIn;
    private LocalTime timeOut;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
