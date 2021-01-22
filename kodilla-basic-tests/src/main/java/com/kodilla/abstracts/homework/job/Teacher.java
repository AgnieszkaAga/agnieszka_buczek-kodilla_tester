package com.kodilla.abstracts.homework.job;

public class Teacher extends Job {
    public Teacher() {
        super(3000,
                "teacher. Responsibilities: teaching students, selfdevelopment");
    }

    @Override
    public void showResponsibilities() {}
}
