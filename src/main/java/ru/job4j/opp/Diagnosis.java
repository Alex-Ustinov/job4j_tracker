package ru.job4j.opp;

import java.util.Date;

public class Diagnosis extends Doctor {
    private String issue;

    Diagnosis(String hospital, String name, String surname, String education, Date birthday) {
        super(hospital, name, surname, education, birthday);
    }

    public void heal() {

    }
}
