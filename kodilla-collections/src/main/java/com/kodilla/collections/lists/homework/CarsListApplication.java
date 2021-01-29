package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ferrari;
import com.kodilla.collections.interfaces.homework.Fiat;
import com.kodilla.collections.interfaces.homework.Ford;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Fiat(20));
        cars.add(new Ferrari(130));
        cars.add(new Ford(50));
        cars.add(new Ford(65));
        cars.add(new Fiat(32));
        cars.add(new Fiat(90));

        for (Car car: cars)
            CarUtils.describeCar(car);
        System.out.println("===============================");
        System.out.println("===============================");

        cars.remove(5);
        cars.remove(new Ferrari(130));

        for (Car car: cars)
            CarUtils.describeCar(car);
        System.out.println("===============================");
        System.out.println("Collection size: "+cars.size());
    }
}
