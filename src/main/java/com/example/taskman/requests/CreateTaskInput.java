package com.example.taskman.requests;

import com.example.taskman.entities.Task;
import com.example.taskman.entities.TaskStatusEnum;
import java.util.Date;

public class CreateTaskInput {
    private String name;
    private String description;
    private TaskStatusEnum status;
    private Date dueDate;

    public CreateTaskInput(String name, String description, TaskStatusEnum status, Date dueDate) {
        this.name = name;
        this.description = description;
        this.status = status;
        this.dueDate = dueDate;
    }
    public TaskStatusEnum getStatus() {
        return status;
    }
    public Task toTask() {
        Task task = new Task();

        task.setName(name)
                .setDescription(description)
                .setStatus(status)
                .setDueDate(dueDate);

        return task;
    }
}

