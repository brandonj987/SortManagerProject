package com.spartaglobal.factory.Factory;
import com.spartaglobal.factory.model.MergeSort;
import com.spartaglobal.factory.model.Sorter;

public class MergeSortFactory extends SorterFactory{
    @Override
    public Sorter getInstance() {
        return new MergeSort();
    }
}

