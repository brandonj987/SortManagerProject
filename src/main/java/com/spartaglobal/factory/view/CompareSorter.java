package com.spartaglobal.factory.view;
import java.util.Scanner;

// This class asks the user whether to conduct the sort process again or not - allows for comparison of sorters using the same generated array
public class CompareSorter {
    public String sortAgain(){
        String sortAgain = "";
        while (!sortAgain.toLowerCase().equals("yes") && !sortAgain.toLowerCase().equals("no")) {
            System.out.print("Would you like to compare another sorter? [yes or no]: ");
            Scanner scanner = new Scanner(System.in);
            sortAgain = scanner.next();
        }
        return sortAgain;
    }
}
