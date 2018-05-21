package com.test.nine;

public class MyThread2 extends Thread {
    private Service service;
    MyThread2(Service service){
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
