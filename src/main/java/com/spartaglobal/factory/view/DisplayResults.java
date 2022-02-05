package com.spartaglobal.factory.view;

public class DisplayResults {
    public void fullResults(String ints, long timeTaken){
        System.out.println("The sort took " + timeTaken + " nanoseconds to complete and the sorted array is:\n" + ints);
    }
    public void results(String ints, long timeTaken){
        System.out.println("The sort took " + timeTaken + " nanoseconds to complete");
    }

}
