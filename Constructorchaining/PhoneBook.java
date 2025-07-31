class PhoneBook {
    String ownerName;
    int totalContacts;
    boolean isSynced;
    Contact contact;

    PhoneBook(String ownerName, int totalContacts, boolean isSynced, Contact contact) {
        this.ownerName = ownerName;
        this.totalContacts = totalContacts;
        this.isSynced = isSynced;
        this.contact = contact;
    }

    public void getPhoneBookInfo() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Total Contacts: " + totalContacts);
        System.out.println("Is Synced: " + isSynced);
        contact.getContactInfo();
    }
}
