package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GamblingMachineTestSuite {
    GamblingMachine machine = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources = "/validNumbers.csv")
    public void returnTrueIfValidNumbersAndResultInRange(String numbers)
            throws InvalidNumbersException {
        String[] myStringNumbers = numbers.split(",");
        Set<Integer> myNumbers = new HashSet<>();
        for (int n = 0; n< myStringNumbers.length; n++) {
            Integer a = Integer.parseInt(myStringNumbers[n]);
            myNumbers.add(a);
        }
            int result = machine.howManyWins(myNumbers);
            assertTrue(result < 7 && result >= 0);
        }

    @ParameterizedTest
    @CsvFileSource(resources = "/invalidNumbers.csv")
    public void returnFalseIfNotEnoughOrTooMuchNumbersOrInvalidNumbers(String numbers)
            throws InvalidNumbersException {
        String[] myStringNumbers = numbers.split(",");
        Set<Integer> myNumbers = new HashSet<>();
        for (int n = 0; n< myStringNumbers.length; n++) {
            Integer a = Integer.parseInt(myStringNumbers[n]);
            myNumbers.add(a);
        }
        Exception exception = assertThrows(InvalidNumbersException.class, () -> {
            machine.howManyWins(myNumbers);
        });
    }
    }
