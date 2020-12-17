package ru.job4j.opp;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {

    @Test
    public void when11to21to87then2() {
        Point firstPoint = new Point(4, 7, 9);

        Point secondPoint = new Point(3, 6, 1);

        double rsl = firstPoint.distance3d(secondPoint);
        double expect = 8.1240;

        Assert.assertEquals(expect, rsl, 0.0001);
    }
}