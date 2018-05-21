package com.test.six;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        Service service=new Service();
        ThreadA threadA=new ThreadA(service);
        ThreadB threadB=new ThreadB(service);
        threadA.start();
        Thread.sleep(2);
        threadB.start();
    }
}
