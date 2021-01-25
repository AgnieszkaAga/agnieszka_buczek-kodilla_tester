package com.kodilla.basic_assertion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {
    private static Calculator calculator;

    @BeforeEach
    public void prepare()  {
        calculator = new Calculator();
    }

    @Test
    public void testSum() {
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    }

    @Test
    public void testSubtract() {
      int a = 10;
      int b = 3;
      int subtractResult = calculator.subtract(a, b);
      assertEquals(7,subtractResult);
    }

    @Test
    public void testSquared() {
        int a = 2;
        int b = 0;
        int c = -3;
        int squaredResult1 = calculator.squared(a);
        int squaredResult2 = calculator.squared(b);
        int squaredResult3 = calculator.squared(c);
        assertEquals(4,squaredResult1);
        assertEquals(0,squaredResult2);
        assertEquals(9,squaredResult3);
    }
}
