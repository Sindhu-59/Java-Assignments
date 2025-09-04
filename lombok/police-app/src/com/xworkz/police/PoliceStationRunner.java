package com.xworkz.police;

import com.xworkz.police.Police.Police;

public class PoliceStationRunner {
    public static void main(String[] args) {

        Police police = new Police();
        police.setPoliceId(1);

        Police police1 = new Police();
        police.setPoliceId(2);
        Police police2 = new Police();
        police.setPoliceId(3);
        Police police3 = new Police();
        police.setPoliceId(4);
        Police police4 = new Police();
        police.setPoliceId(5);
        Police police5 = new Police();
        police.setPoliceId(6);

        PoliceStation policeStation=new PoliceStation();
        policeStation.addPolice(police);
        policeStation.addPolice(police1);
        policeStation.addPolice(police2);
        policeStation.addPolice(police3);
        policeStation.addPolice(police4);
        policeStation.addPolice(police5);

        policeStation.getPoliceInfo();
        System.out.println("the police id is :"+police.getPoliceId());
    }
}
