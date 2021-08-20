package com.chunyue.array.sorting;

import java.util.Arrays;

public class BubbleSort {

    public void bubbleSort(int[] array){
        for (int i=0; i<array.length; i++){
            for (int j=0; j<array.length; j++){
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
