package ru.job4j.opp;

import java.util.Date;

public class Developer extends Engineer {
    Developer(int salary, String name, String surname, String education, Date birthday) {
        super(salary, name, surname, education, birthday);
    }
    private String typeDeveloper;
    public void writeCode() {}
}
