package com.kodilla.abstracts.homework.shape;

public class Rectangle extends Shape {


    public Rectangle(double side1Size, double side2Size) {
        super(side1Size, side2Size, 0);
        System.out.println("Rectangle - sides "+side1Size+" ; "+side2Size+": ");
    }

    @Override
    public double calculateArea() {
        return getSide1Size()*getSide2Size();
    }

    @Override
    public double calcutateCircuit() {
        return 2*getSide1Size()+2*getSide2Size();
    }
}
