package com.xworkz.institute;

import com.xworkz.institute.constants.Course;
import java.util.Scanner;

public class InstituteRunner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of trainees:");
        int size = sc.nextInt();

        Institute institute = new Institute(size);

        for (int i = 0; i < size; i++) {
            Trainee trainee = new Trainee();

            System.out.println("Enter Trainee Id:");
            trainee.setTraineeId(sc.nextInt());

            System.out.println("Enter Trainee Name:");
            trainee.setName(sc.next());

            System.out.println("Enter Trainee Age:");
            trainee.setAge(sc.nextInt());

            System.out.println("Enter Course name:");
            String courseInput = sc.next();
            Course course = Course.valueOf(courseInput.toUpperCase());
            trainee.setCourse(course);


            System.out.println("Enter Batch ");
            trainee.setBatch(sc.next());

            institute.addTrainee(trainee);
        }
        System.out.println(" All Trainees ");
        institute.getAllTraineeDetails();


        System.out.println("Enter trainee name to get course:");
        String name = sc.next();
        System.out.println("Course: " + institute.getCourseByName(name));

        System.out.println("\nEnter trainee id to update age:");
        int id = sc.nextInt();

        System.out.println("Enter new age:");
        int age = sc.nextInt();


        }
}
