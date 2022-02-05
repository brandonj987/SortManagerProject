package com.spartaglobal.factory.view;

import java.util.Scanner;

public class SelectArrayView {
    public String getDesiredArray(){
            System.out.print("Please enter your desired array creation method [random or defined] (x to exit): ");
            Scanner scanner = new Scanner(System.in);
            String desiredArray = scanner.next();
            if (desiredArray.equals("x")){
                System.exit(0);
            }
            return desiredArray;
    }
}