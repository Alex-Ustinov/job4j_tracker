package ru.job4j.streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

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

    public Map<String, Student> studentsMap (List<Student> students) {
        return students
            .stream()
            .distinct()
            .collect(Collectors
                    .toMap(
                            student -> student.getSurname(),
                            student -> student,
                            (s1, s2) -> s1
        ));
    }
}
