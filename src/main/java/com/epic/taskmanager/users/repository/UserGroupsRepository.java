package com.epic.taskmanager.users.repository;

import com.epic.taskmanager.users.entity.UserGroups;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UserGroupsRepository extends JpaRepository<UserGroups, Integer> {

    @Query("select userGroupId from UserGroups where userGroupNr = ?1")
    Integer getUserGroupId(String userGroupNr);

    UserGroups findByUserGroupId(int userGroupId);

    boolean existsByUserGroupNr(String userGroupNr);


}