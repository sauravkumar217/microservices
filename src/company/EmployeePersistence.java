// EmployeePersistence.java
package com.company;

import java.io.FileWriter;
import java.io.IOException;

public class EmployeePersistence {
    public void saveToFile(Employee employee, String filename) {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write("Employee ID: " + employee.getId() + "\n");
            writer.write("Name: " + employee.getName() + "\n");
            writer.write("Department: " + employee.getDepartment() + "\n");
            writer.write("Base Salary: $" + employee.getBaseSalary() + "\n");
        } catch (IOException e) {
            System.out.println("Error saving employee: " + e.getMessage());
        }
    }
}
