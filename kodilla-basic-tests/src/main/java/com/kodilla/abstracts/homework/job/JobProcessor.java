package com.kodilla.abstracts.homework.job;

public class JobProcessor {
    public void process(Job job, Person firstName) {
        System.out.println(firstName.getFirstName());
        System.out.println("is a "+ job.getReponsibilities());
    }
}
