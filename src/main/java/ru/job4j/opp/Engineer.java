package ru.job4j.opp;

import java.util.Date;

public class Engineer extends Profession {
    int salary;
    Engineer(int salary, String name, String surname, String education, Date birthday ) {
        super(name, surname, education, birthday);
        this.salary = salary;
    }
}
