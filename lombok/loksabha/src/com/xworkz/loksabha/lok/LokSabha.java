package com.xworkz.loksabha.lok;

import com.xworkz.loksabha.Politician;

public class LokSabha {

        Politician[] politicians = new Politician[11];
        int index;

        public boolean addPolitician(Politician politician) {
            boolean isAdded = false;
            if (politician != null) {
                politicians[index++] = politician;
                isAdded = true;
            }
            return isAdded;
        }

        public void getAllPoliticianDetails() {
            System.out.println("The Politician Details are:");
            for (Politician politician :politicians) {
                System.out.println("Politician Name: " + politician.getPoliticianName());
            }
        }
    }


