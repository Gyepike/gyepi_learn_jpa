package com.workshop.gyepi_learn_jpa.controller;

import com.workshop.gyepi_learn_jpa.models.entity.EmployeeTwo;
import com.workshop.gyepi_learn_jpa.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
/*
  [
   {
     "name" : "Munyi",
     "age"  : 42,
     "designation" : "Dev"
   }
   ,
   {
     "name" : "Gyepike",
     "age"  : 40,
     "designation" : "Test"
   }
]
 */
@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;
    @PostMapping("/saveEmployees")
    public List<EmployeeTwo> saveEmployees(@RequestBody List<EmployeeTwo> employeeTwoList) {
        return employeeService.saveEmployeeData(employeeTwoList);
    }

    @PostMapping("/saveOneEmployee")
    public EmployeeTwo saveEmployees(@RequestBody EmployeeTwo employeeTwo) {
        return employeeService.saveEmployeeTwo(employeeTwo);
    }

}
