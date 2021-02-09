package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    public static List<Task> getTasks(){
        List<Task> myList = new ArrayList<>();
        myList.add(new Task("Verification",
                LocalDate.of(2021,2,10), LocalDate.of(2022, 2, 28)));
        myList.add(new Task("Preparing documentation",
                LocalDate.of(2021,2,2), LocalDate.of(2021, 2, 7)));
        myList.add(new Task("Arrange appointment",
                LocalDate.of(2021,2,9), LocalDate.of(2021, 2, 9)));
        myList.add(new Task("Double check the balance",
                LocalDate.of(2021,2,9), LocalDate.of(2021, 2, 11)));
        myList.add(new Task("To find new solution",
                LocalDate.of(2021,2,9), LocalDate.of(2021, 2, 24)));
        myList.add(new Task("Presentation",
                LocalDate.of(2021,2,9), LocalDate.of(2021, 1, 30)));
        myList.add(new Task("Meeting",
                LocalDate.of(2021,2,9), LocalDate.of(2021, 3, 20)));
        return myList;
    }
}
