package com.test.eight;

public class MyThread2 extends Thread {
    private Service service;

    public MyThread2(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.read();
    }
}
