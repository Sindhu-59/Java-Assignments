package com.xworkz.watch;

import com.xworkz.watch.Watch.Watch;

public class WatchShop {


        Watch[] watches = new Watch[9];
        int index;

        public boolean addWatch(Watch watch) {
            boolean isAddwatch=false;
            if (watch != null) {
                watches[index++] = watch;
                return true;
            }
            return isAddwatch;
        }

    public void getAllWatchDetails() {
        System.out.println("The Watch Details are:");
        for (Watch watch : watches) {
            if (watch != null) {
                System.out.println("Brand: " + watch.getWatchName());
            }
        }
    }

}


