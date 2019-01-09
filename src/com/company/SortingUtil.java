package com.company;

public class SortingUtil{
    //This is self explanatory, if the checkList is false, swap the indices.
    public static void swap (int[] arr, int i, int j)
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

    public static int findSmallIndex(int[] arr, int start) {
        int smallestNumber = arr[start];
        int i = start;
        while (i < arr.length) {
            if (smallestNumber > arr[i]) {
                smallestNumber = arr[i];
            }
            i++;
        }
        i = start;
        //This checks against the array for the smallestNumber and returns the index of it.
        while (i < arr.length)
        {
            if(arr[i] == smallestNumber)
            {
                return i;
            }
            i++;
        }
        return start;
    }

}
