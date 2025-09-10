package com.xworkz.hospital;

import com.xworkz.hospital.Patient.Patient;
import com.xworkz.hospital.constants.Gender;

public class Hospital {

    public Hospital(int size){
       patients=new Patient[size];
    }

    int index;
    Patient[] patients;

    //
    public boolean addPatients(Patient patient) {
        boolean isPatientAdded = false;

        if (patient != null) {
            patients[index++] = patient;
            isPatientAdded = true;
        } else
            System.out.println("Patient is added");
        return isPatientAdded;
    }


    public void getPatientInfo() {
        System.out.println("The lists of patients are:");
        for (Patient patient : patients) {
            System.out.println("Patient Id is:"+patient.getPatientId());
            System.out.println("Patient age is :"+patient.getAge());
            System.out.println("Patient name is:"+patient.getName());
            System.out.println("Patient gender is: "+patient.getGender());
           }
    }

    public String getGenderByPatientName(String patientName){
        String gender=null;
        //Gender gender=null;
        for(Patient patient : patients){
            if(patient.getName().equals(patientName)){

                gender=patient.getGender();//return patient.getGender();
            }
        }
        return gender;//return null;
    }

//    public boolean updateDiseaseByName(String name String updateDisease){
//        boolean updateDiseaseByName=false;
//        if(name!=null){
//            for(Patient patient:patients){
//                if(patient.getName().equals(updateDiseaseByName()));
//            }
//        }
//    }


//
//    public boolean ageUpdatedbyId(int updateAge, int existingId) {
//        System.out.println("Invalid updatePatientAgeById");
//        boolean isUpdateAge = false;
//        for (Patient patient : this.patients) {
//            if (patient.getPatientId() == existingId) {
//                patient.setAge(updateAge);
//                System.out.println("Age is updated");
//                isUpdateAge = true;
//            }
//        }
//
//        if (isUpdateAge == false) {
//            System.out.println("PatientId not found" + existingId);
//        }
//        return isUpdateAge;
//
//    }
//
//    public String getPatientNameById(int id) {
//        String patientName = null;
//        for (Patient patient : this.patients) {
//            if (patient.getPatientId() == id) {
//                patientName = patient.getName();
//            }
//        }
//        if (patientName == null)
//            System.out.println("Invalid");
//
//        return patientName;
//    }
//
//    public String updateAddressByName(String name){
//        String address = null;
//        for(Patient patient : this.patients){
//            System.out.println("The name of patient is :"+patient.getName());
//            if(patient.getAddress() == name);
//            name=patient.getName();
//        }
////        if(name==null)
////            System.out.println("Invalid address");
//        return name;
//
//    }
}
