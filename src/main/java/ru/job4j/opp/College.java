package ru.job4j.opp;

public class College {
    public static void main(String[] args) {
        Freshman freshman = new Freshman();
        Students freshmanStudent = (Students) freshman;
        CustomObject freshmanStudentCustomObject = (CustomObject) freshmanStudent;
    }
}
