package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class WeightAndHeightSources {
    static Stream<Arguments> provideDataForTestingVSU() {
        return Stream.of(
                Arguments.of( 1.9, 20),
                Arguments.of(1.8, 48),
                Arguments.of(1.75,40),
                Arguments.of(1.56, 35),
                Arguments.of(-1.56,35)
        );
    }

    static Stream<Arguments> provideDataForTestingSU() {
        return Stream.of(
                Arguments.of( 1.8, 50),
                Arguments.of(1.65, 43),
                Arguments.of(1.75,47),
                Arguments.of(1.56, 38)
        );
    }

    static Stream<Arguments> provideDataForTestingU() {
        return Stream.of(
                Arguments.of( 1.8, 58),
                Arguments.of(1.65, 50),
                Arguments.of(1.75,51),
                Arguments.of(1.56, 43)
        );
    }

    static Stream<Arguments> provideDataForTestingN() {
        return Stream.of(
                Arguments.of( 1.8, 68),
                Arguments.of(1.65, 60),
                Arguments.of(1.75,74),
                Arguments.of(1.56, 58)
        );
    }

    static Stream<Arguments> provideDataForTestingOverweight() {
        return Stream.of(
                Arguments.of( 1.8, 91),
                Arguments.of(1.65, 74),
                Arguments.of(1.75,85),
                Arguments.of(1.56, 68)
        );
    }

    static Stream<Arguments> provideDataForTestingObeseClassI() {
        return Stream.of(
                Arguments.of( 1.8, 110),
                Arguments.of(1.65, 91),
                Arguments.of(1.75,105),
                Arguments.of(1.56, 85)
        );
    }

    static Stream<Arguments> provideDataForTestingObeseClassII() {
        return Stream.of(
                Arguments.of( 1.8, 120),
                Arguments.of(1.65, 105),
                Arguments.of(1.75,120),
                Arguments.of(1.56, 91)
        );
    }

    static Stream<Arguments> provideDataForTestingObeseClassIII() {
        return Stream.of(
                Arguments.of( 1.8, 140),
                Arguments.of(1.65, 120),
                Arguments.of(1.75,130),
                Arguments.of(1.56, 105)
        );
    }

    static Stream<Arguments> provideDataForTestingObeseClassIV() {
        return Stream.of(
                Arguments.of( 1.8, 150),
                Arguments.of(1.65, 130),
                Arguments.of(1.75,147),
                Arguments.of(1.56, 120)
        );
    }

    static Stream<Arguments> provideDataForTestingObeseClassV() {
        return Stream.of(
                Arguments.of( 1.8, 175),
                Arguments.of(1.65, 160),
                Arguments.of(1.75,180),
                Arguments.of(1.56, 140)
        );
    }

    static Stream<Arguments> provideDataForTestingObeseClassVI() {
        return Stream.of(
                Arguments.of( 1.8, 201),
                Arguments.of(1.65, 175),
                Arguments.of(1.75,190),
                Arguments.of(1.56, 160)
        );
    }
}
