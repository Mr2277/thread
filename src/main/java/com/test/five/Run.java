package com.test.five;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyService myService=new MyService();
        MyThreadA myThreadA=new MyThreadA(myService);
        MyThreadB myThreadB=new MyThreadB(myService);
        myThreadA.start();
        Thread.sleep(1000);
        myThreadB.start();
    }
}
