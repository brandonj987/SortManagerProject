package com.spartaglobal.factory.view;

import java.util.Scanner;

public class RandomArrayBound {
    public int getRandArrayBound(){
        System.out.print("Enter the desired number bound in the array ");
        Scanner scanner = new Scanner(System.in);
        int desiredBound = scanner.nextInt();
        return desiredBound;
    }
}
