package com.spartaglobal.factory.controller;

import com.spartaglobal.factory.model.SelectArray;
import com.spartaglobal.factory.model.SelectArraySize;
import com.spartaglobal.factory.model.SelectBound;
import com.spartaglobal.factory.view.*;

import java.util.Arrays;

public class InitiateSortManager {
    public void initiateManager() {

        SelectArray input = new SelectArray();
        String desiredArray = input.getInput();

        SelectArraySize size = new SelectArraySize();
        int desiredSize = size.getInput();






        ArrayManager controller2 = new ArrayManager();
        if(desiredArray.equals("random")) {
            SelectBound bound = new SelectBound();
            int desiredBound = bound.getInput();


            // Creating the array
            int[] ints;
            ints = controller2.initiateRandomArray(desiredArray, desiredSize, desiredBound);
            DisplayManager view = new DisplayManager();
            String desiredSorter = view.getDesiredSorter();


            // switching to the sort method and initiating with created array
            SortManager controller = new SortManager();

            System.out.println(Arrays.toString(ints));
            String result = controller.initiateSort(desiredSorter, ints);
            view.displayResults(result);
        } else {
            int[] ints = new int[desiredSize];
            ArrayInput in = new ArrayInput();
            for (int k = 0; k < desiredSize; k++) {
                ints[k] = in.getNextInt();
            }
            DisplayManager view = new DisplayManager();
            String desiredSorter = view.getDesiredSorter();
            //        user choosing the sorting method
            desiredSorter = view.getDesiredSorter();

            // switching to the sort method and initiating with created array
            SortManager controller = new SortManager();

            System.out.println(Arrays.toString(ints));
            String result = controller.initiateSort(desiredSorter, ints);
            view.displayResults(result);

        }





    }
}
