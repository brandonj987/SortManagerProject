package com.spartaglobal.factory.model;

import com.spartaglobal.factory.view.ArraySize;

public class SelectArraySize{
    public int getInput() {
        int desiredSize = 0;
        while (desiredSize <= 0) {
            ArraySize size = new ArraySize();
            desiredSize = size.getArraySize();
            if (desiredSize <= 0) {
                System.out.println("Array size must be an integer greater than 0!");
            }
        }
        return desiredSize;
    }
}
