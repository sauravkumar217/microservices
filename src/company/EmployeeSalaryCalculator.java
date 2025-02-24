// EmployeeSalaryCalculator.java
package com.company;

public class EmployeeSalaryCalculator {
    public double calculateSalary(Employee employee, double bonus, double taxRate) {
        double grossSalary = employee.getBaseSalary() + bonus;
        double tax = grossSalary * taxRate;
        return grossSalary - tax;
    }
}
