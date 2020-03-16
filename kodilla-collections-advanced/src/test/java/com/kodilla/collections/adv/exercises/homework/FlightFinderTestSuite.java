package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {

    @Test
   public void testFindFlightFrom() {
        //given
        FlightFinder flightFinder = new FlightFinder();

        //when
        List<Flight> result = flightFinder.findFlightsFrom("Warsaw");

        //then
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("Warsaw", "London"));
        expectedList.add(new Flight("Warsaw", "Hamburg"));
        assertEquals(result, expectedList);
    }

    @Test
    public void testFindFlightTo() {
        //given
        FlightFinder flightFinder = new FlightFinder();

        //when
        List<Flight> result = flightFinder.findFlightsTo("Hamburg");

        //then
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("Warsaw", "Hamburg"));
        assertEquals(result, expectedList);
    }
}