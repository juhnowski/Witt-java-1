package com.juhnowski.onthology;

import java.util.ArrayList;

public class TotalityOfAllFacts {
    public ArrayList<Facts> facts = new ArrayList<Facts> ();

    private static volatile TotalityOfAllFacts instance;

    public static TotalityOfAllFacts getInstance() {
        TotalityOfAllFacts localInstance = instance;
        if (localInstance == null) {
            synchronized (TotalityOfAllFacts.class) {
                localInstance = instance;
                if (localInstance == null) {
                    instance = localInstance = new TotalityOfAllFacts();
                }
            }
        }
        return localInstance;
    }
}
