package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class NotificationServiceTestSuite {

    @Test
    public void testSuccess() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        NotificationService bean = context.getBean(NotificationService.class);
        String result = bean.success("Bielsko-Biała, ul. Poziomkowa 4");

        Assertions.assertEquals("Package delivered to: Bielsko-Biała, ul. Poziomkowa 4", result);
    }

    @Test
    public void testFail() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        NotificationService bean = context.getBean(NotificationService.class);
        String result = bean.fail("Bielsko-Biała, ul. Poziomkowa 4");

        Assertions.assertEquals("Package not delivered to: Bielsko-Biała, ul. Poziomkowa 4", result);
    }
}