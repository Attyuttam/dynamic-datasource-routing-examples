package com.attyuttam.multitenancy.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import com.attyuttam.multitenancy.model.Employee;


@Repository
@Transactional
public interface EmployeeDAO extends CrudRepository<Employee,Integer> {

    List<Employee> findAll();  

}