package com.ems.model;

public class Manager extends Employee {
    public Manager(String id, String name, double salary) {
        super(id, name, salary, "Manager");
    }

    public void assignTask(String taskId, Employee employee, String description) {
        System.out.println(getName() + " assigned task " + taskId + " to " + employee.getName() + ": " + description);
    }

    public void approveLeave(Employee employee, boolean approved) {
        System.out.println(getName() + " " + (approved ? "approved" : "rejected") + " leave for " + employee.getName());
    }
}