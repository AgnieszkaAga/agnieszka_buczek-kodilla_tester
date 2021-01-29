package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ferrari ferrari = (Ferrari) o;
        return speed == ferrari.speed && Objects.equals(name, ferrari.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed, name);
    }
}
