package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ford ford = (Ford) o;
        return speed == ford.speed && Objects.equals(name, ford.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed, name);
    }
}
