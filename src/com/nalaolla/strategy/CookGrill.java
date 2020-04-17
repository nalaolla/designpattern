package com.nalaolla.strategy;

public class CookGrill implements Fried {
    @Override
    public void fried() {
        System.out.println("구워짐");
    }
}
