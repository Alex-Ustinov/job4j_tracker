package ru.job4j.streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class School {
    List<Student> collect(List<Student> students, Predicate<Student> predict) {
        List<Student> newClass = new ArrayList<>();
        for (Student student : students) {
            if (predict.test(student)) {
                newClass.add(student);
            }
        }
        return newClass;
    }
}
