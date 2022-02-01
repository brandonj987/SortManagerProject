package com.spartaglobal.factory.model;

import java.util.Arrays;

public class BubbleSort implements Sorter{
    // Uses the bubble sort method on a random int array of specified size and number boundary    // Loops through ints array and compares next two values, swapping if unordered
    // Each pass reduces array size by 1 as a new value reaches its final position
    public String sort(int[] ints){
        int arrSize = ints.length;
        for (int i = 0; i <= arrSize; i++)
            for (int j = 0; j < arrSize - i - 1; j++)
                if (ints[j] > ints[j + 1]) {
                    int temp1 = ints[j];
                    int temp2 = ints[j + 1];
                    ints[j] = temp2;
                    ints[j + 1] = temp1;
                }
        return Arrays.toString(ints);
    }
}