package com.spartaglobal.factory;

import com.spartaglobal.factory.controller.ArrayManager;
import com.spartaglobal.factory.controller.SortManager;
import com.spartaglobal.factory.model.ArrayFactory;
import com.spartaglobal.factory.model.RandomFactory;
import com.spartaglobal.factory.view.ArraySelector;
import com.spartaglobal.factory.view.DisplayManager;
import com.spartaglobal.factory.view.RandomArrayBound;
import com.spartaglobal.factory.view.RandomArraySize;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class FactoryMain {
//    public static Logger logger = LogManager.getLogger("Sort Manager Logger");
    public static Logger logger = LogManager.getLogger(FactoryMain.class.getName());

    public static void main(String[] args) {
        int i = 50, j = 50;
        logger.warn("testing");

        String desiredArray = "";
        while (!desiredArray.equals("random")) {
            ArraySelector select = new ArraySelector();
            desiredArray = select.getDesiredArray();
        }
        int desiredSize = 0;
        int desiredBound = 0;

        int[] ints;

        while (desiredSize <= 0) {
            RandomArraySize size = new RandomArraySize();
            desiredSize = size.getRandArraySize();
            if (desiredSize <= 0) {
                System.out.println("Array size must be an integer greater than 0!");
            }
        }
        while (desiredBound <=0 ) {
            RandomArrayBound bound = new RandomArrayBound();
            desiredBound = bound.getRandArrayBound();
            if (desiredBound <= 0) {
                System.out.println("Number bound must be an integer greater than 0!");
            }
        }
        ArrayManager controller2 = new ArrayManager();
        ints = controller2.initiateArray(desiredArray, desiredSize, desiredBound);


        DisplayManager view = new DisplayManager();
        String desiredSorter = view.getDesiredSorter();
        SortManager controller = new SortManager();

        String result = controller.initiateSort(desiredSorter, ints);
        view.displayResults(result);


    }
}




