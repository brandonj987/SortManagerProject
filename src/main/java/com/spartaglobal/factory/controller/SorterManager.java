package com.spartaglobal.factory.controller;
import com.spartaglobal.factory.Factory.BinarySortFactory;
import com.spartaglobal.factory.Factory.BubbleSortFactory;
import com.spartaglobal.factory.Factory.MergeSortFactory;
import com.spartaglobal.factory.Factory.SorterFactory;
import com.spartaglobal.factory.model.*;

// This class uses the created array and users desired sorter and returns a string of the sorted array
// A switch case is used to choose the required sorter
public class SorterManager {
    public String initiateSort(String desiredSorter, int[] ints) {
        Sorter s = getSorter(desiredSorter);
        return s.sort(ints);
    }
    public Sorter getSorter(String sorterType){
        SorterFactory sf = switch (sorterType.toLowerCase()) {
            case "merge" -> new MergeSortFactory();
            case "bubble" -> new BubbleSortFactory();
            case "binary"-> new BinarySortFactory();
            default -> null;
        };
        return sf.getInstance();
    }
}
