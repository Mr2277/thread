package com.test.eight;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        Service service = new Service();
        MyThread1 a = new MyThread1(service);
        a.setName("AA");
        a.start();

        MyThread2 b = new MyThread2(service);
        b.setName("BB");
        b.start();
    }
}
