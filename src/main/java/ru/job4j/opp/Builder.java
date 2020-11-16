package ru.job4j.opp;

import java.util.Date;

public class Builder extends Engineer {
    Builder(int salary, String name, String surname, String education, Date birthday) {
        super(salary, name, surname, education, birthday);
    }
    private int projectNumber;
    public void makeFrame() {};
}
