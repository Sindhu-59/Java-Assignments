class LibraryRunner {
	
    public static void main(String[] args) {
        Book book = new Book();
        book.title = "Shri Ramayana Darshanam";
        book.author = "Kuvempu";
        book.pages = 336;
        book.price = 499.50;

        Shelf shelf = new Shelf();
        shelf.shelfNumber = 5;
        shelf.isWooden = true;
        shelf.capacity = 40;
        shelf.book = book;

        Library library = new Library("City Central Library", "Bangalore", 120, shelf);
        library.getLibraryInfo();
    }
}

class LibraryRunner {

    public static void main(String args[]) {

        Shelf shelf = new Shelf();

        Library library = new Library("City Central Library", "Bangalore", 120, shelf);

        library.shelf = shelf;
        shelf.shelfNumber = 5;
        shelf.isWooden = true;
        shelf.capacity = 40;

        Book book = new Book();
        book.title = "The Silent Patient";
        book.author = "Alex Michaelides";
        book.pages = 336;
        book.price = 499.50;

        shelf.book = book;

        library.getLibraryInfo();
    }
}
