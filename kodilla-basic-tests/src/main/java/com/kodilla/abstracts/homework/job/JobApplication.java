package com.kodilla.abstracts.homework.job;

public class JobApplication {
    public static void main(String[] args) {
        JobProcessor processor = new JobProcessor();
        Manager manager = new Manager();
        Teacher teacher = new Teacher();
        TruckDriver truckDriver = new TruckDriver();
        Singer singer = new Singer();

        Person janKowalski = new Person("Jan", manager, 55);
        processor.process(janKowalski, janKowalski);

        Person zofia = new Person("Zofia", teacher, 35);
        processor.process(zofia, zofia);

        Person john = new Person("John", truckDriver, 28);
        processor.process(john, john);

        Person olivia = new Person("Olivia", singer,40);
        processor.process(olivia, olivia);

        Person mark = new Person("Mark",truckDriver,33);
        processor.process(mark, mark);
    }
}
