class Library {
    String name;
    String location;
    int noOfShelves;
    Shelf shelf; 

    Library(String name, String location, int noOfShelves, Shelf shelf) {
        this.name = name;
        this.location = location;
        this.noOfShelves = noOfShelves;
        this.shelf = shelf;
    }

    public void getLibraryInfo() {
        System.out.println("Library Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Number of Shelves: " + noOfShelves);
        this.shelf.getShelfInfo(); 
    }
}
