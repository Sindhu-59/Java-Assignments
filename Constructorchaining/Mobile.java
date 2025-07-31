class Mobile {
    String brand;
    String model;
    double price;
    PhoneBook phoneBook;

    Mobile(String brand, String model, double price, PhoneBook phoneBook) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.phoneBook = phoneBook;
    }

    public void getMobileInfo() {
        System.out.println("Mobile Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: ₹" + price);
        phoneBook.getPhoneBookInfo();
    }
}
