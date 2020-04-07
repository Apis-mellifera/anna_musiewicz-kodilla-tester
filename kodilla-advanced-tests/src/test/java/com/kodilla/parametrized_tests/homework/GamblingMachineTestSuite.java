package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class GamblingMachineTestSuite {

    private GamblingMachine gamblingMachine = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources = "/userNumbers.csv")
    public void shouldCountHowManyWinsWhenSixValidNumbersGiven(int a, int b, int c, int d, int e, int f) throws InvalidNumbersException {
        Set<Integer> userNumbers = new HashSet<>(Arrays.asList(a, b, c, d, e, f));
        int result = gamblingMachine.howManyWins(userNumbers);
        assertTrue(result >= 0 && result <= 6);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/userNumbersWithZero.csv")
    public void shouldTrowInvalidNumberExceptionWhenNumberZeroGiven(int a, int b, int c, int d, int e, int f) throws InvalidNumbersException {
        Set<Integer> userNumbers = new HashSet<>(Arrays.asList(a, b, c, d, e, f));
        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(userNumbers));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/userThreeNumbers.csv")
    public void shouldTrowInvalidNumberExceptionWhenThreeNumbersGiven(int a, int b, int c) throws InvalidNumbersException {
        Set<Integer> userNumbers = new HashSet<>(Arrays.asList(a, b, c));
        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(userNumbers));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/userFiveNumbers.csv")
    public void shouldTrowInvalidNumberExceptionWhenFiveNumbersGiven(int a, int b, int c, int d, int e) throws InvalidNumbersException {
        Set<Integer> userNumbers = new HashSet<>(Arrays.asList(a, b, c, d, e));
        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(userNumbers));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/userSevenNumbers.csv")
    public void shouldTrowInvalidNumberExceptionWhenSevenNumbersGiven(int a, int b, int c, int d, int e, int f, int g) throws InvalidNumbersException {
        Set<Integer> userNumbers = new HashSet<>(Arrays.asList(a, b, c, d, e, f, g));
        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(userNumbers));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/emptyUserNumbers.csv")
    public void shouldTrowInvalidNumberExceptionWhenUserNumbersIsEmpty() throws InvalidNumbersException {
        Set<Integer> userNumbers = new HashSet<>();
        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(userNumbers));
    }

    @ParameterizedTest
    @ValueSource(ints = {5})
    public void shouldTrowInvalidNumberExceptionWhenOnlyOneNumberGiven(int a) throws InvalidNumbersException {
        Set<Integer> userNumbers = new HashSet<>(a);
        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(userNumbers));
    }
}