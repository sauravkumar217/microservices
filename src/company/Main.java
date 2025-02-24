// Main.java (Testing)
package com.company;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("E123", "John Doe", "IT", 60000);

        EmployeeSalaryCalculator calculator = new EmployeeSalaryCalculator();
        double finalSalary = calculator.calculateSalary(employee, 5000, 0.2);

        EmployeePersistence persistence = new EmployeePersistence();
        persistence.saveToFile(employee, "employee.txt");

        EmployeePrinter printer = new EmployeePrinter();
        printer.printEmployeeDetails(employee);

        System.out.println("Final Salary after tax & bonus: $" + finalSalary);
    }
}
