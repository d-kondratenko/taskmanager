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
import java.util.Objects;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userId;
    private String userNr;
    private String password;
    private String email;
    private int userGroupId;
    private boolean isActive;
    private String activationCode;
    private int userCreated;
    private LocalDateTime dateCreated = LocalDateTime.now();
    private int userModifi = userCreated;
    private LocalDateTime dateModifi = LocalDateTime.now();

    @Override
    public int hashCode() {
        return Objects.hash(userId,userNr,password);
    }
}
