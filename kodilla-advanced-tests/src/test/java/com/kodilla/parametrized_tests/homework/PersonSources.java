package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class PersonSources {

    static Stream<Arguments> providePersonForTestingBMI() {
        return Stream.of(
                arguments(1.62, 56.8, "Normal (healthy weight)"),
                arguments(1.68, 130.5, "Obese Class IV (Morbidly Obese)"),
                arguments(1.75, 50.5, "Underweight"),
                arguments(1.75, 48.5, "Severely underweight"),
                arguments(1.75, 45.8, "Very severely underweight"),
                arguments(1.78, 90.3, "Overweight"),
                arguments(1.82, 99.9, "Obese Class I (Moderately obese)"),
                arguments(1.82, 116.7, "Obese Class II (Severely obese)"),
                arguments(1.88, 149.2, "Obese Class III (Very severely obese)"),
                arguments(1.88, 188.1, "Obese Class V (Super Obese)" ),
                arguments(1.95, 229.4, "Obese Class VI (Hyper Obese)")
        );
    }
}
