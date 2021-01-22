package com.kodilla.abstracts.homework.shape;

public class Application {
    public static void main(String[] args) {

        ShapeProcessor processor = new ShapeProcessor();

        Quadrat quadrat = new Quadrat(6);
        processor.process(quadrat);

        Rectangle rectangle = new Rectangle(1,2);
        processor.process(rectangle);

        Circle circle = new Circle(6);
        processor.process(circle);
    }
}
