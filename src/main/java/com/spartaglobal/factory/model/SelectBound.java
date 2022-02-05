package com.spartaglobal.factory.model;

import com.spartaglobal.factory.view.RandomArrayBound;

public class SelectBound {
    public int getInput(){
        int desiredBound = 0;
        while (desiredBound <= 0) {
            RandomArrayBound bound = new RandomArrayBound();
            desiredBound = bound.getRandArrayBound();
            if (desiredBound <= 0) {
                System.out.println("Number bound must be an integer greater than 0!");
            }
        }
        return desiredBound;
    }
}
