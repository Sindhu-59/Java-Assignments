class MobileRunner {
    public static void main(String[] args) {
        Contact contact = new Contact("manjunath", "9876543210", "manju123@gmail.com", true);

        PhoneBook phoneBook = new PhoneBook("manjunath", 150, true, contact);

        Mobile mobile = new Mobile("Samsung", "Galaxy S23", 79999.00, phoneBook);

        mobile.getMobileInfo();
    }
}
