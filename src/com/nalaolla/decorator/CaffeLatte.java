package com.nalaolla.decorator;

public class CaffeLatte extends Beverage {

    public CaffeLatte() {
        super();
        description = "카페라테";
    }

    @Override
    public int cost() {
        return 3000;
    }
}
