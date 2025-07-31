class Product {
    String name;
    String brand;
    double price;
    boolean isAvailable;

    Product(String name, String brand, double price, boolean isAvailable) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    public void getProductInfo() {
        System.out.println("Product Name: " + name);
        System.out.println("Brand: " + brand);
        System.out.println("Price: ₹" + price);
        System.out.println("Available: " + isAvailable);
    }
}
