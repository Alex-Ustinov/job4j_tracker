package ru.job4j.opp;

public class DummyDic {
    public static void main(String[] args) {
        DummyDic dummyDic = new DummyDic();
        String searchTranslate = dummyDic.engToRus("tell");
        System.out.println(searchTranslate);
    }

    public String engToRus(String eng) {
        String translate = "Неизвестное слово. " + eng;
        return translate;
    }
}
