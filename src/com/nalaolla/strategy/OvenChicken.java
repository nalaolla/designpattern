package com.nalaolla.strategy;

public class OvenChicken extends Chicken {

    public OvenChicken() {
        fried = new CookFried();
    }

    @Override
    public void flavor() {
        System.out.println("바베큐 향이 가득한 치킨");
    }

    @Override
    public void display() {
        System.out.println("격자무늬로 구워진 자국이 보이는 먹음직스러운 모습");
    }
}
