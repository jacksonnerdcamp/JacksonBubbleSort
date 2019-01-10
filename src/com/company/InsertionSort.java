package com.company;

public class InsertionSort {
    public static void insertionSort(int[] arr)
    {
        int key = arr[arr.length - 1];
        for(int i = arr[arr.length - 2]; i > 0; i--)
        {
            if(key < arr[i])
            {
                SortingUtil.swap(arr, i, i + 1);
                arr[i] = key;
            }
        }
    }
}
