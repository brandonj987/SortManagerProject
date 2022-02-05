package com.spartaglobal.factory.view;

import java.util.Scanner;

public class ArrayInput {
    public int getNextInt(){
        System.out.print("Enter the next integer into your array ");
        Scanner scanner = new Scanner(System.in);
        int nextInt = scanner.nextInt();
        return nextInt;
    }
}
