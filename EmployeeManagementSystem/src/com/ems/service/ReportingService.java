package com.ems.service;

import com.ems.interface_.ReportingOperations;
import com.ems.model.Employee;

public class ReportingService implements ReportingOperations {
    @Override
    public void generatePayrollReport(Employee employee) {
        System.out.println("Payroll Report for " + employee.getName() + ": Salary = $" + employee.getSalary());
    }

    @Override
    public void generatePerformanceReport(Employee employee) {
        System.out.println("Performance Report for " + employee.getName() + ": Role = " + employee.getRole());
    }
}