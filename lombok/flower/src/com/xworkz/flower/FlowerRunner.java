package com.xworkz.flower;

import com.xworkz.flower.Flower.Flower;

public class FlowerRunner {
   
        public static void main(String[] args) {
            System.out.println("Main Started - Flower Data");

            Flower flower = new Flower();
            flower.setColor("Red");
            System.out.println("color:"+flower.getColor());
            System.out.println("Main Ended - Flower Data Display Complete");
        }
    }

