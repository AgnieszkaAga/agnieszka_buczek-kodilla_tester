package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {

        Fiat fiat = new Fiat(80);
        doRace(fiat);

        Ferrari ferrari = new Ferrari(10);
        doRace(ferrari);

        Ford ford = new Ford(90);
        doRace(ford);
    }

        private static void doRace(Car car) {
            int speed =  car.getSpeed() + car.increaseSpeed()*3 - car.decreaseSpeed()*2;
            System.out.println("Speed of " + car.getName()+": " +speed+" km/h");
        }
    }
