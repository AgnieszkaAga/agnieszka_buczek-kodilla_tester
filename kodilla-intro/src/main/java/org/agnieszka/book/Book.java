package org.agnieszka.book;

public class Book {
    private static int numberOfBooks = 0;
    private String author;
    private String title;

    public static Book of(String author, String title) {
        numberOfBooks++;
        Book myBook = new Book();
        myBook.author = author;
        myBook.title = title;
        return myBook;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }
}

