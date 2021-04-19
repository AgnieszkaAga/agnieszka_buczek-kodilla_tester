package com.kodilla.collections.adv.maps.complex;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class GradesTestSuite {

    @Test
    public void testGetAverage() {
        //Given
        Map<Student, Grades> school = new HashMap<>();
        Student john = new Student("John", "Stevenson");
        Grades johnGrades = new Grades(5.0, 4.0, 4.5, 3.0, 2.0);

        //When
        double johnAverage = johnGrades.getAverage();

        //Then
        Assertions.assertEquals(3.7,johnAverage);
    }

}