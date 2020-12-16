package ru.job4j.opp;

import java.util.Date;

public class Surgeon extends Doctor {
    private String patient;

    Surgeon(String hospital, String name, String surname, String education, Date birthday) {
        super(hospital, name, surname, education, birthday);
    }

    public void makeOperation() {

    }
}
