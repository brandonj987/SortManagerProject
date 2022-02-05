package com.spartaglobal.factory.controller;
import com.spartaglobal.factory.model.*;
import com.spartaglobal.factory.view.SorterSelection;
import com.spartaglobal.factory.view.DisplayResults;

import java.util.Arrays;

// This class contains the main process the sort manager goes through when executed
public class SortManager {
    int[] ints;
    public void start() {
        // Choose whether to create an array or randomly generate one
        SelectArray input = new SelectArray();
        String desiredArray = input.getInput();

        // Define the size of array required
        SelectArraySize size = new SelectArraySize();
        int desiredSize = size.getInput();

        // Initiate the random or user array creation process
        if(desiredArray.equals("random")) {
            //Get number bound
            SelectBound bound = new SelectBound();
            int desiredBound = bound.getInput();

            // Creating the random array
            RandomArray r = new RandomArray();
            ints = r.makeArray(desiredSize, desiredBound);

        } else {
            // Creating the user defined array
            UserArray array = new UserArray();
            ints = array.makeArray(desiredSize);
        }
        // Getting desired sorter from the user
        SorterSelection view = new SorterSelection();
        String desiredSorter = view.getDesiredSorter();

        // Sorting the array
        SorterManager controller = new SorterManager();
        System.out.println("The unsorted array is:\n" + Arrays.toString(ints));
        String result = controller.initiateSort(desiredSorter, ints);
        DisplayResults array = new DisplayResults();
        array.results(result);
    }
}
