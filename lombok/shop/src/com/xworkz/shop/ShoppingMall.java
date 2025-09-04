package com.xworkz.shop;

import com.xworkz.shop.Shop.Shop;

public class ShoppingMall {


        Shop[] shops = new Shop[15];
        int index;

        public boolean addShop(Shop shop) {
            boolean isAdded = false;
            if (shop != null) {
                shops[index++] = shop;
                isAdded = true;
            }
            return isAdded;
        }

        public void getAllShopDetails() {
            System.out.println("The Shop Details are:");
            for (Shop shop : shops) {
                System.out.println("Shop Name: " + shop.getShopName());
            }
        }
    }

