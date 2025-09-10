package com.xworkz.hospital;

import com.xworkz.hospital.Patient.Patient;
import com.xworkz.hospital.constants.Gender;

import java.util.Scanner;


public class HospitalRunner {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the patient details");
        int size = sc.nextInt();

        Hospital hospital = new Hospital(size);
        System.out.println("The patient available are :" + hospital.patients.length);


        for (int i = 0; i < size; i++) {
            Patient patient = new Patient();
            System.out.println("Enter the patient id");
            int patientId = sc.nextInt();
            patient.setPatientId(patientId);

            System.out.println("Enter the patient name");
            String name = sc.next();
            patient.setName(name);

            System.out.println("Enter the age");
            int age = sc.nextInt();
            patient.setAge(age);


            System.out.println("Enter the gender");
            String gender=Gender.MALE.toString();
           // String gender=sc.next();
            patient.setGender(sc.next().toUpperCase());

            //patient.setGender(Gender.valueOf(gender.toUpperCase()));

            hospital.addPatients(patient);
            hospital.getPatientInfo();
        }

//        System.out.println("enter the name");
//        System.out.println("Enter the patient name to fetch gender ");
//        String gender=hospital.getGenderByPatientName(sc.next());
//        System.out.println(gender);

        System.out.println("Enter the patient name to fetch gender ");
        //Gender gender =   hospital.getGenderByPatientName(sc.next());
        String gender =   hospital.getGenderByPatientName(sc.next());
        System.out.println(gender);
    }
}









//        Patient patient = new Patient();
//        patient.setPatientId(1);
//        patient.setAddress("bng");
//        patient.setName("babi");
//        patient.setAge(78);
//
//        Patient patient1 = new Patient();
//        patient1.setPatientId(2);
//        patient1.setName("amy");
//        patient1.setAddress("america");
//        patient1.setAge(68);
//
//        Patient patient2 = new Patient();
//        patient2.setPatientId(3);
//        patient2.setAddress("england");
//        patient2.setName("rai");
//        patient2.setAge(88);

//        Hospital hospital = new Hospital();
//        hospital.addPatients(patient);
//        hospital.addPatients(patient1);
//        hospital.addPatients(patient2);

//        hospital.getPatientInfo();
//        System.out.println("Patient :"+patient.getPatientId());
//        System.out.println("Patient :"+patient.getAge());
//
//       boolean isUpdateAge = hospital.ageUpdatedbyId(69 , 2);
//        System.out.println(isUpdateAge);
//        hospital.getPatientInfo();
//
//        String address=hospital.updateAddressByName("babu");
//        System.out.println(address);
//        hospital.getPatientInfo();
//    }
//}
