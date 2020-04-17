package com.nalaolla.strategy;

public class FriedChicken extends Chicken {

    public FriedChicken() {
        fried = new CookFried();
    }

    @Override
    public void flavor() {
        System.out.println("고소한 일반 후라이드 치킨맛");
    }

    @Override
    public void display() {
        System.out.println("노란 튀김옷을 입은 김이 모락모락 나는 치킨");

    }
}
