package com.kodilla.parametrized_tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StringValidatorTestSuite {
    private StringValidator validator = new StringValidator();

    @Test
    public void shouldReturnFalseIfStringIsNotEmpty() {
        boolean result = validator.isBlank("text");
        assertFalse(result);
    }

    @Test
    public void shouldReturnTrueIfStringHasOnlySpaces () {
        boolean result = validator.isBlank("   ");
        assertTrue(result);
    }

    @ParameterizedTest
    @NullAndEmptySource
    public void shouldReturnTrueIfStringIsEmpty(String text) {
        System.out.println("|" + text + "|");
        assertTrue(validator.isBlank(text));
    }


}