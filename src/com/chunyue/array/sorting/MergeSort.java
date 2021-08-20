package com.chunyue.array.sorting;

public class MergeSort {
    public void merge(int[] array, int start, int mid, int end) {
        int n1 = mid - start + 1;
        int n2 = end - mid;

        int[] left = new int[n1];
        int[] right = new int[n2];

        for (int i=0; i<n1; i++) left[i] = array[start+i];
        for (int j=0; j<n2; j++) right[j] = array[mid + j + 1];

        int i = 0;
        int j = 0;
        int k = start;
        while (i<n1 && j<n2){
            if (left[i] <= right[j]){
                array[k] = left[i];
                i ++;
            } else {
                array[k] = right[j];
                j ++;
            }
            k++;
        }
        while (i<n1){
            array[k] = left[i];
            i++;
            k++;
        }
        while (j<n2){
            array[k] = right[j];
            j++;
            k++;
        }
    }

    public void mergeSort(int[] array, int start, int end){
        if (start < end){
            int mid = (end + start)/2;
            mergeSort(array, start, mid);
            mergeSort(array, mid+1, end);
            merge(array, start, mid, end);
        }
    }
}
