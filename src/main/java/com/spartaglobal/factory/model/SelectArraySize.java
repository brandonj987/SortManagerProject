package com.spartaglobal.factory.model;
import com.spartaglobal.factory.view.ArraySize;
import java.util.InputMismatchException;

// This class retrieves the users desired array size
// InputMismatchExceptions are also handled to ensure only an int is entered
public class SelectArraySize{
    public int getInput() {
        int desiredSize = 0;
        while (desiredSize <= 0 || desiredSize > 10000000) {
            try {
                ArraySize size = new ArraySize();
                desiredSize = size.getArraySize();
                if (desiredSize == -1){
                    System.exit(0);
                }
                if (desiredSize <= 0) {
                    System.out.println("Array size must be an integer greater than 0!");
                } else if (desiredSize > 10000000) {
                    System.out.println("Array size must be an integer less than 10,000,000!");
                }
            } catch (InputMismatchException i){
                System.out.println("Please enter an integer between 1 and 10,000,000!");
                desiredSize = 0;
            }
        }
        return desiredSize;
    }
}
