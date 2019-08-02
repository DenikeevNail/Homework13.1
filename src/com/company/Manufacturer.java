package com.company;

//производитель
public class Manufacturer extends Thread{
    Stock stock = new Stock(0);

    public void run(){

            System.out.println("Запуск потока - " + this.getClass().getName());
            increaseCounter();
        System.out.println("Производство продукции");
        System.out.println("Количество товара на складе " + stock.getCounter());


    }


    public void increaseCounter() {
        stock.setCounter(stock.getCounter() + 1);
    }
}



