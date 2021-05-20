package ru.job4j.algoritms;

public class Tree {
    public static void main(String[] args) {
        CustomTree root = new CustomTree(
                new CustomTree(
                            new CustomTree(
                                null,
                                new CustomTree(6),
                                4),
                            new CustomTree(9),
                            7),
                new CustomTree(new CustomTree(new CustomTree(28), null, 31),
                        new CustomTree(new CustomTree(38), new CustomTree(52), 40),
                        35)
                , 20);
        System.out.println("Result "+root.sum());
    }

    static class CustomTree {
        int value;
        CustomTree left;
        CustomTree right;

        public int sum() {
            int result = value;
            if (left != null) {
                result = result + left.sum();
            }
            if (right != null) {
                result = result + right.sum();
            }
            return result;
        }

        CustomTree (int value) {
            this.value = value;
        }
        CustomTree (CustomTree left, CustomTree right, int value) {
            this.left = left;
            this.right = right;
            this.value = value;
        }
    }
}
