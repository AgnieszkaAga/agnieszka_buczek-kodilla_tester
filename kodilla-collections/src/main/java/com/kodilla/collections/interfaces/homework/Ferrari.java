package com.kodilla.collections.interfaces.homework;

public class Ferrari implements Car {
    private int speed;
    private String name = "Ferrari";

    public Ferrari (int speed){
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
        return 50;
    }

    @Override
    public int decreaseSpeed() {
        return 30;
    }
}
