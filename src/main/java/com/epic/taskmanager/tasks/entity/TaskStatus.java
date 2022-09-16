package com.epic.taskmanager.tasks.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TaskStatus {
    private Long taskStatusId;
    private String taskStatusNr;
    private int userCreated;
    private LocalDateTime dateCreated = LocalDateTime.now();
    private int userModified = userCreated;
    private LocalDateTime dateModified = LocalDateTime.now();
}
