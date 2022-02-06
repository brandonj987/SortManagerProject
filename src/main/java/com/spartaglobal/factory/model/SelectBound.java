package com.spartaglobal.factory.model;
import com.spartaglobal.factory.view.RandomArrayBound;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.InputMismatchException;

// This class retrieves the users desired number bound
// InputMismatchExceptions are also handled to ensure only an int is entered
public class SelectBound {
    public static Logger logger = LogManager.getLogger("Number Bound Logger");
    public int getInput(){
        int desiredBound = 0;
        while (desiredBound <= 0 || desiredBound > 10000000) {
            try {
                RandomArrayBound bound = new RandomArrayBound();
                desiredBound = bound.getRandArrayBound();
                if (desiredBound == -1){
                    System.exit(0);
                }
                if (desiredBound <= 0) {
                    System.out.println("Number bound must be an integer greater than 0!");
                } else if ( desiredBound > 10000000){
                    System.out.println("Number bound must be an integer less than 10,000,000!");
                }
            }  catch (InputMismatchException i){
                System.out.println("Please enter an integer between 1 and 10,000,000!");
                logger.warn("User entered an incorrect data type for number bound!");
                desiredBound = 0;
            }
        }
        return desiredBound;
    }
}
