package com.spartaglobal.factory.view;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// This class displays the desired format of the results and logs it
public class DisplayResults {
    public static Logger logger = LogManager.getLogger("Results Logger");
    public void fullResults(String ints, long timeTaken){
        System.out.println("The sort took " + timeTaken + " nanoseconds to complete and the sorted array is:\n" + ints);
        logger.info("The sort took " + timeTaken + " nanoseconds to complete");
    }
    public void results(String ints, long timeTaken){
        System.out.println("The sort took " + timeTaken + " nanoseconds to complete");
        logger.info("The sort took " + timeTaken + " nanoseconds to complete");
    }

}
