package com.kodilla.collections.interfaces.homework;

public class Fiat implements Car{
    private int speed;
    private String name = "Fiat";

    public Fiat (int speed){
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
        return 10;
    }

    @Override
    public int decreaseSpeed() {
        return 8;
    }
}
