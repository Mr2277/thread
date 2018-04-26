package com.test.three;

public class Run {
    public static void main(String[] ars) throws InterruptedException {
        Object o=new Object();
        test t=new test(o);
        ThreadA threadA=new ThreadA(t);
        threadA.setName("A");
        ThreadB threadB=new ThreadB(t);
        threadB.setName("B");
        threadA.start();
        Thread.sleep(1000);
        threadB.start();
    }
}
