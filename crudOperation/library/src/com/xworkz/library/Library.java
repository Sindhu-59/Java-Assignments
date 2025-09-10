package com.xworkz.library;

import com.xworkz.library.Book.Book;
import com.xworkz.library.Constants.GENRE;


public class Library {

    public Library(int size){

        books = new Book[size];
    }

    public Book[] books;
    int index;

    public boolean addBook(Book book){
        boolean isAdded = false;
        if(book != null){
            books[index++] = book;
            isAdded = true;
        } else {
            System.out.println("Invalid data");
        }
        return isAdded;
    }

    public void getAllBookDetails(){
        System.out.println("All the book details are:");
        for(Book book : books){
            if(book != null){
                System.out.println("Book ID: " + book.getBookId());
                System.out.println("Title: " + book.getTitle());
                System.out.println("Author: " + book.getAuthor());
                System.out.println("Publisher: " + book.getPublisher());
                System.out.println("Genre: " + book.getGenre());
                System.out.println("Pages: " + book.getPages());
                System.out.println("----------------------------------");
            }
        }
    }

    public String updateTitleById(int id, String title){
        if(id != 0){
            for(Book book : books){
                if(id == book.getBookId()){
                    book.setTitle(title);
                }
            }
        }
        return title;
    }

    public String updateAuthorById(int id, String author){
        if(id != 0){
            for(Book book : books){
                if(id == book.getBookId()){
                    book.setAuthor(author);
                }
            }
        }
        return author;
    }

    public String updatePublisherById(int id, String publisher){
        if(id != 0){
            for(Book book : books){
                if(id == book.getBookId()){
                    book.setPublisher(publisher);
                }
            }
        }
        return publisher;
    }

    public GENRE updateGenreById(int id, GENRE genre){
        genre=null;
        if(id != 0){
            for(Book book : books){
                if(id == book.getBookId()){
                    book.getGenre();
                }
            }
        }
        return genre;
    }

    public int updatePagesById(int id, int pages){
        if(id != 0){
            for(Book book : books){
                if(id == book.getBookId()){
                    book.setPages(pages);
                }
            }
        }
        return pages;
    }

    public String getTitleById(int id){
        String title = null;
        for(Book book : books){
            if(id == book.getBookId()){
                title = book.getTitle();
            }
        }
        return title;
    }

    public String getAuthorById(int id){
        String author = null;
        for(Book book : books){
            if(id == book.getBookId()){
                author =book.getAuthor();
            }
        }
        return author;
    }

    public String getPublisherById(int id){
        String publisher = null;
        for(Book book : books){
            if(id == book.getBookId()){
                publisher = book.getPublisher();
            }
        }
        return publisher;
    }

    public GENRE getGenreById(int id){
        GENRE genre = null;
        for(Book book : books){
            if(id == book.getBookId()){
                genre = book.getGenre();
            }
        }
        return genre;
    }

    public int getPagesById(int id){
        int pages = 0;
        for(Book book:books){
            if(id == book.getBookId()){
                pages = book.getPages();
            }
        }
        return pages;
    }

    public boolean isBookExistById(int id){
        for(Book book:books){
            if(book != null && book.getBookId() == id){
                return true;
            }
        }
        return false;
    }

    public int getTotalBooks(){
        return index;
    }
}