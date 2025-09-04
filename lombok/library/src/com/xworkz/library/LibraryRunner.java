package com.xworkz.library;

import com.xworkz.library.Book.Book;

public class LibraryRunner {
    public static void main(String[] args) {

        Book book=new Book();
        book.setBookName("Kaviraja Marga");

        Book book1=new Book();
        book1.setBookName("Kavi");

        Book book2=new Book();
        book2.setBookName("Karma");

        Book book3=new Book();
        book3.setBookName("MalegallalliMadumagalu");

        Book book4=new Book();
        book4.setBookName("Beralge Koral");

        Book book5=new Book();
        book5.setBookName("Naku Tanti");

        Book book6=new Book();
        book6.setBookName("Wings of Fire");

        Book book7=new Book();
        book7.setBookName("Kaviraja Marga");

        Book book8=new Book();
        book8.setBookName("Deepada Hejje");

        Book book9=new Book();
        book9.setBookName("Kirugoorina gayyaligalu");

        Book book10=new Book();
        book10.setBookName("Rudra Prayagad Bhayanaka Narabhakshaka");

        Book book11=new Book();
        book11.setBookName("Mane");

        Book book12=new Book();
        book12.setBookName("My Experiment with truth");

        Book book13=new Book();
        book13.setBookName("Hasiru");


        Library library=new Library();
        //library.getBookName();

        library.getBookName(book);
        library.getBookName(book1);
        library.getBookName(book2);
        library.getBookName(book3);
        library.getBookName(book4);
        library.getBookName(book5);
        library.getBookName(book6);
        library.getBookName(book7);
        library.getBookName(book8);
        library.getBookName(book9);
        library.getBookName(book10);
        library.getBookName(book11);
        library.getBookName(book12);
        library.getBookName(book13);


        library.getAllBookDetails();





    }
}
