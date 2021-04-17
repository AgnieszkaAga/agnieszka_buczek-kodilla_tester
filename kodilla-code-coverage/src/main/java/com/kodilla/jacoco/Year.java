package com.kodilla.jacoco;

public class Year {
    int myYear;

    public Year(int year) {
        this.myYear = year;
    }

    public boolean isLeap() {
        if (this.myYear % 4 == 0) {
            if (this.myYear % 100 == 0) {
                return (this.myYear % 400 == 0);
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}
