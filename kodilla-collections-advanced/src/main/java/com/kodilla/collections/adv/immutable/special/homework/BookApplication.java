package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {

        Book bookA = BookManager.createBook("Chłopi", "Reymont");
        Book bookB = BookManager.createBook("100 lat samotności", "Marquez");
        Book bookC = BookManager.createBook("100 lat samotności", "Marquez");

        System.out.println(bookA.hashCode());
        System.out.println(bookB.hashCode());
        System.out.println(bookC.hashCode());
        System.out.println(bookB == bookC);
        System.out.println("==========================");
        System.out.println(bookA);
        System.out.println(BookManager.books.size());

      }
}
