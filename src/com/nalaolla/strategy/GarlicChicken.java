package com.nalaolla.strategy;

public class GarlicChicken extends Chicken {

    public GarlicChicken() {
        fried = new CookFried();
    }

    @Override
    public void flavor() {
        System.out.println("마늘맛이 나는 치킨");
    }

    @Override
    public void display() {
        System.out.println("갈색에 아몬드가 뿌려진 치킨");

    }
}
