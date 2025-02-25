package com.ems.service;

import com.ems.interface_.TaskOperations;
import com.ems.model.Employee;
import com.ems.model.Manager; // Added import for Manager

public class TaskService implements TaskOperations {
    @Override
    public void assignTask(String taskId, Employee employee, String description) {
        if (employee instanceof Manager) {
            ((Manager) employee).assignTask(taskId, employee, description);
        } else {
            System.out.println("Task can only be assigned by a Manager");
        }
    }

    @Override
    public void trackTaskProgress(String taskId) {
        System.out.println("Tracking progress for task " + taskId);
    }
}