package ru.job4j.opp;

public class Bus implements Vehicle {
    @Override
    public void move() {
        System.out.println("It does it on a road");
    }

    @Override
    public double spentOil() {
        return 14.55;
    }
}
