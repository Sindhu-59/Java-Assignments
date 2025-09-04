package com.xworkz.institute;

import com.xworkz.institute.Institute.Institute;

public class InstituteRunner {

    public static void main(String args[]) {

        Institute institute = new Institute();

        Trainee trainee1 = new Trainee();
        trainee1.setTraineeName("Arun");
        institute.addTrainee(trainee1);

        Trainee trainee2 = new Trainee();
        trainee2.setTraineeName("Kiran");
        institute.addTrainee(trainee2);

        Trainee trainee3 = new Trainee();
        trainee3.setTraineeName("Divya");
        institute.addTrainee(trainee3);

        Trainee trainee4 = new Trainee();
        trainee4.setTraineeName("Sanjay");
        institute.addTrainee(trainee4);

        Trainee trainee5 = new Trainee();
        trainee5.setTraineeName("Meena");
        institute.addTrainee(trainee5);

        Trainee trainee6 = new Trainee();
        trainee6.setTraineeName("Rahul");
        institute.addTrainee(trainee6);

        Trainee trainee7 = new Trainee();
        trainee7.setTraineeName("Sneha");
        institute.addTrainee(trainee7);

        Trainee trainee8 = new Trainee();
        trainee8.setTraineeName("Manoj");
        institute.addTrainee(trainee8);

        Trainee trainee9 = new Trainee();
        trainee9.setTraineeName("Asha");
        institute.addTrainee(trainee9);

        Trainee trainee10 = new Trainee();
        trainee10.setTraineeName("Varun");
        institute.addTrainee(trainee10);

        Trainee trainee11 = new Trainee();
        trainee11.setTraineeName("Ramesh");
        institute.addTrainee(trainee11);

        Trainee trainee12 = new Trainee();
        trainee12.setTraineeName("Geetha");
        institute.addTrainee(trainee12);

        Trainee trainee13 = new Trainee();
        trainee13.setTraineeName("Harish");
        institute.addTrainee(trainee13);

        Trainee trainee14 = new Trainee();
        trainee14.setTraineeName("Lakshmi");
        institute.addTrainee(trainee14);

        institute.getAllTraineeDetails();
    }
}
