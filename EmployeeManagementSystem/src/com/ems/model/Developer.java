package com.ems.model;

public class Developer extends Employee {
    public Developer(String id, String name, double salary) {
        super(id, name, salary, "Developer");
    }

    public void writeCode(String project, String feature) {
        System.out.println(getName() + " is writing code for " + project + " - " + feature);
    }

    public void submitPullRequest(String project, String prId) {
        System.out.println(getName() + " submitted pull request " + prId + " for " + project);
    }
}