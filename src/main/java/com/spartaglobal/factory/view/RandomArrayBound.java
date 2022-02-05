package com.spartaglobal.factory.view;
import java.util.Scanner;

// This class
public class RandomArrayBound {
    public int getRandArrayBound(){
        System.out.print("Enter the desired number bound in the array (-1 to exit): ");
        Scanner scanner = new Scanner(System.in);
        int desiredBound = scanner.nextInt();
        return desiredBound;
    }
}
