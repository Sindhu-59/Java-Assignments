class Shelf {
    int shelfNumber;
    boolean isWooden;
    int capacity;
    Book book;  
	
	 Shelf(int shelfNumber, boolean isWooden, int capacity, Book book) {
        this.shelfNumber = shelfNumber;
        this.isWooden = isWooden;
        this.capacity = capacity;
        this.book = book;
    }

    public void getShelfInfo() {
        System.out.println("Shelf Number: " + shelfNumber);
        System.out.println("Is Wooden: " + isWooden);
        System.out.println("Capacity: " + capacity);
        this.book.getBookInfo(); 
    }
}
