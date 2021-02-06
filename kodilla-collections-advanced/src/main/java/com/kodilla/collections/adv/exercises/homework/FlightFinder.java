package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FlightFinder {
    public List<Flight> findFlightsFrom(String departure) {
        List<Flight> yourFlights = new ArrayList<>();
            for (Flight flight : FlightRepository.getFlightsTable()) {
                if (flight.getDeparture().equals(departure))
                    yourFlights.add(flight);
            }
        return yourFlights;
    }

    public List<Flight> findFlightsTo(String arrival) {
        List<Flight> yourFlights = new ArrayList<>();
        for (Flight flight : FlightRepository.getFlightsTable()) {
            if (flight.getArrival().equals(arrival))
                yourFlights.add(flight);
    }
        return yourFlights;
    }
}
