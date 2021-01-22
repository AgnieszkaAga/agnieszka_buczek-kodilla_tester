package com.kodilla.abstracts.homework.job;

public class Manager extends Job{
    public Manager() {
        super(10000,
                "manager. Responsibilities: managing departments, negotiations, raporting");
    }

    @Override
    public void showResponsibilities() {}
}
