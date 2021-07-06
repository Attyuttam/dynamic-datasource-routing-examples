package com.attyuttam.dynamicdatasourcerouting.application.exception;

public class EmployeeDetailsNotFoundException extends RuntimeException{
    public EmployeeDetailsNotFoundException(String message){
        super(message);
    }
    
}
