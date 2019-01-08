package com.company;

public class SelectionSort {
    public static void SelectionSort(int[] arr)
    {
        int len = arr.length;
        int smallIndex;
        for(int n = 0; n < len; n++)
        {
            smallIndex = SortingUtil.findSmallIndex(arr, n);
            SortingUtil.swap(arr, n, smallIndex);
        }
    }
}
