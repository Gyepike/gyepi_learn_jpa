package com.workshop.gyepi_learn_jpa.service;

import com.workshop.gyepi_learn_jpa.models.entity.EmployeeTwo;
import com.workshop.gyepi_learn_jpa.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public List<EmployeeTwo> saveEmployeeData(List<EmployeeTwo> employeeTwoList) {
        return employeeRepository.saveAll(employeeTwoList);
    }

    public  EmployeeTwo saveEmployeeTwo(EmployeeTwo employeeTwo) {
        return employeeRepository.save(employeeTwo);
    }
}
