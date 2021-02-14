package com.kodilla.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse.addOrder(new Order("2021/001"));
        Warehouse.addOrder(new Order("2021/002"));
        Warehouse.addOrder(new Order("2021/003"));
        Warehouse.addOrder(new Order("2020/542"));
        Warehouse.addOrder(new Order("2020/542"));

        System.out.println(Warehouse.orders.size());

        try {
            Warehouse.getOrder("2021/001");
        } catch (OrderDoesntExistException e) {
            System.out.println("Order 2021/001 doesn't exist.");
        }

        try {
            Warehouse.getOrder("2021/020");
        } catch (OrderDoesntExistException e) {
            System.out.println("Order 2021/020 doesn't exist.");
        }
    }
}
