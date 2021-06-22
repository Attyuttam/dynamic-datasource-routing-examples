package com.attyuttam.dynamicdatasourcerouting.infra.controller;

import java.util.List;

import com.attyuttam.dynamicdatasourcerouting.domain.Employee;
import com.attyuttam.dynamicdatasourcerouting.domain.EmployeeService;
import com.attyuttam.dynamicdatasourcerouting.infra.datasource.DataSourceContextHolder;
import com.attyuttam.dynamicdatasourcerouting.infra.datasource.DataSourceEnum;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class DetailsController {
    private final EmployeeService employeeService;
    
    @GetMapping(value="/getEmployeeDetails/{dataSourceType}" , produces=MediaType.APPLICATION_JSON_VALUE)
    public List<Employee> getAllEmployeeDetails(@PathVariable("dataSourceType") String dataSourceType){
        if(DataSourceEnum.DATASOURCE_TWO.toString().equals(dataSourceType)){
            DataSourceContextHolder.setBranchContext(DataSourceEnum.DATASOURCE_TWO);
        }else{
            DataSourceContextHolder.setBranchContext(DataSourceEnum.DATASOURCE_ONE);
        }
        return employeeService.getAllEmployeeDetails(); 
    }
}
