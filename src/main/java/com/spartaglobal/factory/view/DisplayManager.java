package com.spartaglobal.factory.view;

import java.util.Scanner;

public class DisplayManager {
    public String getDesiredSorter(){
        System.out.print("Please enter your desired sorting algorithm: ");
        Scanner scanner = new Scanner(System.in);
        String desiredSorter = scanner.next();
        return desiredSorter;
    }

    public void displayResults(String result) {
        System.out.println(result);
    }
}
