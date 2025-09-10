package com.xworkz.library;

import com.xworkz.library.Book.Book;

import java.util.Scanner;

public class LibraryRunner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of book details you want to enter");
        int size = sc.nextInt();

        Library library = new Library(size);

        System.out.println("The available book slots are " + library.books.length);

        for (int i = 0; i < size; i++) {
            Book book = new Book();

            System.out.println("Enter the book ID");
            book.setBookId(sc.nextInt());

            System.out.println("Enter the book title");
            book.setTitle(sc.next());

            System.out.println("Enter the author");
            book.setAuthor(sc.next());

            System.out.println("Enter the publisher");
            book.setPublisher(sc.next());

           // System.out.println("Enter the genre");
           // book.setGenre(GENRE.valueOf(sc.next().toUpperCase()));

            System.out.println("Enter the number of pages");
            book.setPages(sc.nextInt());

            library.addBook(book);
        }

        library.getAllBookDetails();

        System.out.println("Updating book with ID 1...");
        library.updateTitleById(1, "Kolalu");
        library.updateAuthorById(1, "kuvempu");
        library.updatePublisherById(1, "Rastrottana");
        library.updatePagesById(1, 208);

        library.getAllBookDetails();

        System.out.println("Enter the ID to fetch the title:");
        String title = library.getTitleById(sc.nextInt());
        System.out.println("Title: " + title);

        System.out.println("Enter the ID to fetch the author:");
        String author = library.getAuthorById(sc.nextInt());
        System.out.println("Author: " + author);

        System.out.println("Enter the ID to fetch the publisher:");
        String publisher = library.getPublisherById(sc.nextInt());
        System.out.println("Publisher: " + publisher);

//        System.out.println("Enter the ID to fetch the genre:");
//       GENRE genre=library.getGenre(GENRE.valueOf(wait().toUpperCase()));
//        System.out.println("Genre: " + genre);

        System.out.println("Enter the ID to fetch the number of pages:");
        int pages = library.getPagesById(sc.nextInt());
        System.out.println("Pages: " + pages);

        System.out.println("Enter ID to check if the book exists:");
        boolean exists = library.isBookExistById(sc.nextInt());
        System.out.println("Book exists: " + exists);

        int total = library.getTotalBooks();
        System.out.println("Total books added: " + total);
    }
}