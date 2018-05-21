package com.test.nine;

public class MyThread1 extends Thread {
    private Service service;
    MyThread1(Service service){
        this.service=service;
    }

    @Override
    public void run() {
        try {
            service.write();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
