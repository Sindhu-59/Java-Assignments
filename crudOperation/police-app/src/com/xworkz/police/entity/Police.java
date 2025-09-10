package com.xworkz.police.entity;

import com.xworkz.police.constants.PoliceRank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Police {
    private int badgeId;
    private String name;
    private int age;
    private String stationName;
    private PoliceRank rank;
    private double salary;
}
