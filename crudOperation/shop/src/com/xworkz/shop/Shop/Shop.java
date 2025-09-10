package com.xworkz.shop.Shop;

import com.xworkz.shop.constant.ShopCategory;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Shop {

    private String shopName;
    private String ownerName;
    private int shopNumber;
    private ShopCategory category;
    private double rent;
    private boolean open;



}
