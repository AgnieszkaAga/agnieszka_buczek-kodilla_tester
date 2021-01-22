package com.kodilla.abstracts.homework.job;

public class Singer extends Job{
    public Singer() {
        super(30000,
                "singer. Responsibilities: making great show, recording CD's");
    }

    @Override
    public void showResponsibilities() {}
}
