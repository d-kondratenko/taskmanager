package com.epic.taskmanager.tasks.services;

import com.epic.taskmanager.tasks.dto.TaskPriorityDto;
import com.epic.taskmanager.tasks.entity.TaskPriority;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class TaskPriorityService {

    public void createTaskPriority(TaskPriorityDto taskPriorityDto){}
    public boolean checkTaskPriorityExists(String priorityNr){return false;}
    public void updateTaslPriority(TaskPriorityDto taskPriorityDto){}
    public Long getTaskPriorytiId(String priorityNr){return null;}
    public void deleteTaskPriority(Long taskPriorityId){}
    public ArrayList<TaskPriority> getAllTaskPriority() {return null;}
    public TaskPriority getTaskPriority(Long taskPriorityId){return null;}
}
