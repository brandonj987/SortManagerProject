package com.spartaglobal.algorithms;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        // Call sortArray and pass in an array of ints to be sorted or a size and number boundary for a random array
        // Uses both the bubble sort and merge sort and outputs their results as a string
        int[] ints = {5,54,8574,854,854,2,45,4,54,85,487,58,5845,548};
        int[] ints2 = ints.clone();
        SortArray s = new SortArray();
        System.out.println(s.sortArray(50, 1000));
        System.out.println(s.sortArray(ints));

        // Call merge or bubble sort individually to sort an array of ints or random array of specified size and number boundary
        // returns the sorted array as an int[]
        MergeSort m = new MergeSort();
        m.mergeSort(ints);
        System.out.println(Arrays.toString(ints));
        System.out.println(Arrays.toString(m.mergeSort(40, 60)));

        BubbleSort b = new BubbleSort();
        b.bubbleSort(ints2);
        System.out.println(Arrays.toString(ints2));
        System.out.println(Arrays.toString(b.bubbleSort(40, 60)));


        RandomArray r = new RandomArray();
        System.out.println(Arrays.toString(r.randArray(50,100)));
    }
}
