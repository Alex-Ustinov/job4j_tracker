package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.*;

public class SearchAtt {

    public static List<Attachment> filter(List<Attachment> list, Predicate<Attachment> condition) {
        List<Attachment> rsl = new ArrayList<>();
        for (Attachment att : list) {
            if (condition.test(att)) {
                rsl.add(att);
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        List<Attachment> attachments = new ArrayList<>();
        attachments.add(new Attachment("bug", 32));
        attachments.add(new Attachment("task", 144));
        attachments.add(new Attachment("epic", 123));
        List<Attachment> test = filter(attachments, (x) -> x.getSize() > 100);
        List<Attachment> test2 = filter(attachments, (x) -> x.getName().contains("bug"));
        for (Attachment a : test) {
            System.out.println(a);
        }
        System.out.println("-------");
        for (Attachment a2 : test2) {
            System.out.println(a2);
        }

        Comparator<Attachment> comparator = (left, right) -> {
            System.out.println("compare - " + right.getName().length() + " : " + left.getName().length());
            return Integer.compare(right.getName().length(), left.getName().length());
        };
    }

    public static List<Attachment> filterSize(List<Attachment> list) {
        return filter(list, (x) -> x.getSize() > 100);
    }

    public static List<Attachment> filterName(List<Attachment> list) {
        return filter(list, (x) -> x.getName().contains("bug"));
    }
}