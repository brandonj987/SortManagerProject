package com.sparta.sortmanagertesting;

import com.spartaglobal.factory.model.BubbleSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class BubbleTest {
    @Test
    @DisplayName("Given a basic integer array, bubbleSort returns the array in order")
    public void givenABasicIntegerArray_bubbleSort_ReturnsArrayInOrder() {
        int[] actual = {5, 4, 3, 2, 1};
        int[] expected = actual.clone();
        BubbleSort b = new BubbleSort();
        b.sort(actual);
        Arrays.sort(expected);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("Given a basic negative array, bubbleSort returns the array in order")
    public void givenABasicNegativeArray_bubbleSort_ReturnsArrayInOrder() {
        int[] actual = {-1, -2, -3, -4, -5};
        int[] expected = actual.clone();
        BubbleSort b = new BubbleSort();
        b.sort(actual);
        Arrays.sort(expected);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("Given an empty array, bubbleSort returns an empty array")
    public void givenAnEmptyArray_bubbleSort_ReturnsEmptyArray() {
        int[] actual = {};
        int[] expected = actual.clone();
        BubbleSort b = new BubbleSort();
        b.sort(actual);
        Arrays.sort(expected);
        Assertions.assertArrayEquals(expected, actual);
    }


}
