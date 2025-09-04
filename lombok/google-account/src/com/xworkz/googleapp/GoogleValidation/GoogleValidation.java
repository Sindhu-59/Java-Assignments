package com.xworkz.googleapp.GoogleValidation;

import com.xworkz.googleapp.Google.Google;

public class GoogleValidation {

    Google google;

    public boolean createGoogle(Google google) {
        boolean createGoogle = false;
        boolean isfirstNameValid = false;
        if (google.getFirstName() != null) {
            isfirstNameValid = true;
        } else
            System.out.println("The first name is invalid");

        boolean islastNameValid = false;
        if (google.getLastName() != null) {
            islastNameValid = true;
        } else
            System.out.println("The last name is invalid");

        boolean isgenderValid = false;
        if (google.getGender() != null) {
            isgenderValid = true;
        } else
            System.out.println("The gender is invalid");

        boolean isdobValid = false;
        if (google.getDob() != null) {
            isdobValid = true;
        } else
            System.out.println("The dob is invalid");

        boolean isphnoValid = false;
        if (google.getPhno() != 0) {
            isphnoValid = true;
        } else
            System.out.println("The phno is invalid");

        if (isfirstNameValid && islastNameValid && isgenderValid && isdobValid && isphnoValid) {
            createGoogle = true;
            this.google = google;

        }
        return createGoogle;
    }

    public void displayInfo() {
        System.out.println("The first name is :" + google.getFirstName());
        System.out.println("The last name is :" + google.getLastName());
        System.out.println("The gender is :" + google.getGender());
        System.out.println("The phno " + google.getPhno());
        System.out.println("the dob " + google.getDob());
    }
}
