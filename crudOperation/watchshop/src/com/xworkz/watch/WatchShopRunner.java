package com.xworkz.watch;

import com.xworkz.watch.Watch.Watch;

import java.util.Scanner;

public class WatchShopRunner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Watches to add:");
        int size = sc.nextInt();

        WatchShop shop = new WatchShop(size);
        System.out.println("The watch slots available are: " + shop.watches.length);

        for (int i = 0; i < size; i++) {
            Watch watch = new Watch();

            System.out.println("Enter the Watch Name:");
            String watchName = sc.next();
            watch.setWatchName(watchName);

            System.out.println("Enter the Brand:");
            String brand = sc.next();
            watch.setBrand(brand);

            System.out.println("Enter the Model:");
            String model = sc.next();
            watch.setModel(model);

            System.out.println("Enter the Type:");
            String type = sc.next();
            watch.setType(type);

            System.out.println("Enter the Price:");
            double price = sc.nextDouble();
            watch.setPrice(price);

            System.out.println("Is it Water Resistant? (true/false):");
            boolean waterResistant = sc.nextBoolean();
            watch.setWaterResistant(waterResistant);

            shop.addWatch(watch);

            shop.getAllWatchInfo();
        }

        System.out.println("Enter the Watch Name to fetch Brand:");
        String brand = shop.getBrandByWatchName(sc.next());
        System.out.println("Brand is: " + brand);
    }
}
