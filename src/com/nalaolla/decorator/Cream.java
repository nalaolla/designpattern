package com.nalaolla.decorator;

public class Cream extends CondimentDecorator {

    Beverage beverage;

    public Cream(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public int cost() {
        return beverage.cost() + 300;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 크림추가";
    }
}
