package com.spartaglobal.factory.Factory;
import com.spartaglobal.factory.model.BinarySort;
import com.spartaglobal.factory.model.Sorter;

public class BinarySortFactory extends SorterFactory{
    @Override
    public Sorter getInstance() {
        return new BinarySort();
    }
}
