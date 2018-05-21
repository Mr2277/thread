package com.test.six;

public class ThreadA extends Thread {
    private Service service;
    public ThreadA(Service service){
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
