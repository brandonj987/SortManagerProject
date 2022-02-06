package com.sparta.sortmanagertesting;
import com.spartaglobal.factory.model.BinarySort;
import com.spartaglobal.factory.model.BubbleSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

public class BinaryTest {
    @Test
    @DisplayName("Given an integer array, binarySort returns the array in order")
    public void givenALargeIntegerArray_binarySort_ReturnsArrayInOrder() {
        int[] array = {82, 86, 92, 36, 82, 68, 19, 73, 79, 98, 13, 45, 6, 15, 87, 58, 87, 57, 50, 66, 99, 68, 42, 45, 12, 80, 9, 38, 13, 93, 92, 100, 92, 38, 8, 99, 82, 78, 13, 94, 5, 8, 65, 24, 25, 80, 27, 4, 60, 32};
        int[] arrayClone = array.clone();
        BinarySort b = new BinarySort();
        String actual = b.sort(array);
        Arrays.sort(arrayClone);
        String expected = Arrays.toString(arrayClone);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Given a basic negative array, binarySort returns the array in order")
    public void givenABasicNegativeArray_binarySort_ReturnsArrayInOrder() {
        int[] array = {-1, -2, -3, -4, -5};
        int[] arrayClone = array.clone();
        BinarySort b = new BinarySort();
        String actual = b.sort(array);
        Arrays.sort(arrayClone);
        String expected = Arrays.toString(arrayClone);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Given an empty array, binarySort returns an empty array")
    public void givenAnEmptyArray_binarySort_ReturnsEmptyArray() {
        int[] array = {};
        int[] arrayClone = array.clone();
        BinarySort b = new BinarySort();
        String actual = b.sort(array);
        Arrays.sort(arrayClone);
        String expected = Arrays.toString(arrayClone);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Given a zeros array, binarySort returns an array of zeroes the same size")
    public void givenAZeroesArray_binarySort_ReturnsZeroesArray() {
        int[] actual = {0,0,0,0,0,0,0,0,0,0};
        int[] expected = actual.clone();
        BubbleSort b = new BubbleSort();
        b.sort(actual);
        Arrays.sort(expected);
        Assertions.assertArrayEquals(expected, actual);
    }
}
