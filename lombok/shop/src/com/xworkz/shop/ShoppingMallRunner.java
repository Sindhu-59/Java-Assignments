package com.xworkz.shop;

import com.xworkz.shop.Shop.Shop;

public class ShoppingMallRunner {

        public static void main(String[] args) {

            ShoppingMall mall = new ShoppingMall();

            Shop shop1 = new Shop();
            shop1.setShopName("Reliance Trends");
            mall.addShop(shop1);

            Shop shop2 = new Shop();
            shop2.setShopName("Big Bazaar");
            mall.addShop(shop2);

            Shop shop3 = new Shop();
            shop3.setShopName("Lifestyle");
            mall.addShop(shop3);

            Shop shop4 = new Shop();
            shop4.setShopName("Max");
            mall.addShop(shop4);

            Shop shop5 = new Shop();
            shop5.setShopName("Pantaloons");
            mall.addShop(shop5);

            Shop shop6 = new Shop();
            shop6.setShopName("Croma");
            mall.addShop(shop6);

            Shop shop7 = new Shop();
            shop7.setShopName("Shoppers Stop");
            mall.addShop(shop7);

            Shop shop8 = new Shop();
            shop8.setShopName("Decathlon");
            mall.addShop(shop8);

            Shop shop9 = new Shop();
            shop9.setShopName("Zudio");
            mall.addShop(shop9);

            Shop shop10 = new Shop();
            shop10.setShopName("Levi's");
            mall.addShop(shop10);

            Shop shop11 = new Shop();
            shop11.setShopName("Bata");
            mall.addShop(shop11);

            Shop shop12 = new Shop();
            shop12.setShopName("Adidas");
            mall.addShop(shop12);


            mall.getAllShopDetails();
        }
    }

}
