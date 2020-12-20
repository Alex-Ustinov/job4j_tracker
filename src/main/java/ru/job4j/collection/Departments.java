package ru.job4j.collection;

import java.lang.reflect.Array;
import java.util.*;

public class Departments {

    public static List<String> fillGaps(List<String> deps) {
        Set<String> tmp = new LinkedHashSet<>();
        for (String value : deps) {
            String start = "";
            for (String el : value.split("/")) {
                if (start.equals("")) {
                    start = el;
                } else {
                    start = start + "/" + el;
                }
                tmp.add(start);
            }
        }
        return new ArrayList<>(tmp);
    }

    public static void sortAsc(List<String> orgs) {
        DepDescComp depDescComp = new DepDescComp();
        Collections.sort(orgs, depDescComp);
    }

    public static void sortDesc(List<String> orgs) {
        Collections.sort(orgs, Collections.reverseOrder());
    }

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(
                "K2",

                "K2/SK1",

                "K2/SK1/SSK1",

                "K2/SK1/SSK2",

                "K1",

                "K1/SK1",

                "K1/SK1/SSK1",

                "K1/SK1/SSK2",

                "K1/SK2"));
        List<String>dep = fillGaps(arrayList);
        DepDescComp depDescComp = new DepDescComp();
        Collections.sort(dep, depDescComp);
        //Collections.sort(dep);

        for (String de : arrayList) {
            System.out.println(de);
        }

    }
}