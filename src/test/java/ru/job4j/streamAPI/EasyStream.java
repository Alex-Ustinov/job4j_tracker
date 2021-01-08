package ru.job4j.streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class EasyStream {
    private List<Integer> list = new ArrayList<>();

    public static EasyStream of(List<Integer> list) {
        return new Builder().buildList(list).builder();
    }

    public EasyStream map(Function<Integer, Integer> fun) {
        List<Integer> testList = new ArrayList<>();
        for (Integer num : list) {
            testList.add(fun.apply(num));
        }
        list = testList;
        return this;
    }

    public EasyStream filter(Predicate<Integer> fun) {
        List<Integer> testList = new ArrayList<>();
        for (Integer num : list) {
            if (fun.test(num)) {
                testList.add(num);
            }
        }
        list = testList;
        return this;
    }

    public List<Integer> collect() {
        return list;
    }

    static class Builder {
        private List<Integer> list;

        public Builder buildList (List<Integer> list) {
            this.list = list;
            return this;
        }

        public EasyStream builder() {
            EasyStream easyStream = new EasyStream();
            easyStream.list = list;
            return easyStream;
        }
    }
}