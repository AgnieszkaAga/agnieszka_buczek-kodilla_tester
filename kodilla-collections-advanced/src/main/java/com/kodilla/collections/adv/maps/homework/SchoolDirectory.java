package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        School school1 = new School("College of Franklin", 20,18,21,25,25,19);
        School school2 = new School("New College", 22,12,21,25,24,23,20,20,20,15);
        School school3 = new School("College of London", 18,18,19,18,18,20,21,18,18);
        School school4 = new School("Best College",15,15,15,15,15,15,15);

        Principal john = new Principal("John","Clark");
        Principal andy = new Principal("Andy", "Rocket");
        Principal susan = new Principal("Suzan", "White");
        Principal anna = new Principal("Anna", "Great");

        Map<Principal,School> schoolDirector = new HashMap<>();
        schoolDirector.put(john,school1);
        schoolDirector.put(andy, school2);
        schoolDirector.put(susan, school3);
        schoolDirector.put(anna, school4);

        for (Map.Entry<Principal,School> school : schoolDirector.entrySet())
            System.out.println(school.getKey().getFirstname() + " " + school.getKey().getLastname()
                    + " - " + school.getValue().getSchoolName()+ " - number of students: "
                    + school.getValue().getSchoolSize());
        }
}
