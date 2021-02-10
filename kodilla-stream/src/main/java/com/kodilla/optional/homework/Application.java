package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Mark Bold",new Teacher("John Clark")));
        students.add(new Student("Sara Rich", new Teacher("Anna Dark")));
        students.add(new Student("Robert Cook", null));
        students.add(new Student("Emily White", new Teacher("Emma Twins")));
        students.add(new Student("Patric O'Conor", new Teacher("Steven Rocked")));
        students.add(new Student("Lora Daisy", null));
        students.add(new Student("Olivia Tommson", null));

        for (Student student: students) {
            Optional<Teacher> optionalTeacher = Optional.ofNullable(student.getTeacher());
            Teacher teacherName = optionalTeacher.orElse(new Teacher("<undefined>"));
            System.out.println("uczeń: " + student.getName() + ", nauczyciel: " + teacherName.getName());
        }
    }
}
