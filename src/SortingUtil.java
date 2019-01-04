package com.company;

public class SortingUtil{
    //This is self explanatory, if the checkList is false, swap the indices.
    public static void swap (int[]arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    //This checks if two target indices are in order, and returns true or false.
    public static boolean checkList (int[] arr)
    {
        int len = arr.length - 1;
        for (int pos = 0; pos < len; pos++)
        {
            if (arr[pos] > arr[pos+1])
            {
                return true;
            }
        }
        return false;
    }


}
