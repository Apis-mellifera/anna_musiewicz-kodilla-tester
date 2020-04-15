package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class PersonTestSuite {

    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.PersonSources#providePersonForTestingBMI")
    public void shouldCalculatePersonBMI(double height, double weight, String expected) {

        assertEquals(expected, new Person(height, weight).getBMI());
    }
}