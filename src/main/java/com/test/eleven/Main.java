package com.test.eleven;

public class Main {
    public static void main(String[] args){
        /*
        new Thread(){
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        }.start();
        */
        new Thread(()->System.out.println(Thread.currentThread().getName())).start();
    }
}
