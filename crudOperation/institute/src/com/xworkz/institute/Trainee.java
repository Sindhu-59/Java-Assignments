package com.xworkz.institute;

import com.xworkz.institute.constants.Course;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Trainee {
    private int traineeId;
    private String name;
    private int age;
    private Course course;
    private String batch;
}
