package org.agnieszka.book;

public class BookApp {
    public static void main(String[] args) {
        Book book = Book.of("Isaac Asimov", "The Galaxy");
        System.out.println(book.getAuthor() + " - " + book.getTitle());
    }
}
