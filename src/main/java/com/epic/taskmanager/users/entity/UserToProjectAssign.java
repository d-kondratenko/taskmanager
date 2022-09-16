package com.epic.taskmanager.users.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class UserToProjectAssign {
    private Long assignId;
    private int userId;
    private Long projectId;
    private int userCreated;
    private LocalDateTime dateCreated = LocalDateTime.now();
    private int userModifi = userCreated;
    private LocalDateTime dateModifi = LocalDateTime.now();
}
