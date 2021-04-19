package com.kodilla.hibernate.task;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "TASKS_FINANCIALS")
public class TaskFinancialDetails {
    private int id;
    private int price;
    private boolean paid;

    public TaskFinancialDetails(){
    }

    public TaskFinancialDetails(int price,  boolean paid) {
        this.price = price;
        this.paid = paid;
    }

    @Id
    @NotNull
    @GeneratedValue
    @Column(name = "ID", unique = true)
    public int getId() {
        return id;
    }

    @Column(name = "PRICE")
    public int getPrice() {
        return price;
    }

    @NotNull
    @Column(name = "PAID")
    public boolean isPaid() {
        return paid;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }
}
