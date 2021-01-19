package com.kodilla.inheritance.homework;

public class OperatingSystemForKids extends OperatingSystem {

    public OperatingSystemForKids(int yearOfPublishment){
        super(yearOfPublishment);
    }

    @Override
    public void turningOnTheSystem () {
        System.out.println("Hello!!! Please do not touch anything, just wait a minute...");
    }

    @Override
    public void turningOffTheSystem () {
        System.out.println("Well done, It is time to play outside!!! Bye!!!");
    }
}
