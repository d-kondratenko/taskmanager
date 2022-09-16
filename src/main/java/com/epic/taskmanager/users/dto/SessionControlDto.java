package com.epic.taskmanager.users.dto;

import lombok.Data;

import java.time.LocalDateTime;
@Data
public class SessionControlDto {
    int userId;
    String token;
    LocalDateTime curDateTime = LocalDateTime.now();

}
