package com.spartaglobal.factory;
import com.spartaglobal.factory.controller.SortManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FactoryMain {
//    public static Logger logger = LogManager.getLogger("Sort Manager Logger");
    public static Logger logger = LogManager.getLogger(FactoryMain.class.getName());

    public static void main(String[] args) {
        new SortManager().start();
    }
}




