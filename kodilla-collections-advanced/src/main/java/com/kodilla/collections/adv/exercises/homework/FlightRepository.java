package com.kodilla.collections.adv.exercises.homework;

import java.util.*;

public class FlightRepository {
    public Flight flight;

    public FlightRepository(Flight flight) {
        this.flight = flight;
    }

    public Flight getFlight() {
        return flight;
    }

    public static List<Flight> getFlightsTable() {
        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("Warsaw", "London"));
        flights.add(new Flight("Warsaw", "Hamburg"));
        flights.add(new Flight("Riga", "Warsaw"));
        return flights;
    }
}


