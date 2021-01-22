package com.kodilla.abstracts.homework.job;

public class TruckDriver extends Job{
    public TruckDriver() {
        super(4000,
                "truck driver. Responsibilities: transporting goods from one place to another");
    }

    @Override
    public void showResponsibilities() {}
}
