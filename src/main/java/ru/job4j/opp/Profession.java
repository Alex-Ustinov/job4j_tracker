package ru.job4j.opp;

import java.util.Date;

public class Profession {
    private String name;
    private String surname;
    private String education;
    private Date birthday;

    Profession() {}

    public Date getBirthday() {
        return birthday;
    }

    public String getEducation() {
        return education;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
