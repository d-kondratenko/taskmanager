package com.epic.taskmanager.projects.services;

import com.epic.taskmanager.projects.dto.ProjectTypesDto;
import com.epic.taskmanager.projects.entity.ProjectTypes;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.util.ArrayList;

@Service
@Slf4j
@AllArgsConstructor
public class ProjectTypeService {
    public void createProjectType(ProjectTypesDto projectTypesDto){}

    public ArrayList<ProjectTypes> getAllProjectType(){ return null;}

    public ProjectTypes getProjectType(){return null;}

    public Long getProjectTypeId(String projectTypeNr){return null;}

    public boolean chekProjectTypeExists(String projectTypeNr) {return false;}

    public void updateProjectType(ProjectTypesDto projectTypesDto){}

    public void deleteProjectType(Long projectTypeId){}

}
