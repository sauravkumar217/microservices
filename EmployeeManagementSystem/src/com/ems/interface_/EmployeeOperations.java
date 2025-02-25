package com.ems.interface_;

import com.ems.model.Employee;

public interface EmployeeOperations {
    void addEmployee(Employee employee);
    Employee getEmployee(String id);
    void updateEmployee(Employee employee);
}