package ru.job4j.opp;

import java.util.Date;

public class Developer extends Engineer {
    private String typeDeveloper;

    Developer(int salary, String name, String surname, String education, Date birthday) {
        super(salary, name, surname, education, birthday);
    }

    public void writeCode() {

    }
}
