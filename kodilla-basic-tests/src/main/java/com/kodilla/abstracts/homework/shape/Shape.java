package com.kodilla.abstracts.homework.shape;

public abstract class Shape {
    static double PI = 3.1415927;
    private double side1Size;
    private double side2Size;
    private double radius;

    public Shape(double side1Size, double side2Size, double radius) {
        this.side1Size = side1Size;
        this.side2Size = side2Size;
        this.radius = radius;
    }

    public double getSide1Size() {
        return side1Size;
    }
    public double getSide2Size() {
        return side2Size;
    }
    public double getRadius() {
        return radius;
    }

    public abstract double calculateArea();

    public abstract double calcutateCircuit();
}
