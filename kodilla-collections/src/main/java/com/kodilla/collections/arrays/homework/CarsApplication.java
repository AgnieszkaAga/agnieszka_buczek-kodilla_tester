package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ferrari;
import com.kodilla.collections.interfaces.homework.Fiat;
import com.kodilla.collections.interfaces.homework.Ford;

import java.util.Random;

public class CarsApplication {
    public static void main(String[] args) {
        Random random = new Random();
        int nuberOfCars = random.nextInt(15);
        Car[] cars = new Car[nuberOfCars + 1];
        for(int n = 0; n < cars.length; n++)
            cars[n] = drawCar();
            for (Car car : cars)
                CarUtils.describeCar(car);

    }

    public static Car drawCar(){
        Random random = new Random();
        int drawnCarType = random.nextInt(3);
        int speedIncrease = random.nextInt(101);
            if (drawnCarType == 0)
                return new Ferrari(0+speedIncrease);
            else if (drawnCarType == 1)
                return new Fiat(0+speedIncrease);
            else
                return new Ford(0+speedIncrease);
    }
}
