package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book stephenKing = new Book();
        Book dostoevsky = new Book();
        Book ernestHemingway = new Book();
        Book pushkin = new Book();
        Book [] books = new Book[5];
        stephenKing.setPages(400);
        stephenKing.setName("Misery");
        dostoevsky.setPages(450);
        dostoevsky.setName("crime and punishment");
        ernestHemingway.setPages(300);
        ernestHemingway.setName("old man and sea");
        pushkin.setPages(600);
        pushkin.setName("anegin");
        books[0] = stephenKing;
        books[1] = dostoevsky;
        books[2] = ernestHemingway;
        books[3] = pushkin;
        Book cleanCode = new Book();
        books[4] = cleanCode;
        cleanCode.setPages(500);
        cleanCode.setName("Clean code");
        for(int i = 0; i < books.length; i++) {
            System.out.println(books[i].getName());
        }
        Book firstBook = books[0];
        books[0] = books[3];
        books[3] = firstBook;
        for(int i = 0; i < books.length; i++) {
            System.out.println(books[i].getName());
        }
        for(int i = 0; i < books.length; i++) {
            if(books[i].getName() == "Clean code") {
                System.out.println(books[i].getPages());
            }
        }
    }
}
