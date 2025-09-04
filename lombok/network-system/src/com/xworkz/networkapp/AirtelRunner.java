package com.xworkz.networkapp;

import com.xworkz.networkapp.Airtel.AirtelNetwork;

public class AirtelRunner {

    public static void main(String[] args) {

        AirtelNetwork airtel = new AirtelNetwork();
        airtel.airtelId = 1;
        System.out.println("The airtel id is : "+airtel.airtelId);
        airtel.networkRange = "400 meter";
        System.out.println("The airtel network range : "+airtel.networkRange);
    }
}
