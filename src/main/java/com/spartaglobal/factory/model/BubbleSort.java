package com.spartaglobal.factory.model;
import java.util.Arrays;

// Uses the bubble sort method on a random int array of specified size and number boundary
// Loops through ints array and compares next two values, swapping if unordered
// Each pass reduces array size by 1 as a new value reaches its final position
public class BubbleSort implements Sorter{
    public String sort(int[] ints){
        int size = ints.length;
        for (int i = 0; i <= size; i++)
            for (int j = 0; j < size - i - 1; j++)
                if (ints[j] > ints[j + 1]) {
                    int temp1 = ints[j];
                    int temp2 = ints[j + 1];
                    ints[j] = temp2;
                    ints[j + 1] = temp1;
                }
        return Arrays.toString(ints);
    }
}