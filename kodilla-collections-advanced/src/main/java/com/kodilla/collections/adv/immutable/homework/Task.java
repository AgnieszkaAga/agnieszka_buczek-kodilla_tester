package com.kodilla.collections.adv.immutable.homework;

public final class Task {
    protected final String task;
    protected final int duration;

    public Task(String task, int duration) {
        this.task = task;
        this.duration = duration;
    }

    public final String getTask() {
        return task;
    }

    public final int getDuration() {
        return duration;
    }
}
