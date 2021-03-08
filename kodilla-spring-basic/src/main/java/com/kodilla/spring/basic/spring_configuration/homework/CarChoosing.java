package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.LocalTime;

@Configuration
public class CarChoosing {


    @Bean
    public Car createCar() {
        int month = LocalDate.now().getMonthValue();
        int hour = LocalTime.now().getHour();
        Car car;
        if (month >= 6 && month <= 8)
            car = new Cabrio(hour >= 20 || hour <=6);
        else if (month == 12 || month >=1 && month <=2)
            car = new SUV(hour >= 20 || hour <=6);
        else
            car = new Sedan(hour >= 20 || hour <=6);

        return car;
    }
}
