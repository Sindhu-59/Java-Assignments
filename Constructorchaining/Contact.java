class Contact {
    String name;
    String phoneNumber;
    String email;
    boolean isFavourite;

    Contact(String name, String phoneNumber, String email, boolean isFavourite) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.isFavourite = isFavourite;
    }

    public void getContactInfo() {
        System.out.println("Contact Name: " + name);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Email: " + email);
        System.out.println("Is Favourite: " + isFavourite);
    }
}
