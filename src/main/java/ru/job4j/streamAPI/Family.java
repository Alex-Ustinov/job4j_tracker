package ru.job4j.streamAPI;

public class Family {
    private String son;
    private String daughter;
    private String father;
    private String mother;
    private String sister;
    private String brother;
    private String dog;

    static class Builder {
        private String son;
        private String daughter;
        private String father;
        private String mother;
        private String sister;
        private String brother;
        private String dog;
        Builder buildSon (String son){
            this.son = son;
            return this;
        }
        Builder buildDaughter(String daughter) {
            this.daughter = daughter;
            return this;
        }
        Builder buildFather(String father) {
            this.father = father;
            return this;
        }
        Builder buildMother(String mother) {
            this.mother = mother;
            return this;
        }
        Builder buildSister(String sister) {
            this.sister = sister;
            return this;
        }
        Builder buildDog(String dog) {
            this.dog = dog;
            return this;
        }
        Builder buildBrother(String brother) {
            this.brother = brother;
            return this;
        }
        Family build() {
            Family family = new Family();
            family.brother = brother;
            family.dog = dog;
            family.daughter = daughter;
            family.sister = sister;
            family.son = son;
            family.mother = mother;
            return family;
        }
    }

    public static void main(String[] args) {
        Family family = new Builder()
                .buildMother("Mary")
                .buildBrother("Sam")
                .buildDaughter("Katrine")
                .buildDog("hurricane")
                .buildFather("Ben")
                .buildSon("Alex")
                .buildSister("Yulia")
                .build();
        System.out.println(family);
    }
}
