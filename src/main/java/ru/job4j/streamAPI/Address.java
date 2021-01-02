package ru.job4j.streamAPI;

import java.util.Objects;

public class Address implements Comparable<Address> {
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

    public int getApartment() {
        return apartment;
    }

    public int getHome() {
        return home;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return home == address.home && apartment == address.apartment && Objects.equals(city, address.city) && Objects.equals(street, address.street);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, street, home, apartment);
    }

    @Override
    public int compareTo(Address o) {
        return city.compareTo(o.getCity());
    }
}
