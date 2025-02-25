package com.ems.interface_;

import com.ems.model.Employee;

public interface ReportingOperations {
    void generatePayrollReport(Employee employee);
    void generatePerformanceReport(Employee employee);
}