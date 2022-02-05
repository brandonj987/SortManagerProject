package com.spartaglobal.factory.view;
import java.util.Scanner;

// This class retrieves the users desired sorting method
// It ensures only the 3 sorters are accepted, otherwise the question is re-asked
public class SorterSelection {
    public String getDesiredSorter(){
        String desiredSorter = "";
        while(!desiredSorter.toLowerCase().equals("bubble") && !desiredSorter.toLowerCase().equals("merge") && !desiredSorter.toLowerCase().equals("binary")) {
            System.out.print("Please enter your desired sorting algorithm [bubble, merge or binary] (x to exit): ");
            Scanner scanner = new Scanner(System.in);
            desiredSorter = scanner.next();
            if (desiredSorter.equals("x")){
                System.exit(0);
            }
        }
        return desiredSorter;
    }
}
