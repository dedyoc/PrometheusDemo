package com.example.taskman.requests;

import com.example.taskman.entities.TaskStatusEnum;
import java.util.Date;

public class UpdateTaskInput {
    private TaskStatusEnum status;
    private Date dueDate;

    public UpdateTaskInput(TaskStatusEnum status, Date dueDate) {
        this.status = status;
        this.dueDate = dueDate;
    }

    public TaskStatusEnum getStatus() {
        return status;
    }

    public Date getDueDate() {
        return dueDate;
    }

    // Add getter and setter methods for dueDate if needed

    // Additional methods and class members can also be defined here
}
