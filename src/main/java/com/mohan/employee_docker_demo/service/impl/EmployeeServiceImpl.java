package com.mohan.employee_docker_demo.service.impl;

import com.mohan.employee_docker_demo.entity.Employee;
import com.mohan.employee_docker_demo.repository.EmployeeRepository;
import com.mohan.employee_docker_demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository repo;

    @Override
    public Employee saveEmployee(Employee employee) {
        return repo.save(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return repo.findAll();
    }
}
