package com.kodilla.inheritance.homework;

public class OperatingSystemApp {
    public static void main(String[] args) {

        OperatingSystem regularSystem = new OperatingSystem(2020);
        regularSystem.turningOnTheSystem();
        regularSystem.getYearOfPublishment();
        regularSystem.turningOffTheSystem();

        OperatingSystemPersonalized mySytem = new OperatingSystemPersonalized(2017);
        mySytem.turningOnTheSystem();
        mySytem.getYearOfPublishment();
        mySytem.turningOffTheSystem();

        OperatingSystemForKids kidsSystem = new OperatingSystemForKids(2019);
        kidsSystem.turningOnTheSystem();
        kidsSystem.getYearOfPublishment();
        kidsSystem.turningOffTheSystem();
    }
}
