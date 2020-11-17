package ru.job4j.pojo;

public class Shop {
    public static void main(String[] args) {
        Product [] products = new Product[5];
        products[0] = new Product("Milk", 7);
        products[2] = new Product("Bread", 15);
        products[3] = new Product("Egg", 3);
        int firsIndexNull = indexOfNull(products);
        System.out.println(firsIndexNull);
    }
    public static int indexOfNull(Product [] products) {
        int result = -1;
        for(int i = 0; i < products.length; i++) {
            Product product = products[i];
            if (product == null) {
                result = i;
                break;
            }
        }
        return result;
    }
}
