package com.epic.taskmanager.users.services;

import com.epic.taskmanager.users.dto.UserGroupsDto;
import com.epic.taskmanager.users.entity.UserGroups;
import com.epic.taskmanager.users.repository.UserGroupsRepository;
import com.epic.taskmanager.users.repository.UsersRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@AllArgsConstructor
public class UserGroupeService {

    private final UserGroupsRepository userGroupsRepository;
    private final UsersRepository usersRepository;

    public void createUserGroups(UserGroupsDto userGroupsDto){

        UserGroups group = UserGroups.builder()
                .userGroupNr(userGroupsDto.getUserGroupNr())
                .isAdmin(userGroupsDto.isAdmin())
                .isManager(userGroupsDto.isManager())
                .isClient(userGroupsDto.isClient())
                .userCreated(usersRepository.getUserId(userGroupsDto.getUserNr()))
                .userModifi(usersRepository.getUserId(userGroupsDto.getUserNr()))
                .dateCreated(LocalDateTime.now())
                .dateModifi(LocalDateTime.now())
                .build();

        userGroupsRepository.save(group);
    }

    public int getUserGroupId(String userGroupNr){
        return userGroupsRepository.getUserGroupId(userGroupNr);
    }

    public void updateUserGroup(UserGroupsDto userGroupsDto){
        int groupId = userGroupsRepository.getUserGroupId(userGroupsDto.getUserGroupNr());
        UserGroups userGroups = userGroupsRepository.findByUserGroupId(groupId);
        userGroups.setUserGroupNr(userGroupsDto.getUserGroupNr());
        userGroups.setAdmin(userGroupsDto.isAdmin());
        userGroups.setManager(userGroupsDto.isManager());
        userGroups.setClient(userGroupsDto.isClient());
        userGroups.setUserModifi(usersRepository.getUserId(userGroupsDto.getUserNr()));
        userGroups.setDateModifi(LocalDateTime.now());
        userGroupsRepository.save(userGroups);

    }

    public void deleteUserGroup(int groupId){
        userGroupsRepository.deleteById(groupId);
    }

    public List<UserGroups> getAllUserGroups(){
        return userGroupsRepository.findAll();
    }

    public UserGroups getUserGroup(int userGroupId){
        return userGroupsRepository.findByUserGroupId(userGroupId);
    }
}
