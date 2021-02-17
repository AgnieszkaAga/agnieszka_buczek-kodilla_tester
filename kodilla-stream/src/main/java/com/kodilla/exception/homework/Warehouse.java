package com.kodilla.exception.homework;

import java.util.HashSet;
import java.util.Set;

public class Warehouse {
    static Set<Order> orders = new HashSet<>();

    public Set<Order> getOrders() {
        return orders;
    }

    public static void addOrder(Order order) {
        if (orders.contains(order))
            System.out.println(order + " already exists in order base");
        else {
            orders.add(order);
            System.out.println(order + " - Order has been added.");
        }
    }

    public static Order getOrder(String number) throws OrderDoesntExistException {
        Order myOrder = orders
                .stream()
                .filter(n -> n.getNumber().equals(number))
                .findFirst().orElseThrow(OrderDoesntExistException::new);

        System.out.println(myOrder);

        return myOrder;
    }
}
