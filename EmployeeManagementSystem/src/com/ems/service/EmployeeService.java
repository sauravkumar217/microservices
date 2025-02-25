package com.ems.service;

import com.ems.interface_.EmployeeOperations;
import com.ems.model.Employee;

import java.util.HashMap;
import java.util.Map;

public class EmployeeService implements EmployeeOperations {
    private final Map<String, Employee> employees;

    public EmployeeService() {
        this.employees = new HashMap<>();
    }

    @Override
    public void addEmployee(Employee employee) {
        employees.put(employee.getId(), employee);
        System.out.println("Added " + employee);
    }

    @Override
    public Employee getEmployee(String id) {
        return employees.get(id);
    }

    @Override
    public void updateEmployee(Employee employee) {
        if (employees.containsKey(employee.getId())) {
            employees.put(employee.getId(), employee);
            System.out.println("Updated " + employee);
        } else {
            System.out.println("Employee not found: " + employee.getId());
        }
    }
}