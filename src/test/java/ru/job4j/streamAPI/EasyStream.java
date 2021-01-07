package ru.job4j.streamAPI;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EasyStream {
    private List<Integer> list = new ArrayList<>();
    private EasyStream easyStream;

    public static EasyStream of(List<Integer> list) {
        EasyStream easyStream = new EasyStream();
        easyStream.list = list;
        return easyStream.builder(easyStream);
    }

    public EasyStream map(Function<Integer, Integer> fun) {
        easyStream.list = collect().stream().map(fun).collect(Collectors.toList());
        return easyStream;
    }

    public EasyStream filter(Predicate<Integer> fun) {
        easyStream.list = collect().stream().filter(fun).collect(Collectors.toList());
        return easyStream;
    }

    public List<Integer> collect() {
        return list;
    }

    public EasyStream builder(EasyStream easyStream){
        this.easyStream = easyStream;
        return easyStream;
    }

}