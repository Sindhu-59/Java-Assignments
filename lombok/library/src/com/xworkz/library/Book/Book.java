package com.xworkz.library.Book;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    int bookId;
    String authorName;
    String bookName;
    String publishDate;
    int pages;
}
