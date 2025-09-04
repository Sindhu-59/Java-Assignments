package com.xworkz.hospital;

import com.xworkz.hospital.Patient.Patient;

public class HospitalRunner {
    public static void main(String[] args) {
        Patient patient = new Patient();
        patient.setPatientId(1);

        Patient patient1 = new Patient();
        patient1.setPatientId(2);

        Patient patient2 = new Patient();
        patient1.setPatientId(3);

        Hospital hospital = new Hospital();
        hospital.addPatients(patient);
        hospital.addPatients(patient1);
        hospital.addPatients(patient2);

        hospital.getPatientInfo();
        System.out.println("Patient :"+patient.getPatientId());
    }
}
