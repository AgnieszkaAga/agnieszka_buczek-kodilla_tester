package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Eagle","20x30",true));
        stamps.add(new Stamp("Mieszko I","25x25",false));
        stamps.add(new Stamp("Eagle","20x30",true));
        stamps.add(new Stamp("Bolesław Chrobry","25x25",true));
        stamps.add(new Stamp("Eagle","20x30",true));
        stamps.add(new Stamp("Castle", "20x30", false));
        stamps.add(new Stamp("Owl","20x30",false));
        stamps.add(new Stamp("Eagle","20x30",true));

        System.out.println("Colleciotn size: "+ stamps.size());
        for (Stamp stamp : stamps)
            System.out.println(stamp);
    }
}
