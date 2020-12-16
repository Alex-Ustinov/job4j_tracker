package ru.job4j.opp;

import java.util.Date;

public class Doctor extends Profession {
    private String hospital;
    
    Doctor(String hospital, String name, String surname, String education, Date birthday) {
        super(name, surname, education, birthday);
        this.hospital = hospital;
    }
}
