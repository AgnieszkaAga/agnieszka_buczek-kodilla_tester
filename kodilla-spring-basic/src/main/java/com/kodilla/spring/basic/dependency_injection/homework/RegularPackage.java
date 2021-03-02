package com.kodilla.spring.basic.dependency_injection.homework;

public class RegularPackage implements DeliveryService {
    @Override
    public boolean deliverPackage(String address, double weight) {
        if (weight > 50 && weight <= 1000) {
            System.out.println("Package too heavy. You probably need to order pallet shipment");
            return false;
        }
        if (weight > 1000 && weight <20000) {
            System.out.println("Package too heavy. You probably need to order full truck load");
            return false;
        }
        if (weight > 20000) {
            System.out.println("Load too heavy. Ask for dedicated transport");
            return false;
        }
        System.out.println("Delivering in progress...");
        return true;
        }
    }
