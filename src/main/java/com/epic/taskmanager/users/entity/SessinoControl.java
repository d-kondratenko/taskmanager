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
public class SessinoControl {
    private Long sessionId;
    private int userId;
    private String token;
    private LocalDateTime dateCreated;
    private LocalDateTime dateExpired;
}
