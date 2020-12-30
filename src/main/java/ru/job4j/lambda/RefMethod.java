package ru.job4j.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class RefMethod {
    public static void main(String[] args) {
        List<String> names = Arrays.asList(
                "Ivan",
                "Petr Arsentev"
        );
        Consumer<String> out = (name) -> cutOut(name);
        names.forEach(System.out::println(out));
    }

    public static String cutOut(String value) {
        //return value.length() > 10 ? System.out::println(value.substring(0, 10) + "..") : System.out::println(value);
        /*
        if (value.length() > 10) {
            System.out::println(value.substring(0, 10) + "..")
        } else {
            System.out::println(value)
        }
        */
        /*
        String result = "";
        if (value.length() > 10) {
            result = value.substring(0, 10) + "..";
        } else {
            result = value;
        }
        return result;
         */
        return value.length() > 10 ? value.substring(0, 10) + ".." : value;
    }
}