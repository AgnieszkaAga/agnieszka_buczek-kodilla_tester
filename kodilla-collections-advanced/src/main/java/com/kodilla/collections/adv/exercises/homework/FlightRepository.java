package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FlightRepository {

    public static List<Flight> getFlightsTable(){
        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("London", "Berlin"));
        flights.add(new Flight("London", "Vienna"));
        flights.add(new Flight("Paris", "London"));
        flights.add(new Flight("Barcelona", "London"));
        flights.add(new Flight("London","Lisbona"));
        flights.add(new Flight("Toronto","London"));
        flights.add(new Flight("Paris", "London"));

        return flights;
    }
}
