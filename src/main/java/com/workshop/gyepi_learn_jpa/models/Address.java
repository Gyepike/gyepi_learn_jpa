package com.workshop.gyepi_learn_jpa.models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /*
    @OneToOne
    @JoinColumn(name = "employee_id")  // BI ONE-To - ONE
    private EmployeeClass employee;
   */

    private String streetName;

    private String house;
}
