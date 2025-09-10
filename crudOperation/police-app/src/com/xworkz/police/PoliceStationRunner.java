package com.xworkz.policestation;

import com.xworkz.police.PoliceStation;
import com.xworkz.policestation.constants.Rank;
import java.util.Scanner;

public class PoliceStationRunner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of police in station:");
        int size = sc.nextInt();

        PoliceStation policeStation = new PoliceStation(size);

        for (int i = 0; i < size; i++) {
            Police police = new Police();

            System.out.println("Enter Police Id:");
            police.setPoliceId(sc.nextInt());

            System.out.println("Enter Police Name:");
            police.setName(sc.next());

            System.out.println("Enter Police Age:");
            police.setAge(sc.nextInt());

            System.out.println("Enter Police Rank:");
            police.setRank(PoliceStation.valueOf(sc.next().toUpperCase()));

            System.out.println("Enter Police Station Name:");
            police.setStationName(sc.next());

            policeStation.addPolice(police);
        }

        // Call methods
        System.out.println("\n--- Police Details ---");
        policeStation.getAllPoliceDetails();

        System.out.println("\nEnter police name to get rank:");
        String policeName = sc.next();
        System.out.println("Rank is: " + policeStation.getRankByName(policeName));

        System.out.println("\nEnter police id to update age:");
        int id = sc.nextInt();
        System.out.println("Enter new age:");
        int age = sc.nextInt();
        boolean updated = policeStation.updateAgeById(age, id);
        System.out.println("Age updated? " + updated);

    }
}
