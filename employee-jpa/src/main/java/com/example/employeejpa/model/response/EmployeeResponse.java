package com.example.employeejpa.model.response;

import java.time.LocalTime;

public interface EmployeeResponse {
    Integer getId();
    String getName();
    String getPosition();
    LocalTime getTimeIn();
    LocalTime getTimeOut();
}
