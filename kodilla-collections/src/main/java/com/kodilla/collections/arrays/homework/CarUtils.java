package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;

public class CarUtils {
    public static void describeCar(Car car) {
        System.out.println("-------------------------------");
        System.out.println("Car type: " + car.getName());
        System.out.println("Car start speed: "+ car.getSpeed());
        System.out.println("Car acceleration: "+ car.increaseSpeed());
        System.out.println("Car braking: " + car.decreaseSpeed());

    }
}
