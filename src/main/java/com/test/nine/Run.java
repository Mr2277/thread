package com.test.nine;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        Service service=new Service();
        MyThread1 myThread1=new MyThread1(service);
        myThread1.setName("AAAAAAAAAAA");
        myThread1.start();
        Thread.sleep(2);
        MyThread2 myThread2=new MyThread2(service);
        myThread2.setName("BBBBBBBB");
        myThread2.start();
        Thread.sleep(2);
        MyThread3 myThread3=new MyThread3(service);
        myThread3.setName("CCC");
        myThread3.start();
    }
}
