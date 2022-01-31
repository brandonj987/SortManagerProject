package com.spartaglobal.algorithms;
import java.util.Arrays;
public class SortArray {
    // Sorts an array of random numbers, specify size of array and bound for the random numbers
    public String sortArray(int size, int bound){
        RandomArray r = new RandomArray();
        int[] ints = r.randArray(size, bound);
        return sortArray(ints);
    }
    // Takes input array and calls the bubble and merge sort methods and returns their results alongside the unsorted array in a string
    public String sortArray (int[] ints) {
        int[] ints2 = ints.clone();
        int[] ints3 = ints.clone();
        BubbleSort b = new BubbleSort();
        MergeSort m = new MergeSort();
        b.bubbleSort(ints);
        m.mergeSort(ints2);
        return "Unsorted Array: " + Arrays.toString(ints3)
                + "\nBubble sort result: " + Arrays.toString(ints)
                + "\nMerge sort result: " + Arrays.toString(ints2);
    }
}