package com.xworkz.company.company;

import com.xworkz.company.Project;

public class Company {


        Project[] projects = new Project[15];
        int index;

        public boolean addProject(Project project) {
            boolean isAdded = false;

            if (project != null && index < projects.length) {
                projects[index++] = project;
                isAdded = true;
            }
            return isAdded;
        }

        public void getAllProjectDetails() {
            System.out.println("The Project Details are: ");
            for (Project project : projects);
                System.out.println("Project Name: " + project.getProjectName());

        }
    }

