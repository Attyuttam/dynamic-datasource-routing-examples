package com.attyuttam.dynamicdatasourcerouting.domain;

import javax.persistence.*;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "employee")
public class Employee {

    @Id                                                     // primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)     // auto increment
    @Column(name = "employeeId")
    private int employeeId;

    @Column(name = "employeeName")
    private String employeeName;

    @Column(name = "employeeRole")
    private String employeeRole;

}