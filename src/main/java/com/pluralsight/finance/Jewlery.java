package com.pluralsight.finance;

public class Jewlery extends FixedAsset {

    private double karat;

    public Jewlery(String name, double marketValue, double karat) {
        super(name, marketValue);
        this.karat = karat;
    }


    @Override
    public double getValue() {
        return getMarketValue();
    }
}
