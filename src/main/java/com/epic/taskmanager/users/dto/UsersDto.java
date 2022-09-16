package com.epic.taskmanager.users.dto;

import lombok.Data;

@Data
public class UsersDto {
    String userName;
    String password;
    String email;
    String userGroupNr;
    String userNr;
    String token;

}
