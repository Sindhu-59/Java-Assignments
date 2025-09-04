package com.xworkz.library;

import com.xworkz.library.Book.Book;

public class Library {

    Book[] books = new Book[14];

    int index;
    private Book book;

    public boolean getBookName(Book book) {
        boolean isBookName = false;

        if (book != null) {
            books[index++] = book;
            isBookName = true;
        }
        return isBookName;
    }

    public void getAllBookDetails() {
        System.out.println("The book Details are: ");
        for (Book book : books) System.out.println("The Book name are " + book.getBookName());
    }
}