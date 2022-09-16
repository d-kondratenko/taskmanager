package com.epic.taskmanager.users.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
public class UserGroups {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private int userGroupId;
    private String userGroupNr;
    private boolean isAdmin;
    private boolean isManager;
    private boolean isClient;
    private int userCreated;
    private LocalDateTime dateCreated = LocalDateTime.now();
    private int userModifi = userCreated;
    private LocalDateTime dateModifi = LocalDateTime.now();
}
