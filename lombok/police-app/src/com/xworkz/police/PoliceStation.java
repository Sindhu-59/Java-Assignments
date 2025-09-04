package com.xworkz.police;

import com.xworkz.police.Police.Police;

public class PoliceStation {

    int index;
    Police[] police=new Police[6];

    public boolean addPolice(Police police) {
        boolean isPoliceAdded = false;
        if (police != null) {
            polices[index++] = police;
            isPoliceAdded = true;

        } else
            System.out.println("Not added");

        return isPoliceAdded;
    }
    public void getPoliceInfo(){
        for(Police police:polices) {
            System.out.println("The police id is :" + police.getPoliceId());
        }
    }
}
