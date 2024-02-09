package com.workshop.gyepi_learn_jpa.models.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class EmployeeTwo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long empid;

    private String name;

    private Integer age;

    @Column(name = "PHONE_NUMBER")
    private Long phoneNumber = (long) (Math.random()*Math.pow(10,10));

    private String designation;

    private Double salary = Math.random()*100000;
}
