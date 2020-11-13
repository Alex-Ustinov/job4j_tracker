package ru.job4j.opp;

public class BallStory {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        Fox fox = new Fox();
        Ball ball = new Ball();
        Hare hare = new Hare();
        hare.tryEat(ball);
        fox.tryEat(ball);
        wolf.tryEat(ball);
    }
}
