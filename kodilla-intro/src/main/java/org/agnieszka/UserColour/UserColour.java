package org.agnieszka.UserColour;

import java.util.Scanner;

public class UserColour {
    public static String getUserColour() {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Select colour: B-blue, R-red, Y-yellow, G-green");
            String selectedColour = scanner.nextLine().trim().toUpperCase();
            switch (selectedColour){
                case "B": return "blue";
                case "R": return "red";
                case "Y": return "yellow";
                case "G": return "green";
                default:
                    System.out.println("Select your color from the list! Try once again.");
            }
        }

    }
}
