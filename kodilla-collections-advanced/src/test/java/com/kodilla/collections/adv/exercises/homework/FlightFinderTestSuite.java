package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {

    @Test
    public void testFindingFlightsDestinationGiven(){
        // given
        FlightFinder flightFinder = new FlightFinder();
        // when
        List<Flight> result = flightFinder.findFlightsFrom("Paris");
        // then
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("Paris","London"));
        expectedList.add(new Flight("Paris","London"));
        assertEquals(expectedList, result);
    }

    @Test
    public void testFindingFlightsArrivalGiven() {
        // given
        FlightFinder flightFinder = new FlightFinder();
        // when
        List<Flight> result = flightFinder.findFlightsTo("London");
        // then
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("Paris", "London"));
        expectedList.add(new Flight("Barcelona", "London"));
        expectedList.add(new Flight("Toronto", "London"));
        expectedList.add(new Flight("Paris", "London"));
        assertEquals(expectedList, result);
    }
}