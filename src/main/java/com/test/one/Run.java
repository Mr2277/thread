package com.test.one;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        Object locka=new Object();
        Object lockb=new Object();
        Object lockc=new Object();
        ThreadA threadA=new ThreadA(locka,lockb);
        ThreadB threadB=new ThreadB(lockb,lockc);
        ThreadC threadC=new ThreadC(lockc,locka);
        threadA.start();
        Thread.sleep(100);
        threadB.start();
        Thread.sleep(100);
        threadC.start();

    }
}
