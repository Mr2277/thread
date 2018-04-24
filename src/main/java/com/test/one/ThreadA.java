package com.test.one;


public class ThreadA extends Thread {
    private Object objecta;
    private Object objectb;
    public ThreadA(Object objecta,Object objectb){
        this.objecta=objecta;
        this.objectb=objectb;
    }

    @Override
    public void run() {
        while(true){
            synchronized (objecta){
                System.out.println("a");
                synchronized (objectb){
                    objectb.notify();
                }
                try {
                    objecta.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
