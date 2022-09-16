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
public class TaskTypes {
    private Long taskTypeId;
    private String taskTypeNr;
    private int userCreated;
    private LocalDateTime dateCreated = LocalDateTime.now();
    private int userModifi = userCreated;
    private LocalDateTime dateModifi = LocalDateTime.now();
}
