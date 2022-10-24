package com.example.employeejpa.model.request;

import lombok.Data;

import java.time.LocalTime;

@Data
public class EmployeeRequest {
    private String name;
    private String position;
    private LocalTime timeIn;
    private LocalTime timeOut;
}
