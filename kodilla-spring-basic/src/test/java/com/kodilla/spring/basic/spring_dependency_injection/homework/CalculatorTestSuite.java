package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class CalculatorTestSuite {
    ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");

    @Test
    public void shouldReturnCorrectMessage() {
        Display bean = context.getBean(Display.class);
        String result = bean.display(100.0);
        Assertions.assertEquals("Result: 100.0", result);
    }

    @Test
    public void shouldReturnCorrectResultOfAddingAndMessage() {
        Calculator bean = context.getBean(Calculator.class);
        double result = bean.add(50,12);
        Display beanDisplay = context.getBean(Display.class);
        String message = beanDisplay.display(result);

        Assertions.assertEquals("Result: 62.0", message);
        Assertions.assertEquals(62, result);
    }

    @Test
    public void shouldReturnCorrectResultOfSubtractingAndMessage() {
        Calculator bean = context.getBean(Calculator.class);
        double result = bean.subtract(50,12);
        Display beanDisplay = context.getBean(Display.class);
        String message = beanDisplay.display(result);

        Assertions.assertEquals("Result: 38.0", message);
        Assertions.assertEquals(38, result);
    }

    @Test
    public void shouldReturnCorrectResultOfMultiplyingAndMessage() {
        Calculator bean = context.getBean(Calculator.class);
        double result = bean.multiply(11,2);
        Display beanDisplay = context.getBean(Display.class);
        String message = beanDisplay.display(result);

        Assertions.assertEquals("Result: 22.0", message);
        Assertions.assertEquals(22, result);
    }

    @Test
    public void shouldReturnCorrectResultOfDividingAndMessage() {
        Calculator bean = context.getBean(Calculator.class);
        double result = bean.divide(11,2);
        Display beanDisplay = context.getBean(Display.class);
        String message = beanDisplay.display(result);

        Assertions.assertEquals("Result: 5.5", message);
        Assertions.assertEquals(5.5, result);
    }

    @Test
    public void shouldReturnZeroWhenDividingByZeroAndCorrectMessage() {
        Calculator bean = context.getBean(Calculator.class);
        double result = bean.divide(1123,0);
        Display beanDisplay = context.getBean(Display.class);
        String message = beanDisplay.display(result);

        Assertions.assertEquals("Result: 0.0", message);
        Assertions.assertEquals(0, result);
    }
}