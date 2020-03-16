package com.kodilla.collections.adv.exercises.homework;

import com.kodilla.collections.adv.exercises.dictionary.EnglishWord;

import java.util.*;

public class FlightFinder {

    public List<Flight> findFlightsFrom(String departure) {
        List<Flight> result = new ArrayList<>();
        for (Flight f : FlightRepository.getFlightsTable()) {
            if (f.getDeparture().equals(departure)) {
                result.add(f);
            }
        }
        return result;
    }

    public List<Flight> findFlightsTo(String arrival) {
        List<Flight> result = new ArrayList<>();
        for (Flight f : FlightRepository.getFlightsTable()) {
            if (f.getArrival().equals(arrival)) {
                result.add(f);
            }
        }
        return result;
    }
}
