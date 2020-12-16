package ru.job4j.collection;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Departments {

    public static List<String> fillGaps(List<String> deps) {
        Set<String> tmp = new LinkedHashSet<>();
        for (String value : deps) {
            for (String el : value.split("/")) {
                tmp.add(el);
            }
        }
        String mapDep = "";
        for (String dep : tmp) {
            mapDep = dep + "/" + mapDep;
        }
        return tmp;
    }

    public static void sortAsc(List<String> orgs) {
    }

    public static void sortDesc(List<String> orgs) {
    }
}