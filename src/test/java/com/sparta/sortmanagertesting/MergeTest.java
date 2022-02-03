package com.sparta.sortmanagertesting;

import com.spartaglobal.factory.model.MergeSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.Arrays;



public class MergeTest {
    @Test
    @DisplayName("Given a basic integer array, mergeSort returns the array in order")
    public void givenABasicIntegerArray_mergeSort_ReturnsArrayInOrder() {
        int[] actual = {5, 4, 3, 2, 1};
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

}
