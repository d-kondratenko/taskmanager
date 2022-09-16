package com.epic.taskmanager.tasks.services;

import com.epic.taskmanager.tasks.dto.TaskDto;
import com.epic.taskmanager.tasks.entity.Task;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class TaskService {
    public void createTask(TaskDto taskDto){}
    public void changeTaskStatus(Long taskId, Long newStatus, int userId){}
    public ArrayList<Task> getAllTaskForProjects(Long projectId){return null;}
    public Task getTask(Long taskId){return null;}
    public ArrayList<Task> getAllTaskForProjectAndStatus(Long projectId, Long taskStatusId){return null;}
    public ArrayList<Task> getAllTaskForProjectAndTaskType(Long projectId, Long taskTypeId){return null;}

}
