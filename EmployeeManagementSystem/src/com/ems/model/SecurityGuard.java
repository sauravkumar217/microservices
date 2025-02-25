package com.ems.model;

public class SecurityGuard extends Employee {
    public SecurityGuard(String id, String name, double salary) {
        super(id, name, salary, "SecurityGuard");
    }

    public void monitorPremises(String location) {
        System.out.println(getName() + " is monitoring " + location);
    }

    public void logAccess(String employeeId, boolean authorized) {
        System.out.println(getName() + " logged access for employee " + employeeId + ": " + (authorized ? "Authorized" : "Unauthorized"));
    }
}