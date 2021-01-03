package ru.job4j.streamAPI;


import java.util.stream.Stream;

public class Card {
    private Suit suit;
    private Value value;

    public Card(Suit suit, Value value) {
        this.suit = suit;
        this.value = value;
    }

    public static void main(String[] args) {
        Stream.of(Suit.values())
                .flatMap(sui -> Stream.of(Value.values())
                        .map(val -> val + " " + sui))
                .forEach(System.out::println);
    }
}
