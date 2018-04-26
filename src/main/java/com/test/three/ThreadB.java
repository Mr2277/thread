package com.test.three;

public class ThreadB extends Thread {
    private test t;
    public ThreadB(test t){
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
