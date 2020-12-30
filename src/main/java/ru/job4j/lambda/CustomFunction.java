package ru.job4j.lambda;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;

public class CustomFunction {
    public List<Double> diapason(int start, int finish, Function<Double, Double> func) {
        List<Double> results = new LinkedList<>();
        for (double i = start; i < finish; i++) {
            double rsl = func.apply(i);
            results.add(rsl);
        }
        return results;
    }
}
