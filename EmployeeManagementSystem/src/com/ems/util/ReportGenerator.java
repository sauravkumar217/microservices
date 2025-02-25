package com.ems.util;

import com.ems.interface_.ReportingOperations;
import com.ems.model.Employee;

public class ReportGenerator {
    private final ReportingOperations reportingService;

    public ReportGenerator(ReportingOperations reportingService) {
        this.reportingService = reportingService;
    }

    public void generateReports(Employee employee) {
        reportingService.generatePayrollReport(employee);
        reportingService.generatePerformanceReport(employee);
    }
}