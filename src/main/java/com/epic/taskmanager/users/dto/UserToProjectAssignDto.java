package com.epic.taskmanager.users.dto;

import lombok.Data;

@Data
public class UserToProjectAssignDto {
    String userName;
    String projectNr;
    String userNr;
    String token;
}
