package com.kodilla.execution_model;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceTestSuite {
    Invoice invoice = new Invoice();
    Item papier = new Item("Papier do drukarki", 12.5);
    Item kalkulator = new Item("Kalkulator",30.2);
    Item dziurkacz = new Item("Dziurkacz", 38.50);

    @Test
    public void testAddItem() {
        // when
        int result = invoice.getSize();

        // then
        assertEquals(3, result);
    }

    @Test
    public void testGetItem() {
        // when
        String resultName = invoice.getItem(1).getName();
        double resultPrice = invoice.getItem(1).getPrice();

        // then
        assertEquals("Kalkulator",resultName);
        assertEquals(30.2, resultPrice);
    }

    @Test
    public void testGetItemWhenPassingNegativeIndex() {
        // when
        Item result = invoice.getItem(-1);

        // then
        assertNull(result);
    }

    @Test
    public void testGetItemWhenIndexIsOutOfRange() {
        // when
        Item result = invoice.getItem(6);

        // then
        assertNull(result);
    }

    @Test
    public void testClear() {
        // when
        invoice.clear();
        int result = invoice.getSize();

        // then
        assertEquals(0,result);
    }

    @BeforeEach
    public void initializeInvoice() {
        invoice.addItem(papier);
        invoice.addItem(kalkulator);
        invoice.addItem(dziurkacz);
    }

    @AfterEach
    public void resetValues() {
        System.out.println("Resetting values...");
    }

    @BeforeAll
    public static void displayIntroMessage() {
        System.out.println("Starting testing");
    }

    @AfterAll
    public static void displayGoodByeMessage() {
        System.out.println("Finishing testing");
    }
}