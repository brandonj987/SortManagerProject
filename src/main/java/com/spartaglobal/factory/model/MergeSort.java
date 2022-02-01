
package com.spartaglobal.factory.model;

import java.util.Arrays;

public class MergeSort implements Sorter{
    // Uses the merge sort method on a random int array of specified size and number boundary
//    public int[] sort(int size, int bound){
//        RandomArray r = new RandomArray();
//        int[] ints = r.randArray(size, bound);
//        sort(ints);
//        return ints;
//    }
//    public static void sort(int[] ints){
    public String sort(int[] ints){
        mSort(ints);
        return Arrays.toString(ints);
    }
    public static void mSort(int[] ints){
        int intsLength = ints.length;
        // Ends the recursion cycle when the array is split into its most discrete form of 1 unit
        if (intsLength < 2) {
            return;
        }
        // Find sizes of left and right side of split array
        int midIndex = intsLength / 2;
        int[] leftArr = new int[midIndex];
        int[] rightArr = new int[intsLength - midIndex];
        // Populates the new left and right side arrays with the respective values from the pre-split array
        for (int i = 0; i < midIndex; i++) {
            leftArr[i] = ints[i];
        }
        for (int i = midIndex; i < intsLength; i++) {
            rightArr[i - midIndex] = ints[i];
        }
        // Re-calls the splitting part of the algorithm until the initial array is split into single values
        mSort(leftArr);
        mSort(rightArr);
        // Calls the merging method to reconstruct and sort the array
        merge(ints, leftArr, rightArr);
    }

    public static void merge ( int[] ints, int[] leftHalf, int[] rightHalf){
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;
        int i = 0; // left half iterator
        int j = 0; // right half iterator
        int k = 0; // merged array iterator
        // Loops through the left and right iterators until elements in one side have all been merged
        // Increments the respective iterator once an element of either side has been merged
        while (i < leftSize && j < rightSize) {
            if (leftHalf[i] <= rightHalf[j]) {
                ints[k] = leftHalf[i];
                i++;
            } else {
                ints[k] = rightHalf[j];
                j++;
            }
            k++;
        }
        // adds the remaining elements of the left or right side to the merged array if the other side has no elements left
        while (i < leftSize) {
            ints[k] = leftHalf[i];
            i++;
            k++;
        }
        while (j < rightSize) {
            ints[k] = rightHalf[j];
            j++;
            k++;
        }
    }
}

