package com.mohan.employee_docker_demo.service;

import com.mohan.employee_docker_demo.entity.Employee;

import java.util.List;

public interface EmployeeService {

    Employee saveEmployee(Employee employee);

    List<Employee> getAllEmployees();

}
