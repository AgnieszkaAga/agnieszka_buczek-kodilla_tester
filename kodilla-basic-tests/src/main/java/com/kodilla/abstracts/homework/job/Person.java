package com.kodilla.abstracts.homework.job;

public class Person extends Job{
    private String firstName;
    private int age;
    private Job job;

    public Person(String firstName, Job job, int age) {
        super(0, job.getReponsibilities());
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }

    public Job getJob() {
        return job;
    }

    @Override
    public void showResponsibilities() {
        System.out.println("Responsibilities are: "+job.getReponsibilities());
    }
}
