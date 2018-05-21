package com.test.eight;

public class MyThread1 extends Thread{
    private Service service;

    public MyThread1(Service service) {
        this.service = service;
    }
    @Override
    public void run() {
        service.read();
    }
}
