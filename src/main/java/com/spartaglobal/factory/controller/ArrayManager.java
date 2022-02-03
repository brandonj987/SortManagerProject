package com.spartaglobal.factory.controller;

import com.spartaglobal.factory.model.*;

public class ArrayManager {
    public int[] initiateArray(String desiredArray, int i, int j) {
        Array a = getArray(desiredArray);
        return a.makeArray(i, j);
    }
    // simple factory method
    public Array getArray(String arrayType){
        ArrayFactory a = switch (arrayType.toLowerCase()) {
            case "random" -> new RandomFactory();
//            case "user" -> new BubbleSortFactory();
            default -> null;
        };
        return a.getInstance();
    }
}
