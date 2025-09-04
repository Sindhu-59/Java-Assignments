package com.xworkz.networkapp;

import com.xworkz.networkapp.vi.ViNetwork;

public class ViNetworkRunner {
    public static void main(String[] args) {

        ViNetwork viNetwork = new ViNetwork();
        viNetwork.viId = 2;
        System.out.println("The id is:" + viNetwork.viId);
        viNetwork.antenna = "shkjmcn";
        System.out.println("The antenna type is:" +viNetwork.antenna);
    }
}
