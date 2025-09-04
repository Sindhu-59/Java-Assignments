package com.xworkz.institute;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@AllArgsConstructor
@Setter
public class Trainee {

        private String traineeName;
        private int traineeId;
        private String course;
        private String batch;
        private double fees;
}
