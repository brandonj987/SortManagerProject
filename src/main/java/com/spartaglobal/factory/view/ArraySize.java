package com.spartaglobal.factory.view;

import java.util.Scanner;

public class ArraySize {
    public int getArraySize(){
        System.out.print("Enter the desired size of array ");
        Scanner scanner = new Scanner(System.in);
        int desiredSize = scanner.nextInt();
        return desiredSize;
    }
}
