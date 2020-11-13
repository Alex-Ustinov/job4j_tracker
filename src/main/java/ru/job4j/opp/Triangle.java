package ru.job4j.opp;

public class Triangle {
    private Point first;
    private Point second;
    private Point third;

    Triangle(Point ap, Point bp, Point cp) {
        this.first = ap;
        this.second = bp;
        this.third = cp;
    }

    public double period(double a, double b, double c) {

    }
    public boolean exist(double ab, double ac, double bc) {
        return false;
    }
    public double area() {
        double rsl = -1;
        double ab = first.distance(second);
        double ac = 2.5;
    }
}
