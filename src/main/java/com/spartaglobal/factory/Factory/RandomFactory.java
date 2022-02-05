package com.spartaglobal.factory.Factory;

import com.spartaglobal.factory.model.Array;
import com.spartaglobal.factory.model.RandomArray;

public class RandomFactory extends ArrayFactory{
    @Override
    public Array getInstance() {
        return new RandomArray();
    }
}
