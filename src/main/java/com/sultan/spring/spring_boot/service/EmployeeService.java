package com.sultan.spring.spring_boot.service;



import com.sultan.spring.spring_boot.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEmployeeById(int id);

    public void deleteEmployee(int id);

    public List<Employee> findAllByName(String firstName);


}
