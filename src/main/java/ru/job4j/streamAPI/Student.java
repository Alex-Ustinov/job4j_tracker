package ru.job4j.streamAPI;

import java.util.Objects;

public class Student implements Comparable<Student> {
    private int score;

    private String surname;

     Student(int score, String surname) {
        this.score = score;
        this.surname = surname;
     }

    public int getScore() {
        return score;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Student student = (Student) o;
        return score == student.score &&
                Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(score, surname);
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(getScore(), o.getScore());
    }
}