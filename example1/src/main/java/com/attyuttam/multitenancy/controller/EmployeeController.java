package com.attyuttam.multitenancy.controller;


import com.attyuttam.multitenancy.dao.EmployeeDAO;
import com.attyuttam.multitenancy.model.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeDAO employeeDAO;

    @RequestMapping(value = "emploeeList")
    public java.util.List<Employee> emploeeList() {
        return employeeDAO.findAll();
    }

}