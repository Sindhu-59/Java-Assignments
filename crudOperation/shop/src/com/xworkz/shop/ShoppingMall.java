package com.xworkz.shop;

import com.xworkz.shop.Shop.Shop;
import com.xworkz.shop.constant.ShopCategory;

public class ShoppingMall {

    Shop[] shops;
    int index;

    public ShoppingMall(int size) {
        shops = new Shop[size];
    }

    // 1. Add shop
    public boolean addShop(Shop shop) {
        boolean isAdded = false;
        if(shop != null) {
            shops[index++] = shop;
            isAdded = true;
        }
        return isAdded;
    }

    // 2. Display all shops
    public void getAllShopInfo() {
        System.out.println("List of Shops:");
        for(Shop shop : shops) {
            if(shop != null) {
                System.out.println("Shop Name: " + shop.getShopName());
                System.out.println("Owner Name: " + shop.getOwnerName());
                System.out.println("Shop Number: " + shop.getShopNumber());
                System.out.println("Category: " + shop.getCategory());
                System.out.println("Rent: " + shop.getRent());
                System.out.println("Open: " + shop.isOpen());
                System.out.println("--------------------");
            }
        }
    }

    // ---- 6 GET methods ----
    public String getOwnerByShopName(String name) {
        String owner = null;
        for(Shop s : shops) {
            if(s != null) {
                if(s.getShopName().equals(name)) owner = s.getOwnerName();
            }
        }
        return owner;
    }

    public int getShopNumberByShopName(String name) {
        int number = -1;
        for(Shop s : shops) {
            if(s != null) {
                if(s.getShopName().equals(name)) number = s.getShopNumber();
            }
        }
        return number;
    }

    public ShopCategory getCategoryByShopName(String name) {
        ShopCategory category = null;
        for(Shop s : shops) {
            if(s != null) {
                if(s.getShopName().equals(name)) category = s.getCategory();
            }
        }
        return category;
    }

    public double getRentByShopName(String name) {
        double rent = -1;
        for(Shop s : shops) {
            if(s != null) {
                if(s.getShopName().equals(name)) rent = s.getRent();
            }
        }
        return rent;
    }

    public boolean getOpenStatusByShopName(String name) {
        boolean open = false;
        for(Shop s : shops) {
            if(s != null) {
                if(s.getShopName().equals(name)) open = s.isOpen();
            }
        }
        return open;
    }

    public String getShopNameByOwner(String ownerName) {
        String name = null;
        for(Shop s : shops) {
            if(s != null) {
                if(s.getOwnerName().equals(ownerName)) name = s.getShopName();
            }
        }
        return name;
    }

    public boolean updateOwnerByShopName(String name, String owner) {
        boolean updated = false;
        for(Shop s : shops) {
            if(s != null) {
                if(s.getShopName().equals(name)) {
                    s.setOwnerName(owner);
                    updated = true;
                }
            }
        }
        return updated;
    }

    public boolean updateShopNumberByShopName(String name, int number) {
        boolean updated = false;
        for(Shop s : shops) {
            if(s != null) {
                if(s.getShopName().equals(name)) {
                    s.setShopNumber(number);
                    updated = true;
                }
            }
        }
        return updated;
    }

    public boolean updateCategoryByShopName(String name, ShopCategory category) {
        boolean updated = false;
        for(Shop s : shops) {
            if(s != null) {
                if(s.getShopName().equals(name)) {
                    s.setCategory(category);
                    updated = true;
                }
            }
        }
        return updated;
    }

    public boolean updateRentByShopName(String name, double Rent) {
        boolean updated = false;
        for(Shop s : shops) {
            if(s != null) {
                if(s.getShopName().equals(name)) {
                    s.setRent(Rent);
                    updated = true;
                }
            }
        }
        return updated;
    }

    public boolean updateOpenStatusByShopName(String name, boolean Status) {
        boolean updated = false;
        for(Shop s : shops) {
            if(s != null) {
                if(s.getShopName().equals(name)) {
                    s.setOpen(Status);
                    updated = true;
                }
            }
        }
        return updated;
    }

    public boolean updateShopNameByOwner(String owner, String Name) {
        boolean updated = false;
        for(Shop s : shops) {
            if(s != null) {
                if(s.getOwnerName().equals(owner)) {
                    s.setShopName(Name);
                    updated = true;
                }
            }
        }
        return updated;
    }

    public boolean updateOwnerByCategory(ShopCategory category, String Owner) {
        boolean updated = false;
        for(Shop s : shops) {
            if(s != null) {
                if(s.getCategory() == category) {
                    s.setOwnerName(Owner);
                    updated = true;
                }
            }
        }
        return updated;
    }
}
