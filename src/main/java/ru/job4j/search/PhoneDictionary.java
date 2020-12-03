package ru.job4j.search;

import java.util.ArrayList;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<Person>();
    public void add (Person person) {
        persons.add(person);
    }
    public ArrayList<Person> find(String key) {
        ArrayList<Person> result = new ArrayList<Person>();
        for(Person person : persons) {
            if(person.getName().contains(key)) {
                result.add(person);
            } else if (person.getAddress().contains(key)) {
                result.add(person);
            } else if (person.getPhone().contains(key)) {
                result.add(person);
            } else if (person.getSurname().contains(key)) {
                result.add(person);
            }
        }
        return result;
    }
}
