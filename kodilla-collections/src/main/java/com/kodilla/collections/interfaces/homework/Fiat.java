package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fiat fiat = (Fiat) o;
        return speed == fiat.speed && Objects.equals(name, fiat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed, name);
    }
}
