package com.sparta.sortmanagertesting;
import com.spartaglobal.factory.model.BubbleSort;
import com.spartaglobal.factory.model.MergeSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

public class MergeTest {
    @Test
    @DisplayName("Given an integer array, mergeSort returns the array in order")
    public void givenALargeIntegerArray_mergeSort_ReturnsArrayInOrder() {
        int[] actual = {82, 86, 92, 36, 82, 68, 19, 73, 79, 98, 13, 45, 6, 15, 87, 58, 87, 57, 50, 66, 99, 68, 42, 45, 12, 80, 9, 38, 13, 93, 92, 100, 92, 38, 8, 99, 82, 78, 13, 94, 5, 8, 65, 24, 25, 80, 27, 4, 60, 32};
        int[] expected = actual.clone();
        MergeSort m = new MergeSort();
        m.sort(actual);
        Arrays.sort(expected);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("Given a basic negative array, mergeSort returns the array in order")
    public void givenABasicNegativeArray_mergeSort_ReturnsArrayInOrder() {
        int[] actual = {-1, -2, -3, -4, -5};
        int[] expected = actual.clone();
        MergeSort m = new MergeSort();
        m.sort(actual);
        Arrays.sort(expected);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("Given an empty array, mergeSort returns an empty array")
    public void givenAnEmptyArray_mergeSort_ReturnsEmptyArray() {
        int[] actual = {};
        int[] expected = actual.clone();
        MergeSort m = new MergeSort();
        m.sort(actual);
        Arrays.sort(expected);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("Given a zeros array, mergeSort returns an array of zeroes the same size")
    public void givenAZeroesArray_mergeSort_ReturnsZeroesArray() {
        int[] actual = {0,0,0,0,0,0,0,0,0,0};
        int[] expected = actual.clone();
        BubbleSort b = new BubbleSort();
        b.sort(actual);
        Arrays.sort(expected);
        Assertions.assertArrayEquals(expected, actual);
    }

}
