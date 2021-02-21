package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.Objects;

public class Order {
    private double orderValue;
    private LocalDate dateOfOrder;
    private String login;

    public Order(LocalDate dateOfOrder, double orderValue, String login) {
        this.orderValue = orderValue;
        this.dateOfOrder = dateOfOrder;
        this.login = login;
    }

    public double getOrderValue() {
        return orderValue;
    }

    public LocalDate getDateOfOrder() {
        return dateOfOrder;
    }

    public String getLogin() {
        return login;
    }

    @Override
    public String toString() {
        return "Order " +
                "value: " + orderValue +
                ", date: " + dateOfOrder +
                ", customer: " + login;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Double.compare(order.orderValue, orderValue) == 0 && Objects.equals(dateOfOrder, order.dateOfOrder) && Objects.equals(login, order.login);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderValue, dateOfOrder, login);
    }
}
