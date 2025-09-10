package com.xworkz.shop;

import com.xworkz.shop.Shop.Shop;
import com.xworkz.shop.constant.ShopCategory;

import java.util.Scanner;

public class ShoppingMallRunner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of shops:");
        int size = sc.nextInt();

        ShoppingMall mall = new ShoppingMall(size);
        System.out.println("Slots available: " + mall.shops.length);

        for (int i = 0; i < size; i++) {
            Shop shop = new Shop();

            System.out.println("Enter Shop Name:");
            String shopName = sc.next();
            shop.setShopName(shopName);

            System.out.println("Enter Owner Name:");
            String ownerName = sc.next();
            shop.setOwnerName(ownerName);

            System.out.println("Enter Shop Number:");
            int shopNumber = sc.nextInt();
            shop.setShopNumber(shopNumber);

            System.out.println("Enter Shop Category (CLOTHING/ELECTRONICS/GROCERY/JEWELLERY/FURNITURE):");
            String categoryInput = sc.next();
            ShopCategory category = ShopCategory.valueOf(categoryInput.toUpperCase());
            shop.setCategory(category);

            System.out.println("Enter Rent:");
            double rent = sc.nextDouble();
            shop.setRent(rent);

            System.out.println("Is the shop open? (true/false):");
            boolean open = sc.nextBoolean();
            shop.setOpen(open);

            mall.addShop(shop);
            mall.getAllShopInfo();
        }

        System.out.println("Enter shop name to fetch owner:");
        String fetchShopName = sc.next();
        String owner = mall.getOwnerByShopName(fetchShopName);
        System.out.println("Owner of " + fetchShopName + " is: " + owner);
    }
}
