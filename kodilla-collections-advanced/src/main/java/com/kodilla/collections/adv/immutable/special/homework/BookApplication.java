package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {

        Book bookA = BookManager.createBook("Chłopi", "Reymont");
        Book bookB = BookManager.createBook("100 lat samotności", "Marquez");
        Book bookC = BookManager.createBook("100 lat samotności", "Marquez");
        Book bookD = BookManager.createBook("Chłopi", "Reymont");

//        System.out.println(bookA.hashCode());
//        System.out.println(bookB.hashCode());
//        System.out.println(bookC.hashCode());
//        System.out.println(bookB.equals(bookC));
        System.out.println("==========================");
        System.out.println(bookA == bookB);
        System.out.println(bookB == bookC);
        System.out.println(bookA == bookD);
//        System.out.println(BookManager.books.size());

      }
}
