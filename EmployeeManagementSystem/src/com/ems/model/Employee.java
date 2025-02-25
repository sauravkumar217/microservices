package com.ems.model;

public abstract class Employee {
    private String id;
    private String name;
    private double salary;
    private String role;

    public Employee(String id, String name, double salary, String role) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.role = role;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public double getSalary() { return salary; }
    public String getRole() { return role; }

    @Override
    public String toString() {
        return "Employee{id='" + id + "', name='" + name + "', salary=" + salary + ", role='" + role + "'}";
    }
}