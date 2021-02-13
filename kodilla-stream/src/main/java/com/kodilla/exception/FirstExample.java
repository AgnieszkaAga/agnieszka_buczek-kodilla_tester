package com.kodilla.exception;

public class FirstExample {
    public static void main(String[] args) {
        String username = "John Deep";
        String [] nameParts = username.split(" ");
        System.out.println("Name: " + nameParts[0]);
        System.out.println("LastName: " + nameParts[1]);
    }
}
