package ru.job4j.pojo;

public class ShopDrop {
    public static Product[] leftShift(Product[] products, int index) {
        if (products.length - 1 <= index) {
            products[products.length - 1] = null;
        } else {
            for (int i = index; i < products.length; i++) {
                if (i + 1 < products.length && products[i + 1] != null) {
                    products[i] = products[i + 1];
                } else {
                    products[i] = null;
                }
            }
        }
        return products;
    }
}
