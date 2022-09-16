package com.epic.taskmanager.users.controllers;

import com.epic.taskmanager.users.controllers.records.groups.GroupId;
import com.epic.taskmanager.users.dto.UserGroupsDto;
import com.epic.taskmanager.users.entity.UserGroups;
import com.epic.taskmanager.users.services.UserGroupeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("taskmanager/user")
@AllArgsConstructor
public class UserGroupController {
    private UserGroupeService userGroupeService;

    @PostMapping("/creategroup")
    public String createGroup(@RequestBody UserGroupsDto userGroupsDto) {
        try {
            userGroupeService.createUserGroups(userGroupsDto);
            return "Group: " + userGroupsDto.getUserGroupNr() + " was be created";
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    @PostMapping("/updategroup")
    public String updateGroup(@RequestBody UserGroupsDto userGroupsDto){
        try{
            userGroupeService.updateUserGroup(userGroupsDto);
            return "Group: " + userGroupsDto.getUserGroupNr() + " was be updated";
        } catch (Exception e){
            return e.getMessage();
        }
    }

    @PostMapping("/deletegroup")
    public String deleteGroup(@RequestBody GroupId groupId){
        try{
            userGroupeService.deleteUserGroup(groupId.groupId());
            return "Group was be deleted";
        } catch (Exception e){
            return e.getMessage();
        }
    }

    @GetMapping("/allgroups")
    public List<UserGroups> getAllGroups(){
        return userGroupeService.getAllUserGroups();
    }

    @GetMapping("/getgroup")
    public UserGroups getGroup(@RequestBody GroupId groupId){
        return userGroupeService.getUserGroup(groupId.groupId());
    }
}


