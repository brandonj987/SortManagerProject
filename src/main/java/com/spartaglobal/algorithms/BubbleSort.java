package com.spartaglobal.algorithms;

public class BubbleSort {
    public int[] bubbleSort(int[] ints){
        int arrSize = ints.length;
        for (int i = 0; i <= arrSize; i++)
            for (int j = 0; j < arrSize - i - 1; j++)
                if (ints[j] > ints[j + 1]) {
                    int temp1 = ints[j];
                    int temp2 = ints[j + 1];
                    ints[j] = temp2;
                    ints[j + 1] = temp1;
                }
        return ints;
    }
}

