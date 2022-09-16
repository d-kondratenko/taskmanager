package com.epic.taskmanager.projects.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Project {
    private Long projectId;
    private String projectName;
    private String projectDescription;
    private int userCreated;
    private LocalDateTime dateCreated = LocalDateTime.now();
    private int userModified;
    private LocalDateTime dateModified = LocalDateTime.now();
}
