package ru.job4j.algoritms;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = new int[] {15, 5, 7, 33, 26, 57, 88};
        System.out.println(arrayToString(arr));
        quickSearch(arr, 0 , arr.length -1);
    }
    private static void quickSearch(int[] arr, int from, int to) {
        if (from < to) {

            int divideIndex = partition(arr, from, to);
            System.out.println("divideIndex VALUE " + arr[divideIndex]);
            printSortStep(arr, from, to, divideIndex);
            quickSearch(arr, from, divideIndex - 1);

            quickSearch(arr, divideIndex, to);
        }
    }
    private static int partition(int[] arr, int from, int to) {
        int rightIndex = to;
        int leftIndex = from;

        int pivot = arr[from];
        while (leftIndex <= rightIndex) {

            while (arr[leftIndex] < pivot) {
                leftIndex++;
            }

            while (arr[rightIndex] > pivot) {
                rightIndex--;
            }

            if (leftIndex <= rightIndex) {
                swap(arr, rightIndex, leftIndex);
                leftIndex++;
                rightIndex--;
            }
        }
        return leftIndex;
    }
    private static void swap(int[] array, int index1, int index2) {
        int tmp  = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }
    private static String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(array[i]);
        }
        sb.append("]");
        return sb.toString();
    }
    private static void printSortStep(int[] arr, int from, int to, int partitionIndex) {
        System.out.print(arrayToString(arr));
        System.out.print("\npartition at index: " + partitionIndex);
        System.out.print(", left: " + arrayToString(Arrays.copyOfRange(arr, from, partitionIndex)));
        System.out.println(", right: " + arrayToString(Arrays.copyOfRange(arr, partitionIndex, to + 1)) + "\n");
    }

}
