package com.kodilla.spring.basic.dependency_injection.homework;

public class LorryShipment implements DeliveryService {
    @Override
    public boolean deliverPackage(String address, double weight) {
        if (weight > 20000) {
            System.out.println("Load too heavy. Ask for dedicated transport");
            return false;
        }
        System.out.println("Delivering in progress...");
        return true;
    }
}
