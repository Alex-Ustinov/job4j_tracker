package ru.job4j.opp;

import static java.lang.Math.sqrt;

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
        double result = (a + b + c) / 2;
        return result;
    }

    public boolean exist(double ab, double ac, double bc) {
        if (ab > 0 && ac > 0 && bc > 0) {
            return true;
        }
        return false;
    }

    public double area() {
        double rsl = 0;
        double ab = first.distance(second);
        double ac = second.distance(third);
        double bc = third.distance(first);
        if (this.exist(ab, ac, bc)) {
            double p = this.period(ab, ac, bc);
            rsl = sqrt(p * ((p - ab) * (p - ac) * (p - bc)));
        }
        return rsl;
    }

    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(4, 0);
        Point c = new Point(0, 4);
        Triangle triangle = new Triangle(a, b, c);
        double rsl = triangle.area();
        System.out.println(rsl);
    }
}
