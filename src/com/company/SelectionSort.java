package com.company;

public class SelectionSort {
    public static void SelectionSort(int[] arr){
        int len = arr.length;
        int smallestNumber = 0;
        for(int n; n < len; n++)
        {
            smallestNumber = SortingUtil.findSmallIndex(arr, n);
            SortingUtil.swap(arr, n, i);
        }
    }
}
