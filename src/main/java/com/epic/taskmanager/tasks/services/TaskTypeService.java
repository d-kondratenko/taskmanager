package com.epic.taskmanager.tasks.services;

import com.epic.taskmanager.tasks.dto.TaskTypeDto;
import com.epic.taskmanager.tasks.entity.TaskTypes;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class TaskTypeService {
    public void createTaskType(TaskTypeDto taskTypeDto){}
    public void updateTaskType(TaskTypeDto taskTypeDto){}
    public Long getTaskTypeId(String taskTypeNr){return null;}
    public void deleteTaskId(Long taskTypeId){}
    public ArrayList<TaskTypes> getAllTaskTypes(){return null;}
    public TaskTypes getTaskType(Long taskTypeId){return null;}
}
