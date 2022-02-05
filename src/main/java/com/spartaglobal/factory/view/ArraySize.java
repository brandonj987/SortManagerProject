package com.spartaglobal.factory.view;
import java.util.Scanner;

// This class uses a scanner to read the users desired size of array
public class ArraySize {
    public int getArraySize(){
        System.out.print("Enter the desired size of array (-1 to exit): ");
        Scanner scanner = new Scanner(System.in);
        int desiredSize = scanner.nextInt();
        return desiredSize;
    }
}
