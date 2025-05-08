package com.sultan.spring.spring_boot.dao;

import com.sultan.spring.spring_boot.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface EmployeeRepository  extends JpaRepository<Employee, Integer> {
    List<Employee> findAllByName(String name);
}

