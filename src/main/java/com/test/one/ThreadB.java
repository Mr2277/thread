package com.test.one;

public class ThreadB extends Thread {
    private Object objectb;
    private Object objectc;

    public ThreadB(Object objectb, Object objectc) {
        this.objectb = objectb;
        this.objectc = objectc;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (objectb) {
                synchronized (objectc) {
                    objectc.notify();
                    System.out.println("b");
                }
                try {
                    objectb.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
