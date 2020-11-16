package ru.job4j.opp;

import java.util.Date;

public class Profession {
    private String name;
    private String surname;
    private String education;
    private Date birthday;

    Profession(String name, String surname, String education, Date birthday) {
        this.birthday = birthday;
        this.education = education;
        this.name = name;
        this.surname = surname;
    }

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
