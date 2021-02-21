package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ShopTestSuite {
    Shop shop = new Shop();

    Order order1 = new Order(LocalDate.of(2021,1,05),100.00, "alex");
    Order order2 = new Order(LocalDate.of(2021,1,05),110.00, "john");
    Order order3 = new Order(LocalDate.of(2021,1,10),120.00, "susanna");
    Order order4 = new Order(LocalDate.of(2021,1,15),120.00, "marco");
    Order order5 = new Order(LocalDate.of(2021,1,20),140.00, "simon");
    Order order6 = new Order(LocalDate.of(2021,1,30),150.00, "alex");

    @BeforeEach
    public void initializeShop() {
        shop.addOrder(order1);
        shop.addOrder(order2);
        shop.addOrder(order3);
        shop.addOrder(order4);
        shop.addOrder(order5);
        shop.addOrder(order6);
    }

    @Test
    public void testAddOrder() {
        //when
        int numberOfOrders = shop.getOrdersNumber();
        Set<Order> result = shop.getOrderFromPeriod(LocalDate.of(2020,1,1), LocalDate.of(2022,12,31));

        //then
        assertEquals(6,numberOfOrders);
        assertTrue(result.contains(order1) && result.contains(order2) && result.contains(order3) && result.contains(order4));
    }

    @Test
    public void testGetOrderFromPeriod() {
        //when
        Set<Order> result = shop.getOrderFromPeriod(LocalDate.of(2021, 1, 5), LocalDate.of(2021, 1, 15));

        // then
        assertEquals(4, result.size());
        assertTrue(result.contains(order1) && result.contains(order2) && result.contains(order3) && result.contains(order4));
    }

    @Test
    public void testGetOrderFromRangeOfValue() {
        //when
        Set<Order> result = shop.getOrderFromRangeOfValue(115,160);

        //then
        assertEquals(4, result.size());
        assertTrue(result.contains(order3) && result.contains(order4) && result.contains(order5) && result.contains(order6));
    }

    @Test
    public void testGetOrdersNumber() {
        //when
        int result = shop.getOrdersNumber();

        //then
        assertEquals(6, result);
    }

    @Test
    public void testGetSumOfOrdersValues() {
        //when
        double sum = shop.getSumOfOrdersValues();

        //then
        assertEquals(740, sum);
    }
}