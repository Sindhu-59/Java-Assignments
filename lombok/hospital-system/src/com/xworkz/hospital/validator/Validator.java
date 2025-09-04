package com.xworkz.hospital.validator;

public class Validator {
    package com.xworkz.hospitalsystem.hospital;

import patient.Patient;
import validator.Validator;

    public class Hospital {
        Patient patient;
        public boolean getPatientData(Patient patient){
            boolean getPatientData=false;

            Validator validator=new Validator();

            boolean data= validator.getValidate(patient);
            if(data){
                this.patient = patient;
                getPatientData=true;
            }
            else
                System.out.println("The patient data not valid");
            return getPatientData;
        }

        public boolean getPatientDetails(){
            System.out.println("The patient ID: " +patient.getPatientId());
            System.out.println("The patient name: "+patient.getPatientName());
            System.out.println("The patient age: "+patient.getAge());
            System.out.println("The patient gender: "+patient.getGender());
            System.out.println("The disease name: "+patient.getDisease());
            System.out.println("The Doctor assigned: "+patient.getDoctorAssigned());
            return false;
        }
    }
}
