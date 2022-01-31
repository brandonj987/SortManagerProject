package com.spartaglobal.algorithms;
import java.util.Random;
// Creates a random array with specified size and number boundary
public class RandomArray {
    public int[] randArray(int size, int bound){
        int[] ints = new int[size];
        Random r = new Random();
        for (int i = 0; i < ints.length; i++) {
            ints[i] = r.nextInt(bound);
        }
        return ints;
    }
}