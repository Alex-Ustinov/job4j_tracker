package ru.job4j.search;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        var result = new ArrayList<Person>();
        for (Person person : persons) {
            if (person.getName().contains(key)
                    || person.getAddress().contains(key)
                    || person.getPhone().contains(key)
                    || person.getSurname().contains(key)) {
                result.add(person);
            }
        }
        return result;
    }

    public ArrayList<Person> advancedFind(String key) {
        Predicate<Person> sortName = (x) -> x.getName().contains(key);
        Predicate<Person> sortAddress = (x) -> x.getAddress().contains(key);
        Predicate<Person> sortPhone = (x) -> x.getPhone().contains(key);
        Predicate<Person> sortSurname = (x) -> x.getSurname().contains(key);

        Predicate<Person> combine = sortName.or(sortAddress).or(sortPhone).or(sortSurname);

        var result = new ArrayList<Person>();
        for (Person person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }

}
