package com.kodilla.collections.adv.immutable.special.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static com.kodilla.collections.adv.immutable.special.homework.BookManager.books;
import static org.junit.jupiter.api.Assertions.*;

class BookManagerTestSuite {

    @Test
    public void testCreateBook() {
        //Given
        Book book = Book.of("Chłopi", "Reymont");
        books.add(book);

        //When
        BookManager.createBook("Chłopi", "Reymont");

        //Then
        Assertions.assertEquals(1, books.size());
    }

}