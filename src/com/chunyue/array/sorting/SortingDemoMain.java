package com.chunyue.array.sorting;

import java.util.Arrays;

public class SortingDemoMain {
    private static int[] array = {34, 22, 56, 43, 89, 90};

    public static void main(String[] args) {
        // bubbleSort();
        // mergeSortDemo();
    }

    public static void mergeSortDemo(){
        System.out.println("Before merge sort: " + Arrays.toString(array));
        MergeSort mergeSort = new MergeSort();
        mergeSort.mergeSort(array, 0, array.length-1);
        System.out.println("After merge sort: " + Arrays.toString(array));
    }

    public static void bubbleSort (){
        System.out.println("Before bubble sorting: " + Arrays.toString(array));
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.bubbleSort(array);
        System.out.println("After bubble sorting: " + Arrays.toString(array));
    }
}
