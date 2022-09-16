package com.epic.taskmanager.tasks.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Task {
    private Long taskId;
    private String taskNumber;
    private String taskFullName;
    private String taskObject;
    private String taskDescription;
    private int taskType;
    private int taskPriority;
    private int project;
    private String taskStatus;

    private int userCreated;
    private LocalDateTime dateCreated = LocalDateTime.now();
    private int userModified = userCreated;
    private LocalDateTime dateModified = LocalDateTime.now();
}
