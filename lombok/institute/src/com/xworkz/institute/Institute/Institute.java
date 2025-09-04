package com.xworkz.institute.Institute;

import com.xworkz.institute.Trainee;

public class Institute {

        Trainee[] trainees = new Trainee[14];

        int index;
        private Trainee trainee;

        public boolean addTrainee(Trainee trainee) {
            boolean isAdded = false;

            if (trainee != null) {
                trainees[index++] = trainee;
                isAdded = true;
            }
            return isAdded;
        }

        public void getAllTraineeDetails() {
            System.out.println("The Trainee Details are: ");
            for (Trainee trainee : trainees) {
                System.out.println("Trainee Name: " + trainee.getTraineeName());
            }

        }

}
