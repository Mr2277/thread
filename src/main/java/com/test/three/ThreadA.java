package com.test.three;

public class ThreadA extends Thread {
    private test t;
    public ThreadA(test t){
        this.t=t;
    }

    @Override
    public void run() {
        try {
            t.test();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
