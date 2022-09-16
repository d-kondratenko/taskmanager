package com.epic.taskmanager.tasks.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class TaskComments {
    private Long commnetId;
    private Long taskid;
    String comment;
    private int userId;
    private LocalDateTime commentDate = LocalDateTime.now();
}
