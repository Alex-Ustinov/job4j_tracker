package ru.job4j.opp;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Point {
    private int y;
    private int x;
    private int z;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double distance3d(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2) + pow(this.z - that.z, 2));
    }

    public double distance(Point that) {
     return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    public static void main(String[] args) {

        Point a = new Point(0, 0);

        Point b = new Point(0, 2);

        double dist = a.distance(b);
        System.out.println(dist);

        Point firstPoint = new Point(4, 7, 9);

        Point secondPoint = new Point(3, 6, 1);

        double d = firstPoint.distance3d(secondPoint);
        System.out.println(d);
    }
}
