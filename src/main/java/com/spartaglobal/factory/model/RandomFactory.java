package com.spartaglobal.factory.model;

public class RandomFactory extends ArrayFactory{
    @Override
    public Array getInstance() {
        return new RandomArray();
    }
}
