package com.kodilla.collections.interfaces.homework;

public class Ford implements Car{
    private int speed;
    private String name = "Ford";

    public Ford (int speed){
        this.speed = speed;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getSpeed() {
        return this.speed;
    }

    @Override
    public int increaseSpeed() {
        return 30;
    }

    @Override
    public int decreaseSpeed() {
        return 25;
    }
}
