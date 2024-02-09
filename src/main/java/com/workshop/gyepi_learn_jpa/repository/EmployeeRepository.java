package com.workshop.gyepi_learn_jpa.repository;

import com.workshop.gyepi_learn_jpa.models.entity.EmployeeTwo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<EmployeeTwo,Long> {
}
