// EmployeePrinter.java
package com.company;

public class EmployeePrinter {
    public void printEmployeeDetails(Employee employee) {
        System.out.println("Employee Details:");
        System.out.println("ID: " + employee.getId());
        System.out.println("Name: " + employee.getName());
        System.out.println("Department: " + employee.getDepartment());
        System.out.println("Base Salary: $" + employee.getBaseSalary());
    }
}
