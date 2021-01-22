package com.kodilla.abstracts.homework.shape;

public class Quadrat extends Shape {


    public Quadrat(double side1Size) {
        super(side1Size, 0,0);
        System.out.println("Quadrat - side "+side1Size+":");
    }

    @Override
    public double calculateArea() {
        return getSide1Size()*getSide1Size();
    }

    @Override
    public double calcutateCircuit() {
        return 4*getSide1Size();
    }
}
