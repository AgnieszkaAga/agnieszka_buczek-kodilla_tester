package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTestSuite {

    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.WeightAndHeightSources#provideDataForTestingVSU")
        public void returnVerySeverelyUnderweight(double height, double weight) {
            assertEquals("Very severely underweight", new Person(height,weight).getBMI());
        }

    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.WeightAndHeightSources#provideDataForTestingSU")
    public void returnSeverelyUnderweight(double height, double weight) {
        assertEquals("Severely underweight", new Person(height,weight).getBMI());
    }

    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.WeightAndHeightSources#provideDataForTestingU")
    public void returnUnderweight(double height, double weight) {
        assertEquals("Underweight", new Person(height,weight).getBMI());
    }

    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.WeightAndHeightSources#provideDataForTestingN")
    public void returnNormalWeight(double height, double weight) {
        assertEquals("Normal (healthy weight)", new Person(height,weight).getBMI());
    }

    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.WeightAndHeightSources#provideDataForTestingOverweight")
    public void returnNormalOverweight(double height, double weight) {
        assertEquals("Overweight", new Person(height,weight).getBMI());
    }

    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.WeightAndHeightSources#provideDataForTestingObeseClassI")
    public void returnObeseClassI(double height, double weight) {
        assertEquals("Obese Class I (Moderately obese)", new Person(height,weight).getBMI());
    }

    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.WeightAndHeightSources#provideDataForTestingObeseClassII")
    public void returnObeseClassII(double height, double weight) {
        assertEquals("Obese Class II (Severely obese)", new Person(height,weight).getBMI());
    }

    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.WeightAndHeightSources#provideDataForTestingObeseClassIII")
    public void returnObeseClassIII(double height, double weight) {
        assertEquals("Obese Class III (Very severely obese)", new Person(height,weight).getBMI());
    }

    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.WeightAndHeightSources#provideDataForTestingObeseClassIV")
    public void returnObeseClassIV(double height, double weight) {
        assertEquals("Obese Class IV (Morbidly Obese)", new Person(height,weight).getBMI());
    }

    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.WeightAndHeightSources#provideDataForTestingObeseClassV")
    public void returnObeseClassV(double height, double weight) {
        assertEquals("Obese Class V (Super Obese)", new Person(height,weight).getBMI());
    }

    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.WeightAndHeightSources#provideDataForTestingObeseClassVI")
    public void returnObeseClassVI(double height, double weight) {
        assertEquals("Obese Class VI (Hyper Obese)", new Person(height,weight).getBMI());
    }
    }