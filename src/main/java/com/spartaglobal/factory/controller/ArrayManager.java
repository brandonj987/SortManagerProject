package com.spartaglobal.factory.controller;

import com.spartaglobal.factory.Factory.ArrayFactory;
import com.spartaglobal.factory.Factory.RandomFactory;
import com.spartaglobal.factory.model.*;

public class ArrayManager {
    public int[] initiateRandomArray(String desiredArray, int i, int j) {
        RandomArray r = new RandomArray();
        return r.makeArray(i, j);
    }
//    public int[] initiateUserArray(int i) {
//        UserArray u = new UserArray();
//        return u.makeArray(i);
//    }



    // simple factory method
    public Array getArray(String arrayType){
        ArrayFactory a = switch (arrayType.toLowerCase()) {
            case "random" -> new RandomFactory();
//            case "user" -> new UserFactory();
            default -> null;
        };
        return a.getInstance();
    }
//    public void createArray(String desiredArray){
//
//        if(desiredArray.equals("random")){
//
//        }
//
//
//    }



}
