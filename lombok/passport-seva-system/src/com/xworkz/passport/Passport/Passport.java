package com.xworkz.passport.Passport;

public class Passport {
    private String cpvLocation;
    public String getCpvLocation(){
        return cpvLocation;
    }
    public void setCpvLocation(String cpvLocation){
        this.cpvLocation=cpvLocation;
    }
    private String givenName;

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }
    private String surname;

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    private String dcdrLocation;

    public String getDcdrLocation() {
        return dcdrLocation;
    }

    public void setDcdrLocation(String dcdrLocation) {
        this.dcdrLocation = dcdrLocation;
    }
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    private String dob;

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getDob() {
        return dob;
    }
    private String captcha;

    public void setCaptcha(String captcha) {
        this.captcha = captcha;
    }

    public String getCaptcha() {
        return captcha;
    }
private String pwd;

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
    private String confirmPwd;

    public String getConfirmPwd() {
        return confirmPwd;
    }

    public void setConfirmPwd(String confirmPwd) {
        this.confirmPwd = confirmPwd;
    }
}
