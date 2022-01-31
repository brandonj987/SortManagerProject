package com.spartaglobal.algorithms;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        int[] ints = {5,654,4,6,45,64,56,45,56,4,65,65,54,897,69,56,496,46,56,6,986,4,6,9,6,6,654,96,49,84,964,6,49,4,64,64,964,964535,35496,4};
        BubbleSort b = new BubbleSort();
        System.out.println(Arrays.toString(b.bubbleSort(ints)));
    }
}
