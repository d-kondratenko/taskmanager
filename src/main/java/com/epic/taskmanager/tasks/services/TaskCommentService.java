package com.epic.taskmanager.tasks.services;

import com.epic.taskmanager.tasks.dto.TaskCommentDto;
import com.epic.taskmanager.tasks.entity.TaskComments;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class TaskCommentService {
    public void createComment(TaskCommentDto taskCommentDto){}

    public ArrayList<TaskComments> getAllCommentForTask(Long taskId){return null;}
}
