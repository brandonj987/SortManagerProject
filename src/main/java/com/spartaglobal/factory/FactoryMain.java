package com.spartaglobal.factory;

import com.spartaglobal.factory.controller.SortManager;
import com.spartaglobal.factory.view.DisplayManager;

import java.util.Arrays;

public class FactoryMain {
    public static void main(String[] args) {
        DisplayManager view = new DisplayManager();
        String desiredSorter = view.getDesiredSorter();
        SortManager controller = new SortManager();
        String result = controller.initiateSort(desiredSorter, ints);
        view.displayResults(result);
    }
}




