package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTestSuite {
    UserValidator validator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = {"aaa", "1234df", "aa.GERdgf1", ".._-", "111-456-asd", "..__--", "aNZY123456789"})
    public void returnTrueIfUsernameIsProper(String input) {
        assertTrue(validator.validateUsername(input));
    }

    @ParameterizedTest
    @NullAndEmptySource
    public void returnFalseIfNullOrEmpty(String input) {
        assertFalse(validator.validateUsername(input));
    }

    @ParameterizedTest
    @ValueSource(strings = {"1", "aA", "00", "@df54", "jkk -.", "!!!", "ą1234"})
    public void returnFalseIfUserNameIsTooShortOrHasIllegalChars(String input) {
        assertFalse(validator.validateUsername(input));
    }

    @ParameterizedTest
    @ValueSource(strings = {"a@b.C", "123@456.m", "sdfas12@DFKDLF.kldwjk", "a_bjk12-LSD@1232.pL", "_@--.P"})
    public void returnTrueIfAddressEmailIsProper(String input) {
        assertTrue(validator.validateEmail(input));
    }

    @ParameterizedTest
    @ValueSource(strings = {"@dfs.pl", "fdsjjlk.com", "fdd@123.", "dfjk@sdfkl123"})
    public void returnFalseIfEmailAddressHasNoAtDotOrDemandPart(String input) {
        assertFalse(validator.validateEmail(input));
    }

    @ParameterizedTest
    @ValueSource(strings = {"bbby@dfs.com.pl", "arrr.fdsjjlk@com.com", "fdd@123..bbb", "aa$$!@klops.pl", "fel@@rle.stop", "jan@nezb.janowice"})
    public void returnFalseIfEmailAddressHasIllegalCharsOrTooLongEndingOrAdditionalParts(String input) {
        assertFalse(validator.validateEmail(input));
    }

    @ParameterizedTest
    @NullAndEmptySource
    public void ReturnFalseIfContainsNullOrEmptyEmail(String input) {
        assertFalse(validator.validateEmail(input));
    }
}