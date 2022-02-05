package com.spartaglobal.factory.model;
import java.util.Random;

// This class creates a random array with specified size and number boundary
public class RandomArray implements Array{
    public int[] makeArray(int size, int bound){
        int[] ints = new int[size];
        Random r = new Random();
        for (int i = 0; i < ints.length; i++) {
            ints[i] = r.nextInt(bound);
        }
        return ints;
    }
}