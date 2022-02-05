package com.sparta.sortmanagertesting;
import com.spartaglobal.factory.model.BinarySort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

public class BinaryTest {
    @Test
    @DisplayName("Given a basic integer array, binarySort returns the array in order")
    public void givenABasicIntegerArray_binarySort_ReturnsArrayInOrder() {
        int[] array = {5, 4, 3, 2, 1};
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
}
