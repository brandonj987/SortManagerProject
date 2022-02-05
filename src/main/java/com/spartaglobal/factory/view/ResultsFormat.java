package com.spartaglobal.factory.view;
import java.util.Scanner;

// This class gets input from the user on whether to output the array to the console or not
public class ResultsFormat {
    public String getFormat(){
        String format = "";
        while (!format.toLowerCase().equals("yes") && !format.toLowerCase().equals("no")) {
            System.out.print("Would you like to output the unsorted and sorted arrays to the console? [yes, no]: ");
            Scanner scanner = new Scanner(System.in);
            format = scanner.next();
        }
        return format;
    }
}
