package com.company;

public class Main {

    public static void main(String[] args) {
        Stock stock = new Stock(0);
        Manufacturer manufacturer = new Manufacturer();
        manufacturer.run();
        Consumer consumer = new Consumer();
        consumer.run();

        for (int i=1; i<5; i++){

        }

    }
}

