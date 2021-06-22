package com.attyuttam.dynamicdatasourcerouting.domain;

import java.util.List;

import com.attyuttam.dynamicdatasourcerouting.application.exception.EmployeeDetailsNotFoundException;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployeeDetails(){
        try{
            return employeeRepository.findAll();
        }catch(RuntimeException ex){
            throw new EmployeeDetailsNotFoundException("Could not find all employee details "+ex.getMessage());
        }
    }
}
