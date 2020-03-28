//package com.kodilla.parametrized_tests.homework;
//
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.CsvFileSource;
//import org.junit.jupiter.params.provider.ValueSource;
//
//import java.util.HashSet;
//import java.util.Set;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class GamblingMachineTestSuite {
//
//    private GamblingMachine gamblingMachine = new GamblingMachine();
//
//    @ParameterizedTest
//    @CsvFileSource(resources = "/userNumbers.csv")
//    public void shouldCountHowManyWins(Set<Integer> userNumbers, int expected) throws InvalidNumbersException {
//        int result = gamblingMachine.howManyWins(userNumbers);
//        assertEquals(expected, result);
//    }
//
//}