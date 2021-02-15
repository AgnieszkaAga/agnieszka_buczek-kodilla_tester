package com.kodilla.exception.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseTestSuite {

    @Test
    public void testGetOrder() throws OrderDoesntExistException {
        // given
        Warehouse.addOrder(new Order("122"));
        // when
        Order result = Warehouse.getOrder("122");
        Order expectedOrder = new Order("122");
        // then
        assertEquals(expectedOrder, result);
    }

    @Test
    public void testGetOrder_withException() throws OrderDoesntExistException {
        Exception exception = assertThrows(OrderDoesntExistException.class, () -> {
            Order result = Warehouse.getOrder("1244552");
        });
    }
}