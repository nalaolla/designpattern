package com.nalaolla.observer;

public class Messenger {
    public static void main(String[] args) {
        Company company = new Company();
        Subscriber subscriber = new Subscriber(company);
        Subscriber2 subscriber2 = new Subscriber2(company);
        company.setMessage("photo", "이벤트");
    }
}
