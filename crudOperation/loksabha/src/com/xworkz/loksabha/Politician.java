package com.xworkz.loksabha;

import com.xworkz.loksabha.constants.Party;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@Setter
@Getter
@NoArgsConstructor
public class Politician {

    private int politicianId;
    private String name;
    private int age;
    private Party party;
    }
