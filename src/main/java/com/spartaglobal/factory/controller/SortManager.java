package com.spartaglobal.factory.controller;

import com.spartaglobal.factory.model.BubbleSortFactory;
import com.spartaglobal.factory.model.MergeSortFactory;
import com.spartaglobal.factory.model.Sorter;
import com.spartaglobal.factory.model.SorterFactory;

public class SortManager {
    public String initiateSort(String desiredSorter, int[] ints) {
        Sorter s = getSorter(desiredSorter);
        return s.sort(ints);
    }
    // simple factory method
    public Sorter getSorter(String sorterType){
        SorterFactory vf = switch (sorterType.toLowerCase()) {
            case "merge" -> new MergeSortFactory();
            case "bubble" -> new BubbleSortFactory();
            default -> null;
        };
        return vf.getInstance();
    }
}
