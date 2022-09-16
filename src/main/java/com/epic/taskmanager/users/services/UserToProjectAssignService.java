package com.epic.taskmanager.users.services;

import com.epic.taskmanager.users.dto.UserToProjectAssignDto;
import com.epic.taskmanager.users.entity.UserToProjectAssign;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class UserToProjectAssignService {
    public boolean chekAssign(int userId, Long projectId){
        return false;
    }

    public void createAssign(UserToProjectAssignDto assignDto){
    }

    public void updateAssign(UserToProjectAssignDto assignDto){
    }

    public void deleteAssign(Long assginId){
    }

    public Long getAsignId(int userId, Long projctId){
        return null;
    }

    public ArrayList<UserToProjectAssign> getAllAssign(){return null;}

    public UserToProjectAssign getAssign(Long assignId){return null;}
}
