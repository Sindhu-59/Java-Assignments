package com.xworkz.hospital.Patient;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Patient {
    private int patientId;
    private String Name;
    private int age;
    private String gender;
    private String disease;

}
