package com.company;
//потребитель
public class Consumer extends Thread{
    Stock stock = new Stock(0);

    public void run(){
            System.out.println("Запуск потока - " + this.getClass().getName());
            decreaseCounter();
        System.out.println("Потребление продукции");
        System.out.println("Количество товара на складе " + stock.getCounter());


    }


    public void decreaseCounter(){
        stock.setCounter(stock.getCounter()-1);
    }

}
