package ru.job4j.ooa;

public class Airport {
    public static void main(String[] args) {
        final Aircraft airbus = new Aircraft("A320");
        System.out.println(airbus);
        airbus.printModel();
        airbus.printCountEngine();

        System.out.println(airbus);

        airbus.setName("A380");
        System.out.println(airbus);
    }
}