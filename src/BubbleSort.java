package com.company;


public class BubbleSort{
    public static void bubbleSort(int[] arr)
    {
        int len = arr.length;

        while (com.company.SortingUtil.checkList(arr) )
        {
            for (int i = 0; i < len - 1; i++)
            {
                if (arr[i]> arr[i+1])
                {
                    com.company.SortingUtil.swap(arr, i+0, i+1);
                }
            }
        }
    }




}