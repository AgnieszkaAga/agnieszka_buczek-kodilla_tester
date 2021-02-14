package com.kodilla.exception.homework;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

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
        List<Order> myOrder = orders
                .stream()
                .filter(n -> n.getNumber().equals(number))
                .collect(Collectors.toList());
        for (Order singleOrder : myOrder) {
            System.out.println(singleOrder);
        }
        if (myOrder.isEmpty())
            throw new OrderDoesntExistException();
        return myOrder.get(0);
    }
}
