package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Shop {
    private Set<Order> orderBase = new HashSet<>();

    public void addOrder(Order order) {
        this.orderBase.add(order);
    }

    public Set<Order> getOrderFromPeriod(LocalDate dateFrom, LocalDate dateTo) {
        Set<Order> dateFilter = orderBase
                .stream()
                .filter(n -> n.getDateOfOrder().isEqual(dateFrom) || n.getDateOfOrder().isAfter(dateFrom))
                .filter(m -> m.getDateOfOrder().isEqual(dateTo) || m.getDateOfOrder().isBefore(dateTo))
                .collect(Collectors.toSet());
        for (Order pickedOrder : dateFilter) {
            System.out.println(pickedOrder);
        }
        return dateFilter;
    }

    public Set<Order> getOrderFromRangeOfValue(double minimum, double maximum) {
        Set<Order> valueFilter = orderBase
                .stream()
                .filter(n -> n.getOrderValue() >= minimum && n.getOrderValue() <=maximum)
                .collect(Collectors.toSet());
        for (Order pickedOrder : valueFilter) {
            System.out.println(pickedOrder);
        }
        return valueFilter;
    }

    public int getOrdersNumber() {
        return orderBase.size();
    }

    public double getSumOfOrdersValues() {
        double sumOfValues = orderBase
                .stream()
                .map(n -> n.getOrderValue())
                .mapToDouble(m -> m)
                .sum();
        return sumOfValues;
    }
}
