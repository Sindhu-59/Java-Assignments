package com.xworkz.passport.PassportSeva;

import com.xworkz.passport.Passport.Passport;

public class Seva {

    Passport passport;

    public boolean createPassport(Passport passport) {
        boolean createPassport = false;
        boolean cpvLocationValid = false;
        if (passport.getCpvLocation() != null) {
            cpvLocationValid = true;
        } else
            System.out.println("CPV location is not valid");

        boolean givenNameValid = false;
        if (passport.getGivenName() != null) {
            givenNameValid = true;
        } else
            System.out.println("The Given name is invalid");

        boolean surNameValid = false;
        if (passport.getSurname() != null) {
            surNameValid = true;
        } else
            System.out.println("The surname is inavalid");

        boolean dcdrLocationValid = false;
        if (passport.getDcdrLocation() != null) {
            dcdrLocationValid = true;
        } else
            System.out.println("The dcdrLocation is invalid");

        boolean dobValid = false;
        if (passport.getDob() != null) {
            dobValid = true;
        } else
            System.out.println("The dob is invalid");

        boolean emailValid = false;
        if (passport.getEmail() != null) {
            emailValid = true;
        } else
            System.out.println("The email is invalid");

        boolean captchaValid = false;
        if (passport.getCaptcha() != null) {
            captchaValid = true;
        } else
            System.out.println("The captcha is invalid");

        boolean pwdValid = false;
        if (passport.getPwd() != null) {
            pwdValid = true;
        } else
            System.out.println("The dpwd is invalid");

        boolean confirmPwdValid = false;
        if (passport.getConfirmPwd() != null) {
            confirmPwdValid = false;
        } else
            System.out.println("The confirm pwd is invalid");

       if(cpvLocationValid && dcdrLocationValid && givenNameValid && surNameValid
       && dobValid && pwdValid && confirmPwdValid && captchaValid && emailValid){
           createPassport=true;
           this.passport=passport;
       }
       return createPassport;
    }
}
