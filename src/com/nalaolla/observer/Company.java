package com.nalaolla.observer;

import java.util.Observable;

public class Company extends Observable {

    private String photoUrl;
    private String content;

    public Company() {

    }

    public void messageChanged() {
        setChanged();
        notifyObservers();
    }

    public void setMessage(String photoUrl, String content) {
        this.photoUrl = photoUrl;
        this.content = content;

        messageChanged();
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public String getContent() {
        return content;
    }
}
