package com.nalaolla.observer;

import java.util.Observable;
import java.util.Observer;

public class Subscriber implements Observer, DisplayElement {

    Observable observable;
    private String photoUrl;
    private String content;

    public Subscriber(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("1st subscriber");
        System.out.println("photo link : " + photoUrl);
        System.out.println("content : " + content);
        System.out.println("\n");

    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof Company) {

            Company company = (Company) o;

            this.photoUrl = company.getPhotoUrl();
            this.content = company.getContent();
            display();

        }

    }
}
