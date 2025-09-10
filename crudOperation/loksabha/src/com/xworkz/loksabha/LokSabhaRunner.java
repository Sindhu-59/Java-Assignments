package com.xworkz.loksabha;

import com.xworkz.loksabha.constants.Party;
import com.xworkz.loksabha.lok.Loksabha;
import com.xworkz.loksabha.politician.Politician;

import java.util.Scanner;

public class LoksabhaRunner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of Politicians:");
        int size = sc.nextInt();

        Loksabha loksabha = new Loksabha(size);
        System.out.println("The slots available are: " + size);

        for (int i = 0; i < size; i++) {
            Politician politician = new Politician();

            System.out.println("Enter Politician Id:");
            int id = sc.nextInt();
            politician.setPoliticianId(id);

            System.out.println("Enter Politician Name:");
            String name = sc.next();
            politician.setName(name);

            System.out.println("Enter Politician Age:");
            int age = sc.nextInt();
            politician.setAge(age);

            System.out.println("Enter Party (BJP/CONGRESS/AAP/JDS/TMC/BSP):");
            String partyInput = sc.next();
            politician.setParty(Party.valueOf(partyInput.toUpperCase()));

            loksabha.addPolitician(politician);
            loksabha.getAllPoliticianInfo();
        }

        System.out.println("Enter Politician name to fetch Party:");
        String searchName = sc.next();
        String partyByName = loksabha.getPartyByPoliticianName(searchName);
        System.out.println("Party: " + partyByName);

    }
}
