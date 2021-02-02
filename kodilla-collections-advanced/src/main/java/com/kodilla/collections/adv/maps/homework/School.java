package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Integer> sizeOfClasses = new ArrayList<>();
    private String schoolName;

    public School (String schoolName, int ... size){
        this.schoolName = schoolName;
        for (int classSize : size)
            this.sizeOfClasses.add(classSize);
    }

    public List<Integer> getSizeOfClasses() {
        return sizeOfClasses;
    }

    public String getSchoolName() {
        return schoolName;
    }

    @Override
    public String toString() {
        return "schoolName: " + schoolName;
    }

    public int getSchoolSize() {
        int sum = 0;
        for (int size : sizeOfClasses)
            sum += size;
        return sum;
    }
}
