package com.company;

public class Runner {
    public static void main(String[] args){
        int[] testArray = SortingUtil.randomIntArr(1000);
        long timeStart = 0;
        long duration = 0;



        //bubble sort runner
        int[] testArr1 = SortingUtil.copyIntArray(testArray);
        System.out.println("Bubble Sort");
        System.out.print("Before: ");
        for  (int num:testArr1)
        {System.out.print(num+" ");}
        System.out.println();

        timeStart = System.nanoTime();
        BubbleSort.bubbleSort(testArr1);
        duration = System.nanoTime() - timeStart;

        System.out.print("After:  ");
        for (int num:testArr1)
        {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println(duration);
        System.out.println();



        //selection sort runner
        int[] testArr2 = SortingUtil.copyIntArray(testArray);
        System.out.println("Selection Sort");
        System.out.print("Before: ");
        for  (int num:testArr2)
        {
            System.out.print(num+" ");
        }
        System.out.println();

        timeStart = System.nanoTime();
        SelectionSort.SelectionSort(testArr2);
        duration = System.nanoTime() - timeStart;

        System.out.print("After:  ");
        for (int num:testArr2)
        {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println(duration);
        System.out.println();



        //insertion sort here
        System.out.println("Insertion Sort");
        int[] testArr3 = SortingUtil.copyIntArray(testArray);
        System.out.print("Before: ");
        for  (int num:testArr3)
        {
            System.out.print(num+" ");
        }
        System.out.println();

        timeStart = System.nanoTime();
        InsertionSort.insertionSort(testArr3);
        duration = System.nanoTime() - timeStart;

        System.out.print("After:  ");
        for (int num:testArr3)
        {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println(duration);
        System.out.println();

    }
}
