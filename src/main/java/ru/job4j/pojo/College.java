package ru.job4j.pojo;

import java.time.LocalDateTime;

public class College {
    public static void main(String[] args) {
        Student firstCours = new Student();
        firstCours.setName("alex");
        firstCours.setGroup("engineer");
        firstCours.setStartDate(LocalDateTime.now());
        System.out.println(firstCours.getName());
        System.out.println(firstCours.getGroup());
        System.out.println(firstCours.getStartDate());
    }
}
