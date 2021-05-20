package ru.job4j.algoritms;

public class SearchFind {
    public static void main(String[] args) {
        int [] newArr = new int[] {11, 3, 54, 16, 99, 5, 8};
        for (int i = 0; i < newArr.length; i++) {
            int index = min(newArr, i);
            int oldValue = newArr[i];
            newArr[i] = newArr[index];
            newArr[index] = oldValue;
        }
    }

    private static int min(int[] array, int start){
        int minIndex = start;
        int minValue = array[start];
        for (int i = start + 1; i < array.length; i++) {
            if (minValue > array[i]) {
                minIndex = i;
                minValue = array[i];
            }
        }
        return minIndex;
    }
}
