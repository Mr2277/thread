package com.test.nine;

public class MyThread3 extends Thread {
    private Service service;
    MyThread3(Service service){
        this.service=service;
    }

    @Override
    public void run() {
        try {
            service.read();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
