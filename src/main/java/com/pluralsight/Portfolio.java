package com.pluralsight;

import com.pluralsight.finance.Valuable;

import java.util.ArrayList;

public class Portfolio {

    private String name;
    private String owner;
    private ArrayList<Valuable> assets;

    public Portfolio(String name, String owner) {
        this.name = name;
        this.owner = owner;
        this.assets = new ArrayList<>();
    }

    public void add(Valuable asset) {
        assets.add(asset);
    }

    public double getValue(){
        //Loop through the Valuables in ArrayList asset
        //keep a total
        double total = 0;
        for (Valuable valuable : assets){
            //add everything up
            total += valuable.getValue();

        }
        //return the total
        return total;
    }
}
