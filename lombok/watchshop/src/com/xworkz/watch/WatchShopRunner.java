package com.xworkz.watch;

import com.xworkz.watch.Watch.Watch;

public class WatchShopRunner {

        public static void main(String[] args) {

            WatchShop shop = new WatchShop();

            Watch watch1 = new Watch();
            watch1.setWatchName("Titan");
            shop.addWatch(watch1);

            Watch watch2 = new Watch();
            watch2.setWatchName("Fastrack");
            shop.addWatch(watch2);

            Watch watch3 = new Watch();
            watch3.setWatchName("Sonata");
            shop.addWatch(watch3);

            Watch watch4 = new Watch();
            watch4.setWatchName("Casio");
            shop.addWatch(watch4);

            Watch watch5 = new Watch();
            watch5.setWatchName("Rolex");
            shop.addWatch(watch5);

            Watch watch6 = new Watch();
            watch6.setWatchName("Omega");
            shop.addWatch(watch6);

            Watch watch7 = new Watch();
            watch7.setWatchName("Timex");
            shop.addWatch(watch7);

            Watch watch8 = new Watch();
            watch8.setWatchName("Seiko");
            shop.addWatch(watch8);

            Watch watch9 = new Watch();
            watch8.setWatchName("Seiko");
            shop.addWatch(watch9);

            shop.getAllWatchDetails();
        }

        }
