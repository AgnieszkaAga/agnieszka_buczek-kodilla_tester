package com.kodilla.abstracts.homework.shape;

public class ShapeProcessor {
    public void process(Shape shape) {
        System.out.println("The area of this shape is: "+shape.calculateArea());
        System.out.println("The circuit of this shape is: "+shape.calcutateCircuit());
    }
}
