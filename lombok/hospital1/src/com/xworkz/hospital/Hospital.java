package com.xworkz.hospital;

import com.xworkz.hospital.Patient.Patient;

public class Hospital {


    int index;
    Patient[] patients = new Patient[3];

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
            System.out.println("The patient id is " + patient.getPatientId());

        }
    }
}

