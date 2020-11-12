package ru.job4j.opp;

public class Cat {
    private String food;
    private String name;
    public void show() {
        System.out.println(this.name + " has eaten" + this.food);
    }
    public void eat(String meat){
        this.food = meat;
    }
    public void giveNick(String nick) {
        this.name = nick;
    }
    public static void main(String[] args) {
        Cat gav = new Cat();
        gav.eat("kotleta");
        gav.giveNick("gav");
        gav.show();
        Cat black = new Cat();
        black.eat("fish");
        black.giveNick("black cat");
        black.show();
    }
}
