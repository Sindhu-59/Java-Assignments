package com.xworkz.hospital.Patient;

import com.xworkz.hospital.constants.Gender;
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
    public String Name;
    private int age;
    private String gender;
    //private Gender gender;
    private String address;
    private String disease;

}
