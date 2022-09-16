package com.epic.taskmanager.tasks.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class TaskCommentDto {
    Long taskId;
    String comment;
    String userNr;
    String token;

}
