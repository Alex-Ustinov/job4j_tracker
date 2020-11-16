package ru.job4j.opp;

import java.util.Date;

public class Surgeon extends Doctor {
    Surgeon(String hospital, String name, String surname, String education, Date birthday){
        super(hospital, name, surname, education, birthday);
    }
    private String patient;
    public void makeOperation() {}
}
