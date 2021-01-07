package ru.job4j.streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EasyStream {
    private List<Integer> list = new ArrayList<>();
    static private Builder builder = new Builder();

    public static EasyStream of(List<Integer> list) {
        return builder.buildList(list).builder();
    }

    public EasyStream map(Function<Integer, Integer> fun) {
        list = list.stream().map(fun).collect(Collectors.toList());
        return this;
    }

    public EasyStream filter(Predicate<Integer> fun) {
        list = list.stream().filter(fun).collect(Collectors.toList());
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