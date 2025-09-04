package com.xworkz.company;

import com.xworkz.company.company.Company;

public class CompanyRunner {


        public static void main(String args[]) {

            Company company = new Company();

            Project p1 = new Project();
            p1.setProjectName("E-Commerce Platform");
            company.addProject(p1);

            Project p2 = new Project();

            company.addProject(p2);

            Project p3 = new Project();
            p3.setProjectName("Healthcare Portal");

            company.addProject(p3);

            Project p4 = new Project();
            p4.setProjectName("Ride Sharing App");

            company.addProject(p4);

            Project p5 = new Project();
            p5.setProjectName("Hotel Booking System");

            company.addProject(p5);

            Project p6 = new Project();
            p6.setProjectName("Food Delivery App");

            company.addProject(p6);

            Project p7 = new Project();
            p7.setProjectName("Education Portal");

            company.addProject(p7);

            Project p8 = new Project();
            p8.setProjectName("Gaming Platform");

            company.addProject(p8);

            Project p9 = new Project();
            p9.setProjectName("Insurance App");

            company.addProject(p9);

            Project p10 = new Project();
            p10.setProjectName("Stock Trading App");

            company.addProject(p10);

            Project p11 = new Project();
            p11.setProjectName("Social Media App");

            company.addProject(p11);

            Project p12 = new Project();
            p12.setProjectName("Logistics Tracking");

            company.addProject(p12);

            Project p13 = new Project();
            p13.setProjectName("Smart City Project");

            company.addProject(p13);

            Project p14 = new Project();
            p14.setProjectName("Space Research Software");

            company.addProject(p14);
            company.getAllProjectDetails();
        }
    }


