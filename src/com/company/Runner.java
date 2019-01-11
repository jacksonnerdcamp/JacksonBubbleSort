package com.company;

public class Runner {
    public static void main(String[] args){
        //bubble sort runner
        System.out.println("Bubble Sort");
        int [] testArr = {8,6,7,5,4,0,9,10,1,2,3};
        System.out.print("Before: ");
        for  (int num:testArr)
        {System.out.print(num+" ");}
        System.out.println();

        BubbleSort.bubbleSort(testArr);
        System.out.print("After:  ");
        for (int num:testArr)
        {
            System.out.print(num + " ");
        }
        System.out.println();

        //selection sort runner
        System.out.println("Selection Sort");
        int[] testArr2 = {5,6,7,8,4,0,9,10,2,1,3};
        System.out.print("Before: ");
        for  (int num:testArr2)
        {System.out.print(num+" ");}
        System.out.println();

        SelectionSort.SelectionSort(testArr2);
        System.out.print("After:  ");
        for (int num:testArr2)
        {
            System.out.print(num + " ");
        }
        System.out.println();

        //insertion sort here
        System.out.println("Insertion Sort");
        int[] testArr3 = {10,8,7,6,4,0,9,5,2,1,3};
        System.out.print("Before: ");
        for  (int num:testArr3)
        {System.out.print(num+" ");}
        System.out.println();

        InsertionSort.insertionSort(testArr3);
        System.out.print("After:  ");
        for (int num:testArr3)
        {
            System.out.print(num + " ");
        }
        System.out.println();

    }
}
