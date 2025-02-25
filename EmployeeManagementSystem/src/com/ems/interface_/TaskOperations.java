package com.ems.interface_;
import com.ems.model.Employee;

public interface TaskOperations {
    void assignTask(String taskId, Employee employee, String description);
    void trackTaskProgress(String taskId);
}