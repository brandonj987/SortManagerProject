package com.spartaglobal.factory.model;
import com.spartaglobal.factory.view.SelectArrayView;

public class SelectArray {
    public String getInput() {
        String desiredArray = "";
        while (!desiredArray.equals("random") && !desiredArray.equals("user")) {
            SelectArrayView select = new SelectArrayView();
            desiredArray = select.getDesiredArray();
        }
        return desiredArray;
    }
}
