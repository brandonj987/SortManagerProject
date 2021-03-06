package com.spartaglobal.factory.model;
import java.util.Arrays;

// The merge sort takes an array of ints and uses recursion to split into elements 1 wide
// These values are then merged together and the values compared and swapped if necessary to return a sorted array
public class MergeSort implements Sorter{

    // Uses the merge sort method on a random int array of specified size and number boundary
    public String sort(int[] ints){
        split(ints);
        return Arrays.toString(ints);
    }

    // Splitting method
    public static void split(int[] ints){
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
        split(leftArr);
        split(rightArr);
        // Calls the merging method to reconstruct and sort the array
        merge(ints, leftArr, rightArr);
    }

    // Merging the array back together
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
