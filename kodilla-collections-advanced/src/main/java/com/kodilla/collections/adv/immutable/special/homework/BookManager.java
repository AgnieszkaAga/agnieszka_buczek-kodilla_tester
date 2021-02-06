package com.kodilla.collections.adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.List;

public class BookManager {
    static List<Book> books = new ArrayList<>();

    public static Book createBook(String title, String author) {
        Book book = new Book(title,author);
                return book;
    }

//    public static boolean justExist() {
//        Book newBook = BookManager.createBook();
//        for (Book myBook : books)
//            if (myBook.equals(book)) {}
//            else {
//                books.add(new Book(title, author));
//            }
//    }
}