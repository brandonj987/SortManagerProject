package com.spartaglobal.factory.controller;
import com.spartaglobal.factory.model.*;
import com.spartaglobal.factory.view.CompareSorter;
import com.spartaglobal.factory.view.ResultsFormat;
import com.spartaglobal.factory.view.SorterSelection;
import com.spartaglobal.factory.view.DisplayResults;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;



// This class contains the main process the sort manager goes through when executed
public class SortManager {
    int[] ints;
    int[] ints3;
    public static Logger logger = LogManager.getLogger("Sort Manager Logger");
    public void start() {
        logger.info("Sort Manager Initiated");
        // Choose whether to create an array or randomly generate one
        SelectArray input = new SelectArray();
        String desiredArray = input.getInput();

        // Define the size of array required
        SelectArraySize size = new SelectArraySize();
        int desiredSize = size.getInput();

        // Initiate the random or user array creation process
        if(desiredArray.equals("random")) {
            logger.info("User chose to generate a random array");
            //Get number bound
            SelectBound bound = new SelectBound();
            int desiredBound = bound.getInput();

            // Creating the random array
            RandomArray r = new RandomArray();
            ints = r.makeArray(desiredSize, desiredBound);
        } else {
            // Creating the user defined array
            logger.info("User chose to define an array");
            UserArray array = new UserArray();
            ints = array.makeArray(desiredSize);
        }

        // Sorter comparison loop
        String comparison = "yes";
        int[] intsClone = ints.clone();
        while (comparison.equals("yes")) {
            // Getting desired sorter from the user
            SorterSelection view = new SorterSelection();
            String desiredSorter = view.getDesiredSorter();

            // Sorting the array with timer
            SorterManager controller = new SorterManager();
            long startTime = System.nanoTime();
            String result = controller.initiateSort(desiredSorter, ints);
            long endTime = System.nanoTime();

            // Printing the arrays or not based on user input
            ResultsFormat rf = new ResultsFormat();
            String format = rf.getFormat();
            DisplayResults array = new DisplayResults();
            if(format.equals("yes")) {
                System.out.println("The unsorted array is:\n" + Arrays.toString(intsClone));
                array.fullResults(result, (endTime - startTime));
            } else {
                array.results(result, (endTime - startTime));
            }

            // Option to run again with different sorter
            ints = intsClone.clone();
            CompareSorter compare = new CompareSorter();
            comparison = compare.sortAgain();
            if (comparison.equals("yes"))
                logger.info("User chose to sort array again");
        }
        logger.info("Sort Manager exited\n|--------------------------------------------------|");
    }
}
