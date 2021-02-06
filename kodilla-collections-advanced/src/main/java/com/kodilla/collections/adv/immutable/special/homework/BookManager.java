package com.kodilla.collections.adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.List;

public class BookManager {
    static List<Book> books = new ArrayList<>();

    public static Book createBook(String title, String author) {
        Book book = new Book(title, author);
        for (Book tempBook : books) {
            if (book.equals(tempBook)) {
                System.out.println("This book is already in the base");
            } else {
                books.add(book);
            }
        }
        return book;
    }
}