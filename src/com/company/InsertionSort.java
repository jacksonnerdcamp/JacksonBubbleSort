package com.company;

public class InsertionSort {
    public static void insertionSort(int[] arr)
    {
        int key;
        while(SortingUtil.checkList(arr))
        {

            for (int i = 0; i < arr.length - 1; i++) {
                key = i + 1;
                for (int j = i; j >= 0; j--) {
                    if (arr[key] < arr[j]) {
                        SortingUtil.swap(arr, i, key);
                    }
                }
            }
        }
    }
}
