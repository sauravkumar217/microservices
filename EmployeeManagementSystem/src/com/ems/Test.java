package com.ems;

import com.ems.model.Developer;
import com.ems.model.Manager;
import com.ems.model.SecurityGuard;
import com.ems.service.EmployeeService;
import com.ems.service.SecurityService;
import com.ems.service.TaskService;
import com.ems.service.ReportingService; // Added import for ReportingService
import com.ems.util.ReportGenerator;

public class Test {
    public static void main(String[] args) {
        // Initialize services with dependency injection
        EmployeeService employeeService = new EmployeeService();
        TaskService taskService = new TaskService();
        SecurityService securityService = new SecurityService();
        ReportingService reportingService = new ReportingService(); // Create ReportingService instance
        ReportGenerator reportGenerator = new ReportGenerator(reportingService); // Use ReportingService

        // Create employees
        Manager manager = new Manager("M001", "Alice Smith", 80000);
        Developer developer = new Developer("D001", "Bob Johnson", 60000);
        SecurityGuard securityGuard = new SecurityGuard("SG001", "Charlie Brown", 50000);

        // Add employees to the system (SRP, DIP)
        employeeService.addEmployee(manager);
        employeeService.addEmployee(developer);
        employeeService.addEmployee(securityGuard);

        // Manager assigns a task (SRP, OCP)
        taskService.assignTask("T001", developer, "Develop login feature");

        // Developer works on the task (SRP)
        developer.writeCode("Employee Portal", "Login Feature");
        developer.submitPullRequest("Employee Portal", "PR-001");

        // Security guard monitors premises (SRP, ISP)
        securityService.monitorPremises("Main Entrance");
        securityService.logAccess("D001", true);

        // Generate reports (OCP, DIP)
        reportGenerator.generateReports(manager);
        reportGenerator.generateReports(developer);
        reportGenerator.generateReports(securityGuard);
    }
}