package com.company;

public class SelectionSortRunner {
    public static void main(String[] args) {
        int [] testArr = {5,6,7,8,4,0,9,10,2,1,3};
        System.out.print("Before: ");
        for  (int num:testArr)
        {System.out.print(num+" ");}
        System.out.println();

        SelectionSort.SelectionSort(testArr);
        System.out.print("After: ");
        for (int num:testArr)
        {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
