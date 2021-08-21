package com.chunyue.array.sorting;

public class QuickSort {

    public int partition(int[] array, int low, int high){
        int pivot = array[high];
        int i = low;
        for (int j = low; j<high; j++){
            if (array[j] < pivot){
                int temp = array[j];
                array[j] = array[i];
                array[i] = temp;
                i++;
            }
        }

        int temp = array[i];
        array[i] = array[high];
        array[high] = temp;
        return i;
    }

    public void quickSort(int[] array, int low, int high){
        if (low < high) {
            int p = partition(array, low, high);
            quickSort(array, low, p-1);
            quickSort(array, p+1, high);
        }
    }
}
