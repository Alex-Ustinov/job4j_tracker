package ru.job4j.opp;

public class Plain implements Vehicle {
    @Override
    public void move() {
        System.out.println("It does in the sky");
    }

    @Override
    public double spentOil() {
        return 89.8;
    }
}
