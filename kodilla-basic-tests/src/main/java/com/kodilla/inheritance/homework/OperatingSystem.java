package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int yearOfPublishment;

    public OperatingSystem(int yearOfPublishment) {
        this.yearOfPublishment = yearOfPublishment;
    }

    public void turningOnTheSystem () {
        System.out.println("System is turning on ... Please wait...");
    }

    public void turningOffTheSystem () {
        System.out.println("System is turning off ...");
    }

    public void getYearOfPublishment(){
        System.out.println("Year of publishment: "+yearOfPublishment);
    }
}
