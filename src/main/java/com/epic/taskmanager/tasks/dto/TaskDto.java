package com.epic.taskmanager.tasks.dto;

import lombok.Data;

@Data
public class TaskDto {
    String taskNumber;
    String taskFullName;
    String taskObject;
    String taskDescription;
    String taskType;
    int taskPriority;
    String project;
    String userNr;
    String token;
}
