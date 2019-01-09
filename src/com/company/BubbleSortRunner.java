package com.company;

public class BubbleSortRunner {
    public static void main(String[] args) {
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
    }
}