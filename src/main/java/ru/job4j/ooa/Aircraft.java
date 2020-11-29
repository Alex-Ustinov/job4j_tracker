package ru.job4j.ooa;

public class Aircraft {

    private String name;

    Aircraft(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printModel() {
        System.out.println(name);
    }
    public void printCountEngine() {}
}
