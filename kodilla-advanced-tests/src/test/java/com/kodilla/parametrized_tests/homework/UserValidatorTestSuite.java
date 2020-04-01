package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTestSuite {

    UserValidator userValidator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = {"Suzie67", "caraoLLi-s", "..--", "01."})
    public void shouldReturnTrueIfUsernameIsCorrect(String username) {
        assertTrue(userValidator.validateUsername(username));
    }

    @ParameterizedTest
    @ValueSource(strings = {"Suzie,67", "ca", "jul$", "vero&tom", "jula@"})
    public void shouldReturnFalseIfUsernameIsInvalid(String username) {
        assertFalse(userValidator.validateUsername(username));
    }

    @ParameterizedTest
    @ValueSource(strings = {"suzie67.fort@flisat.ok.newbi", "caroll-i.uter45@d.n.l", "45_.0@p.pl", "_._@-.-.nhlpdo",
            "a@go.pl"})
    public void shouldReturnTrueIfEmailIsCorrect(String email) {
        assertTrue(userValidator.validateEmail(email));
    }

    @ParameterizedTest
    @ValueSource(strings = {"suzie67!@flisat.ok", "caroll>@drabex.nhl", "caroll-i.uter45@d", "45_.0@ru.op.company",
            "02@d3.ty7", "@fm.pl", " "})
    public void shouldReturnFalseIfEmailIsInvalid(String email) {
        assertFalse(userValidator.validateEmail(email));
    }
}