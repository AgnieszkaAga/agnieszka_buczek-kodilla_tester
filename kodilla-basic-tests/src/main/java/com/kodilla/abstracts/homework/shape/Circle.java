package com.kodilla.abstracts.homework.shape;

public class Circle extends Shape{


    public Circle(double radius) {
        super(0, 0, radius);
        System.out.println("Circle - radius "+radius+":");
    }

    @Override
    public double calculateArea() {
        return PI*getRadius()*getRadius();
    }

    @Override
    public double calcutateCircuit() {
        return 2*PI*getRadius();
    }
}
