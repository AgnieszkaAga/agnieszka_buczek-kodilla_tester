package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalDate;
import java.time.LocalTime;

@SpringBootTest
class CarChoosingTestSuite {

    @Test
    public void shouldReturnCorrectLights() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = (Car) context.getBean("createCar");
        int month = LocalDate.now().getMonthValue();
        int hour = LocalTime.now().getHour();

        //Then
        boolean expectedLights = hour >= 20 || hour <= 6;
        Assertions.assertEquals(expectedLights, car.hasHeadlightsTurnedOn());

        // w inny sposób:
//        if(hour >= 20 || hour <= 6) {
//            Assertions.assertTrue(car.hasHeadlightsTurnedOn());
//        } else {
//            Assertions.assertFalse(car.hasHeadlightsTurnedOn());
//        }

        if (month >= 6 && month <= 8) {
            Assertions.assertTrue(car instanceof Cabrio);
        } else if (month == 12 || month >=1 && month <= 2) {
            Assertions.assertTrue(car instanceof SUV);
        } else {
            Assertions.assertTrue(car instanceof Sedan);
        }
    }
}
