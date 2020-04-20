package com.nalaolla.singleton;

public class Client {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {
            Singleton obj = Singleton.getInstance();
            System.out.println(obj);
        }
    }
}
