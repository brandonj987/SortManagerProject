package com.spartaglobal.factory.view;

import java.util.Scanner;

public class ArraySelector {
    public String getDesiredArray(){
            System.out.print("Please enter your desired array creation method: ");
            Scanner scanner = new Scanner(System.in);
            String desiredArray = scanner.next();
            return desiredArray;
    }
}