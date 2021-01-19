package com.kodilla.inheritance.homework;

public class OperatingSystemPersonalized extends OperatingSystem {

    public OperatingSystemPersonalized(int yearOfPublishment){
        super(yearOfPublishment);
    }

    @Override
    public void turningOnTheSystem () {
        System.out.println("Hello, it's nice to see you. System is turning on ... Please wait a minute...");
    }

    @Override
    public void turningOffTheSystem () {
        System.out.println("System is turning off ... See you!");
    }
}
