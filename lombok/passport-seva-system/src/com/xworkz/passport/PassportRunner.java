package com.xworkz.passport;

import com.xworkz.passport.Passport.Passport;
import com.xworkz.passport.PassportSeva.Seva;

public class PassportRunner {
    public static void main(String[] args) {

        Passport passport = new Passport();
        passport.setCpvLocation("PO");
        passport.setDcdrLocation("bangalore");
        passport.setDob("19/11/2003");
        passport.setEmail("lini123@gmail.com");
        passport.setCaptcha("REs4587");
        passport.setGivenName("Lini");
        passport.setSurname("gowda");
        passport.setPwd("346389PP");
        passport.setConfirmPwd("346389PP");
        System.out.println("The cpvlocation is :"+passport.getCpvLocation());
        System.out.println("The dcdrLocation is: "+passport.getDcdrLocation());
        System.out.println("The email is: "+passport.getEmail());
        System.out.println("The dob is: "+passport.getDob());
        System.out.println("The given name is: "+passport.getGivenName());
        System.out.println("The surname is: "+passport.getSurname());
        System.out.println("The captcha is: "+passport.getCaptcha());
        System.out.println("The pwd is: "+passport.getPwd());
        System.out.println("The confirm pwd is: "+passport.getConfirmPwd());

        Seva seva = new Seva();
        seva.createPassport(passport);
    }
}


