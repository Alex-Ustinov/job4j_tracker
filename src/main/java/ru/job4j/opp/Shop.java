package ru.job4j.opp;

public class Shop {
    public static void main(String[] args) {
        Good product = of("Oil", 100);
        System.out.println(product.label());
    }

    public static Good of(String name, int price) {
        if ("Oil".equals(name)) {
            return new LiquidationProduct(name, price);
        }
        return new Product(name, price);
    }

}