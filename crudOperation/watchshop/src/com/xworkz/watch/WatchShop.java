package com.xworkz.watch;

import com.xworkz.watch.Watch.Watch;

public class WatchShop {

    int index;
    Watch[] watches;

    public WatchShop(int size) {
        watches = new Watch[size];
    }

    // 1. Add watch
    public boolean addWatch(Watch watch) {
        boolean isWatchAdded = false;
        if (watch != null) {
            watches[index++] = watch;
            isWatchAdded = true;
        } else
            System.out.println("Watch is not added");
        return isWatchAdded;
    }

    // 2. Display all watch info
    public void getAllWatchInfo() {
        System.out.println("The list of watches are:");
        for (Watch watch : watches) {
            if (watch != null) {
                System.out.println("Watch Name: " + watch.getWatchName());
                System.out.println("Brand: " + watch.getBrand());
                System.out.println("Model: " + watch.getModel());
                System.out.println("Type: " + watch.getType());
                System.out.println("Price: " + watch.getPrice());
                System.out.println("Water Resistant: " + watch.isWaterResistant());

            }
        }
    }

    public String getBrandByWatchName(String watchName) {
        String brand = null;
        for (Watch watch : watches) {
            if (watch != null) {
                if (watch.getWatchName().equals(watchName)) {
                    brand = watch.getBrand();
                }
            }
        }
        return brand;
    }


    public String getModelByWatchName(String watchName) {
        String model = null;
        for (Watch watch : watches) {
            if (watch != null) {
                if (watch.getWatchName().equals(watchName)) {
                    model = watch.getModel();
                }
            }
        }
        return model;
    }

    public String getTypeByWatchName(String watchName) {
        String type = null;
        for (Watch watch : watches) {
            if (watch != null) {
                if (watch.getWatchName().equals(watchName)) {
                    type = watch.getType();
                }
            }
        }
        return type;
    }

    public double getPriceByWatchName(String watchName) {
        double price = 0;
        for (Watch watch : watches) {
            if (watch != null) {
                if (watch.getWatchName().equals(watchName)) {
                    price = watch.getPrice();
                }
            }
        }
        return price;
    }

    public boolean getWaterResistantByWatchName(String watchName) {
        boolean status = false;
        for (Watch watch : watches) {
            if (watch != null) {
                if (watch.getWatchName().equals(watchName)) {
                    status = watch.isWaterResistant();
                }
            }
        }
        return status;
    }

    public String getWatchNameByBrand(String brand) {
        String watchName = null;
        for (Watch watch : watches) {
            if (watch != null) {
                if (watch.getBrand().equals(brand)) {
                    watchName = watch.getWatchName();
                }
            }
        }
        return watchName;
    }

    public boolean updateBrandByWatchName(String watchName, String newBrand) {
        boolean isUpdated = false;
        for (Watch watch : watches) {
            if (watch != null) {
                if (watch.getWatchName().equals(watchName)) {
                    watch.setBrand(newBrand);
                    isUpdated = true;
                }
            }
        }
        return isUpdated;
    }

    public boolean updateModelByWatchName(String watchName, String newModel) {
        boolean isUpdated = false;
        for (Watch watch : watches) {
            if (watch != null) {
                if (watch.getWatchName().equals(watchName)) {
                    watch.setModel(newModel);
                    isUpdated = true;
                }
            }
        }
        return isUpdated;
    }

    public boolean updateTypeByWatchName(String watchName, String newType) {
        boolean isUpdated = false;
        for (Watch watch : watches) {
            if (watch != null) {
                if (watch.getWatchName().equals(watchName)) {
                    watch.setType(newType);
                    isUpdated = true;
                }
            }
        }
        return isUpdated;
    }

    public boolean updatePriceByWatchName(String watchName, double newPrice) {
        boolean isUpdated = false;
        for (Watch watch : watches) {
            if (watch != null) {
                if (watch.getWatchName().equals(watchName)) {
                    watch.setPrice(newPrice);
                    isUpdated = true;
                }
            }
        }
        return isUpdated;
    }

    public boolean updateWaterResistantByWatchName(String watchName, boolean newStatus) {
        boolean isUpdated = false;
        for (Watch watch : watches) {
            if (watch != null) {
                if (watch.getWatchName().equals(watchName)) {
                    watch.setWaterResistant(newStatus);
                    isUpdated = true;
                }
            }
        }
        return isUpdated;
    }


    public boolean updateWatchNameByModel(String model, String newName) {
        boolean isUpdated = false;
        for (Watch watch : watches) {
            if (watch != null) {
                if (watch.getModel().equals(model)) {
                    watch.setWatchName(newName);
                    isUpdated = true;
                }
            }
        }
        return isUpdated;
    }

    public boolean updateBrandByModel(String model, String newBrand) {
        boolean isUpdated = false;
        for (Watch watch : watches) {
            if (watch != null) {
                if (watch.getModel().equals(model)) {
                    watch.setBrand(newBrand);
                    isUpdated = true;
                }
            }
        }
        return isUpdated;
    }
}
