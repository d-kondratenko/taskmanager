package com.epic.taskmanager.users.dto;

import lombok.Data;

@Data
public class UserGroupsDto {
     String userGroupNr;
     boolean isAdmin;
     boolean isManager;
     boolean isClient;
     String userNr;
     String token;
}
