package com.test.one;

public class ThreadC extends Thread {
    private Object objectc;
    private Object objecta;
    public ThreadC(Object objectc,Object objecta){
        this.objectc=objectc;
        this.objecta=objecta;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (objectc) {
               synchronized (objecta){
                   System.out.println("c");
                   objecta.notify();
               }
                try {
                    objectc.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
