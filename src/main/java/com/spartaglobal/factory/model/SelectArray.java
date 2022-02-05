package com.spartaglobal.factory.model;
import com.spartaglobal.factory.view.SelectArrayView;

// This class retrieves the desired array creation method from the user
// It ensures only "random" or "defined" can be inputted
public class SelectArray {
    public String getInput() {
        String desiredArray = "";
        while (!desiredArray.toLowerCase().equals("random") && !desiredArray.toLowerCase().equals("defined")) {
            SelectArrayView select = new SelectArrayView();
            desiredArray = select.getDesiredArray();
        }
        return desiredArray;
    }
}
