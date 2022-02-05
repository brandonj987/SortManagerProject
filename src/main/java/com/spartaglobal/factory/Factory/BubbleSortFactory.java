package com.spartaglobal.factory.Factory;
import com.spartaglobal.factory.model.BubbleSort;
import com.spartaglobal.factory.model.Sorter;

public class BubbleSortFactory extends SorterFactory{
    @Override
    public Sorter getInstance() {
        return new BubbleSort();
    }
}
