package com.epic.taskmanager.tasks.services;

import com.epic.taskmanager.tasks.dto.TaskStatusDto;
import com.epic.taskmanager.tasks.entity.TaskStatus;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class TaskStatusService {
    public void createTaskStatus(TaskStatusDto taskStatusDto){}
    public void updateTaskStatus(TaskStatusDto taskStatusDto){}
    public Long getTaskStatusId(String taskStatusNr){return null;}
    public void deleteTaskStatus(Long taskStatusId){}
    public ArrayList<TaskStatus> getAllTaskStatus(){return null;}
    public TaskStatus getTaskSatus(Long taskStatusId){return null;}
}
