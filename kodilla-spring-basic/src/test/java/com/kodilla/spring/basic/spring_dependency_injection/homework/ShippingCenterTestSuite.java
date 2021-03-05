package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class ShippingCenterTestSuite {

    @Test
    public void shouldReturnCorrectMessageFromShippingCenter() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        ShippingCenter beanShippingCenter = context.getBean(ShippingCenter.class);
        String resultSuccess = beanShippingCenter.sendPackage("London, 5 New Avenue",10.5);
        String resultFail = beanShippingCenter.sendPackage("Kraków, ul. Czartoryskich 12", 32.1);

        Assertions.assertEquals("Package delivered to: London, 5 New Avenue", resultSuccess);
        Assertions.assertEquals("Package not delivered to: Kraków, ul. Czartoryskich 12", resultFail);
    }
}