package com.epic.taskmanager.projects.services;

import com.epic.taskmanager.projects.dto.ProjectDto;
import com.epic.taskmanager.projects.entity.Project;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ProjectService {
    public void createProject(ProjectDto projectDto){}

    public ArrayList<Project> getAllProjects(){return null;}

    public Project getProject(Long projectId){ return null;}

    public Long getProjectId(String projentNr){
        return null;
    }

    public boolean chekProjectExists(String projectNr){
        return false;
    }

    public void updateProject(ProjectDto projectDto){}

    public void deleteProject(Long projectId){}
}
