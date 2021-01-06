package ru.job4j.streamAPI;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class Analyze {

    public static double averageScore(Stream<Pupil> stream) {
        return stream
                .flatMap(p -> p.getSubjects().stream())
                .mapToInt(s -> s.getScore())
                .average()
                .orElse(0.0);
    }

    public static List<Tuple> averageScoreBySubject(Stream<Pupil> stream) {
        return stream.map(p -> {
            return new Tuple(p.getName(), averageScore(Stream.of(p)));
        }).collect(Collectors.toList());
    }

    public static List<Tuple> averageScoreByPupil(Stream<Pupil> stream) {
        return stream
                .flatMap(p -> p.getSubjects().stream())
                .collect(groupingBy(s -> s.getName(), averagingDouble(Subject::getScore)))
                .entrySet()
                .stream()
                .map(s -> {
                    return new Tuple(s.getKey(), s.getValue());
                })
                .sorted((t1, t2) -> t2.getName().compareTo(t1.getName()))
                .collect(Collectors.toList());
    }

    public static Tuple bestStudent(Stream<Pupil> stream) {
        return stream.map(p -> {
            return new Tuple(p.getName(), p.getSubjects()
                    .stream()
                    .mapToInt(s -> s.getScore()).sum());
                })
                .max((p1, p2) -> Double.compare(p1.getScore(), p2.getScore()))
                .orElse(new Tuple("", 0.0));
    }

    public static Tuple bestSubject(Stream<Pupil> stream) {
        return stream
                .flatMap(p -> p.getSubjects().stream())
                .collect(groupingBy(s -> s.getName(), summingDouble(Subject::getScore))).entrySet()
                .stream()
                .map(s -> {
                    return new Tuple(s.getKey(), s.getValue());
                })
                .max((p1, p2) -> Double.compare(p1.getScore(), p2.getScore()))
                .orElse(new Tuple("", 0.0));
    }
}