package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class DeliveryServiceTestSuite {

    @Test
    public void testDeliverPackage() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        DeliveryService bean = context.getBean(DeliveryService.class);
        boolean resultTrue = bean.deliverPackage("Warsaw, ul. Wiejska 13",30.0);
        boolean resultFalse = bean.deliverPackage("Berlin, Frauenstrasse 225",30.5);

        Assertions.assertTrue(resultTrue);
        Assertions.assertFalse(resultFalse);
    }

}