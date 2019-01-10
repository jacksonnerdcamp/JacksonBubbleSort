package com.company;

public class Runner {
    public void main(String[] args){
        //bubble sort runner
        int [] testArr = {8,6,7,5,4,0,9,10,1,2,3};
        System.out.print("Before: ");
        for  (int num:testArr)
        {System.out.print(num+" ");}
        System.out.println();

        BubbleSort.bubbleSort(testArr);
        System.out.print("After: ");
        for (int num:testArr)
        {
            System.out.print(num + " ");
        }
        System.out.println();

        //selection sort runner
        int[] testArr2 = {5,6,7,8,4,0,9,10,2,1,3};
        System.out.print("Before: ");
        for  (int num:testArr2)
        {System.out.print(num+" ");}
        System.out.println();

        SelectionSort.SelectionSort(testArr2);
        System.out.print("After: ");
        for (int num:testArr2)
        {
            System.out.print(num + " ");
        }
        System.out.println();

        //insertion sort here
        int[] testArr3 = {5,6,7,8,4,0,9,10,2,1,3};
        System.out.print("Before: ");
        for  (int num:testArr3)
        {System.out.print(num+" ");}
        System.out.println();

        InsertionSort.insertionSort(testArr3);
        System.out.print("After: ");
        for (int num:testArr3)
        {
            System.out.print(num + " ");
        }
        System.out.println();

    }
}
