package com.xworkz.googleapp;

import com.xworkz.googleapp.Google.Google;
import com.xworkz.googleapp.GoogleValidation.GoogleValidation;

public class GoogleRunner {
    public static void main(String[] args) {

        Google google = new Google();
        google.setFirstName("Sachin");
        google.setLastName("Tendulkar");
        google.setGender("Male");
        google.setPhno(4567033025l);
        google.setDob("01/10/1985");

        GoogleValidation googleValidation = new GoogleValidation();
       boolean result= googleValidation.createGoogle(google);
        if(result){
            googleValidation.displayInfo();
        }
        else
            System.out.println("the result is invalid");


    }
}
