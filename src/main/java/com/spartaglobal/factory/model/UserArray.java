package com.spartaglobal.factory.model;
import com.spartaglobal.factory.view.ArrayInput;
import java.util.InputMismatchException;

// This class takes the users desired size for an array and creates an empty array of that size
// The user then populates the array
public class UserArray {
    public int[] makeArray(int desiredSize){
            int[] ints = new int[desiredSize];
            ArrayInput in = new ArrayInput();
            int i = 0;
                while (i < desiredSize) {
                    try {
                        ints[i] = in.getNextInt();
                        i++;
                    }catch (InputMismatchException k){
                        System.out.println("Please enter an integer!");//
                    }
                }
        return ints;
    }
}
