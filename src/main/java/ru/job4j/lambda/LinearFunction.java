package ru.job4j.lambda;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntFunction;

public class LinearFunction {

    public List<Double> diapason(int start, int finish, Function<Double, Double> func) {
        List<Double> results = new LinkedList<>();
        for (double i = start; i < finish; i++) {
            double rsl = func.apply(i);
            results.add(rsl);
        }
        return results;
    }


    public List<Integer> testDiapason(int start, int finish) {
        List<Integer> results = new LinkedList<>();
        for (int i = start; i < finish; i++) {
            IntFunction<Integer> func = (int x) -> 2 * x + 1;
            int rsl = func.apply(i);
            results.add(rsl);
        }
        return results;
    }

    public static void main(String[] args) {
        LinearFunction linearFunction = new LinearFunction();
        List<Integer> test = linearFunction.testDiapason(5,8);
        List<Integer> testBest = linearFunction.testDiapason(5,8, (x, y) -> 2 * x + 1);
        for (int c : test) {
            //System.out.println(c);
        }
        for (int t : testBest) {
            System.out.println(t);
        }
    }
}
