package com.spartaglobal.factory.model;

public class BinarySortFactory extends SorterFactory{
    @Override
    public Sorter getInstance() {
        return new BinarySort();
    }
}
