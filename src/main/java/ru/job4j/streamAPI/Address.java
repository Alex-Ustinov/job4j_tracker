package ru.job4j.streamAPI;

public class Address {
    private String city;
    private String street;

    private int home;

    private int apartment;
    Address (String city, String street, int home, int apartment) {
        this.apartment = apartment;
        this.city = city;
        this.home = home;
        this.street = street;
    }
}
