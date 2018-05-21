package com.test.six;

public class ThreadB extends Thread{
    private Service service;
    public ThreadB(Service service){
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
