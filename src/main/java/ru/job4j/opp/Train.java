package ru.job4j.opp;

public class Train implements Vehicle{
    @Override
    public void move() {
        System.out.println("It does it by rails");
    }

    @Override
    public double spentOil() {
        return 111.44;
    }
}
