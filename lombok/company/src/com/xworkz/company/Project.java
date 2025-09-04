package com.xworkz.company;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Project {
    private String projectName;
    private int projectId;
    private String domain;
    private String client;
    private double budget;

}
