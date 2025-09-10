package com.xworkz.library.Book;

import com.xworkz.library.Constants.GENRE;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// Book Entity class
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    private int bookId;
    private String title;
    private String author;
    private String publisher;
    private GENRE genre;
    private int pages;
}
